package ui;
import model.Operations;

import java.util.Scanner;

public class UI{
    double n1, n2;
    public static void showMenu(){
        System.out.println("---Welcome to Calculator---");
        System.out.println("You must choose a option !\n");
        int response = 0;
        do{
            System.out.println("1. Addition.");
            System.out.println("2. Subtraction.");
            System.out.println("3. Multiplicacion.");
            System.out.println("4. Division.");
            System.out.println("5. Exit.");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    Operations.showAddition();
                    break;
                case 2:
                    Operations.showSubtracion();
                    break;
                case 3:
                    Operations.showMultiplication();
                    break;
                case 4:
                    Operations.showDivision();
                    break;
                case 0:
                    System.out.println("Thanks for you visit, come soon! \n");
            }

        }while(response !=0);

    }
}
