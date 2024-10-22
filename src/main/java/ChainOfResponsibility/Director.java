package ChainOfResponsibility;

public class Director extends Approver {
    private final double APPROVAL_LIMIT = 5000;

    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= APPROVAL_LIMIT) {
            System.out.println("Director approved the expense: " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
