package PracticaL10;
//
class BankAccount {
    String Name = "GHIKLM";
    long AccountNumber = 1000l;

    BankAccount() {
        String Name;
        long AccountNumber;
    }

    BankAccount(String Name, long AccountNumber) {
        this.Name = Name;
        this.AccountNumber = AccountNumber;

    }

    BankAccount(String Name) {
        this.Name = Name;
    }

    void display() {
        System.out.println("AccountHolder Name:" + Name);
        System.out.println("AccountNumber: " + AccountNumber);
    }
}

class BankingDemo {
    public static void main(String[] aa) {
        BankAccount b1 = new BankAccount();
        b1.display();

        BankAccount b2 = new BankAccount("ABCD", 1000L);
        b2.display();
    }
}
