/*
Test class for company object
*/

import java.io.*;
import java.util.*;

public class Test

{
public static void main(String[]args)
{
 Company c1 = new Company ();
 String nameInput = "null";
 double shareInput = 0.0;
 Scanner input = new Scanner(System.in);

 System.out.println("Enter company name here: ");
 nameInput = input.nextLine();
 c1.setCompanyName(nameInput);

 System.out.println("Enter company price per share here: ");
 shareInput = input.nextDouble();
 c1.setPerShare(shareInput);

}

}