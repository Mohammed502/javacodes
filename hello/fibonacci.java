package hello;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int f0=0,f1=1;
	for(int i=0;i<n;i++) {
		System.out.println(f0);
		int fib=f0+f1;
		f0=f1;
		f1=fib;
	}

	}

}
