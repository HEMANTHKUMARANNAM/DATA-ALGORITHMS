import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ksnap 
{


    public static void main(String[] args) 
    {
        int profit[] = new int[] { 60 , 120 , 100};

        int weight[] = new int[] { 10 , 20 , 30};

        int W = 50;

		ArrayList<data> entries = new ArrayList<data>(); // Create an ArrayList object


        for(int i =0 ; i< profit.length ; i++)
        {
            entries.add( new data(profit[i] , weight[i] ) );
        }

        Collections.sort( entries , Comparator.comparing( data :: getratio ));

        float totalprofit =0;

        while( entries.size() != 0 && W != 0)
        {
            data temp  = entries.get( entries.size()-1);

            if( W > (int)temp.weight  )
            {
                W = W - (int)temp.weight;
                totalprofit += temp.profit;
            }
            else
            {
                totalprofit += temp.ratio*(W);
                W =0;
            }

            entries.remove(temp);


        }

        System.out.println(totalprofit);


        

    }

    static class data
    {
        int profit;
        float weight;
        float ratio;

        data( int profit , float weight)
        {
            this.weight = weight;

            this.profit = profit;

            this.ratio = (float)profit/weight;

            System.out.println(ratio);

        }

        public float getratio()
        {
            return ratio;
        }

    }

    
}
