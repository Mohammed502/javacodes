package kunalkushwadsa;

public class evendigits {
public static void main(String[] args) {
	int a[]= {12,345,2,6,7869};
	int ans=findnumbers(a);
	System.out.println(ans);
}
public static int findnumbers(int []a) {
	int counter=0;
	for(int i=0;i<a.length;i++) {
		if(digitspluseven(a[i])) {
			counter++;
		}
	}
	return counter;
}
public static boolean digitspluseven(int i) {
	int count=0;
	while(i>0) {
	 count++;
	 i=i/10;
	}
	if(count%2==0) {
		return true;
	}else {
	return false;
	}
}
}
