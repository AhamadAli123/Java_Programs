package patterns;

public class star38 {

	public static void main(String[] args) {
		int n=7;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=n;j++) {
				  //if(j==1 && i<=(n+1)/2 || j==n && i<=(n+1)/2 || i==j && j<=(n+1)/2 
					//	   || i+j==(n+1) && j>=(n+1)/2 || i-j==(n+1)/2 || i+j==n+(n+1)/2)
					   
					  if(i!=1 &&(j==1||j==n||j==i||i+j==n+1)&& i<=(n+1)/2 || i+j==n+(n+1)/2 || i-j==n/2) 
				   
				   {
					   System.out.print(" *");
				   }
				   else {
					   System.out.print("  ");
				   }
			   }
			   System.out.println();

		   }

	}

}
