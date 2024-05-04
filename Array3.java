class Array3
{   
    public static void main (String Arg[])
    {
    int Arr[][]= {{10,20,30},{40,50},{60,70,80},{90,100,110,120,130},{140}};

    int i=0,j=0;
     //   1       2       3    Outer
    for(i=0;i<Arr.length;i++)
    {
    //       1       2        3    Inner
       for(j=0;j<Arr[i].length;j++)
       {
        System.out.print(Arr[i][j]+"\t");
       }
       System.out.println();
    }

    }
}