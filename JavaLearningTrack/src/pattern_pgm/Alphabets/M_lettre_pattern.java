package pattern_pgm.Alphabets;
import java.util.Scanner;
class M_lettre_pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
			if(j==n||j==0||i+j==n&&i<=n/2||i==j&&i<=n/2){
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
 