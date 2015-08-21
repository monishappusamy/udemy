
public class EmployeeImpl {

	public static void main(String[] args) {
		Employee emp[] = createEmployee();
		
		Employee current; int j;
		for(int i=0; i<emp.length; i++){
			current = emp[i];
			j = i-1;
			while (j >=0 && emp[j].getemployeeId() > current.getemployeeId()){
				emp[j+1] = emp[j];
				j = j - 1;
				
			emp[j+1] = current;  	
			}
		}
		for (int i=0; i<4; i++)
			System.out.println(emp[i].getfirstName());
	}
	
	public static Employee[] createEmployee(){
		Employee emp[] = new Employee[4];
		
		emp[0] = new Employee();
		emp[0].setfirstName("Employee4");
		emp[0].setemailId("Employee1@gmail.com");
		emp[0].setemployeeId(100000004);
		emp[0].setlastName("kumar");
		
		emp[1] = new Employee();
		emp[1].setfirstName("Employee3");
		emp[1].setemailId("Employee2@gmail.com");
		emp[1].setemployeeId(100000003);
		emp[1].setlastName("kumar");
		
		emp[2] = new Employee();
		emp[2].setfirstName("Employee2");
		emp[2].setemailId("Employee3@gmail.com");
		emp[2].setemployeeId(100000002);
		emp[2].setlastName("kumar");
		
		emp[3] = new Employee();
		emp[3].setfirstName("Employee1");
		emp[3].setemailId("Employee4@gmail.com");
		emp[3].setemployeeId(100000001);
		emp[3].setlastName("kumar");
		
		return emp;
	}
}
