
import java.util.Scanner;

public class LectureLogin {
	
	
	StudentData obj1=new StudentData();
	StudentLogin obj2=new  StudentLogin();
	
	
	static Scanner s=new Scanner(System.in);
	static String username="maneesh";
	static 	String password="rao";
	static String username1;
	static String password1;
	
	/*static int username=123;
	static int password=456;
	static int username1;
	static int password1;*/
	
	static int a;
	
	
	public static void select1()
	{	System.out.println(StudentData.backMagenta+"								 TELANGANA BOARD OF SECONDARY EDUCATION 																							"+StudentData.resetAll);
		System.out.println();
		System.out.println(StudentData.textGreen+"									1)DEPARTMENT LOGIN"+StudentData.resetAll);
		System.out.println();
		System.out.println(StudentData.textGreen+"									2) RESULT "+StudentData.resetAll);
		System.out.println();
		System.out.println(StudentData.backGreen+"									Select 1 or 2																														"+StudentData.resetAll);
		System.out.println();
		
		 reEntry();
	}
	public static void reEntry()
	{
		System.out.print(StudentData.textGreen+"Enter:-"+StudentData.resetAll);
		 a=s.nextInt();
		 System.out.println();
		 choose();
	}
	public static void choose()
	{
		if(a==1)
		{
		login();
		}
		else if(a==2)
		{
		StudentLogin.studEntry();
		}
		else
		{
			System.out.println(StudentData.textRed+"INVALID"+StudentData.resetAll);
			reEntry();
		}
		
	}
	public static void login()
	{
		System.out.println(StudentData.backMagenta+"									 LECTURER LOGIN																																										"+StudentData.resetAll);
		
		System.out.println();
		loginPage();
	}
	public static void loginPage()
	{
		
		System.out.print(StudentData.textGreen+"USERNAME:-"+StudentData.resetAll);
		 username1=s.next();
		//username1=s.nextInt();
		 System.out.println();
		System.out.print(StudentData.textGreen+"PASSWORD:-"+StudentData.resetAll);
	password1=s.next();
		//password1=s.nextInt();
		System.out.println();
		
		if(username1.equals(username))
		{                                                      // string comparing means use .equals.
			
			if(password1.equals(password))
			{
				System.out.println(StudentData.backGreen+"										SUCCESSFULL LOGIN   																																																                                                                                                                                "+StudentData.resetAll);
				System.out.println();
				StudentData.std();
			}
			else
			{
				
			error();
			}
		}
		else
		{
			
		error();
		}
	}
	public static void error()
	{
		System.out.println(StudentData.textRed+"INVALID CREDENTIALS"+StudentData.resetAll);
		loginPage();
		
	}
}



