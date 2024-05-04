abstract class Demo
{
    public int A, B;
    
    public Demo()
    {  
        System.out.println("Inside Demo Constructor");
        this.A=0;
        this.B=0;
    }

    abstract void fun();

    void gun()
    {
        System.out.println("Inside gun of Demo");
    }
}

class Hello extends Demo
{
    public Hello()
    {
      System.out.println("Inside Hello Countructor");
    }
    public void fun()
    {
      System.out.println("Inside fun of Hello");
    }
}

class AbstractDemo1
{
    public static void main(String arg[])
    {
        Hello hobj=new Hello();
        hobj.fun();
        hobj.gun();

    }
}