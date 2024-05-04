class Demo extends Thread
{
    public void run()   // Running state
    {
        for(int i = 1; i < 10; i++)
        {
            try
            {
                System.out.println("Value of i is : "+i);
                Thread.sleep(5000);
            }
            catch(Exception obj)
            {}
        }
    }
}

class Multi5 
{
    public static void main(String arg[])throws Exception
    {
        System.out.println("Current thread is"+Thread.currentThread().getName());
        Demo dobj =new Demo(); //New state 
        dobj.start(); //Runnable state
        dobj.join();

        System .out.println("End of main thread");


    }
}