class Base 
{
   public void fun()
   {
      System.out.println("Inside base fun");
   }
    public void gun()
   {
       System.out.println("Inside base gun");
   }
   public void sun()
   {
       System.out.println("Inside base sun");
   }
   public void run()
   {
       System.out.println("Inside base run");
   }
}

class Derived extends Base
{
    public void fun ()  //redefining 
    {
       System.out.println("Inside derived fun");
    }
    public void sun()  //redefining 
    {
        System.out.println("Inside derived sun");
    }
    public void run(int A) //redefining
    {
         System.out.println("Inside derived run");
    }
    public  void mun() 
    {
         System.out.println("Inside derived mun");
    }
}


class Overriding
{
    public static void main (String arg[])
    {
       Base bobj =new Derived(); //Upcasting
      
      // Base bobj =new Base(); //Nocasting
      // Derived dobj =new Derived(); //Nocasting
      // Derived dobj=new Base(); //Downcasting
      
      bobj.fun(); //Derived fun (Override)
      bobj.gun(); //Base gun    
      bobj.sun(); //Derived sun (Override)
      bobj.run(); //Base run

      //bobj.run(11);
      // bobj.mun();


    }
}