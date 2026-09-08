package PracticaL12;

class GrandFather
{
    void collect()
    {
        System.out.println("Money Collected Successfully");
    }
}

class father extends GrandFather
{
    void lost()
    {
        System.out.println("Money Lost, Better Luck Next Time");
    }
}

class son extends father
{
   void deposit()
   {
    System.out.println("Money Deposited  Successfully");
   }
}

class Daughter extends GrandFather
{
     void withdraw()
     {
        System.out.println("Money withdrawal Successfully");
     }
}


class HybridInheritanceDemo
{
    public static void main(String []aa)
    {
        son s = new son();
        s.collect();
        s.lost();
        s.deposit();


        Daughter  d = new Daughter();
        d.withdraw();
        d.collect();
    }
}