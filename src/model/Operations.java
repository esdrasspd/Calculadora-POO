package model;
import java.util.Scanner;

public class Operations {

    public static void showAddition()
    {
        double n1,n2,addition;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n1 = Double.valueOf(sc.nextLine());
        System.out.println("\nEnter other number");
        n2 = Double.valueOf(sc.nextLine());
        addition = n1+n2;
        System.out.println("\nThe addition is: "+addition);
    }

    public static void showSubtracion()
    {
        double n1,n2,subtraction;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n1 = Double.valueOf(sc.nextLine());
        System.out.println("\nEnter other number");
        n2 = Double.valueOf(sc.nextLine());
        subtraction = n1-n2;
        System.out.println("\nThe addition is: "+subtraction);
    }

    public static void showMultiplication()
    {
        double n1,n2,multiplication;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n1 = Double.valueOf(sc.nextLine());
        System.out.println("\nEnter other number");
        n2 = Double.valueOf(sc.nextLine());
        multiplication = n1*n2;
        System.out.println("\nThe addition is: "+multiplication);
    }
    public static void showDivision()
    {
        double n1, n2, division;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n1 = Double.valueOf(sc.nextLine());
        System.out.println("\nEnter other number");
        n2 = Double.valueOf(sc.nextLine());
        if(n1==0 || n2==0)
        {
            System.out.println("Error, you must enter numbers other than 0");
        }
        else {
            division = n1/n2;
            System.out.println("\nThe division is: "+division);
        }

    }
}
