package Power_Plant;

import java.util.InputMismatchException;
import java.util.Scanner;

class WindPowerPlant extends Renewable{
	
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO WIND POWER PLANTS IN INDIA               |");
		System.out.println("====================================================================");
		
		System.out.println("1. Maharashtra");
		System.out.println("2. Andhra-Pradesh");
		System.out.println("3. Madhya-Pradesh");
		System.out.println("4. Tamilnadu");
		System.out.println("5. Rajasthan");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println("Press 200 For Exit");
	}
	
	public static void Wstates()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Enter Your Choice");
		int a10 = sc.nextInt();
		
		switch(a10)
		{
		case 1:
			WMaharashtra Wobj1 = new WMaharashtra();
			Wobj1.WMaharahstra();
			break;
		case 2:
			WAndhraPradesh Wobj7 = new WAndhraPradesh();
			Wobj7.WAndhra();
			break;
		case 3:
			WMadhyaPradesh Wobj10 = new WMadhyaPradesh();
			MamathKheda Wobj11 = new MamathKheda(MamathKheda.name,MamathKheda.Establishment,MamathKheda.Location,MamathKheda.Capacity,MamathKheda.Initial_cost);
			System.out.println(Wobj11);
			
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
				WindPowerPlant Wobj = new WindPowerPlant();
				Wobj.Wstates();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 4:
			WTamilnadu Wobj12 = new WTamilnadu();
			Muppandal Wobj13 = new Muppandal(Muppandal.name,Muppandal.Establishment,Muppandal.Location,Muppandal.Capacity,Muppandal.Initial_cost);
			System.out.println(Wobj13);
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 200 For Exit");
			int a124 = sc.nextInt();
			switch(a124)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 5:
			WRajasthan Wobj14 = new WRajasthan();
			Jaisalmer Wobj15 = new Jaisalmer(Jaisalmer.name,Jaisalmer.Establishment,Jaisalmer.Location,Jaisalmer.Capacity,Jaisalmer.Initial_cost);
			System.out.println(Wobj15);
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 200 For Exit");
			int a125 = sc.nextInt();
			switch(a125)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			Renewable Renobj = new Renewable();
			Renobj.Renewable();
		case 200:
			Exit obj1 = new Exit();
			obj1.end();
			System.exit(a10);
		default:
			System.out.println("Please Select Valid Choice.");
			Wstates();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			Wstates();
		}
	}
}

class WMaharashtra extends WindPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|           WELCOME TO WIND POWER PLANTS IN MAHARASHTRA            |");
		System.out.println("====================================================================");
		
		System.out.println("1. Bruhmanvel Wind Farm");
		System.out.println("2. Dhalgaon Wind Farm");
		System.out.println("3. Vankuswade Wind Farm");
		System.out.println("4. Vaspet Wind Farm");
		System.out.println("5. Tuljapur Wind Farm");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println("Press 200 For Exit");
	}
	
	
	public static void WMaharahstra()
	{
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Please Select Your Choice");
		int a11 = sc.nextInt();
		
		switch(a11)
		{
		case 1:
			Bruhmanvel Wobj2 = new Bruhmanvel(Bruhmanvel.name,Bruhmanvel.Establishment,Bruhmanvel.Location,Bruhmanvel.Capacity,Bruhmanvel.Initial_cost);
			System.out.println(Wobj2);
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
				WMaharashtra Wobj1 = new WMaharashtra();
				Wobj1.WMaharahstra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			Dhalgaon Wobj3 = new Dhalgaon(Dhalgaon.name,Dhalgaon.Establishment,Dhalgaon.Location,Dhalgaon.Capacity,Dhalgaon.Initial_cost);
			System.out.println(Wobj3);
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
				WMaharashtra Wobj1 = new WMaharashtra();
				Wobj1.WMaharahstra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 3:
			Vankuswade Wobj4 = new Vankuswade(Vankuswade.name,Vankuswade.Establishment,Vankuswade.Location,Vankuswade.Capacity,Vankuswade.Initial_cost);
			System.out.println(Wobj4);
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
				WMaharashtra Wobj1 = new WMaharashtra();
				Wobj1.WMaharahstra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 4:
			Vaspet Wobj5 = new Vaspet(Vaspet.name,Vaspet.Establishment,Vaspet.Location,Vaspet.Capacity,Vaspet.Initial_cost);
			System.out.println(Wobj5);
			
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
				WMaharashtra Wobj1 = new WMaharashtra();
				Wobj1.WMaharahstra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(126);
			}

		case 5:
			Tuljapur Wobj6 = new Tuljapur(Tuljapur.name,Tuljapur.Establishment,Tuljapur.Location,Tuljapur.Capacity,Tuljapur.Initial_cost);
			System.out.println(Wobj6);
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
				WMaharashtra Wobj1 = new WMaharashtra();
				Wobj1.WMaharahstra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a127);
			}
			
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			WindPowerPlant Wobj = new WindPowerPlant();
			Wobj.Wstates();
		case 200:
			Exit obj1 = new Exit();
			obj1.end();
			System.exit(a11);
			
		default:
			System.out.println("Please Select Valid Choice.");
			WMaharahstra();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			WMaharahstra();
		}
	}
}
class WAndhraPradesh extends WindPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|          WELCOME TO WIND POWER PLANTS IN ANDHRA-PRADESH          |");
		System.out.println("====================================================================");
		
		System.out.println("1. Beluguppa Wind Park");
		System.out.println("2. Anantpur Wind Park");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println("Press 200 For Exit");
	}
	
	public static void WAndhra()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice");
		int a12 = sc.nextInt();
		
		switch(a12)
		{
		case 1:
			BeluGuppa Wobj8 = new BeluGuppa(BeluGuppa.name,BeluGuppa.Establishment,BeluGuppa.Location,BeluGuppa.Capacity,BeluGuppa.Initial_cost);
			System.out.println(Wobj8);
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
				WAndhraPradesh Wobj7 = new WAndhraPradesh();
				Wobj7.WAndhra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			AnantPur Wobj9 = new AnantPur(AnantPur.name,AnantPur.Establishment,AnantPur.Location,AnantPur.Capacity,AnantPur.Initial_cost);
			System.out.println(Wobj9);
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
				WAndhraPradesh Wobj7 = new WAndhraPradesh();
				Wobj7.WAndhra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			WindPowerPlant Wobj = new WindPowerPlant();
			Wobj.Wstates();
		case 200:
			Exit obj1 = new Exit();
			obj1.end();
			System.exit(a12);
		default:
			System.out.println("Please Select Valid Choice");	
			WAndhra();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			WAndhra();
		}
	}
}
class WMadhyaPradesh extends WindPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|          WELCOME TO WIND POWER PLANTS IN MADHYA-PRADESH          |");
		System.out.println("====================================================================");
		
		System.out.println("1. Mamathkheda Wind Park");
	}
}
class WTamilnadu extends WindPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|            WELCOME TO WIND POWER PLANTS IN TAMILNADU             |");
		System.out.println("====================================================================");
		
		System.out.println("1. Muppandal Wind Farm");
	}
}
class WRajasthan extends WindPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|             WELCOME TO WIND POWER PLANTS IN RAJASTHAN            |");
		System.out.println("====================================================================");
		
		System.out.println("1. Jaisalmer Wind Park");
	}
}

// Maharashtra Wind Power Plant

class Bruhmanvel extends WMaharashtra {
	
	static String name = "Brahmanvel wind farm";
	static int Establishment = 2007;
	static String Location = "Dhule Dsitrict: Dhule";
	static double Capacity = 40;
	static double Initial_cost = 350;
	
	Bruhmanvel(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO WIND POWER PLANTS IN MAHARASHTRA            |");
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

class Dhalgaon extends WMaharashtra{
	
	static String name = "Dhalgaon wind farm";
	static int Establishment = 2015;
	static String Location = "Dhalgaon District:Sangli ";
	static double Capacity = 278;
	static double Initial_cost = 1037;
		
	Dhalgaon(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO WIND POWER PLANTS IN MAHARASHTRA            |");
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

class Vankuswade extends WMaharashtra {
	
	static String name = "Vankusawade Wind Park";
	static int Establishment = 2001;
	static String Location = "Satara District: Satara";
	static double Capacity = 210;
	static double Initial_cost = 872;
	
	Vankuswade(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO WIND POWER PLANTS IN MAHARASHTRA            |");
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

class Vaspet extends WMaharashtra {
	
	static String name = "Jath Vaspet wind power plant";
	static int Establishment = 2014;
	static String Location = "Vaspet District: Sangli";
	static double Capacity = 40;
	static double Initial_cost = 45;
	
	Vaspet(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO WIND POWER PLANTS IN MAHARASHTRA            |");
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

class Tuljapur extends WMaharashtra {
	
	static String name = "TULJAPUR WIND FARMS PRIVATE";
	static int Establishment = 2017;
	static String Location = "Tuljapur District: ";
	static double Capacity = 126;
	static double Initial_cost = 143;
	
	Tuljapur(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO WIND POWER PLANTS IN MAHARASHTRA            |");
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

// Andhra Pradesh Wind Power Plant

class BeluGuppa extends WAndhraPradesh {
	static String name = "Beluguppa Wind Park";
	static int Establishment = 2007;
	static String Location = "BeluGuppa District: Beluguppa";
	static double Capacity = 100.8;
	static double Initial_cost = 115;
	
	BeluGuppa(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO WIND POWER PLANTS IN ANDHRAPRADESH            |");
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

class AnantPur extends WAndhraPradesh {
	
	static String name = "Anantapur Wind Farm";
	static int Establishment = 2017;
	static String Location = "Anantpur District: Anantpur";
	static double Capacity = 226.8;
	static double Initial_cost = 250.432;
	
	AnantPur(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO WIND POWER PLANTS IN ANDHRAPRADESH            |");
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

// Madhya Pradesh Wind Power Plant


class MamathKheda extends WMadhyaPradesh {
	
	static String name = "Mamatkheda Wind Park";
	static int Establishment = 2015;
	static String Location = "Mamatkheda District: Mamatkheda";
	static double Capacity = 100.5;
	static double Initial_cost = 128.037;

	MamathKheda(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO WIND POWER PLANTS IN MADHYA PRADESH         |");
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


// TamilNadu Wind Power Plant


class Muppandal extends WTamilnadu {
	
	static String name = "Muppandal wind farm";
	static int Establishment = 1986;
	static String Location = "Muppandal District: AralvaiMozhi";
	static double Capacity = 1500;
	static double Initial_cost = 28750;
	
	Muppandal(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO WIND POWER PLANTS IN TAMILNADU              |");
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


// Rajasthan Wind Power Plant

class Jaisalmer extends WRajasthan {
	
	static String name = "Jaisalmer Wind Park";
	static int Establishment =2001 ;
	static String Location = "Jaisalmer District: Jaisalmer";
	static double Capacity = 1064;
	static double Initial_cost = 302.50;
	
	Jaisalmer(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO WIND POWER PLANTS IN RAJASTHAN              |");
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