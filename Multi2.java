class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running...");

    }
}
class Multi2 
{
    public static void main(String arg[])
    {
       System.out.println("Inside main");
       
       Demo dobj1 =new Demo();
       Thread t1=new Thread(dobj1);
       Demo dobj2 =new Demo();
       Thread t2=new Thread(dobj2);

       t1.start();
       t2.start();
              

    }
}