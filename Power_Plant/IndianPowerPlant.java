package Power_Plant;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.Scanner;

interface Behaviours{
	abstract public void DailyGEneration();
	abstract public void MonthlyGEneration();
	abstract public void YearlyGEneration();
}

public class IndianPowerPlant implements Behaviours{
	
	static
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO  POWER PLANTS IN INDIA               	   |");
		System.out.println("====================================================================");
	}
	
	String name;
	int Establishment;
	private String River;
	String Location;
	double Capacity;
	double Initial_cost;
	
	
	public void DailyGEneration() 
	{
		System.out.println("Daily Generation of "+ name + "is "+ Capacity +"MW.");
	}
	public void MonthlyGEneration()
	{	
		System.out.println("Monthly Generation of "+ name + "is "+ Capacity *30 +"MW.");
	}
	public void YearlyGEneration() 
	{	
		System.out.println("Yearly Generation of "+ name + "is "+ Capacity *365 + "MW.");
	}
	
	public static void  start()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Renewable Power Plant");
		System.out.println("2. Non-Renewable Power Plant");
		System.out.println("Press 200 For Exit");
		try {
			System.out.println("Please Enter Your Choice");
			int a = sc.nextInt();

			switch(a)
			{
			case 1: 
				Renewable Renobj = new Renewable();
				Renobj.Renewable();
				break;
			case 2:
				NonRenewable NRref = new NonRenewable();
				NRref.NonRenewabble();
				break;
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a);
			default:
				System.out.println("Please Select Valid Choice.");
				start();
			}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			start();
		}	
	}
	public String getRiver() {
		return River;
	}
	public void setRiver(String river) {
		River = river;
	}	
}

class Login{
	String Emailid ;
	String Password;
	
		//Method
		public void Pass()
		{	
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Please Create Your UserID:-");
			this.Emailid = sc.nextLine();
			
			if(Emailid.matches("[a-zA-Z0-9]+"))
			{
				if(Emailid.length()>= 8)
				{
					iddone();
				}
				else 
				{
					System.out.println("Minimum 8 Characters Required.");
					System.out.println();
					Pass();
				}
				
			}
			else 
			{
				Pass();
			}			
		}
		
		public void iddone()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 to Generate Password by Compiler Or,");
			System.out.println("Enter Any Integer To Create Your Own Password.");
			String a = sc.nextLine();
			
			try {
			if(a.equals("1"))
			{
				this.Password =  Emailid + hashCode();
				
				if(Password.matches("[a-zA-Z0-9]+"))
				{
					System.out.println("====================================================================");
					
					System.out.println("Your Userid is: "+Emailid);
					System.out.println("Your Password is: "+ Password);
					System.out.println();
					System.out.println("Your Account Is Created..");
					
					
					System.out.println();
					System.out.println("====================================================================");
					System.out.println();
				}
				else
				{
					iddone();
				}
						
			}
			else
			{
				System.out.println("Please Create Your Own Password:-");
				this.Password = sc.nextLine();
				
				if(Password.matches("[a-zA-Z0-9@#$%^&*_+]+"))
				{
					
					if(Password.length()>= 8)
					{
						System.out.println("====================================================================");
						
						System.out.println("Your Userid is: "+Emailid);
						System.out.println("Your Password is: "+ Password);
						System.out.println();
						System.out.println("Your Account Is Created..");
						
						
						System.out.println();
						System.out.println("====================================================================");
						System.out.println();
					}
					else 
					{
						System.out.println("Please Enter 8 Character Password");
						System.out.println();
						iddone();
					}
					
				}
				else
				{
					System.out.println("Please Enter 8 Character Password");
					System.out.println();
					iddone();
				}
			}
			}
			catch(InputMismatchException ipe)
			{
				System.out.println("Please Enter Integer");
				System.out.println();
				Pass();
			}
		}

	public void login()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Please Enter Your Userid:-");
		String email = sc.nextLine();
		System.out.println("Please Enter Your Password:-");
		String pass = sc.nextLine();
		
		if(Emailid.equals(email) && Password.equals(pass) )
		{
			System.out.println("Login Successfully..");
		}
		else 
		{
			System.out.println("Please Enter Valid Username or Password");
			login();
		}
		
	}
	
}

class Exit{
	public void end()
	{
		
			System.out.println("====================================================================");
			System.out.println("|        THANK YOU FOR VISITING  POWER PLANTS IN INDIA             |");
			System.out.println("====================================================================");
	}
}

