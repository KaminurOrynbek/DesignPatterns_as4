package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        ExpenseRequest request1 = new ExpenseRequest(300, "Team Outing");
        ExpenseRequest request2 = new ExpenseRequest(1500, "Project Equipment");
        ExpenseRequest request3 = new ExpenseRequest(4500, "New Office Setup");
        ExpenseRequest request4 = new ExpenseRequest(6000, "International Conference");

        System.out.println("Processing requests:");

        approvalChain.processRequest(request1);
        approvalChain.processRequest(request2);
        approvalChain.processRequest(request3);
        approvalChain.processRequest(request4);
    }
}
