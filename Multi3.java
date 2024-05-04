class Demo extends  Thread
{
    public void run() //Running state
    {
        String name =Thread.currentThread().getName();
        System.out.println("Current thread is "+name);
        for(int i =0 ; i<1000 ; i++)
        {
            System.out.println("Name of thread is "+name+"with counter"+i);
        }

    }
}
class Multi3 
{
    public static void main(String arg[])
    {
       System.out.println("Current Thread is "+Thread.currentThread().getName());
       
       Demo dobj1=new Demo(); //New state
       Demo dobj2=new Demo(); //New state

       dobj1.setName("First_Thread");
       dobj2.setName("Second_Thread");

       dobj1.start();  //Runnable state
       dobj2.start();  //Runnable state


    }
}
