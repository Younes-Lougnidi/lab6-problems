package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y" ;
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();
// *** create a new item and add it to the cart
            // *** print the contents of the cart object using println
            item = new Item( itemName,itemPrice,quantity);
            cart.add(item);
            System.out.println("The elements of your cart are:");
            // System.out.println(cart);
            double totPrice = 0;
            int totQuant = 0;
            for(Item cartItem : cart){
                totPrice+= cartItem.getPrice();
                totQuant+= cartItem.getQuantity();
                System.out.println(cartItem);
            }
            System.out.println("The total price of items in the cart is: " + totPrice);
            System.out.println("The cart has " + totQuant + " items");
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
