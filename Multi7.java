class Demo extends Thread 
{
    public void run() //Running state 
    {
      
    }
     
    synchronized public void Display()
    {
       //Logic 
    }
     

}
class Multi7 
{
    public  static void main(String Arg [])
    {
        System.out.println("Current Thread is "+Thread.currentThread().getName());

        Demo dobj1 =new Demo(); //New State 
        Demo  dobj2=new Demo (); //New state

        dobj1.setPriority(8);
        dobj2.setPriority(10);

        dobj1.start();  //Runnable state 
        dobj2.start();  //Runnable state

        System.out.println("Priority of dobj1 is "+dobj1.getPriority());
        System.out.println("Priority of dobj2 is "+dobj2.getPriority());



    }
}

// MIN_PRIORITY     1
// NORM_PRIORITY    5
// MAX_PRIORITY     10