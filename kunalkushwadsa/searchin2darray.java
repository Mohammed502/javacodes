package kunalkushwadsa;

import java.util.Arrays;

public class searchin2darray {

	public static void main(String[] args) {
		int a[][]= {
				{23,4,1},
				{16,12,3,9},
				{18,19}
		};
		int target=19;
		int ans[]=search(a,target);
		System.out.println(Arrays.toString(ans));

	}
	static int [] search(int a[][],int target) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==target) 
					return new int[]{i,j};
				
			}
		}
		return new int[] {-1,-1};
		
	}

}
