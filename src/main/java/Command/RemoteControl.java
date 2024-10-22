package Command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commands;
    private Command lastCommand;

    public RemoteControl() {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void pressButton(int index) {
        if (index >= 0 && index < commands.size()) {
            commands.get(index).execute();
            lastCommand = commands.get(index);
        } else {
            System.out.println("Invalid command index.");
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        } else {
            System.out.println("No command to undo.");
        }
    }
}
