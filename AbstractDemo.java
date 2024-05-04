abstract class Demo
{
    public  int A ;
    public int B;

    public  Demo()
    {
        System.out.println("Inside Countructor");
        this.A=0;
        this.B=0;
    }
    
    abstract void fun();
   /* {                         //abstract methods cannot have a body

    }*/

    void gun()
    {
        System.out.println("Inside gun");

    }
} 
class AbstractDemo
{
    public static void main(String arg[])
    {
    //Demo dobj=new Demo();      // Demo is abstract cannot be instantiated
          
    }
}