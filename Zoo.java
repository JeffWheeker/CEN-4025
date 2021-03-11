
public class Zoo
{
    private String name;
    private String address;
    private int maxGuestNum;
    private int currentGuestNum;
    private int numEmployees;
    private int maxAssetNum;
    private int currentAssetNum;
    
    void addGuest()
    {
        System.out.println("Guest was added to the customer database");
    }
    void removeGuest()
    {
        System.out.println("Guest was removed from the customer database");
    }
    void openZoo()
    {
        System.out.println("The zoo is open");
    }
    void closeZoo()
    {
        System.out.println("The zoo is closed");
    }
    void sellTicket()
    {
        System.out.println("Ticket sold");
    }
    void addEnclosure()
    {
        System.out.println("Enclosure was added");
    }
    void removeEnclosure()
    {
        System.out.println("Enclosure was removed");
    }
    void relocateAnimal()
    {
        System.out.println("Animal was relocated");
    }
    void addBuilding()
    {
        System.out.println("Building was added");
    }
    void removeBuilding()
    {
        System.out.println("Building was removed");
    }
}
