
class Base
{
    public  int A ,B;

    public Base()
    {
        System.out.println("Base Countructor");
    }
    public void fun()
    {
        System.out.println("Base fun");
    }
}
class Derived extends Base
{
    public int X,Y;

   public Derived()
   {
    System.out.println("Derived Countructor");
   }
   public void gun()
   {
    System.out.println("Derived gun");
   }
}


class Single
{
    public static void main (String arg [])
    {
      Derived dobj=new Derived();
      dobj.fun();
      dobj.gun();
    }
}