/*  ID   : 21CE027
    Name : Fachara Raj
    Aim  : (Subclasses of Account) In Programming Exercise 2, the 
           Account class was defined to model a bank account. An account has the properties 
           account number,balance, annual interestrate, and date created, and methods 
           to deposit and withdrawfunds. Create two subclasses for checking and 
           saving accounts.
           A checkingaccount has an overdraft limit, but a savings account cannot be overdrawn.
           Draw the UML diagram for the classes and then implement them. 
           Write a test program that creates objects of Account, SavingsAccount, and CheckingAccount and 
           invokes their toString() methods.

 */

public class Prac_4_SavingAccount extends Prac_2_Account
{
    public Prac_4_SavingAccount() {
    }
    public Prac_4_SavingAccount(int id, double balance) 
    {
        super(id, balance);
    }
    public void withdraw(double money)
    {
    if(money<=getBalance())
    {
        super.withdraw(money); // Parent class method to withdraw amount.
    }
    else 
    {
        System.out.println("You don't have sufficient balance to withdraw "+money+" Rs.");
    }
    }
}   
