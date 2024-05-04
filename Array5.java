import java.util.*;

class Array5 
{
    public static void main(String Arg[])
    {   
        int Arr[][]=new int[4][];
        Arr[0]=new int[2];
        Arr[1]=new int[5];
        Arr[2]=new int[3];
        Arr[3]=new int[7];
        
        Scanner sobj =new Scanner(System.in);

         for (int i = 0; i < Arr.length; i++) 
         {
            for (int j = 0; j < Arr[i].length; j++) 
            {
                System.out.print("Enter value for Arr[" + i + "][" + j + "]: ");
                Arr[i][j] = sobj.nextInt();
            }
         }
        
        sobj.close();

        System.out.println("Array elements:");
        
        for (int i = 0; i < Arr.length; i++) 
        {
            for (int j = 0; j < Arr[i].length; j++) 
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }    

    }
}