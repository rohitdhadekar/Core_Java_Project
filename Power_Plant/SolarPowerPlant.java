package Power_Plant;

import java.util.InputMismatchException;
import java.util.Scanner;


class SolarPowerPlant extends Renewable {
	
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO SOLAR POWER PLANTS IN INDIA              |");
		System.out.println("====================================================================");
		
		System.out.println("1. Andhra-Pradesh");
		System.out.println("2. Madhya-Pradesh");
		System.out.println("3. Rajasthan");
		System.out.println("4. Karnataka");
		System.out.println("5. Gujrat");
		System.out.println("6. Tamilnadu");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
		
	}
	
	public static void Sstates()
	{
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Please Select Your Choice");
		int a13 = sc.nextInt();
		
		switch(a13)
		{
		case 1:
			SAndhraPradesh Sobj1 = new SAndhraPradesh();
			Sobj1.SAndhra();
			break;
		case 2:
			SMadhyaPradesh Sobj6 = new SMadhyaPradesh();
			Sobj6.SMadhya();
			break;	
		case 3:
			SRajasthan Sobj9 = new SRajasthan();
			Bhadla Sobj10 = new Bhadla(Bhadla.name,Bhadla.Establishment,Bhadla.Location,Bhadla.Capacity,Bhadla.Initial_cost);
			System.out.println(Sobj10);
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
				SolarPowerPlant Sobj = new SolarPowerPlant();
				Sobj.Sstates();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 4:
			SKarnataka Sobj11 = new SKarnataka();
			Pavagad Sobj12 = new Pavagad(Pavagad.name,Pavagad.Establishment,Pavagad.Location,Pavagad.Capacity,Pavagad.Initial_cost);
			System.out.println(Sobj12);
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
				SolarPowerPlant Sobj = new SolarPowerPlant();
				Sobj.Sstates();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 5:
			SGujrat Sobj13 = new SGujrat();
			Charanka Sobj14 = new Charanka(Charanka.name,Charanka.Establishment,Charanka.Location,Charanka.Capacity,Charanka.Initial_cost);
			System.out.println(Sobj14);
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
				SolarPowerPlant Sobj = new SolarPowerPlant();
				Sobj.Sstates();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 6:
			STamilnadu Sobj15 = new STamilnadu();
			Kamuthi Sobj16 = new Kamuthi(Kamuthi.name,Kamuthi.Establishment,Kamuthi.Location,Kamuthi.Capacity,Kamuthi.Initial_cost);
			System.out.println(Sobj16);
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
				SolarPowerPlant Sobj = new SolarPowerPlant();
				Sobj.Sstates();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a126);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			Renewable Renobj = new Renewable();
			Renobj.Renewable();
		default:
			System.out.println("Please Select Valid Choice.");	
			Sstates();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			Sstates();
		}
	}

}
class SAndhraPradesh extends SolarPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|          WELCOME TO SOLAR POWER PLANTS IN ANDHRA-PRADESH         |");
		System.out.println("====================================================================");
		
		System.out.println("1. Kurnool Ultra Mega Solar Plant");
		System.out.println("2. NP Kunta Solar Power Plant");
		System.out.println("3. Ananthpuramu-2 Solar Power Plant");
		System.out.println("4. Galiveedu Solar Power Plant");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
		
	}
	
	public static void SAndhra()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice");
		int a14 = sc.nextInt();		
		
		switch(a14)
			{
			case 1: 
				Kurnool Sobj2 = new Kurnool(Kurnool.name,Kurnool.Establishment,Kurnool.Location,Kurnool.Capacity,Kurnool.Initial_cost);
				System.out.println(Sobj2);
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
					SAndhraPradesh Sobj1 = new SAndhraPradesh();
					Sobj1.SAndhra();
				case 200:
					Exit obj1 = new Exit();
					obj1.end();
					System.exit(a126);
				}
			case 2:
				NP_Kunta Sobj3 = new NP_Kunta(NP_Kunta.name,NP_Kunta.Establishment,NP_Kunta.Location,NP_Kunta.Capacity,NP_Kunta.Initial_cost);
				System.out.println(Sobj3);
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
					SAndhraPradesh Sobj1 = new SAndhraPradesh();
					Sobj1.SAndhra();
				case 200:
					Exit obj1 = new Exit();
					obj1.end();
					System.exit(a123);
				}

			case 3:
				AnanthPuramu2 Sobj4 = new AnanthPuramu2(AnanthPuramu2.name,AnanthPuramu2.Establishment,AnanthPuramu2.Location,AnanthPuramu2.Capacity,AnanthPuramu2.Initial_cost);
				System.out.println(Sobj4);
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
					SAndhraPradesh Sobj1 = new SAndhraPradesh();
					Sobj1.SAndhra();
				case 200:
					Exit obj1 = new Exit();
					obj1.end();
					System.exit(a124);
				}

			case 4:
				Galiveedu Sobj5 = new Galiveedu(Galiveedu.name,Galiveedu.Establishment,Galiveedu.Location,Galiveedu.Capacity,Galiveedu.Initial_cost);
				System.out.println(Sobj5);
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
					SAndhraPradesh Sobj1 = new SAndhraPradesh();
					Sobj1.SAndhra();
				case 200:
					Exit obj1 = new Exit();
					obj1.end();
					System.exit(a125);
				}

			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 100:
				SolarPowerPlant Sobj = new SolarPowerPlant();
				Sobj.Sstates();
			default:
				System.out.println("Please Select Valid Choice.");
				SAndhra();
			}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			SAndhra();
		}
	}
}

class SMadhyaPradesh extends SolarPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO SOLAR POWER PLANTS IN MADHYA-PRADESH           |");
		System.out.println("====================================================================");
		
		System.out.println("1. Mandasaur Solar Farm");
		System.out.println("2. Rewa Ultra Solar Power Plant");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
		
		
	}
	
	public static void SMadhya()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice");
		int a15 = sc.nextInt();
		
		switch(a15)
		{
		case 1:
			Mandasaur Sobj7 = new Mandasaur(Mandasaur.name,Mandasaur.Establishment,Mandasaur.Location,Mandasaur.Capacity,Mandasaur.Initial_cost);
			System.out.println(Sobj7);
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
				SMadhyaPradesh Sobj6 = new SMadhyaPradesh();
				Sobj6.SMadhya();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a126);
			}

		case 2:
			Rewa Sobj8 = new Rewa(Rewa.name,Rewa.Establishment,Rewa.Location,Rewa.Capacity,Rewa.Initial_cost);
			System.out.println(Sobj8);
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
				SMadhyaPradesh Sobj6 = new SMadhyaPradesh();
				Sobj6.SMadhya();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			SolarPowerPlant Sobj = new SolarPowerPlant();
			Sobj.Sstates();
		default:
			System.out.println("Please Select Valid Choice.");	
			SMadhya();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			SMadhya();
		}
	}	
}
class SRajasthan extends SolarPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|            WELCOME TO SOLAR POWER PLANTS IN RAJASTHAN            |");
		System.out.println("====================================================================");
		
		System.out.println("1. Bhadla Solar Power Plant");
	}
}
class SKarnataka extends SolarPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|            WELCOME TO SOLAR POWER PLANTS IN KARNATAKA            |");
		System.out.println("====================================================================");
		
		System.out.println("1. Pavagad Solar Solar Plant");
	}
}
class SGujrat extends SolarPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO SOLAR POWER PLANTS IN GUJRAT             |");
		System.out.println("====================================================================");
		
		System.out.println("1. Charanka Solar Power Plant");
	}
}
class STamilnadu extends SolarPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|            WELCOME TO SOLAR POWER PLANTS IN TAMILNADU            |");
		System.out.println("====================================================================");
		
		System.out.println("1. Kamuthi Solar Power Plant");
	}
}


// Andhra Pradesh Solar Power Plant

class Kurnool extends SAndhraPradesh {
	
	static String name = "Kurnool Ultra Mega Solar Park";
	static int Establishment =2001 ;
	static String Location = "Kurnool District: Kurnool";
	static double Capacity = 1000;
	static double Initial_cost = 100;
	
	Kurnool(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|          WELCOME TO SOLAR POWER PLANTS IN ANDHRA PRADESH         |");
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

class NP_Kunta extends SAndhraPradesh {
	
	static String name = "	NP Kunta Ultra Mega Solar Plant";
	static int Establishment = 2015;
	static String Location = "Ananthpur District: AnanthPur";
	static double Capacity = 1500;
	static double Initial_cost = 7000;
	
	NP_Kunta(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|          WELCOME TO SOLAR POWER PLANTS IN ANDHRA PRADESH         |");
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

class AnanthPuramu2 extends SAndhraPradesh {
	
	static String name = "	Ananthapuramu – II Solar Power Plant";
	static int Establishment = 2016;
	static String Location = "Ananthpur District: Ananthpur";
	static double Capacity = 400;
	static double Initial_cost = 53.4;
	
	AnanthPuramu2(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|          WELCOME TO SOLAR POWER PLANTS IN ANDHRA PRADESH         |");
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

class Galiveedu extends SAndhraPradesh {
	
	static String name = "Galiveedu solar park";
	static int Establishment = 2022;
	static String Location = "Galiveedu District: Ananthpuramu";
	static double Capacity = 100;
	static double Initial_cost = 69.8;
	
	Galiveedu(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|          WELCOME TO SOLAR POWER PLANTS IN ANDHRA PRADESH         |");
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

// Madhya Pradesh Solar Power Plant

class Mandasaur extends SMadhyaPradesh {
	
	static String name = "Mandsaur Solar Farm";
	static int Establishment = 2017;
	static String Location = "Mandasur District: Mandasur";
	static double Capacity = 250;
	static double Initial_cost = 1500;

	Mandasaur(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|          WELCOME TO SOLAR POWER PLANTS IN MADHYA PRADESH         |");
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

class Rewa  extends SMadhyaPradesh {
	
	static String name = "	Rewa Ultra Mega Solar";
	static int Establishment = 2018;
	static String Location = "Gurh District: Rewa";
	static double Capacity = 750;
	static double Initial_cost = 4500;
	
	Rewa(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|          WELCOME TO SOLAR POWER PLANTS IN MADHYA PRADESH         |");
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

// Rajasthan Solar Power Plant

class Bhadla extends SRajasthan {
	
	static String name = "Bhadla Solar Park";
	static int Establishment = 2020;
	static String Location = "Bhadla District: Jodhpur";
	static double Capacity = 2245;
	static double Initial_cost = 10000;
	
	Bhadla(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|          WELCOME TO SOLAR POWER PLANTS IN RAJASTHAN              |");
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


// Karnataka Solar Power Plant

class Pavagad extends SKarnataka {
	
	static String name = "	Pavagada Solar Park";
	static int Establishment = 2018;
	static String Location = "Pavagada District: Tamkur";
	static double Capacity = 2050;
	static double Initial_cost = 14425;
	
	Pavagad(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|          WELCOME TO SOLAR POWER PLANTS IN KARNATAKA              |");
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


// Gujrat Solar Power Plant

class Charanka extends SGujrat {

	static String name = "Charanka Solar Park";
	static int Establishment = 2012;
	static String Location = "Charanka District: Patan";
	static double Capacity = 615;
	static double Initial_cost = 280;

	Charanka(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|          WELCOME TO SOLAR POWER PLANTS IN GUJRAT                 |");
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


// TamilNadu Solar Power Plant

class Kamuthi extends STamilnadu {
	
	static String name = "Kamuthi Solar Power Project";
	static int Establishment =2017 ;
	static String Location = "Kamuthi District: Kamuthi"; 
	static double Capacity = 1350;
	static double Initial_cost = 4550;

	Kamuthi(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|          WELCOME TO SOLAR POWER PLANTS IN TAMILNADU              |");
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