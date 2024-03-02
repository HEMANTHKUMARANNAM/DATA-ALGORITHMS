// Java program to find number
// of bins required using
// next fit algorithm.

import java.util.ArrayList;
import java.util.Collections;

public class BINPACKING
{

	// Returns number of bins required
	// using next fit online algorithm
	static int nextFit(ArrayList<Integer> data, int n, int c)
	{

		// Initialize result (Count of bins) and remaining
		// capacity in current bin.
		int res = 0;

		// Place items one by one
		for (int i = 0; i < n; i++) 
		{
			int bin_rem = c;
			res++;
			
			for (int j = 0; j < data.size(); j++)
			{
				if( data.get(j) <= bin_rem )
				{
					bin_rem -= data.get(j);
					int meow = data.remove(j);
					System.out.println(meow);
					j--;
				}
			}

			System.out.println("......");

			Collections.sort(data , Collections.reverseOrder());

			if( data.size() == 0)
			{
				return res;
			}

		}


		return res;

	}

	// Driver program
	public static void main(String[] args)
	{
		int weight[] = { 2, 5, 4, 7, 1, 3, 8 };
		int c = 10;
		int n = weight.length;

		ArrayList<Integer> data = new ArrayList<Integer>(); // Create an ArrayList object


		for(int i = 0; i < n; i++)
		{
			data.add(weight[i]);
		}

		Collections.sort(data ,  Collections.reverseOrder());
		
		System.out.println("Number of bins required in Next Fit : " + nextFit(data, n, c));
	}


}


