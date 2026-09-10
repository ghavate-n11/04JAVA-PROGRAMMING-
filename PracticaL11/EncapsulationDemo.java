package PracticaL11;


public class EncapsulationDemo
{
    public static void main(String[]args)
    {
        System.out.println("\nEncapsulationDemo\n");

        System.out.println("\n***BANK OF BARODA***\n");


        BankAccount ba = new BankAccount();

        ba.setName("ABCDEFGH");
        ba.setAccountNumber(910293293812L);

        System.out.println("Account Holder Name: " + ba.getName());
        System.out.println("Account Number: " + ba.getAccountNumber());
//
    }
}


class BankAccount
{
    private String Name;
    private long AccountNumber;


    public void setName(String AccName)
    {
        Name = AccName;
    }

    public void setAccountNumber(long AccNumber )
    {
        if(AccNumber > 0)
        {
                  AccountNumber = AccNumber;
        }
      
    }

    public String getName()
    {
        return Name;
    }

    public long getAccountNumber()
    {
        return AccountNumber;
    }
}


