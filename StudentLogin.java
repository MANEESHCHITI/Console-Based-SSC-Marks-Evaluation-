
import java.util.Scanner;

public class StudentLogin {

	
	
	
	static Scanner ss=new Scanner(System.in);
	public static  void studEntry()
	{
		
		System.out.print(StudentData.textCyan+"					Enter hallticket Number:-"+StudentData.resetAll);
		int anyStud=ss.nextInt();
		System.out.println();
		
		if(1738616811==anyStud)  
			
		{
			
		
			System.out.println(StudentData.textCyan+"						NAME:-"+StudentData.resetAll+"CHITI MANEESH");
			
			System.out.println();
			
			System.out.println(StudentData.backCyan+"						Subjects		"+"Marks		"+ "Grade																			"+StudentData.resetAll);
			System.out.println();
			for(int i=0;i<StudentData.student1.length;i++)
			{
				System.out.println("					"+StudentData.subjects[i]+"			  "+StudentData.student1[i]+"		 "+StudentData.grade1[i]);
				System.out.println();
			}
			System.out.println();
			System.out.println(StudentData.textGreen+"							TOTAL MARKS:-"+StudentData.resetAll+StudentData.sum1);
			System.out.println();
			System.out.println(StudentData.textGreen+"                            				OVERALL GRADE:-"+StudentData.resetAll+StudentData.overallGrade[0]);
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//	studEntry();
			LectureLogin.select1();
			
		}
		else if(1738616812==anyStud)
		{
		//	System.out.println("1911120402");
			//System.out.println();
			
			System.out.println(StudentData.textCyan+"						NAME:-"+StudentData.resetAll+"YADAGIRI VAMSHI"+StudentData.resetAll);
			System.out.println();
		
			System.out.println(StudentData.backCyan+"						Subjects		"+"Marks		"+ "Grade																			"+StudentData.resetAll);
			System.out.println();
			for(int i=0;i<StudentData.student2.length;i++)
			{
				System.out.println("					"+StudentData.subjects[i]+"			  "+StudentData.student2[i]+"		 "+StudentData.grade2[i]);
				System.out.println();
			}
			System.out.println();
			System.out.println(StudentData.textGreen+"							TOTAL MARKS:-"+StudentData.resetAll+StudentData.sum2);
			System.out.println();
			System.out.println(StudentData.textGreen+"                            				OVERALL GRADE:-"+StudentData.resetAll+StudentData.overallGrade[1]);
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//	studEntry();
			LectureLogin.select1();
		}
		else if(1738616813==anyStud)
		{
		
		
			System.out.println(StudentData.textCyan+"						NAME:-"+StudentData.resetAll+"BONGIR VARDHAN");
			
			System.out.println();
			System.out.println(StudentData.backCyan+"						Subjects		"+"Marks		"+ "Grade																			"+StudentData.resetAll);
			System.out.println();
			for(int i=0;i<StudentData.student3.length;i++)
			{
				System.out.println("					"+StudentData.subjects[i]+"			  "+StudentData.student3[i]+"		 "+StudentData.grade3[i]);
				System.out.println();
			}
			System.out.println();
			System.out.println(StudentData.textGreen+"							TOTAL MARKS:-"+StudentData.resetAll+StudentData.sum3);
			System.out.println();
			System.out.println(StudentData.textGreen+"                            				OVERALL GRADE:-"+StudentData.resetAll+StudentData.overallGrade[2]);
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			//studEntry();
			LectureLogin.select1();
		}
		else if(1738616814==anyStud)
		{
		
			
			System.out.println(StudentData.textCyan+"						NAME:-"+StudentData.resetAll+"GOVARDHANA KRISHNA"+StudentData.resetAll);
			System.out.println();
			
			System.out.println(StudentData.backCyan+"						Subjects		"+"Marks		"+ "Grade																			"+StudentData.resetAll);
			System.out.println();
			for(int i=0;i<StudentData.student4.length;i++)
			{
				System.out.println("					"+StudentData.subjects[i]+"			  "+StudentData.student4[i]+"		 "+StudentData.grade4[i]);
				System.out.println();
			}
			System.out.println();
			System.out.println(StudentData.textGreen+"							TOTAL MARKS:-"+StudentData.resetAll+StudentData.sum4);
			System.out.println();
			System.out.println(StudentData.textGreen+"                            				OVERALL GRADE:-"+StudentData.resetAll+StudentData.overallGrade[3]);
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			//studEntry();
			LectureLogin.select1();
			
		}
		else
		{
			System.out.println("Invalid");
			studEntry();
			
		}
		
		
	}
	
}
