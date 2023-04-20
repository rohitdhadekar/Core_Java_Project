package Power_Plant;

import java.util.InputMismatchException;
import java.util.Scanner;

class Renewable extends IndianPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO RENEWABLE POWER PLANTS IN INDIA          |");
		System.out.println("====================================================================");
		System.out.println("1. Hydro Power Plant");
		System.out.println("2. Wind Power Plant");
		System.out.println("3. Solar Power Plant");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 200 For Exit");
	}
	
	public static void Renewable()
	{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please Enter Your Choice");
			int a1 = sc.nextInt();

			switch(a1)
			{
			case 1:
				HydroPowerPlant Hobj = new HydroPowerPlant();
				Hobj.Hstates();
				break;
			case 2:
				WindPowerPlant Wobj = new WindPowerPlant();
				Wobj.Wstates();
				break;
			case 3:
				SolarPowerPlant Sobj = new SolarPowerPlant();
				Sobj.Sstates();
				break;
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a1);
			default:
				System.out.println("Please Select Valid Choice.");
				Renewable();
			}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			Renewable();
		}
	}
}

