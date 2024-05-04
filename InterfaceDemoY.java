//not runnable , to demonstrate that one interface can extends another interface
interface Demo
{
    void fun();

}

interface Hello implements Demo
{
    void gun();

}

class Marvellous extends Hello, Demo
{
    public  void fun()
    {

    }
    public void  gun()
    {

    }
}