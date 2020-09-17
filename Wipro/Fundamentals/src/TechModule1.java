import java.util.Scanner;

/**
 * 
 */

/**
 * @author Parsh
 *
 */
public class TechModule1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr = { { "EmpNo","EmpName", "Join Date", "Designation Code", "Department","Basic", "HRA", "IT" },
				{ "1001", "Asish","01/04/2009","e","R&D","20000","8000","3000" } ,
				{ "1002", "Sushma","23/08/2012","c","PM","30000","12000","9000" },
				{"1003", "Rahul","12/11/2008","k","Acct","10000","8000","1000" },
				{"1004", "Chahat","29/01/2013","r","FrontDesk","12000","6000","2000" },
				{"1005", "Ranjan","16/07/2005","m","Engg","50000","20000","20000" },
				{"1006", "Suman","1/01/2000","e","Manufacturing","23000","9000","4400" },
				{"1007", "Tanmay","12/06/2006","c","PM","29000","12000","10000" }
				}; 
		String[][] arrDa= {{"Designatioon Code","Designation","DA"},
				{"e","Engineer","20000"},
				{"c","Consutant","32000"},
				{"k","Clerk","12000"},
				{"r","Receptionst","15000"},
				{"m","Manager","40000"}
				};
		  
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int Id=sc.nextInt();
		Id=Id-1000;
        
        if(Id<=7) {
	System.out.println("EmpNo   Emp_Name  Depatment  Designation  Salary");
        	
            for (int j = 0; j <=4; j++) { 
            	
            	if(j==2) {
            		continue;
            	}
            	else if(j==3) {
            		System.out.print(" "+getDesignation(arrDa,arr[Id][j])+"   ");
            		continue;
            	}
                System.out.print(arr[Id][j] +"    "); 
            }
            
            int sal=Integer.parseInt(arr[Id][5])+Integer.parseInt(arr[Id][6])+Integer.parseInt(arr[Id][7])-Integer.parseInt(getDa(arrDa,arr[Id][3]));
            System.out.print(sal); 
        }
        else {
        	  System.out.print("Invalid Emp Id");
        }
	
            
            
	}
 
 


	private static String getDa(String[][] arrDa, String id) {
		// TODO Auto-generated method stub
	String res = "";
		
		for(int i=0;i<arrDa.length;i++) {
			
			
			if(id.equals(arrDa[i][0])) {
				
//				System.out.print(arrDa[i][1]+" ");
				
				res=arrDa[i][2];
				break;
			}
		}
		return res;
	}

	private static String getDesignation(String[][] arrDa, String id) {
		// TODO Auto-generated method stub
		
		String res = "";
		
		for(int i=0;i<arrDa.length;i++) {
			
			
			if(id.equals(arrDa[i][0])) {
				
//				System.out.print(arrDa[i][1]+" ");
				
				res=arrDa[i][1];
				break;
			}
		}
		return res;
	}
        

}