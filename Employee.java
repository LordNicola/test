import java.io.Serializable;
import java.io.*;

public class Employee implements java.io.Serializable{
	String name;
	String age;
	double salary;
	String gender;
	//private static final long serialVersionUID = 1L;
	
	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.salary);
		System.out.println(this.gender);
	}
	
	public static void main(String[] args) throws IOException{
		
		Employee emp1 = new Employee();
		emp1.name = "李嘉诚";
		emp1.age = "96";
		emp1.salary = 1000000;
		emp1.gender = "男";
		
		FileOutputStream fileout = new FileOutputStream("123.int");
		ObjectOutputStream objectout = new ObjectOutputStream(fileout);
		
		objectout.writeObject(emp1);
		objectout.close();
		fileout.close();
		

	}
}