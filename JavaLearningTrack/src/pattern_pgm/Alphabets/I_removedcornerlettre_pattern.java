package pattern_pgm.Alphabets;
import java.util.Scanner;
class I_removedcornerlettre_pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
			if( i==n||i==1||j==n/2){
				System.out.print("*");
			}
			else{
			System.out.print(" ");
				
			}
		}
			System.out.println();
		
			
			}
		}
}

//i==1&&j<n/2&&j>1||i==n/2&&j<=n/2||j==1&&i>1||i==n&&j<=n/2||j==n/2&&j>n/2