package Exception_programs;
import java.util.Scanner;
class Demo103
{
void fun1(){
			 System.out.println("Enter the Numerator");
   Scanner scan=new Scanner (System.in);
   int a=scan.nextInt();
   System.out.println("Enter the Denominator");
   int b=scan.nextInt();
   int c=a/b;
   System.out.println( c);

		 }
}
class Demo2
{
void fun2(){
	Demo103 d1=new Demo103();
		 d1.fun1();
		 }
}

class Demo3
{
void fun3(){
		 Demo2 d2=new Demo2();
		 d2.fun2();
		 }
}
class PropagationofExcption_problem 
{
	public static void main(String[] args) 
	{
		 Demo3 d3=new Demo3();
		 d3.fun3();
	}
}
