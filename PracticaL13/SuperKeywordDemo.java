package PracticaL13;

// Base Class
class Bank 
{
    double interestRate = 5.0;

    // 1. Parent Constructor
    Bank() 
    {
        System.out.println("Central Bank initialized.");
    }

    // 2. Parent Method
    void showPolicy() 
    {
        System.out.println("Standard Bank Policy applies.");
    }
}

// Derived Class
class SBI extends Bank 
{
    double interestRate = 7.5; // Shadows parent's variable

    // Using super() to call parent constructor
    SBI() 
    {
        super(); // Calls Bank() constructor
        System.out.println("SBI Branch initialized.");
    }

    // Overriding parent method
    void showPolicy() 
    {
        System.out.println("SBI Specific Policy applies.");
    }

    void displayDetails() 
    {
        // 1. Using super.variable vs this.variable
        System.out.println("\nParent Interest Rate (super.interestRate): " + super.interestRate + "%");
        System.out.println("SBI Interest Rate    (this.interestRate) : " + this.interestRate + "%");

        // 2. Using super.method() vs current method
        System.out.println("\nCalling Parent Method using super.showPolicy():");
        super.showPolicy();

        System.out.println("\nCalling Overridden Method in SBI:");
        this.showPolicy();
    }
}

public class SuperKeywordDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("=== DEMO OF 'super' KEYWORD ===");
        SBI sbi = new SBI();
        sbi.displayDetails();
    }
}
