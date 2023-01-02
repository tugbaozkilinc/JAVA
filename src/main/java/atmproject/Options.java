package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{

    Scanner scan = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    boolean flag = true;

    HashMap<Integer, Integer> data = new HashMap<>();

    public void login(){

        System.out.println("Welcome to the TechProEd ATM");
        do{
            data.put(12345, 1234);
            data.put(23456, 2345);
            data.put(34567, 3456);
            data.put(45678, 4567);
            try {
                System.out.println("Enter your customer number");
                setAccountNumber(scan.nextInt());
                System.out.println("Enter your pin number");
                setPinNumber(scan.nextInt());
            }catch (Exception e){
                System.out.println("You entered a wrong character! Please just enter a digit, enter 'Q' to exit");
                scan.nextLine();
                String exit = scan.next();
                if(exit.equalsIgnoreCase("q")){
                    flag = false;
                }
            }
            int count = 0;
            for(Map.Entry<Integer, Integer> w : data.entrySet()){
                if(w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber())){
                    getAccountTypes();
                } else {
                    count++;
                }
            }
            if(count==data.size()){
                System.out.println("You entered the wrong keying");
            }
        }while (flag);

    }

    public void checkingOperations(){

        do {
            displayMessage();
            int option = scan.nextInt();
            if(option==4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("The balance in your checking balance: " + moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("You did the wrong keying, please try again");
            }
        }while (true);
        getAccountTypes();

    }

    public void savingOperations(){

        do {
            displayMessage();
            int option = scan.nextInt();
            if(option==4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("The balance in your saving balance: " + moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("You did the wrong keying, please try again");
            }
        }while (true);
        getAccountTypes();

    }

    public void getAccountTypes(){

        System.out.println("Choose the account you want to transact\n" +
                           "1. Checking account\n" +
                           "2. Saving account\n" +
                           "3. Exit");
        int option = scan.nextInt();
        switch (option){
            case 1:
                System.out.println("You are in your checking balance");
                checkingOperations();
                break;
            case 2:
                System.out.println("You are in your saving balance");
                savingOperations();
                break;
            case 3:
                System.out.println("Thank you for choosing us");
                flag = false;
            default:
                System.out.println("You did the wrong keying, please try again");
        }

    }

    public void displayMessage(){
        System.out.println("Choose an option\n" +
                           "1. View Balance\n" +
                           "2. Withdraw\n" +
                           "3. Deposit\n" +
                           "4. Exit");
    }








}
