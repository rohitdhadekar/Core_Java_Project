package Power_Plant;

import java.util.InputMismatchException;
import java.util.Scanner;


class NuclearPowerPlant extends NonRenewable {

	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO NUCLEAR POWER PLANTS IN INDIA           |");
		System.out.println("====================================================================");
		
		System.out.println("1. Gujrat");
		System.out.println("2. Tamilnadu");
		System.out.println("3. Uttar-Pradesh");
		System.out.println("4. Karnataka");
		System.out.println("5. Rajasthan");
		System.out.println("6. Maharashtra");
		
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	public static void Nstates()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice");
		int a16 = sc.nextInt();
		
		switch(a16)
		{
		case 1:
			NGujrat Nobj1 = new NGujrat();
			Kakrapur Nobj7 = new Kakrapur(Kakrapur.name,Kakrapur.Establishment,Kakrapur.Location,Kakrapur.Capacity,Kakrapur.Initial_cost);
			System.out.println(Nobj7);
			
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
				NuclearPowerPlant Nref = new NuclearPowerPlant();
				Nref.Nstates();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
			
		case 2:
			NTamilnadu Nobj2 = new NTamilnadu();
			Nobj2.NTamilnadu();
			break;
		case 3:
			NUttarPradesh Nobj3 = new NUttarPradesh();
			Narora Nobj10 = new Narora(Narora.name,Narora.Establishment,Narora.Location,Narora.Capacity,Narora.Initial_cost);
			System.out.println(Nobj10);
			
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
				NuclearPowerPlant Nref = new NuclearPowerPlant();
				Nref.Nstates();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
			
		case 4:
			NKarnataka Nobj4 = new NKarnataka();
			Kaiga Nobj11 = new Kaiga(Kaiga.name,Kaiga.Establishment,Kaiga.Location,Kaiga.Capacity,Kaiga.Initial_cost);
			System.out.println(Nobj11);
			
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
				NuclearPowerPlant Nref = new NuclearPowerPlant();
				Nref.Nstates();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 5:
			NRajasthan Nobj5 = new NRajasthan();
			RajasthanNP Nobj12 = new RajasthanNP(RajasthanNP.name,RajasthanNP.Establishment,RajasthanNP.Location,RajasthanNP.Capacity,RajasthanNP.Initial_cost);
			System.out.println(Nobj12);
			
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
				NuclearPowerPlant Nref = new NuclearPowerPlant();
				Nref.Nstates();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a126);
			}
			
		case 6:
			NMaharashtra Nobj6 = new NMaharashtra();
			Tarapur Nobj13 = new Tarapur(Tarapur.name,Tarapur.Establishment,Tarapur.Location,Tarapur.Capacity,Tarapur.Initial_cost);
			System.out.println(Nobj13);
			
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
				NuclearPowerPlant Nref = new NuclearPowerPlant();
				Nref.Nstates();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a127);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			NonRenewable NRref = new NonRenewable();
			NRref.NonRenewabble();
		default:
			System.out.println("Please Select Valid Choice.");
			Nstates();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			Nstates();
		}
	}
}

class NGujrat extends NuclearPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO NUCLEAR POWER PLANTS IN GUJRAT           |");
		System.out.println("====================================================================");
		
		System.out.println("1. Kakrapur Nuclear Power Plant");
	}
}

class NTamilnadu extends NuclearPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO NUCLEAR POWER PLANTS IN TAMILNADU        |");
		System.out.println("====================================================================");
		
		System.out.println("1. Kalpakkam (Madras) Nuclear Solar Power Plant");
		System.out.println("2. KundanKulam Nuclear Power Plant");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	public static void NTamilnadu()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice");
		int a17 = sc.nextInt();
		
		switch(a17)
		{
		case 1:
			Kalpakkam Nobj8 = new Kalpakkam(Kalpakkam.name,Kalpakkam.Establishment,Kalpakkam.Location,Kalpakkam.Capacity,Kalpakkam.Initial_cost);
			System.out.println(Nobj8);
			
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
				NTamilnadu Nobj2 = new NTamilnadu();
				Nobj2.NTamilnadu();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			KundanKulam Nobj9 = new KundanKulam(KundanKulam.name,KundanKulam.Establishment,KundanKulam.Location,KundanKulam.Capacity,KundanKulam.Initial_cost);
			System.out.println(Nobj9);
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
				NTamilnadu Nobj2 = new NTamilnadu();
				Nobj2.NTamilnadu();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			NuclearPowerPlant Nref = new NuclearPowerPlant();
			Nref.Nstates();
		default:
			System.out.println("Please Select Valid Choice.");
			NTamilnadu();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			NTamilnadu();
		}
	}
}

class NUttarPradesh extends NuclearPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|           WELCOME TO NUCLEAR POWER PLANTS IN UTTAR-PRADESH       |");
		System.out.println("====================================================================");
		
		System.out.println("1. Narora Nuclear Power Plant");
	}
}

class NKarnataka extends NuclearPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|             WELCOME TO NUCLEAR POWER PLANTS IN KARNATAKA         |");
		System.out.println("====================================================================");
		
		System.out.println("1. Kaiga Nuclear Power Plant");
	}
}
class NRajasthan extends NuclearPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|            WELCOME TO NUCLEAR POWER PLANTS IN RAJASTHAN          |");
		System.out.println("====================================================================");
		
		System.out.println("1. Rajasthan Nuclear Power Plant");
	}
	
}
class NMaharashtra extends NuclearPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|         WELCOME TO NUCLEAR POWER PLANTS IN MAHARASHTRA           |");
		System.out.println("====================================================================");
		
		System.out.println("1. Tarapur Nuclear Power Plant");
	}
}

// Gujrat Nuclear Power Plant

class Kakrapur extends NGujrat{
	static String name = "Kakrapar Atomic Power Station ";
	static int Establishment = 1993;
	static String Location =  "Surat District: Surat";
	static double Capacity = 440;
	static double Initial_cost = 1335;
	

	Kakrapur(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|              WELCOME TO NUCLEAR POWER PLANTS IN GUJRAT           |");
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

// TamilNadu Nuclear Power Plant

class Kalpakkam extends NTamilnadu {
	static String name ="Madras Atomic Power Station";
	static int Establishment = 1984;
	static String Location = "Kalpakkam District: Chennai";
	static double Capacity = 440;
	static double Initial_cost = 1335;
	
	Kalpakkam(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO NUCLEAR POWER PLANTS IN TAMILNADU           |");
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

class KundanKulam extends NTamilnadu {
	static String name = "Kudankulam Nuclear Power Plant";
	static int Establishment = 2013;
	static String Location = "Kundankulam District: Tirunelveli ";
	static double Capacity = 2000;
	static double Initial_cost = 49621;
	
	KundanKulam(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|           WELCOME TO NUCLEAR POWER PLANTS IN TAMILNADU           |");
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


// Uttar Pradesh Nuclear Power Plant

class Narora extends NUttarPradesh {
	static String name = "Narora Atomic Power Station";
	static int Establishment = 1991;
	static String Location = "Narora District: Bulandshahar";
	static double Capacity = 440;
	static double Initial_cost = 12650;
	
	Narora(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|        WELCOME TO NUCLEAR POWER PLANTS IN UTTARPRADESH           |");
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


//Karnatak Nuclear Power Plant

class Kaiga extends NKarnataka{
	static String name = "Kaiga Nuclear Power Plant";
	static int Establishment =2000;
	static String Location = "Kaiga District: Uttar Kannada";
	static double Capacity = 808;
	static double Initial_cost = 105000;
	
	Kaiga(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|        WELCOME TO NUCLEAR POWER PLANTS IN KARNATAKA              |");
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


// Rajasthan Nuclear Power Plant

class RajasthanNP extends NRajasthan{
	static String name = "Rajasthan Atomic Power Station";
	static int Establishment = 1973; 
	static String Location = "Rawatbhata District: Rawatbhata";
	static double Capacity = 995;
	static double Initial_cost = 123020;
	
	RajasthanNP(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|        WELCOME TO NUCLEAR POWER PLANTS IN RAJASTHAN              |");
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

// Maharashtra Nuclear Power Plant

class Tarapur extends NMaharashtra {
	
	static String name = "Tarapur Atomic Power Station ";
	static int Establishment = 1969;
	static String Location = "Boisar District: Palghar";
	static double Capacity = 1280;
	static double Initial_cost = 16800;
	
	Tarapur(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
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
		System.out.println("|        WELCOME TO NUCLEAR POWER PLANTS IN MAHARASHTRA            |");
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