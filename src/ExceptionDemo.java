import java.io.*;
class Room {  
	void color() throws Exception
	{
		System.out.println("Blue");
	}  
}
class ExceptionDemo extends Room
{
	void color() 
	{
		System.out.println("White");
		throw new IOException();
	}

	public static void main(String args[])
	{  
		Room obj = new ExceptionDemo();  
		try
		{
			obj.color();
		}
		catch(Exception e)
		{
			System.out.println("Bharat");
		}
	} 
}