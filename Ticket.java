
public class Ticket
{
    private int ticketNum;
    private int ticketDate;
    private float ticketPrice;
    
    void order()
    {
        System.out.println("Ticket has been ordered");
    }
    void refund()
    {
        System.out.println("Ticket has been refunded");
    }
    void applyDiscount()
    {
        System.out.println("A discount has been applied to the ticket price");
    }
}
