
public class Employee {
	
	private String firstName, lastName, emailId;
	private int employeeId;
	
	public void setemployeeId(int employeeId){
		this.employeeId = employeeId;
	}
	
	public int getemployeeId(){
		return employeeId;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
    }

    public String getfirstName() {
    	return firstName;
    }	
    
    public void setlastName(String lastName){
    	this.lastName = lastName;
    }
    
    public String getlastName(){
    	return lastName;
    }
    
    public void setemailId(String emailId){
    	this.emailId = emailId;
    }
    
    public String getemailId(){
    	return emailId;
    }
}
