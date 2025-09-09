import java.util.Scanner;
class Order
{
    String customerName;
    String cakeType;
    int quantity;
    double pricePerCake;

    Order(String customerName , String cakeType , int quantity)
    {
        this.customerName = customerName;
        this.cakeType = cakeType;
        this.quantity = quantity;
        System.out.println(cakeType);
        if(cakeType == "Chocolate") pricePerCake = 350;
        else if(cakeType == "Vanilla") pricePerCake = 300;
        else if(cakeType == "Other cakes") pricePerCake = 250;
    }
}

public class kavyaBakery 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the custoner: ");
        String customerName = sc.nextLine();
        System.out.print("Enter the cake type: ");
        String cakeType = sc.nextLine();
        System.out.print("Enter number of cakes: ");
        int quantity = sc.nextInt();
        Order o1 = new Order(customerName, cakeType, quantity);

        System.out.println("Name: "+o1.customerName+"\nCake Type: "+o1.cakeType+"\nPrice: "+o1.quantity*o1.pricePerCake);
        sc.close();
    }
}
