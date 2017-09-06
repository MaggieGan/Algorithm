//import StdOut;
// import stdlib library
//import edu.princeton.cs.algs4.StdOut; 
/*
  To use StdOut, should put StdOut.java file in the same directory;
  no need to use import;
*/

import java.lang.Math;
import java.util.Random;
import java.util.list;
import java.util.ArrayList;

public class exercise11
{
	private static void exercise111()
	{
		StdOut.println("1.1.1:");
		StdOut.println((0+15)/2);
		StdOut.println(2.0e-6*100000000.1);
		StdOut.println(true && false || true && true);	
	}
	
	private static void exercise112()
	{
		StdOut.println((1 + 2.236)/2); // float
		StdOut.println(1 + 2 + 3 + 4.0); // float
		StdOut.println(4.1 >= 4); // boolean
		StdOut.println(1 + 2 + "3"); // string
	}
	
	private static void exercise113()
	{
		int a1 = StdIn.readInt();
		int a2 = StdIn.readInt();
		int a3 = StdIn.readInt();
		//if(StdIn.isEmpty()) {		
			if (a1==a2 && a2==a3){
				StdOut.print("equal");
			}
			else {
				StdOut.print("not equal");
			}
		//}
	}
	
	private static void exercise115()
	{
		StdOut.println("1.1.5");
		StdOut.println("Please input two doubles");
		double x,y;
		x = StdIn.readDouble();
		y = StdIn.readDouble();
		
		if (x>0 && x<1 && y>0 && y<1){
			StdOut.print("True");
		}
		else{
			StdOut.print("False");
		}
		
		//StdOut.print(x>0 && x<1 && y>0 && y<1);
	}
	
	private static void exercise116()// Fibonacci
	{
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++)
		{
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}
	
	private static void exercise118()
	{
		StdOut.println("1.1.8");
		System.out.println('b'); // print char type
		System.out.println('b' + 'c'); // print int type ??? why????
		System.out.println((char) ('a' + 4)); // print char type
		StdOut.println();
	}
	
	
	private static String my2BinaryString(int N)
	{
		String s = "";
		for (int n = N; n > 0; n /= 2)
			s = (n % 2) + s;
		
		return s;
	}
	
	private static void exercise119()
	{

		//exercise118();
		StdOut.println("Please input an integer:");
		int N = StdIn.readInt();
		
		StdOut.println("method1:");
		String s = my2BinaryString(N);
		StdOut.println(s);
		
		StdOut.println("method2:");
		s = Integer.toBinaryString(N);
		StdOut.println(s);
		
	}	
	
	private static void exercise1111()
	{
		boolean[][] a;
		String s;
		double r;
		a = new boolean[10][10];
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
			{
				r = Math.random();
				if (r > 0.5)
				a[i][j] = true;
				else a[i][j] = false;
			}
			
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
			{
				if (a[i][j] == true)
					s = "*";
				else s = " ";
				StdOut.printf("%d row %d column:%s \n", i,j,s);
			}

	}
	
	public static void exercise1112()
	{
		int[] a = new int[10];
		StdOut.println("loop1:");		
		for (int i = 0; i < 10; i++)
		{
			a[i] = 9 - i;
			StdOut.printf("%d ",a[i]);
			
		}
		StdOut.println();
		StdOut.println("loop2:");
		for (int i = 0; i < 10; i++)
		{
			
			a[i] = a[a[i]];
			StdOut.printf("%d ",a[i]);
		}
		StdOut.println();		
		StdOut.println("loop3:");		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}

		
	}
	
	public static int lg(int n)
	{
		int num = 0;
		
		while ( n / 2 != 0)
		{
			num++;
			n = n / 2;
			
		}
		
		return num;
	}
	
	public static void exercise1114()
	{
		StdOut.println("Please input an integer:");
		int n = StdIn.readInt();
		int num = lg(n);
		StdOut.printf("lg(%d) >= %d", n, num);
	}
	
	public static int[] histogram(int[] a, int m)
	{
		int[] b = new int[m];
		for (int i=0; i<m; i++)
		{
			b[a[i]]++;
		}
		return b;
	}
	
	public static void exercise1115()
	{
		int m = 10;
		int[] a = new int[m];
		int[] b = new int[m];
		Random random = new Random();
		for (int i=0; i<m; i++)
			a[i] = random.nextInt(m-1);
		
		b = histogram(a, m);
		
		StdOut.println("Input array: ");
		for (int j=0; j<m; j++)
			StdOut.printf("%d ",a[j]);
		StdOut.println();
		StdOut.println("Output array: ");
		for (int j=0; j<m; j++)
			StdOut.printf("%d ",b[j]);
		StdOut.println();
	}
	
	public static String exR1(int n)
	{
		if (n <= 0) return "";
		return exR1(n-3) + n + exR1(n-2) + n;
	}
	
	public static void exercise1116()
	{
		String s = exR1(6);
		StdOut.println(s);
	}
	
	public static int mystery(int a, int b)
	{
		//StdOut.printf("a=%d, b=%d \n", a,b);
		if (b==0) return 0;
		if (b%2 == 0) return mystery(a+a, b/2);
		return mystery(a+a, b/2) + a;
	}

	public static int mystery2(int a, int b)
	{
		//StdOut.printf("a=%d, b=%d \n", a,b);
		if (b==0) return 1;
		if (b%2 == 0) return mystery2(a*a, b/2);
		return mystery2(a*a, b/2) * a;
	}
	
	public static void exercise1118()
	{
		int a = mystery(2,25);
		StdOut.printf("mystery(2,25) = %d\n", a);
		
		a = mystery(3,11);
		StdOut.printf("mystery(3,11) = %d\n", a);		

		int b = mystery2(2,25);
		StdOut.printf("mystery2(2,25) = %d\n", b);
		
		b = mystery2(3,11);
		StdOut.printf("mystery2(3,11) = %d\n", b);	

		
	}	
	
	public static long F(int N)
	{
		if (N == 0) return 0;
		if (N == 1) return 1;
		return F(N-1) + F(N-2);
	}
	
	public static long F2(int N)
	{
		//IllegalArgument Exception
		if (N < 0)
			throw new IllegalArgumentException("argument N in function F2 should be ");
		
		long[] result = new long[N+1];
		
		result[0] = 0; result[1] = 1;
		for(int i =2; i<= N; i++)
			result[i] = result[i-1] + result[i-2];
		
		return result[N];
			
	}
	
	public static void exercise1119()
	{
		for (int N = 0; N < 10; N++)
			StdOut.println(N + " " + F(N));
		
	}	
	
	public static double lnFactorialN(int N)
	{
		if(N==0) return 0; // return value of ln0!, rather than 0!
		return Math.log(N) + lnFactorialN(N-1);
		
	}
	
	public static void exercise1120()
	{
		for (int N = 0; N < 10; N++)
			StdOut.println(N + " " + lnFactorialN(N));
		
	}		
	
	
	public static void exercise1121(int M)
	{	
		StdOut.println("please input your name and two integers followed by a newline");
		
		
		String nmae = null;
		int first,second;
		
		if (StdIn.hasNextLine())
		{
			name = StdIn.readString();
			first = StdIn.readInt();
			second = StdIn.readInt();
			StdOut.printf("%-10s|%-10d|%-10d|%-10.3f", name, first, second, (first*1.0)/second);
		}
		
		StdOut.println();
		
	}
	
	public static void main(String[] args)
	{

		exercise1121();
	
	
	}
	
}