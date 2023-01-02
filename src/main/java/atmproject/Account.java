package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() { return savingBalance; }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    private double calculateCheckingBalanceAfterWithdraw(double amount){
        checkingBalance -= amount;
        return checkingBalance;
    }

    private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance += amount;
        return checkingBalance;
    }

    private double calculateSavingBalanceAfterWithdraw(double amount){
        savingBalance -= amount;
        return savingBalance;
    }

    private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance += amount;
        return savingBalance;
    }

    public void getCheckingWithdraw(){

        displayCurrentAmount(checkingBalance);
        System.out.println("Enter the balance you want to withdraw");
        double amount = input.nextDouble();
        if(amount<=0){
            System.out.println("0 or minus numbers are invalid");
            getCheckingWithdraw();
        } else if(amount<=checkingBalance){
            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);
        } else {
            System.out.println("Insufficient balance");
        }

    }

    public void getCheckingDeposit(){

        displayCurrentAmount(checkingBalance);
        System.out.println("Enter the balance you want to deposit");
        double amount = input.nextDouble();
        if(amount<=0){
            System.out.println("0 or minus numbers are invalid");
            getCheckingDeposit();
        } else {
            calculateCheckingBalanceAfterDeposit(amount);
            displayCurrentAmount(checkingBalance);
        }

    }

    public void getSavingWithdraw(){

        displayCurrentAmount(savingBalance);
        System.out.println("Enter the balance you want to withdraw");
        double amount = input.nextDouble();
        if(amount<=0){
            System.out.println("0 or minus numbers are invalid");
            getSavingWithdraw();
        } else if(amount<=savingBalance){
            calculateSavingBalanceAfterWithdraw(amount);
            displayCurrentAmount(savingBalance);
        } else {
            System.out.println("Insufficient balance");
        }

    }

    public void getSavingDeposit(){

        displayCurrentAmount(savingBalance);
        System.out.println("Enter the balance you want to deposit");
        double amount = input.nextDouble();
        if(amount<=0){
            System.out.println("0 or minus numbers are invalid");
            getSavingDeposit();
        } else {
            calculateSavingBalanceAfterDeposit(amount);
            displayCurrentAmount(savingBalance);
        }

    }

    public void displayCurrentAmount(double balance){
        System.out.println("The money in your balance: " + moneyFormat.format(balance));
    }



}
