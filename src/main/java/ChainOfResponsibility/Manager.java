package ChainOfResponsibility;

public class Manager extends Approver {
    private final double APPROVAL_LIMIT = 2000;

    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= APPROVAL_LIMIT) {
            System.out.println("Manager approved the expense: " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
