class Demo
{
	void fun()
	{
		
	}
}
class NullPointerException_solution{
	public static void main(String[] args) 
	{
		try{
	 Demo d=new Demo();
	 d.fun();
	 d=null;
	 d.fun();
	 }
	 catch(Exception e){
		System.out.println("Invalid references");
	 }



	}}
