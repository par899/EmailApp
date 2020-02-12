import java.util.Scanner;

public class EmailInfo {
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity=500;
	private String alternateemail;
	private int  passlength=10;
	private String company_sufix="nanakdev.com";
	//Constructor for firstname and lastname
	public EmailInfo(String firstname,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		//System.out.println(this.firstname+"   "+this.lastname);
		this.department=setDepartment();
		//calling department method here
		//System.out.println("Department is:"+this.department);
		//calling generate random password method
		this.password=generatePassword(passlength);
		System.out.println("password is:"+this.password);
		//combine elements to create emailid
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"."+department+"@"+company_sufix;
		//System.out.println(email);
	}
	
	//ask for department
	private String setDepartment()
	{
		System.out.println("Hello  "+firstname+"\nChoose the codes for department:\n"
				+ "1 Sales "
				+ "\n2 Accounting\n3 Developement\n 0 for None\nEnter Your Department");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice==1) {
			return "Sales";
		}
		else if(deptChoice==2) {
			return "Accounting";
		}
		else if(deptChoice==3) {
			return "Developement";
		}
		else
		{
			return "";
		}
		
	}
	
	//generate random password
	private String generatePassword(int length)
	{
		String Passwordset="ABCDEFGHIJKLMNOPqrstwxyz0123456789@#$&";
		char[] password = new char[length];
		for(int i=0;i<length;i++)
		{
			int random=(int)(Math.random() * Passwordset.length() );
			password[i]=Passwordset.charAt(random);
		}
		return new String(password);
		
	}
	
	//set mailbox capacity
	public void setmailboxCapacity(int capacity)
	{
		this.mailboxCapacity=capacity;
	}
	//set alternate email
	public void alternateEmail(String email)
	{
		this.alternateemail=email;
	}
	
	//change the password
	public void changePassword(String password)
	{
		this.password=password;
	}
	public int getMailBoxCapacity() { return mailboxCapacity;}
	
	public String getalternateEmail() {return alternateemail;}
	
	public String getPassword() {return password;}
	
	public String show_info()
	{
		return "\nDisplay Name:"+firstname+" "+lastname+"\n Company Email "+email+"\n Mail Box Capacity "+
				mailboxCapacity+"mb";
	}
	

}
