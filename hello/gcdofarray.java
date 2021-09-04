package hello;
import java.util.*;
public class gcdofarray {
	public int findGCD(int[] nums) {
		int max=nums[0],min=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}else {
				min=nums[i];
			}
			
		}
		if(min%max!=0) {
			int rem=min%max;
			min=max;
			max=rem;
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {7,5,6,8,3};
		gcdofarray gcd=new gcdofarray();
		System.out.println(gcd.findGCD(a));

	}

}
