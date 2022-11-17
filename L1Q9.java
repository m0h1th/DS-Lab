import java.util.Scanner;

class Flower
{
    String name;
    int petals;
    double price;

    Flower(){}

    Flower(String n, int p, double pr)
    {
        this.name = n;
        this.petals = p;
        this.price = pr;
    }

    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Petals: "+petals);
        System.out.println("Price: "+price);
    }
    
    void setPrice(double pr)
    {
        this.price = pr;
    }

    void setPetals(int p)
    {
        this.petals = p;
    }

    void setName(String n)
    {
        this.name = n;
    }

    String getName()
    {
        return name;
    }

    int getPetals()
    {
        return petals;
    }

    double getPrice()
    {
        return price;
    }
}

public class L1Q9 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the flower: ");
        String name = sc.nextLine();
        System.out.print("Enter the number of petals: ");
        int petals = sc.nextInt();
        System.out.print("Enter the price: ");
        double price = sc.nextDouble();
        Flower myFlower = new Flower(name, petals, price);
        int choice = 0;
        while (choice!=5)
        {
            System.out.println("Menu: ");
            System.out.println("1. Display");
            System.out.println("2. Change name");
            System.out.println("3. Change petals");
            System.out.println("4. Change price");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    myFlower.display();
                    break;
                case 2:
                    System.out.print("Enter the new name: ");
                    name = sc.nextLine();
                    myFlower.setName(name);
                    break;
                case 3:
                    System.out.print("Enter the new number of petals: ");
                    petals = sc.nextInt();
                    myFlower.setPetals(petals);
                    break;
                case 4:
                    System.out.print("Enter the new price: ");
                    price = sc.nextDouble();
                    myFlower.setPrice(price);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        
    }
}

