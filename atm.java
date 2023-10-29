//  3rd project of internship with codsoft by eeshna uniyal 
import java.util.*;
import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        int balance = 10000;

        // SCANNER CLASS FOR TAKE INPUT( code by eeshna uniyal )

        Scanner r = new Scanner(System.in);
        System.out.println("\n\n Hello Dear customer welcome in SBI bank\n");
        while (true) {

            // TAKE CUSTOMER DETAILS LIKE ID AND PASSWORSD..(code by eeshna uniyal )

            System.out.println("\n Please enter your customer id ");
            int user_id = r.nextInt();
            System.out.println(" please enter your password ");
            int password = r.nextInt();
            if (user_id == 75006593) {
                System.out.println(" ");
            } else {
                System.out.println(" invalid userid ,please enter a valid userid");
            }

            if (password == 2345) {
                System.out.println(" Login successfull !");
            } else {
                System.out.println(" Incorrect username or password");
            }

            // OPERATION PERFORM BY CUSTOMER(code by eeshna uniyal )

            System.out.println(" - Select the operation you want to perform:");
            System.out.println(" \n- Select 1 for chek Bank Balance:");
            System.out.println(" \n- Select 2 for Deposot :");
            System.out.println(" \n- Select 3 for withdrawl:");
            int choice = r.nextInt();
            switch (choice) {

                // CHEK BALANCE......(code by eeshna uniyal)

                case 1:
                    System.out.println("  your current Balance is" + balance);
                    break;

                // DEPOSIT AMOUNT......(code by eeshna uniyal )

                case 2:
                    System.out.println(" Enter the Amount you want to deposit \n");
                    int deposit = r.nextInt();
                    balance = balance + deposit;
                    System.out.println(" YOUR Money has been succesfully deposited");
                    System.out.println(" Now your bank balance is " + balance);

                    break;
                // WITHDRAW BALANCE......(code by eeshna uniyal )

                case 3:
                    System.out.println(" enetr the amount you want to withdraw");
                    int withdraw = r.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("withdrwal sucessfully, plz collect you money");
                        System.out.println("\n Now your balance is " + balance);

                    } else {
                        System.out.println("Insufficient Balance");
                    }

            }
        }
    }
}