package com.tnsif.miniproject1;
import java.sql.*;
import java.sql.DriverManager;
import java.util.*;
public class JDPC {
	public static void show() throws SQLException
	{
	String url="jdbc:mysql://localhost:3306/jd";
	String username="root";
	String password="2002";
	String query="select *from employee";
	Connection nec=DriverManager.getConnection(url,username,password);
	Statement men=nec.createStatement();
	ResultSet kr=men.executeQuery(query);
    while(kr.next()) {
		System.out.println("id is"+kr.getInt(1));
		System.out.println("Name is"+kr.getString(2));
		System.out.println("salary is"+kr.getInt(3));
		System.out.println("designtion is"+kr.getString(4));
		System.out.println("location is"+kr.getString(5));
	}
    nec.close();
	}
	public static void insert() throws SQLException{
		String url="jdbc:mysql://localhost:3306/jd";
		String username="root";
		String password="2002";
		Scanner re= new Scanner(System.in);
		System.out.println("Enter the employee id:");
		int employeeid=re.nextInt();
		re.nextLine();
		System.out.println("Enter the employee name:");
		String employeename=re.nextLine();
		System.out.println("Enter the employee salary:");
		int employeesalary=re.nextInt();
		re.nextLine();
		System.out.println("Enter the employee designtion:");
		String employeedesigntion=re.nextLine();
		System.out.println("Enter the employee location:");
		String employeelocation=re.nextLine();
		String query="insert into employee values("+ employeeid +",'"+employeename+"',"+employeesalary+",'"+employeedesigntion+"','"+ employeelocation +"');";
		Connection nec=DriverManager.getConnection(url,username,password);
		Statement men=nec.createStatement();
		int rows = men.executeUpdate(query);
		System.out.println("numbers of rows are affected :"+rows);
		nec.close();
	    }
	    public static void delete() throws SQLException{
		String url="jdbc:mysql://localhost:3306/jd";
		String username="root";
		String password="2002";
		Scanner re= new Scanner(System.in);
		System.out.println("Enter the employee id:");
		int employeeid=re.nextInt();
	    String query="delete from employee where employeeid="+ employeeid; 
		Connection nec=DriverManager.getConnection(url,username,password);
		Statement men=nec.createStatement();
		int rows=men.executeUpdate(query);
		System.out.println("numbers of rows are affected :"+rows);
		nec.close();
	    }
	    public static void Update() throws SQLException{
		String url="jdbc:mysql://localhost:3306/jd";
		String username="root";
		String password="2002";
		Connection nec=DriverManager.getConnection(url,username,password);
		 Statement men=nec.createStatement();
		Scanner re= new Scanner(System.in);
		System.out.println("5->name change");
		System.out.println("6->salary change");
		System.out.println("7->designation change");
		System.out.println("8->location change");
		System.out.println("where want  to update");
		int column=re.nextInt();
		switch(column) {
		case 5:
		    Scanner A=new Scanner(System.in);
		    System.out.println("Enter the name");
		    String name=A.nextLine();
		    System.out.println("Enter the id");
		    int id=A.nextInt();
		    String query="update employee set employee name ='"+name+"' where employeeid="+id;
		    int rows=men.executeUpdate(query);
		    nec.close();
		    break;
		case 6:
		    Scanner B=new Scanner(System.in);
		    System.out.println("Enter the salary");
		    String salary=B.nextLine();
		    System.out.println("Enter the id");
		    int i=B.nextInt();
		    String quer="update employee set salary ='"+salary+"' where employeeid="+i;
		    int row=men.executeUpdate(quer);
		    nec.close();
		    break;
		case 7:
		 Scanner c=new Scanner(System.in);
		    System.out.println("Enter the designation");
		    String designation=c.nextLine();
		    System.out.println("Enter the id");
		    int ie=c.nextInt();
		    String que="update employee set salary ='"+designation+"' where employeeid="+ ie;
		    int rowss=men.executeUpdate(que);
		   nec.close();
		    break;
		case 8:
		    Scanner to=new Scanner(System.in);
		    System.out.println("Enter the location");
		    String location=to.nextLine();
		    System.out.println("Enter the id");
		    int iee=to.nextInt();
		    String queee="update employee set salary ='"+location+" 'where employeeid="+ iee;
		    Statement statee=nec.createStatement();
			int r=men.executeUpdate(queee);
		    nec.close();
		    break;
		    
		    }
	    }    
	    public static void main(String[] args) throws SQLException {
	       Scanner k=new Scanner(System.in);
	    	System.out.println("do you want change anything? 1--> change\n 0-->not change");
	    	int h=k.nextInt();
	    	while(h==1) {
	    	System.out.println("1->insert\n 2->delete\n3->show\n4->update");
		    System.out.println("Enter the number");
			int option=k.nextInt();
			switch(option) {
			case 1:
			     insert();
			     show();
			     break;
			case 2:
		          delete();
		          show();
		          break;
			case 3:
		           
		          show();
		          break;
			case 4:
			      Update();
		          show();
		          break;
			}
			System.out.println("do you want to continue:");
			 h=k.nextInt();

			}	

System.out.println("thank you");

			     
			}
	
		
		
	
	
	
		
	

}
