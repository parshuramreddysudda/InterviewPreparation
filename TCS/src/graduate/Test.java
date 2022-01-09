/**
 * 
 */
package graduate;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Bachina Akhila
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void displayStudentDetails(Graduate[] graduateStudent )
	{
		for(int i=0;i<graduateStudent.length;i++)
		{
			System.out.println("studentName:%s%n,StudentId:%s%n,studentGrade:%d%n,studentAge:%d%n:graArr[i].getStudentName(),graArr[i].getStudentId(),graArr[i].getGrade(),graArr[i].getAge()");
			if(graduateStudent[i].isPassed(graduateStudent[i].getGrade())) 
					{
					 graduateStudent[i].collectResult();
					}
	
		}
	
	}
	public static void displayStudentDatails(UnderGraduate[] underGraduateStudent)
	{
		for(int j=0;j<underGraduateStudent.length;j++)
		{
			System.out.println("StudentName:%s%n,studentId:%s%n,studentGrade:%d%n,studentAge:%d%n:ugraArr[i].getStudentName(),ugraArr[i].getStudentId(),ugraArr[i].getGrade(),ugraArr[i].getAge()");
			if(underGraduateStudent[j].isPassed(underGraduateStudent[j].getGrade()))
					{
					underGraduateStudent[j].collectResult();
					}
		}
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		boolean run=true;
		Scanner scanner=new Scanner(System.in);
		Graduate[] graArry=new Graduate[20];
		UnderGraduate[] underGraArry=new UnderGraduate[20];
		System.out.println("press1 to add student details for graduation");
		System.out.println("press2 to add student details for undergraduation");
		System.out.println("press3 to exit");
		int choose=scanner.nextInt();
		try
		{
			do
			{
		switch(choose) 
		{
		case 1:
			for( int i=0;i<=2;i++)
			{
				graArry[i]=new Graduate();
				System.out.println("enter student name");
				String studentName=scanner.next();
				graArry[i].setStudentName(studentName);
				System.out.println("enter student id");
				String studentId=scanner.next();
				graArry[i].setStudentId(studentName);
				System.out.println("enter grade");
			    int grade=scanner.nextInt();
				graArry[i].setGrade(grade);
				System.out.println("enter age");
				int age=scanner.nextInt();
				graArry[i].setAge(age);
			}
				displayStudentDetails(graArry);
				continue;
				case 2 :
					for( int j=0;j<=2;j++)
					{
					    underGraArry[j]=new UnderGraduate();
						System.out.println("enter student name");
						String studentName=scanner.next();
						underGraArry[j].setStudentName(studentName);
						System.out.println("enter student id");
						String studentId=scanner.next();
						underGraArry[j].setStudentId(studentName);
						System.out.println("enter grade");
					    int grade=scanner.nextInt();
						underGraArry[j].setGrade(grade);
						System.out.println("enter age");
						int age=scanner.nextInt();
						underGraArry[j].setAge(age);
					}
						displayStudentDatails(underGraArry);
						continue;
				case 3:
					break; 
					default:
						System.out.println("detect wrong error");	
		}
		System.out.println("continue prorgram yes enter yes,no enter no");
		String choice=scanner.next();
		run=choice.equals("yes")?true:false;
					
		     } while (run);

		} catch (InputMismatchException e) {
				System.out.println("Incorrect input found. Program Exited.");
			} finally {
				scanner.close();
			}
	}
}


	
	


	
		
		
		

	
