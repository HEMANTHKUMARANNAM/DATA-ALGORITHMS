import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class suffixarrat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        ArrayList<String> originalList = new ArrayList<>();

        
        for (int i = 0; i < a.length() ; i++)
        {
            originalList.add(a.substring(i, a.length()));
        }


        ArrayList<String> cloneList = new ArrayList<>();

        // Clone the ArrayList
        for(int i = 0; i < originalList.size(); i++)
        {
            cloneList.add(originalList.get(i));
        }

        Collections.sort(cloneList);

        int[] array = new int[cloneList.size()];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = originalList.indexOf( cloneList.get(i) ) ;
        }

        for (int i = 0; i < array.length;i++)
        {
            System.out.println(array[i] );
        }
        sc.close();


    }
}
