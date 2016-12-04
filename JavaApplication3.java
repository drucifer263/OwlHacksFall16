/*

Lee Shin
Terrell Reese
Harley Baum
Drew Watson(helped a bit)

Test code in netbeans for mobile investment app to be transfered to Android Studio project Investment app
OwlHacks 12/3/16

*/

package javaapplication3;
import java.io.*;
import java.util.Scanner;


public class JavaApplication3 {

    public static double investmentFunds(double net)
   {
        double investmentFunds = net;
       return investmentFunds;
   }

   public static int findAmountOfShares(double investmentFunds, double sharePrice)
   {

       return (int)(investmentFunds/sharePrice);

   }
   static int indexOfHighest;
   static int highest;

   public static int highestShare(double investmentFunds, double[] perShare)
   {
       for(int i = 0; i < perShare.length; i++)
        {
            if(findAmountOfShares(investmentFunds, perShare[i]) > highest)
            {
                highest = findAmountOfShares(investmentFunds, perShare[i]);
                indexOfHighest = i;
            }

        }

       return highest;
   }



   public static void main(String[] args) {
     String[] company;
     company = new String[] {"Google", "Netflix", "Instagram", "Pandora", "Uber"};
       double[] perShare;
       perShare = new double[] {150.00, 72.50,81.73,123.28,67.39};
        String name;

        double gross, net, rent, utility, transport, expense;
        int pos = 0;
        int[] shares = new int[4];



      Scanner input = new Scanner(System.in);  // Reading from System.in

      System.out.println("Please enter your full name");
      name = input.nextLine();
      System.out.print("Enter In Gross Income: \n$");
      gross = input.nextDouble();
      System.out.println( "Enter paid amount for rent: $");
      rent = input.nextDouble();
      System.out.println("Enter combined amount for utilities:  $");
      utility = input.nextDouble();
      System.out.println(" Enter total cost for transportation:  $");
      transport = input.nextDouble();

      expense = rent+utility+transport;
      net = gross - expense;

     System.out.println("You have " + "$ " + net + " left to invest in");
     System.out.println("The Highest Stock Listed Is: " + highestShare(net, perShare) + " shares" + company[indexOfHighest]);



     }
}
