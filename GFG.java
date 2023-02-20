class GFG
{
	// Prints numbers from 1 to n
	static void printNos(int n)
	{
		if(n <= 100)
		{
			System.out.print(n + " ");
			printNos(n + 1);
		}
		return;
	}

	// Driver Code
	public static void main(String[] args)
	{
		printNos(1);
	}
}

// This code is contributed by Manish_100
