package Power_Plant;

import java.util.InputMismatchException;
import java.util.Scanner;




class ThermalPowerPlant extends NonRenewable {

	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO THERMAL POWER PLANTS IN INDIA            |");
		System.out.println("====================================================================");
		
		System.out.println("1. Maharashtra ");
		System.out.println("2. Madhya-Pradesh");
		System.out.println("3. Uttar-Pradesh");
		System.out.println("4. Bihar");
		System.out.println("5. Karnataka");
		System.out.println("6. Chattisgarh");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	
	}
	
	
	public static void Tstates()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Enter Your Choice");
		int c = sc.nextInt();
		
		switch(c)
		{
		case 1:
			TMaharashtra Tobj1 = new TMaharashtra();
			Tobj1.TMaharashtra();
			break;
		case 2:
			TMadhyaPradesh Tobj8 = new TMadhyaPradesh();
			Tobj8.TMadhyapradesh();
			break;
		case 3:
			TUttarPradesh Tobj15 = new TUttarPradesh();
			Tobj15.TUttarpradesh();
			break;
		case 4:
			TBihar Tobj22 = new TBihar();
			Tobj22.TBihar();
			break;
		case 5:
			TKarnataka Tobj26 = new TKarnataka();
			Tobj26.TKarnataka();
			break;
		case 6:
			TChattisgarh Tobj40 = new TChattisgarh();
			Tobj40.TChattisgarh();
			break;
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			NonRenewable NRref = new NonRenewable();
			NRref.NonRenewabble();
		default:
			System.out.println("Please Select Valid Choice.");	
			Tstates();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			Tstates();
		}
	}
}

class TMaharashtra extends ThermalPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|           WELCOME TO THERMAL POWER PLANTS IN MAHARASHTRA         |");
		System.out.println("====================================================================");
		
		System.out.println("1. Amarawati Thermal Power Plant");
		System.out.println("2. Chandrapur Thermal Power Plant");
		System.out.println("3. Khaparkheda Thermal Power Plant");
		System.out.println("4. Tiroda Thermal Power Plant");
		System.out.println("5. Solapur Super Thermal Power Plant");
		System.out.println("6. Mauda Thermal Power Plant");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	public static void TMaharashtra()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Enter Your Choice");
		int c1 = sc.nextInt();
		
		switch(c1)
		{
		case 1:
			Amarawati Tobj2 = new Amarawati(Amarawati.name,Amarawati.Establishment,Amarawati.Location,Amarawati.Capacity,Amarawati.Initial_cost);
			System.out.println(Tobj2);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a123 = sc.nextInt();
			switch(a123)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMaharashtra Tobj1 = new TMaharashtra();
				Tobj1.TMaharashtra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			Chandrapur Tobj3 = new Chandrapur(Chandrapur.name,Chandrapur.Establishment,Chandrapur.Location,Chandrapur.Capacity,Chandrapur.Initial_cost);
			System.out.println(Tobj3);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a124 = sc.nextInt();
			switch(a124)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMaharashtra Tobj1 = new TMaharashtra();
				Tobj1.TMaharashtra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 3:
			Khaparkheda Tobj4 = new Khaparkheda(Khaparkheda.name,Khaparkheda.Establishment,Khaparkheda.Location,Khaparkheda.Capacity,Khaparkheda.Initial_cost);
			System.out.println(Tobj4);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a125 = sc.nextInt();
			switch(a125)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMaharashtra Tobj1 = new TMaharashtra();
				Tobj1.TMaharashtra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 4:
			Tiroda Tobj5 = new Tiroda(Tiroda.name,Tiroda.Establishment,Tiroda.Location,Tiroda.Capacity,Tiroda.Initial_cost);
			System.out.println(Tobj5);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a126 = sc.nextInt();
			switch(a126)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMaharashtra Tobj1 = new TMaharashtra();
				Tobj1.TMaharashtra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a126);
			}
		case 5:
			Solapur Tobj6 = new Solapur(Solapur.name,Solapur.Establishment,Solapur.Location,Solapur.Capacity,Solapur.Initial_cost);
			System.out.println(Tobj6);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a127 = sc.nextInt();
			switch(a127)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMaharashtra Tobj1 = new TMaharashtra();
				Tobj1.TMaharashtra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a127);
			}
		case 6:
			Mauda Tobj7 = new Mauda(Mauda.name,Mauda.Establishment,Mauda.Location,Mauda.Capacity,Mauda.Initial_cost);
			System.out.println(Tobj7);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a128 = sc.nextInt();
			switch(a128)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMaharashtra Tobj1 = new TMaharashtra();
				Tobj1.TMaharashtra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a128);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			ThermalPowerPlant Tref = new ThermalPowerPlant();
			Tref.Tstates();
		default:
			System.out.println("Please Select Valid Choice.");
			TMaharashtra();
		}
		}
		
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			TMaharashtra();
		}
	}
	
}

class TMadhyaPradesh extends ThermalPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|         WELCOME TO THERMAL POWER PLANTS IN MADHYA-PRADESH        |");
		System.out.println("====================================================================");
		
		System.out.println("1. Amarantak Thermal Power Plant");
		System.out.println("2. Satpura Thermal Power Plant");
		System.out.println("3. Sanjay Gandhi Birsinghpur Thermal Power Plant");
		System.out.println("4. Shri Singaji Thermal Power Plant");
		System.out.println("5. Vindhyachal Super Thermal Power Plant");
		System.out.println("6. Singrauli Thermal Power Plant");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	public static void TMadhyapradesh()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Enter Your Choice");
		int c2 = sc.nextInt();
		
		switch(c2)
		{
		case 1:
			Amarkantak Tobj9 = new Amarkantak(Amarkantak.name,Amarkantak.Establishment,Amarkantak.Location,Amarkantak.Capacity,Amarkantak.Initial_cost);
			System.out.println(Tobj9);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a123 = sc.nextInt();
			switch(a123)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMadhyaPradesh Tobj8 = new TMadhyaPradesh();
				Tobj8.TMadhyapradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			Satpura Tobj10 = new Satpura(Satpura.name,Satpura.Establishment,Satpura.Location,Satpura.Capacity,Satpura.Initial_cost);
			System.out.println(Tobj10);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a122 = sc.nextInt();
			switch(a122)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMadhyaPradesh Tobj8 = new TMadhyaPradesh();
				Tobj8.TMadhyapradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a122);
			}
		case 3:
			Birsinghpur Tobj11 = new Birsinghpur(Birsinghpur.name,Birsinghpur.Establishment,Birsinghpur.Location,Birsinghpur.Capacity,Birsinghpur.Initial_cost);
			System.out.println(Tobj11);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a121 = sc.nextInt();
			switch(a121)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMadhyaPradesh Tobj8 = new TMadhyaPradesh();
				Tobj8.TMadhyapradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a121);
			}
		case 4:
			ShriSingaji Tobj12 = new ShriSingaji(ShriSingaji.name,ShriSingaji.Establishment,ShriSingaji.Location,ShriSingaji.Capacity,ShriSingaji.Initial_cost);
			System.out.println(Tobj12);

			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a124 = sc.nextInt();
			switch(a124)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMadhyaPradesh Tobj8 = new TMadhyaPradesh();
				Tobj8.TMadhyapradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 5:
			Vindhyachal Tobj13 = new Vindhyachal(Vindhyachal.name,Vindhyachal.Establishment,Vindhyachal.Location,Vindhyachal.Capacity,Vindhyachal.Initial_cost);
			System.out.println(Tobj13);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a125 = sc.nextInt();
			switch(a125)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMadhyaPradesh Tobj8 = new TMadhyaPradesh();
				Tobj8.TMadhyapradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 6:
			Singrauli Tobj14 = new Singrauli(Singrauli.name,Singrauli.Establishment,Singrauli.Location,Singrauli.Capacity,Singrauli.Initial_cost);
			System.out.println(Tobj14);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a126 = sc.nextInt();
			switch(a126)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TMadhyaPradesh Tobj8 = new TMadhyaPradesh();
				Tobj8.TMadhyapradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a126);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			ThermalPowerPlant Tref = new ThermalPowerPlant();
			Tref.Tstates();
		default:
			System.out.println("Please Select Valid Choice.");
			TMadhyapradesh();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			TMadhyapradesh();
		}
	}
	
}

class TUttarPradesh extends ThermalPowerPlant{

	{
		System.out.println("====================================================================");
		System.out.println("|          WELCOME TO THERMAL POWER PLANTS IN UTTAR-PRADESH        |");
		System.out.println("====================================================================");
		
		System.out.println("1. Anpara Thermal Power Plant");
		System.out.println("2. Dadri Thermal Power Plant");
		System.out.println("3. Feroz Gandhi Unchahar Thermal Power Plant");
		System.out.println("4. National Capital Thermal Power Plant");
		System.out.println("5. Obra Super Thermal Power Plant");
		System.out.println("6. Rihand Super Thermal Power Plant");
		System.out.println("7. Rosa Thermal Power Plant");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	public static void TUttarpradesh()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Enter Your Choice");
		int c61 = sc.nextInt();

		switch(c61)
		{
		case 1:
			Anpara Tobj16 = new Anpara(Anpara.name,Anpara.Establishment,Anpara.Location,Anpara.Capacity,Anpara.Initial_cost);
			System.out.println(Tobj16);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a123 = sc.nextInt();
			switch(a123)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TUttarPradesh Tobj15 = new TUttarPradesh();
				Tobj15.TUttarpradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			Dadri Tobj17 = new Dadri(Dadri.name,Dadri.Establishment,Dadri.Location,Dadri.Capacity,Dadri.Initial_cost);
			System.out.println(Tobj17);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a129 = sc.nextInt();
			switch(a129)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TUttarPradesh Tobj15 = new TUttarPradesh();
				Tobj15.TUttarpradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a129);
			}
		case 3:
			Unchahar Tobj18 = new Unchahar(Unchahar.name,Unchahar.Establishment,Unchahar.Location,Unchahar.Capacity,Unchahar.Initial_cost);
			System.out.println(Tobj18);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a130 = sc.nextInt();
			switch(a130)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TUttarPradesh Tobj15 = new TUttarPradesh();
				Tobj15.TUttarpradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a130);
			}
		case 4:
			NationalCapital Tobj19 = new NationalCapital(NationalCapital.name,NationalCapital.Establishment,NationalCapital.Location,NationalCapital.Capacity,NationalCapital.Initial_cost);
			System.out.println(Tobj19);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a131 = sc.nextInt();
			switch(a131)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TUttarPradesh Tobj15 = new TUttarPradesh();
				Tobj15.TUttarpradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a131);
			}
		case 5:
			Obra Tobj20 = new Obra(Obra.name,Obra.Establishment,Obra.Location,Obra.Capacity,Obra.Initial_cost);
			System.out.println(Tobj20);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a132 = sc.nextInt();
			switch(a132)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TUttarPradesh Tobj15 = new TUttarPradesh();
				Tobj15.TUttarpradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a132);
			}
		case 6:
			Rihand Tobj21 = new Rihand(Rihand.name,Rihand.Establishment,Rihand.Location,Rihand.Capacity,Rihand.Initial_cost);
			System.out.println(Tobj21);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a133 = sc.nextInt();
			switch(a133)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TUttarPradesh Tobj15 = new TUttarPradesh();
				Tobj15.TUttarpradesh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a133);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			ThermalPowerPlant Tref = new ThermalPowerPlant();
			Tref.Tstates();
		default:
			System.out.println("Please Select Valid Choice.");
			TUttarpradesh();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			TUttarpradesh();
		}
	}
}

class TBihar extends ThermalPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO THERMAL POWER PLANTS IN BIHAR            |");
		System.out.println("====================================================================");
		
		System.out.println("1. Barauni Thermal Power Plant");
		System.out.println("2. Khalgaon Super Thermal Power Plant");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
		
	}
	
	public static void TBihar()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Enter Your Choice");
		int c3 = sc.nextInt();
		
		switch(c3)
		{
		case 1:
			Barauni Tobj23 = new Barauni(Barauni.name,Barauni.Establishment,Barauni.Location,Barauni.Capacity,Barauni.Initial_cost);
			System.out.println(Tobj23);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a123 = sc.nextInt();
			switch(a123)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TBihar Tobj22 = new TBihar();
				Tobj22.TBihar();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			Khalgaon Tobj25 = new Khalgaon(Khalgaon.name,Khalgaon.Establishment,Khalgaon.Location,Khalgaon.Capacity,Khalgaon.Initial_cost);
			System.out.println(Tobj25);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a140 = sc.nextInt();
			switch(a140)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TBihar Tobj22 = new TBihar();
				Tobj22.TBihar();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a140);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			ThermalPowerPlant Tref = new ThermalPowerPlant();
			Tref.Tstates();
		default:
			System.out.println("Please Select Valid Choice.");
			TBihar();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			TBihar();
		}
	}
}

class TKarnataka extends ThermalPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|            WELCOME TO THERMAL POWER PLANTS IN KARNATAKA          |");
		System.out.println("====================================================================");
		
		
		System.out.println("1. Raichur Thermal Power Plant");
		System.out.println("2. Bellary Thermal Power Plant");
		System.out.println("3. Yermaru Thermal Power Plant");
		System.out.println("4. Udupi Thermal Power Plant");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
		
	}
	
	public static void TKarnataka()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Enter Your Choice");
		int c4 = sc.nextInt();
		
		switch(c4)
		{
		case 1:
			Raichur Tobj27 = new Raichur(Raichur.name,Raichur.Establishment,Raichur.Location,Raichur.Capacity,Raichur.Initial_cost);
			System.out.println(Tobj27);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a123 = sc.nextInt();
			switch(a123)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TKarnataka Tobj26 = new TKarnataka();
				Tobj26.TKarnataka();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			Bellary Tobj28 = new Bellary(Bellary.name,Bellary.Establishment,Bellary.Location,Bellary.Capacity,Bellary.Initial_cost);
			System.out.println(Tobj28);
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a121 = sc.nextInt();
			switch(a121)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TKarnataka Tobj26 = new TKarnataka();
				Tobj26.TKarnataka();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a121);
			}
		case 3:
			Yermarus Tobj29 = new Yermarus(Yermarus.name,Yermarus.Establishment,Yermarus.Location,Yermarus.Capacity,Yermarus.Initial_cost);
			System.out.println(Tobj29);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a122 = sc.nextInt();
			switch(a122)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TKarnataka Tobj26 = new TKarnataka();
				Tobj26.TKarnataka();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a122);
			}
		case 4:
			Udupi Tobj30 = new Udupi(Udupi.name,Udupi.Establishment,Udupi.Location,Udupi.Capacity,Udupi.Initial_cost);
			System.out.println(Tobj30);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a124 = sc.nextInt();
			switch(a124)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TKarnataka Tobj26 = new TKarnataka();
				Tobj26.TKarnataka();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			ThermalPowerPlant Tref = new ThermalPowerPlant();
			Tref.Tstates();
		default:
			System.out.println("Please Select Valid Choice.");
			TKarnataka();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			TKarnataka();
		}
	}
}

class TChattisgarh extends ThermalPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|           WELCOME TO THERMAL POWER PLANTS IN CHATTISGARH         |");
		System.out.println("====================================================================");
		
		System.out.println("1. Sipat Thermal Power Plant");
		System.out.println("2. Lara Super Thermal Power Plant");
		System.out.println("3. Korba Thermal Power Plant");
		System.out.println("4. Bhilai Thermal Power Plant");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
		
	}
	
	public static void TChattisgarh()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Enter Your Choice");
		int c5 = sc.nextInt();
		
		switch(c5)
		{
		case 1:
			Sipat Tobj31 = new Sipat(Sipat.name,Sipat.Establishment,Sipat.Location,Sipat.Capacity,Sipat.Initial_cost);
			System.out.println(Tobj31);
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a123 = sc.nextInt();
			switch(a123)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TChattisgarh Tobj40 = new TChattisgarh();
				Tobj40.TChattisgarh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			Lara Tobj32 = new Lara(Lara.name,Lara.Establishment,Lara.Location,Lara.Capacity,Lara.Initial_cost);
			System.out.println(Tobj32);
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a124 = sc.nextInt();
			switch(a124)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TChattisgarh Tobj40 = new TChattisgarh();
				Tobj40.TChattisgarh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 3:
			Korba Tobj33 = new Korba(Korba.name,Korba.Establishment,Korba.Location,Korba.Capacity,Korba.Initial_cost);
			System.out.println(Tobj33);
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a125 = sc.nextInt();
			switch(a125)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TChattisgarh Tobj40 = new TChattisgarh();
				Tobj40.TChattisgarh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 4:
			Bhilai Tobj34 = new Bhilai(Bhilai.name,Bhilai.Establishment,Bhilai.Location,Bhilai.Capacity,Bhilai.Initial_cost);
			System.out.println(Tobj34);
			
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 100 For Previous Step");
			System.out.println("Press 200 For Exit");
			int a126 = sc.nextInt();
			switch(a126)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				TChattisgarh Tobj40 = new TChattisgarh();
				Tobj40.TChattisgarh();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a126);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			ThermalPowerPlant Tref = new ThermalPowerPlant();
			Tref.Tstates();
		
		default:
			System.out.println("Please Select Valid Choice.");
			TChattisgarh();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			TChattisgarh();
		}
	}
}

// Maharashtra Thermal Power Plant

class Amarawati extends TMaharashtra {
	
	static String name = "Amravati Thermal Power plant";
	static int Establishment = 1987;
	static String Location = "Village: Nandgaonpeth,District: Amravati";
	static double Capacity = 1350;
	static double Initial_cost  = 600;
	
	Amarawati(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MAHARASHTRA            |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
		
}

class Chandrapur extends TMaharashtra {
	
	static String name = "Chandrapur Thermal Power plant ";
	static int Establishment = 1984;
	static String Location = "Chandrapur District: Chandrapur";
	static double Capacity = 3340;
	static double Initial_cost = 5819;
	
	Chandrapur(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MAHARASHTRA            |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Khaparkheda extends TMaharashtra {
	
	static String name = "Khaperkheda Thermal Power plant";
	static int Establishment = 1989;
	static String Location = "Khaparkheda District: Nagpur";
	static double Capacity = 500;
	static double Initial_cost = 449.29; 
	
	Khaparkheda(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MAHARASHTRA            |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Tiroda extends TMaharashtra {
	
	static String name = "Tiroda Thermal Power plant";
	static int Establishment = 2012;
	static String Location = "Toroda District: Gondia";
	static double Capacity = 3300;
	static double Initial_cost = 5500;
	
	Tiroda(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MAHARASHTRA            |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Solapur extends TMaharashtra {
	
	static String name = "Solapur Super Thermal Power Station";
	static int Establishment = 2017;
	static String Location = "Solapur District: Solapur";
	static double Capacity = 1320;
	static double Initial_cost = 1283.25;
	
	Solapur(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MAHARASHTRA            |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Mauda extends TMaharashtra {
	
	static String name = "Mauda Super Thermal Power Plant";
	static int Establishment = 2014;
	static String Location = "Mauda Taluka: Ramtek District: Nagpur";
	static double Capacity = 2320;
	static double Initial_cost = 5459.28;
	
	Mauda(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MAHARASHTRA            |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}


// Madhya Pradesh Thermal Power Plant

class Amarkantak extends TMadhyaPradesh {
	
	static String name = "Amarkantak Thermal Power Plant";
	static int Establishment = 1977;
	static String Location = "Bilaspur-Katni District: Anuppur";
	static double Capacity = 210;
	static double Initial_cost = 623.515;
	
	Amarkantak(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MADHYA PRADESH         |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Satpura extends TMadhyaPradesh {
	
	static String name = "Satpura Thermal Power Plant";
	static int Establishment = 1967;
	static String Location = "Sarni District: Betul";
	static double Capacity = 1142.5;
	static double Initial_cost = 2731.76;
	
	Satpura(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MADHYA PRADESH         |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}
class Birsinghpur extends TMadhyaPradesh {
	
	static String name = "Sanjay Gandhi, Birsinghpur Thermal Power Plant";
	static int Establishment = 1993;
	static String Location = "Birsinghpur District: Umaria";
	static double Capacity = 1340;
	static double Initial_cost = 2300;
	
	Birsinghpur(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MADHYA PRADESH         |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class ShriSingaji extends TMadhyaPradesh {

	static String name = "Shri Singaji Thermal Power Station Dongalia";
	static int Establishment = 2014;
	static String Location = "Dongaliya District: Khandwa";
	static double Capacity = 600;
	static double Initial_cost = 7820;
	
	ShriSingaji(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MADHYA PRADESH         |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Vindhyachal extends TMadhyaPradesh {
	static String name = "Vindhyachal Thermal Power Station";
	static int Establishment = 1982;
	static String Location = "Singrauli District: Singrauli";
	static double Capacity = 4760;
	static double Initial_cost = 5910;
	
	Vindhyachal(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MADHYA PRADESH         |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Singrauli extends TMadhyaPradesh {
	static String name = "Singrauli Super Thermal Power Station";
	static int Establishment = 1986;
	static String Location = "Shaktinagar District: Sonebhadra";
	static double Capacity = 2015;
	static double Initial_cost = 4053.42;
	
	Singrauli(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN MADHYA PRADESH         |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}


// Uttar Pradesh Thermal Power Plant

class Anpara extends TUttarPradesh {
	
	static String name = "Anpara Thermal Power plant";
	static int Establishment = 2015;
	static String Location = "Anpara District: Sonbhadra";
	static double Capacity = 3850;
	static double Initial_cost = 819;
	
	Anpara(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN UTTAR PRADESH          |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}
class Dadri extends TUttarPradesh{
	
	static String name = "Dadri Thermal Power plant";
	static int Establishment = 1991;
	static String Location = "Dadri District: Gautam Budhha Nagar ";
	static double Capacity = 2654.78;
	static double Initial_cost = 1669.21;
	
	Dadri(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN UTTAR PRADESH          |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
	
}

class Unchahar extends TUttarPradesh{
	
	static String name = "Feroz Gandhi Unchahar Thermal Power plant";
	static int Establishment = 1988;
	static String Location = "Unchahar District: Raebareli";
	static double Capacity = 1550;
	static double Initial_cost = 962.4370;
	
	Unchahar(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN UTTAR PRADESH          |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class NationalCapital extends TUttarPradesh {
	
	static String name = "National Capital Thermal Power plant";
	static int Establishment = 1991;
	static String Location = "Gautam Budhha Nagar";
	static double Capacity = 2650;
	static double Initial_cost = 1690.4276;
	
	NationalCapital(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN UTTAR PRADESH          |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Obra extends TUttarPradesh {
	static String name = "Obra Thermal Power plant";
	static int Establishment = 1982;
	static String Location = "Obra District: Sonbhadra";
	static double Capacity = 1288;
	static double Initial_cost = 6175;
	
	Obra(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN UTTAR PRADESH          |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Rihand extends TUttarPradesh {
	static String name = "Rihand Super Thermal Power plant";
	static int Establishment = 1988;
	static String Location = "Renukut District: Sonebhadra";
	static double Capacity = 3000;
	static double Initial_cost = 3451.97;
	
	Rihand(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN UTTAR PRADESH          |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Rosa extends TUttarPradesh {
	
	static String name = "Rosa Thermal Power plant";
	static int Establishment = 2009;
	static String Location = "Rosa District: Shahjahanpur";
	static double Capacity = 1200;
	static double Initial_cost = 3000;
	
	Rosa(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN UTTAR PRADESH          |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

// Bihar Thermal Power Plant

class Barauni extends TBihar {
	static String name = "Barauni Thermal Power Station";
	static int Establishment = 1962;
	static String Location = "Baqrauni District: Barauni";
	static double Capacity = 720;
	static double Initial_cost = 507.59;
	
	Barauni(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN BIHAR                  |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Khalgaon extends TBihar {
	static String name = "Kahalgaon Super Thermal Power Project";
	static int Establishment = 1992;
	static String Location = "Kahalgaon District: Bhagalpur";
	static double Capacity = 2340;
	static double Initial_cost = 7907.35;
	
	Khalgaon(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN BIHAR                  |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

// Karnatak Thermal Power Plant

class Raichur extends TKarnataka {
	static String name = "Raichur Thermal Power station";
	static int Establishment = 1978;
	static String Location = "Raichur District: Raichur";
	static double Capacity = 1720;
	static double Initial_cost = 12770;

	Raichur(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN KARNATAKA                  |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Bellary extends TKarnataka {
	static String name = "Bellary Thermal Power station";
	static int Establishment = 2007;
	static String Location = "Kudatini District: Bellary";
	static double Capacity = 1700;
	static double Initial_cost = 2230;
	
	Bellary(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN KARNATAKA                  |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Yermarus extends TKarnataka {
	static String name = "Yermarus Thermal Power Station";
	static int Establishment = 2015;
	static String Location = "Yegnur District: Raichur";
	static double Capacity = 1600;
	static double Initial_cost = 12589;
	
	Yermarus(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN KARNATAKA                  |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Udupi extends TKarnataka {
	static String name = "Udupi Thermal Power plant";
	static int Establishment = 2012;
	static String Location = "Padubidri District: Udupi";
	static double Capacity = 1200;
	static double Initial_cost = 6000;
	
	Udupi(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO THERMAL POWER PLANTS IN KARNATAKA                  |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}


// Chattisgarh Thermal Power Plant

class Sipat extends TChattisgarh {
	static String name = "Sipat Thermal Power Plant";
	static int Establishment = 2011;
	static String Location = "Sipat District: Bilaspur";
	static double Capacity = 2980;
	static double Initial_cost = 4039.67;
	
	Sipat(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|      WELCOME TO THERMAL POWER PLANTS IN CHATTISGARH              |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Lara extends TChattisgarh {
	static String name = "Lara Super Thermal Power Plant";
	static int Establishment = 2019;
	static String Location = "Pussore District: Raigarh";
	static double Capacity = 1600;
	static double Initial_cost = 9568.27;
	
	Lara(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|      WELCOME TO THERMAL POWER PLANTS IN CHATTISGARH              |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Korba extends TChattisgarh {
	static String name = "Korba Thermal Power Plant";
	static int Establishment = 1983;
	static String Location = "Jamnipali District: Korba";
	static double Capacity = 2600;
	static double Initial_cost = 1500;
	
	Korba(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|      WELCOME TO THERMAL POWER PLANTS IN CHATTISGARH              |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}

class Bhilai extends TChattisgarh {
	static String name = "Bhilai Thermal Power Plant";
	static int Establishment = 1959;
	static String Location = "Bhilai District: Durg";
	static double Capacity = 574;
	static double Initial_cost = 61870;
	
	Bhilai(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	@Override
    public String toString()
    {
		System.out.println("====================================================================");
		System.out.println("|      WELCOME TO THERMAL POWER PLANTS IN CHATTISGARH              |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("Location                  :- "+ super.Location+".");
    	System.out.println("Capacity                  :- "+ super.Capacity +"MW.");
    	System.out.println("Initial Cost              :- "+ super.Initial_cost +"Crore.");
    	System.out.println("====================================================================");
    	DailyGEneration();
    	MonthlyGEneration();
    	YearlyGEneration();
    	System.out.println("====================================================================");
    	return "";
    }
}