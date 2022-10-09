// Java program to find cubic root of a number
// using Binary Search
import java.io.*;

class GFG
{
	// Returns the absolute value of n-mid*mid*mid
	static double diff(double n,double mid)
	{
		if (n > (mid*mid*mid))
			return (n-(mid*mid*mid));
		else
			return ((mid*mid*mid) - n);
	}
	
	// Returns cube root of a no n
	static double cubicRoot(double n)
	{
		// Set start and end for binary search
		double start = 0, end = n;

		// Set precision
		double e = 0.0000001;

		while (true)
		{
			double mid = (start + end)/2;
			double error = diff(n, mid);

			// If error is less than e then mid is
			// our answer so return mid
			if (error <= e)
				return mid;

			// If mid*mid*mid is greater than n set
			// end = mid
			if ((mid*mid*mid) > n)
				end = mid;

			// If mid*mid*mid is less than n set
			// start = mid
			else
				start = mid;
		}
	}
	
	// Driver program to test above function
	public static void main (String[] args)
	{
		double n = 3;
		System.out.println("Cube root of "+n+" is "+cubicRoot(n));
	}
}

// This code is contributed by Pramod Kumar
