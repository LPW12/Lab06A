// Lab06Ast.java
// The First Bank Program
// Object Methods and Output Formatting
// This is the student, starting version of Lab 06A.

import java.text.DecimalFormat;

public class Lab06Ast
{
    public static void main(String args[])
    {
      // Create DecimalFormat and Bank Objects
      DecimalFormat money = new DecimalFormat("$00,000.00");
      Bank tom  = new Bank();
      Bank suzy = new Bank(1600,32000);
      Bank bill = new Bank(8000,Expo.random(20000,90000));

      // Display Initial Balances
      System.out.println("Tom's initial balance:");
      System.out.print("  Checking - ");
      System.out.println(money.format(tom.getChecking()));
      System.out.print("  Savings - ");
      System.out.println(money.format(tom.getSavings()));
      System.out.println("Suzy's initial balance:");
      System.out.print("  Checking - ");
      System.out.println(money.format(suzy.getChecking()));
      System.out.print("  Savings - ");
      System.out.println(money.format(suzy.getSavings()));
      System.out.println("Bill's initial balance:");
      System.out.print("  Checking - ");
      System.out.println(money.format(bill.getChecking()));
      System.out.print("  Savings - ");
      System.out.println(money.format(bill.getSavings()));

      // Deposits and Withdrawals
      tom.checkingDeposit(500);
      tom.savingsDeposit(7000);
      bill.checkingWithdrawal(8000);
      suzy.savingsWithdrawal(20000);
      suzy.checkingDeposit(20000);
      bill.savingsWithdrawal(bill.getSavings());
      
      // Display Final Balances
      for(int l=1; l<=5; l++)
      {
          System.out.println();
      }   
      System.out.println("Tom's Final balance:");
      System.out.print("  Checking - ");
      System.out.println(money.format(tom.getChecking()));
      System.out.print("  Savings - ");
      System.out.println(money.format(tom.getSavings()));
      System.out.println("Suzy's Final balance:");
      System.out.print("  Checking - ");
      System.out.println(money.format(suzy.getChecking()));
      System.out.print("  Savings - ");
      System.out.println(money.format(suzy.getSavings()));
      System.out.println("Bill's Final balance:");
      System.out.print("  Checking - ");
      System.out.println(money.format(bill.getChecking()));
      System.out.print("  Savings - ");
      System.out.println(money.format(bill.getSavings()));







    }
}
