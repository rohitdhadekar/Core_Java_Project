package Power_Plant;

import java.util.InputMismatchException;
import java.util.Scanner;

class NonRenewable extends IndianPowerPlant {

	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO NON-RENEWABLE POWER PLANTS IN INDIA      |");
		System.out.println("====================================================================");
		System.out.println("1. Thermal Power Plant");
		System.out.println("2. Nuclear Power Plant");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 200 For Exit");
		System.out.println();
		
	}
	
	public static void NonRenewabble()
	{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please Enter Your Choice");
			int b = sc.nextInt();

			switch(b)
			{
			case 1:
				ThermalPowerPlant Tref = new ThermalPowerPlant();
				Tref.Tstates();
				break;

			case 2:
				NuclearPowerPlant Nref = new NuclearPowerPlant();
				Nref.Nstates();
				break;
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(b);
			
			default:
				System.out.println("Please Select Valid Choice.");
				NonRenewabble();
			}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			NonRenewabble();
		}
		
	}
}