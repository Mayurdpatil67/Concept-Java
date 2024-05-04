class Demo extends Thread
{
    public void run() //Running state
    {}
}
class Multi6 
{
    public static void main (String Args[]) throws Exception
    {
        System.out.println("Current thread is "+Thread.currentThread().getName());

        Demo dobj1=new Demo(); //New state
        Demo dobj2=new Demo(); //New state
        
        dobj1.setPriority(8);
        dobj2.setPriority(10);

        dobj1.start(); //Runnable state
        dobj2.start(); //Runnable state

        System.out.println("Priority of obj1 is "+dobj1.getPriority());
        System.out.println("Priority of obj2 is "+dobj2.getPriority());


    }    
}
// MIN_PRIORITY     1
// NORM_PRIORITY    5
// MAX_PRIORITY     10