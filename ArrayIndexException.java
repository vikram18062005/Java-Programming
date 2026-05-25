import java.util.*;



class ArrayIndexException
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[]={11,21,52,111};

        System.out.println("Enter the index of array :");
        int Index=sobj.nextInt();

        try
        {
            System.out.println("insde try block");
            System.out.println("Element at that index is :"+Arr[Index]);
        }
        catch()
        {
            System.out.println("Exceptionvoccur"+aobj)
        }

    

        System.out.println("End of application");

    }
}