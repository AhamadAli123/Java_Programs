package Array_Programs;

public class array_factorial {
	
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		
		}
		return fact;
	}
	public static void main(String[] args) {
		
		int a[]= {4,5,6,8};  
		for(int i:a) {
			System.out.println(i+":"+fact(i));
		}
		 
		
			
		}
		
		

	}


