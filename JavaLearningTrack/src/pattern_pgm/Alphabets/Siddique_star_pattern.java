package pattern_pgm.Alphabets;
import java.util.Scanner;
class Siddique_star_pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter thenumber of rows");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
			if(i==1&&j<=n&&j>1||i==n/2&&j<n&&i>1||i==n&&j<n||j==1&&i<n/2&&i>1||j==n&&i>n/2&&i<n){
				System.out.print("*");
			}
			else{
			System.out.print(" ");
				
			}
		}
System.out.print(" ");

		for(int j=1;j<=n;j++){
			if( i==n||i==1||j==n/2){
				System.out.print("*");
			}
			else{
			System.out.print(" ");
				
			}
		}
		System.out.print(" ");
		System.out.print(" ");
			for(int j=1;j<=n;j++){
			if(j==1||i==1&&j<n||i==n&&j<n||j==n&&i<n/*below corner removal*/&&i>1/*Above corner removal*/ ){
				System.out.print("*");
			}
			else{
			System.out.print(" ");
				
			}
		}
		System.out.print(" ");
			for(int j=1;j<=n;j++){
			if(j==1||i==1&&j<n||i==n&&j<n||j==n&&i<n/*below corner removal*/&&i>1/*Above corner removal*/ ){
				System.out.print("*");
			}
			else{
			System.out.print(" ");
				
			}
		}
		System.out.print(" ");
		
		for(int j=1;j<=n;j++){
			if( i==n||i==1||j==n/2){
				System.out.print("*");
			}
			else{
			System.out.print(" ");
				
			}
		}
		System.out.print(" ");

		System.out.print(" ");

for(int j=1;j<=n;j++){
			if(j==n/2&&i>1||i==1&&j<n/2&&j>1||i==n&&j<n/2&&j>1||j==1&&i>1&&i<n||i-j==n/2){
				System.out.print("*");
			}
			else{
			System.out.print(" ");
				
			}
		}
			for(int j=1;j<=n;j++){
			if( j==n&&i<n||i==n&&j<n&&j>1||j==1&&i<n){
				System.out.print("*");
			}
			else{
			System.out.print(" "); 
				
			}
		}
		System.out.print(" ");
			for(int j=1;j<=n;j++){
			if(j==1||i==n/2&&j<n-1||i==1&&j<n||i==n&&j<n){
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