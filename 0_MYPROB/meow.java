


public class meow 
{
    public static void main(String[] args) 
    {
        int[] a = new  int[4];
        a[0] = 1;
        a[1] = 3;
        a[2] = 6;
        a[3] = 9;

        change(a);


        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

    }


    public static void change(int[] a)
    {
        a[0] = 100;
    }



}


