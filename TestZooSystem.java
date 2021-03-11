/*
Jeff Wheeker
Software Development 2
Homework 3
*/

import java.util.Scanner;

public class TestZooSystem
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What portion of the zoo system would you like to test?");
        System.out.println("(1) Build an enclosure and add an animal.");
        System.out.println("(2) Hire staff and sell tickets to customers.");
        int choice = scanner.nextInt();
        
        if (choice == 1)
        {
            Zoo myZoo = new Zoo();
            myZoo.openZoo();
            myZoo.addBuilding();
            Building building1 = new Building();
            building1.addEnclosure();
            Enclosure enclosure1 = new Enclosure();
            enclosure1.addAnimal();
            enclosure1.addNutriment();
            enclosure1.clean();
        }
        else
        {
            Zoo myZoo = new Zoo();
            myZoo.openZoo();
            Employee employee1 = new Employee();
            employee1.hire();
            Guest guest1 = new Guest();
            guest1.requestTicket();
            Ticket ticket1 = new Ticket();
            ticket1.applyDiscount();
            ticket1.order();
            myZoo.addGuest();
        }
    }
}
