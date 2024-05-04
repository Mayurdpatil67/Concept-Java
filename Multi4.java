class Demo extends Thread 
{
    public void run() //Running state
    {
        for(int i =0 ; i < 1000; i ++)
        {}
        System.out.println("End of thread");

    }
}
class Multi4 
{
     public static void main(String arg[])throws Exception 
     {
        System.out.println("Curent Thread is "+Thread.currentThread().getName());

         Demo dobj=new Demo();//New State 
         dobj.start(); // Runnable State 
         dobj.join();
         System.out.println("End of main thread");

     }
}