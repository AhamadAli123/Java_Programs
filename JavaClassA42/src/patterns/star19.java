package patterns;

public class star19 {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==n && i!=1 && i!=n || i==n && j!=1 && j!=n || j==2 && i!=1  && i!=n || i==n && j!=1 && j!=n)
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
