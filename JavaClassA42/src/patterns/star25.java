package patterns;

public class star25 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || i+j==n+1 && j<=(n+1)/2 || i==j && j<=(n+1)/2)
				{
				System.out.print("*");
				}
				else 
				{
				System.out.print(" "); 
				}
			}
			System.out.println();
		}
	

	}

}
