package LoginInfo;
import Classes.*;
import Interfaces.*;
//import FileIO.*;

import java.util.Scanner;

public class Login
{
	Scanner in = new Scanner(System.in);

	private String	usname;
	private String pswrd;
	
	//////////////////////////////////////////////////
	private String regFirstName = "Abdullah";
	private String regLastName = "Ashik";
	private String regUserName = "customer";
	private String regEmailId = "abdullahashik666@gmail.com";
	private String regPassword = "password";
	private String regPhoneNumber = "01779585277";
	private String regRegion =  "Bangladesh";
	private String regCity = "Dhaka";
	private String regArea = "Uttra";
	private String regAddress = "Sector-6,Road No.-5";
	////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////
	public void setRegFirstName(String regFirstName)     {this.regFirstName = regFirstName;}
	public void setRegLastName(String regLastName)       {this.regLastName = regLastName;}
	public void setRegUserName(String regUserName)       {this.regUserName =regUserName ;}
	//public void setRegPassword(){return regFirstName;}
	public void setRegEmailId(String regEmailId)         {this.regEmailId = regEmailId;}
	public void setRegPhoneNumber(String regPhoneNumber) { this.regPhoneNumber = regPhoneNumber;}
	public void setRegRegion(String regRegion)           {this.regRegion = regRegion;}
	public void setRegCity(String regCity)               {this.regCity = regCity;}
	public void setRegArea(String regArea)               {this.regArea = regArea;}
	public void setRegAddress(String regAddress){this.regAddress = regAddress;}
/////////////////////////////////////////////////////////////////////////////////
	
	public String getRegFirstName(){return regFirstName;}
	public String getRegLastName(){return regLastName;}
	public String getRegUserName(){return regUserName;}
	//public String getRegPassword(){return regFirstName;}
	public String getRegEmailId(){return regEmailId;}
	public String getRegPhoneNumber(){return regPhoneNumber;}
	public String getRegRegion(){return regRegion;}
	public String getRegCity(){return regCity;}
	public String getRegArea(){return regArea;}
	public String getRegAddress(){return regAddress;}
	
	
	public boolean check()	{
		        System.out.print("\n\t Please Login First with your User name & Password\n");
		        System.out.print("\t Enter Username : ");
			    	usname = in.nextLine();
				
				System.out.print("\t Enter Password : ");
				 pswrd = in.nextLine();
				System.out.println();
	
		if("admin".equals(usname) && "password".equals(pswrd))
		{
			System.out.println(" You are logged in succesfully.... \n");
			return true;
		}
		else
		{System.out.println(" Invalid userName of password \n");
		}return false;
	}
	
	public void resgistraion()
	{
		System.out.println("\n\t Give The Information For Registration : \n");
		System.out.print("\t Enter Your First Name : ");
		regFirstName = in.nextLine();
		
		System.out.print("\t Enter Your Last Name : ");
		regLastName = in.nextLine();
		
		System.out.print("\t Enter Your User Name : ");
		regUserName = in.nextLine();
		
		System.out.print("\t Enter Your Email Id : ");
		regEmailId = in.nextLine();
		
		System.out.print("\t Enter Your Phone Number : ");
		regPhoneNumber = in.nextLine();
		
		System.out.print("\t Enter Your Password : ");
		regPassword = in.nextLine();
		
		System.out.print("\t Enter Your Region : ");
		regRegion = in.nextLine();
		
		System.out.print("\t Enter Your City : ");
		regCity = in.nextLine();
		
		System.out.print("\t Enter Your Area : ");
		regArea = in.nextLine();
		
		System.out.print("\t Enter Your Address : ");
		regAddress = in.nextLine();
		
		System.out.println("\n\t Account Created Succesfully..............\n");
		
	}
	
	public boolean userLogin()
	{
		System.out.print("\n\t Please Login First with your User name & Password\n");
		System.out.print("\t Enter Username : ");
		String customerUsname = in.nextLine();
				
		System.out.print("\t Enter Password : ");
		String customerPass = in.nextLine();
		System.out.println();
		
		if(customerUsname.equals(regUserName) && customerPass.equals(regPassword))
		{
			System.out.println(" You are logged in succesfully.... \n");
			return true;
		}
		
		else
		{System.out.println(" Invalid userName of password \n");
		}return false;
	}
	
	public void info()
	{
		System.out.println("\t Name         : "+regFirstName+" "+regLastName);
		System.out.println("\t User Name    : "+regUserName);
		System.out.println("\t Email ID     : "+regEmailId);
		System.out.println("\t Phone Number : "+regPhoneNumber);
		System.out.println("\t Address      : "+regAddress+", "+regArea+", "+regCity+", "+regRegion+"\n");
	}
	
	public void address()
	{
		System.out.println("\t Your Delivery Address is : "+regAddress+", "+regArea+", "+regCity+", "+regRegion+"\n");
	}
	
	
	
	
}