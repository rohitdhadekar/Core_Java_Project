package Power_Plant;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HydroPowerPlant extends Renewable{
	
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO HYDRO POWER PLANTS IN INDIA         	   |");
		System.out.println("====================================================================");

		System.out.println("1. Andhra Pradesh");
		System.out.println("2. Gujrat");
		System.out.println("3. Himachal Pradesh");
		System.out.println("4. Maharashtra");
		System.out.println("5. JammuKashmir");
		System.out.println("6. Jharkhand");
		System.out.println("7. Karnataka");
		System.out.println("8. Kerala");
		System.out.println("9. Madhya Pradesh");
		System.out.println("10. Manipur");
		System.out.println("11. Odisha");
		System.out.println("12. Sikkim");
		System.out.println("13. Uttarakhand");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	public static void Hstates()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Enter Your Choice.");
		int a2 = sc.nextInt();
		switch(a2)
		{
		case 1:
			HAndhraPradesh Hobj1 = new HAndhraPradesh();
			Hobj1.HAndhra();
			break;
			
		case 2:
			HGujrat Hobj2 = new HGujrat();
			SardarPatel H4 = new SardarPatel(SardarPatel.HPname,SardarPatel.HPEstablishment,SardarPatel.HPLocation,SardarPatel.HPCapacity,SardarPatel.HPInitial_cost);
			System.out.println(H4.toString());
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
			
		case 3:
			HHimachalPradesh Hobj3 = new HHimachalPradesh();
			Hobj3.HHimachal();
			break;
		case 4:
			HMaharashtra Hobj4 = new HMaharashtra();
			Koyna H5 = new Koyna(Koyna.HPname,Koyna.HPEstablishment,Koyna.HPLocation,Koyna.HPCapacity,Koyna.HPInitial_cost);
			System.out.println(H5.toString());
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 200 For Exit");
			
			int a126 = sc.nextInt();
			switch(a126)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a126);
			}
		case 5:
			HJammuKashmir Hobj5 = new HJammuKashmir();
			Hobj5.HJammu();
			break;
			
		case 6:
			HJharkhand Hobj6 = new HJharkhand();
			Subarnarekha H11 = new Subarnarekha(Subarnarekha.HPname,Subarnarekha.HPEstablishment,Subarnarekha.HPLocation,Subarnarekha.HPCapacity,Subarnarekha.HPInitial_cost);
			System.out.println(H11);
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 200 For Exit");
			
			int a127 = sc.nextInt();
			switch(a127)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a127);
			}
			
		case 7:
			HKarnataka Hobj7 = new HKarnataka();
			Hobj7.HKarnatak(); 
			break;
			
		case 8:
			HKerala Hobj8 = new HKerala();
			Idukki H15 = new Idukki(Idukki.HPname,Idukki.HPEstablishment,Idukki.HPLocation,Idukki.HPCapacity,Idukki.HPInitial_cost);
			System.out.println(H15);
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 200 For Exit");
			
			int a128 = sc.nextInt();
			switch(a128)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a128);
			}
			
		case 9:
			HMadhyaPradesh Hobj9 = new HMadhyaPradesh();
			Hobj9.HMadhya();
			break;
		case 10:
			HManipur Hobj10 = new HManipur();
			Loktak H19 = new Loktak(Rihana.HPname,Rihana.HPEstablishment,Rihana.HPLocation,Rihana.HPCapacity,Rihana.HPInitial_cost);
			System.out.println(H19);
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 200 For Exit");
			int a133 = sc.nextInt();
			switch(a133)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a133);
			}
		case 11:
			HOdisha Hobj11 = new HOdisha();
			Hobj11.HOdisha();
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 200 For Exit");
			
			int a129 = sc.nextInt();
			switch(a129)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a129);
			}
		case 12:
			HSikkim Hobj12 = new HSikkim();
			Hobj12.HSikkim();
			break;
		case 13:	
			HUttarakhand Hobj13 = new HUttarakhand();
			Tehri H24 = new Tehri(Tehri.HPname,Tehri.HPEstablishment,Tehri.HPLocation,Tehri.HPCapacity,Tehri.HPInitial_cost);
			System.out.println(H24);
			System.out.println();
			System.out.println("Press 0 For Main Menu");
			System.out.println("Press 200 For Exit");
			
			int a130 = sc.nextInt();
			switch(a130)
			{
			case 0:
				IndianPowerPlant Obj = new IndianPowerPlant();
				Obj.start();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a130);
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
			System.exit(a2);
			
		default:
			System.out.println("Please Select Valid Choice.");
			Hstates();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			Hstates();
		}
	}
	
	
}

class HAndhraPradesh extends HydroPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|           WELCOME TO HYDRO POWER PLANTS IN ANDHRA-PRADESH        |");
		System.out.println("====================================================================");
		System.out.println("1. Nagarjunasagar");
		System.out.println("2. Srisailam");
		System.out.println("3. Machkund");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	public static void HAndhra()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice.");
		int a3 = sc.nextInt();
		switch(a3)
		{
		case 1:
			NagarjunaSagar H1 = new NagarjunaSagar(NagarjunaSagar.HPname,NagarjunaSagar.HPEstablishment,NagarjunaSagar.HPLocation,NagarjunaSagar.HPCapacity,NagarjunaSagar.HPInitial_cost);
			System.out.println(H1.toString());
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
				HAndhraPradesh Hobj1 = new HAndhraPradesh();
				Hobj1.HAndhra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			Srisailam H2 = new Srisailam(Srisailam.HPname,Srisailam.HPEstablishment,Srisailam.HPLocation,Srisailam.HPCapacity,Srisailam.HPInitial_cost);
			System.out.println(H2.toString());
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
				HAndhraPradesh Hobj1 = new HAndhraPradesh();
				Hobj1.HAndhra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 3:
			Machkund H3 = new Machkund(Machkund.HPname,Machkund.HPEstablishment,Machkund.HPLocation,Machkund.HPCapacity,Machkund.HPInitial_cost);
			System.out.println(H3.toString());
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
				HAndhraPradesh Hobj1 = new HAndhraPradesh();
				Hobj1.HAndhra();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			HydroPowerPlant Hobj = new HydroPowerPlant();
			Hobj.Hstates();

		default:
			System.out.println("Please Select Valid Choice.");	
			HAndhra();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			HAndhra();
		}
	}
}

class HGujrat extends HydroPowerPlant{
	
	static {
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO HYDRO POWER PLANTS IN GUJRAT         	   |");
		System.out.println("====================================================================");
		System.out.println("1. SardarPatel");
		
		System.out.println();
	}
}

class HHimachalPradesh extends HydroPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN HIMACHAL-PRADESH         |");
		System.out.println("====================================================================");

		System.out.println("1. Bhakra Nangal");
		System.out.println("2. Dehar");
		System.out.println("3. Nathpa Jhakri");
		System.out.println("4. Pong");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	public static void HHimachal()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice.");
		int a4 = sc.nextInt();
		switch(a4)
		{
		case 1:
			BhakraNangal H5 = new BhakraNangal(BhakraNangal.HPname,BhakraNangal.HPEstablishment,BhakraNangal.HPLocation,BhakraNangal.HPCapacity,BhakraNangal.HPInitial_cost);
			System.out.println(H5.toString());
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
				HHimachalPradesh Hobj3 = new HHimachalPradesh();
				Hobj3.HHimachal();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			Dehar H6 = new Dehar(Dehar.HPname,Dehar.HPEstablishment,Dehar.HPLocation,Dehar.HPCapacity,Dehar.HPInitial_cost);
			System.out.println(H6);
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
				HHimachalPradesh Hobj3 = new HHimachalPradesh();
				Hobj3.HHimachal();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 3:
			NathpaJhakri H7 = new NathpaJhakri(NathpaJhakri.HPname,NathpaJhakri.HPEstablishment,NathpaJhakri.HPLocation,NathpaJhakri.HPCapacity,NathpaJhakri.HPInitial_cost);
			System.out.println(H7);
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
				HHimachalPradesh Hobj3 = new HHimachalPradesh();
				Hobj3.HHimachal();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a126);
			}
		case 4:
			Pong H8 = new Pong(Pong.HPname,Pong.HPEstablishment,Pong.HPLocation,Pong.HPCapacity,Pong.HPInitial_cost);
			System.out.println(H8);
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
				HHimachalPradesh Hobj3 = new HHimachalPradesh();
				Hobj3.HHimachal();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a127);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			HydroPowerPlant Hobj = new HydroPowerPlant();
			Hobj.Hstates();

		default:
			System.out.println("Please Select Valid Choice.");
			HHimachal();
		}	
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			HHimachal();
		}
	}
}

class HMaharashtra extends HydroPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|           WELCOME TO HYDRO POWER PLANTS IN MAHARASHTRA      	   |");
		System.out.println("====================================================================");
	}
	
}

class HJammuKashmir extends HydroPowerPlant{
	{
		System.out.println("====================================================================");
		System.out.println("|          WELCOME TO HYDRO POWER PLANTS IN JAMMU-KASHMIR      	   |");
		System.out.println("====================================================================");
		System.out.println("1.Salal");
		System.out.println("2. Uri");
		System.out.println("3. Dulhasti");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	public static void HJammu()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice.");
		int a5 = sc.nextInt();
		switch(a5)
		{
		case 1:
			Salal H8 = new Salal(Salal.HPname,Salal.HPEstablishment,Salal.HPLocation,Salal.HPCapacity,Salal.HPInitial_cost);
			System.out.println(H8);
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
				HJammuKashmir Hobj5 = new HJammuKashmir();
				Hobj5.HJammu();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			Uri H9 = new Uri(Uri.HPname,Uri.HPEstablishment,Uri.HPLocation,Uri.HPCapacity,Uri.HPInitial_cost);
			System.out.println(H9);
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
				HJammuKashmir Hobj5 = new HJammuKashmir();
				Hobj5.HJammu();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 3:
			Dulhasti H10 = new Dulhasti(Dulhasti.HPname,Dulhasti.HPEstablishment,Dulhasti.HPLocation,Dulhasti.HPCapacity,Dulhasti.HPInitial_cost);
			System.out.println(H10);
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
				HJammuKashmir Hobj5 = new HJammuKashmir();
				Hobj5.HJammu();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			HydroPowerPlant Hobj = new HydroPowerPlant();
			Hobj.Hstates();

		default:
			System.out.println("Please Select Valid Choice.");
			HJammu();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			HJammu();
		}
	}
}

class HJharkhand extends HydroPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO HYDRO POWER PLANTS IN JHARKHAND      	   |");
		System.out.println("====================================================================");
	}
}

class HKarnataka extends HydroPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO HYDRO POWER PLANTS IN KARNATAKA      	   |");
		System.out.println("====================================================================");
		System.out.println("1. Kalinadi");
		System.out.println("2. Shravathu");
		System.out.println("3. ShavanaSamudra");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	public static void HKarnatak()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice.");
		int a6 = sc.nextInt();
		switch(a6)
		{
		case 1:
			Kalinadi H12 = new Kalinadi(Kalinadi.HPname,Kalinadi.HPEstablishment,Kalinadi.HPLocation,Kalinadi.HPCapacity,Kalinadi.HPInitial_cost);
			System.out.println(H12);
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
				HKarnataka Hobj7 = new HKarnataka();
				Hobj7.HKarnatak();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			Shravathi H13 = new Shravathi(Shravathi.HPname,Shravathi.HPEstablishment,Shravathi.HPLocation,Shravathi.HPCapacity,Shravathi.HPInitial_cost);
			System.out.println(H13);
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
				HKarnataka Hobj7 = new HKarnataka();
				Hobj7.HKarnatak();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 3:
			ShavanaSamudra H14 = new ShavanaSamudra(ShavanaSamudra.HPname,ShavanaSamudra.HPEstablishment,ShavanaSamudra.HPLocation,ShavanaSamudra.HPCapacity,ShavanaSamudra.HPInitial_cost);
			System.out.println(H14);
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
				HKarnataka Hobj7 = new HKarnataka();
				Hobj7.HKarnatak();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			HydroPowerPlant Hobj = new HydroPowerPlant();
			Hobj.Hstates();

		default:
			System.out.println("Please Select Valid Choice.");
			HKarnatak();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			HKarnatak();
		}
	}
}

class HKerala extends HydroPowerPlant{

	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO HYDRO POWER PLANTS IN KERALA         	   |");
		System.out.println("====================================================================");
	}
}

class HMadhyaPradesh extends HydroPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|         WELCOME TO HYDRO POWER PLANTS IN MADHYA-PRADESH      	   |");
		System.out.println("====================================================================");

		System.out.println("1. Balsagar");
		System.out.println("2. Indira Sagar");
		System.out.println("3. Rihand");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	
	public static void HMadhya()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice.");
		int a7 = sc.nextInt();
		switch(a7)
		{
		case 1:
			BanSagar H16 = new BanSagar(BanSagar.HPname,BanSagar.HPEstablishment,BanSagar.HPLocation,BanSagar.HPCapacity,BanSagar.HPInitial_cost);
			System.out.println(H16);
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
				HMadhyaPradesh Hobj9 = new HMadhyaPradesh();
				Hobj9.HMadhya();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a123);
			}
		case 2:
			IndiraSagar H17 = new IndiraSagar(IndiraSagar.HPname,IndiraSagar.HPEstablishment,IndiraSagar.HPLocation,IndiraSagar.HPCapacity,IndiraSagar.HPInitial_cost);
			System.out.println(H17);
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
				HMadhyaPradesh Hobj9 = new HMadhyaPradesh();
				Hobj9.HMadhya();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 3:
			Rihana H18 = new Rihana(Rihana.HPname,Rihana.HPEstablishment,Rihana.HPLocation,Rihana.HPCapacity,Rihana.HPInitial_cost);
			System.out.println(H18);
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
				HMadhyaPradesh Hobj9 = new HMadhyaPradesh();
				Hobj9.HMadhya();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			HydroPowerPlant Hobj = new HydroPowerPlant();
			Hobj.Hstates();
		
		default:
			System.out.println("Please Select Valid Choice.");
			HMadhya();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			HMadhya();
		}
	}
}

class HManipur extends HydroPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO HYDRO POWER PLANTS IN MANIPUR      	   |");
		System.out.println("====================================================================");
	}
}

class HOdisha extends HydroPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO HYDRO POWER PLANTS IN ODISHA         	   |");
		System.out.println("====================================================================");

		System.out.println("1. Hirakud");
		System.out.println("2. Balimela");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	
	public static void HOdisha() 
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice");
		int a8 = sc.nextInt();
		
		switch(a8)
		{
		case 1:
			Hirakud H20 = new Hirakud(Hirakud.HPname,Hirakud.HPEstablishment,Hirakud.HPLocation,Hirakud.HPCapacity,Hirakud.HPInitial_cost);
			System.out.println(H20);
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
				HOdisha Hobj11 = new HOdisha();
				Hobj11.HOdisha();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 2:
			Balimela H21 = new Balimela(Balimela.HPname,Balimela.HPEstablishment,Balimela.HPLocation,Balimela.HPCapacity,Balimela.HPInitial_cost);
			System.out.println(H21);
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
				HOdisha Hobj11 = new HOdisha();
				Hobj11.HOdisha();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a124);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			HydroPowerPlant Hobj = new HydroPowerPlant();
			Hobj.Hstates();

		default:
			System.out.println("Please Select Valid Choice");
			HOdisha();	
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			HOdisha();
		}
	}
	
	
}

class HSikkim extends HydroPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|              WELCOME TO HYDRO POWER PLANTS IN SIKKIM         	   |");
		System.out.println("====================================================================");
		System.out.println("1. Rangit");
		System.out.println("2. Teesta");
		System.out.println("Press 0 For Main Menu");
		System.out.println("Press 100 For Previous Step");
		System.out.println();
	}
	
	
	public static void HSikkim()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Please Select Your Choice");
		int a9 = sc.nextInt();
		
		switch(a9)
		{
		case 1:
			Rangit H22 = new Rangit(Rangit.HPname,Rangit.HPEstablishment,Rangit.HPLocation,Rangit.HPCapacity,Rangit.HPInitial_cost);
			System.out.println(H22);
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
				HSikkim Hobj12 = new HSikkim();
				Hobj12.HSikkim();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a125);
			}
		case 2:
			Teesta H23 = new Teesta(Teesta.HPname,Teesta.HPEstablishment,Teesta.HPLocation,Teesta.HPCapacity,Teesta.HPInitial_cost);
			System.out.println(H23);
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
				HSikkim Hobj12 = new HSikkim();
				Hobj12.HSikkim();
			case 200:
				Exit obj1 = new Exit();
				obj1.end();
				System.exit(a126);
			}
		case 0:
			IndianPowerPlant Obj = new IndianPowerPlant();
			Obj.start();
		case 100:
			HydroPowerPlant Hobj = new HydroPowerPlant();
			Hobj.Hstates();

		default:
			System.out.println("Please Select Valid Choice");
			HSikkim();
		}
		}
		catch(InputMismatchException ipe)
		{
			System.out.println("Please Enter Integer");
			HSikkim();
		}
	}
}

class HUttarakhand extends HydroPowerPlant{
	
	{
		System.out.println("====================================================================");
		System.out.println("|           WELCOME TO HYDRO POWER PLANTS IN UTTARAKHAND       	   |");
		System.out.println("====================================================================");
	}
}
// Andhra Pradesh Hydro Power Plant

class NagarjunaSagar  extends HAndhraPradesh {
	static String HPname = "Nagarjunasagar Hydro Electric Power plant";
	static int HPEstablishment = 1967;
	static String HPRiver = "Krishna";
	static String HPLocation = "Nalgonda District: Nalgonda";
	static double HPCapacity = 816; 
	static double HPInitial_cost = 132.32 ;
	
	NagarjunaSagar(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
		
	}
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			River = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }
	
	 @Override
	    public String toString()
	    {
		 	System.out.println("====================================================================");
			System.out.println("|           WELCOME TO HYDRO POWER PLANTS IN UTTARAKHAND       	   |");
			System.out.println("====================================================================");
			System.out.println();
	    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
	    	System.out.println("Establishment             :- "+ super.Establishment+".");
	    	System.out.println("River                     :- "+ getHPRiver() +".");
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

class Srisailam extends HAndhraPradesh {
	static String HPname = "Srisailam Hydro Electric Power plant";
	static int HPEstablishment =1981 ;
	static String HPRiver = "Krishna";
	static String HPLocation = "Nagarkurnool District: Nagarkurnool";
	static double HPCapacity = 1670;
	static double HPInitial_cost = 1000;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }
	 
	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|           WELCOME TO HYDRO POWER PLANTS IN UTTARAKHAND       	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Srisailam(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

class Machkund extends HAndhraPradesh {
	static String HPname = "Machkund Hydro Electric Power plant";
	static int HPEstablishment = 1959;
	static String HPRiver = "Machkund";
	static String HPLocation =  "Jalaput District: Koraput ";
	static double HPCapacity = 120;
	static double HPInitial_cost = 153.878;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }
	
	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|           WELCOME TO HYDRO POWER PLANTS IN ANDHRA PRADESH    	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Machkund(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

// Gujrat Hydro Power Plant

class SardarPatel extends HGujrat {
	static String HPname = "Sardar Sarovar Hydro Electric Power plant";
	static int HPEstablishment = 2017;
	static String HPRiver = "Narmada";
	static String HPLocation = "Kevadiya District: Narmada";
	static double HPCapacity = 1450;
	static double HPInitial_cost = 5000;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|           WELCOME TO HYDRO POWER PLANTS IN ANDHRA PRADESH    	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	SardarPatel(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}


// Himachal Pradesh Hydro Power Plant


class BhakraNangal extends HHimachalPradesh {
	static String HPname = "Bhakra Nangal Hydroelectric Power plant";
	static int HPEstablishment = 1953;
	static String HPRiver = "Satluj";
	static String HPLocation = "Bilaspur District: Bilaspur";
	static double HPCapacity = 1325;
	static double HPInitial_cost = 245.28;

//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|         WELCOME TO HYDRO POWER PLANTS IN HIMACHAL PRADESH    	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	BhakraNangal(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

class Dehar extends HHimachalPradesh {
	static String HPname = "Dehar Hydroelectric Power plant";
	static int HPEstablishment = 1977;
	static String HPRiver = "Beas";
	static String HPLocation = "Mandi District: Mandi";
	static double HPCapacity = 990; 
	static double HPInitial_cost =22.2646 ;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN HIMACHAL PRADESH    	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Dehar(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
	
}

class NathpaJhakri extends HHimachalPradesh {
	static String HPname = "Nathpa Jhakri Hydroelectric Power plant";
	static int HPEstablishment = 2004;
	static String HPRiver = "Sutlej";
	static String HPLocation = "Kinnapur District: Shimla";
	static double HPCapacity = 1500;
	static double HPInitial_cost = 8187;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN HIMACHAL PRADESH    	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	NathpaJhakri(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

class Pong extends HHimachalPradesh {
	static String HPname = "Pong Power House";
	static int HPEstablishment= 1961;
	static String HPRiver = "Beas";
	static String HPLocation =  "Beas Himachal";
	static double HPCapacity = 396;
	static double HPInitial_cost = 2614;

//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN HIMACHAL PRADESH    	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Pong(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

// Maharashtra Hydro Power Plant

class Koyna extends HMaharashtra {
	static String HPname = "Koyna Hydroelectric Power plant";
	static int HPEstablishment = 1962;
	static String HPRiver = "koyna";
	static String HPLocation = "Koyna nagar District:";
	static double HPCapacity = 1960;
	static double HPInitial_cost = 90;

//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN MAHARASHTRA        	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Koyna(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}


// Jammu And Kashmir Hydro Power Plant

class Salal extends HJammuKashmir {
	static String HPname = "Salal Hydro Electric Power plant";
	static int HPEstablishment = 1987;
	static String HPRiver = "Chenab";
	static String HPLocation =  "Reasi District: Reasi";
	static double HPCapacity =690 ;
	static double HPInitial_cost = 928.29;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }
	 
	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN JAMMU KASHMIR      	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Salal(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

class Uri extends HJammuKashmir {
	static String HPname = "Uri Hydro Electric Power plant";
	static int HPEstablishment = 1997;
	static String HPRiver = "Jhelum";
	static String HPLocation = "Uri District: Baramula";
	static double HPCapacity = 480;
	static double HPInitial_cost = 3300;

//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN JAMMU KASHMIR      	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Uri(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

class Dulhasti extends HJammuKashmir {
	static String HPname = "Dulhasti Hydro Electric Power plant";
	static int HPEstablishment = 2007;
	static String HPRiver = "Chenab";
	static String HPLocation = "Kishtawar District: Kishtawar";
	static double HPCapacity = 390;
	static double HPInitial_cost = 625.95;

//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN JAMMU KASHMIR      	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Dulhasti(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}


// Jharkhand Hydro Power Plant

class Subarnarekha extends HJharkhand {
	static String HPname = "Subarnarekha Hydroelectric Power plant";
	static int HPEstablishment = 1983 ;
	static String HPRiver = "Subarnrekha";
	static String HPLocation = "Piska District:Ranchi";
	static double HPCapacity = 130;
	static double HPInitial_cost = 57;

//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }
	
	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN JHARKHAND      	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Subarnarekha(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}


// Karnataka Hydro Power Plant

class Kalinadi extends HKarnataka{
	static String HPname = "Kalinadi Hydro Electric Power plant";
	static int HPEstablishment = 1987;
	static String HPRiver = "Kali Nadi";
	static String HPLocation = "GaneshaGudi District: UttaraKannada";
	static double HPCapacity = 100;
	static double HPInitial_cost = 500;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN KARNATAKA      	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Kalinadi(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

class Shravathi extends HKarnataka {
	static String HPname = "Sharavathi Hydroelectric Power plant";
	static int HPEstablishment = 1964;
	static String HPRiver = "Shravathi";
	static String HPLocation = "Thithalli District: Shimoga";
	static double HPCapacity = 1035;
	static double HPInitial_cost = 64;

//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN KARNATAKA      	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Shravathi(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

class ShavanaSamudra extends HKarnataka {
	static String HPname = "Shivanasamudra Hydroelectric Power plant";
	static int HPEstablishment = 1902;
	static String HPRiver = "Shivanasamudra";
	static String HPLocation = "Kollegala District: Chamarajanagara";
	static double HPCapacity = 42;
	static double HPInitial_cost = 294; 

//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN KARNATAKA      	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	ShavanaSamudra(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}


// Kerala Hydro Power Plant

class Idukki extends HKerala{ 
	static String HPname = "Idukki Hydro Electric Power plant";
	static int HPEstablishment = 1976;
	static String HPRiver = "Periyar";
	static String HPLocation = "Kuravan District: Idukki";
	static double HPCapacity = 780;
	static double HPInitial_cost =1360 ;

//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN KERALA             	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Idukki(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

// Madhya Pradesh Hydro Power Plant


class BanSagar extends HMadhyaPradesh {
	static String HPname = "Bansagar Hydroelectric Power plant";
	static int HPEstablishment = 2006;
	static String HPRiver = "Sone";
	static String HPLocation = "Ganges Basin";
	static double HPCapacity = 435;
	static double HPInitial_cost = 1054.96;

//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN MADHYA PRADESH      	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	BanSagar(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

class IndiraSagar extends HMadhyaPradesh {
	static String HPname = "Indira Sagar Hydro Electric Power plant";
	static int HPEstablishment = 2005;
	static String HPRiver = "Narmada";
	static String HPLocation = "Punasa District: Khandwa";
	static double HPCapacity = 1000;
	static double HPInitial_cost = 270;

//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN MADHYA PRADESH      	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	IndiraSagar(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

class Rihana extends HMadhyaPradesh {
	static String HPname = "	Rihand Hydroelectric Power plant";
	static int HPEstablishment =1962 ;
	static String HPRiver = "Rihand";
	static String HPLocation = "Pipri District: Sonbhadra";
	static double HPCapacity = 300;
	static double HPInitial_cost = 170;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN MADHYA PRADESH      	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Rihana(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

// Manipur Hydro Power Plant

class Loktak extends HManipur {
	static String HPname = "Loktak Hydro Electric Power plant";
	static int HPEstablishment = 1983;
	static String HPRiver = "Leimtak";
	static String HPLocation = "Tamenglong District: Manipur";
	static double HPCapacity = 105;
	static double HPInitial_cost = 119;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN MANIPUR            	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Loktak(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

// Odisha Hydro Power Plant

class Hirakud extends HOdisha {
	static String HPname = "Hirakud Hydro Electric Power plant";
	static int HPEstablishment = 1957;
	static String HPRiver = "Mahanadi";
	static String HPLocation = "Sambalpur";
	static double HPCapacity = 347.5;
	static double HPInitial_cost =1000.2 ;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }
	
	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN ODISHA             	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Hirakud(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}


class Balimela extends HOdisha {
	static String HPname = "Balimela Hydro Electric Power plant";
	static int HPEstablishment = 1977;
	static String HPRiver = "Godavari";
	static String HPLocation = "Malakangiri District: Malkangiri";
	static double HPCapacity =510 ;
	static double HPInitial_cost = 2413.77;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN ODISHA             	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Balimela(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}


// Sikkim Hydro Power Plant

class Rangit extends HSikkim {
	static String HPname = "Rangit Hydroelectric Power plant";
	static int HPEstablishment = 1999;
	static String HPRiver = "Ranjit";
	static String HPLocation = "South Sikkim";
	static double HPCapacity = 60;
	static double HPInitial_cost = 492.26;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }
	
	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN SIKKIM             	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Rangit(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

class Teesta extends HSikkim {
	static String HPname = "Teesta Hydro Electric Power plant";
	static int HPEstablishment = 2016;
	static String HPRiver = "Teesta";
	static String HPLocation = "Kalijhora District: Kalimpong";
	static double HPCapacity = 160;
	static double HPInitial_cost = 5748.04;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN SIKKIM             	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Teesta(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}

// Uttarakhand Hydro Power Plant

class Tehri extends HUttarakhand {
	static String HPname = "Tehri Hydro Electric Power plant";
	static int HPEstablishment = 2006;
	static String HPRiver = "Bhagirathi";
	static String HPLocation = "New Tehri District: Tehri Garhwal";
	static double HPCapacity = 1000;
	static double HPInitial_cost = 2500;
	
//	 public static void setHPRiver(String hPRiver)
//	 {
//			HPRiver = hPRiver;
//	 }

	 public static String getHPRiver()
	 {
		return HPRiver;
	 }

	@Override
    public String toString()
    {
	 	System.out.println("====================================================================");
		System.out.println("|        WELCOME TO HYDRO POWER PLANTS IN UTTARAKHAND          	   |");
		System.out.println("====================================================================");
		System.out.println();
    	System.out.println("Name Of Hydro-Power Plant :- "+ super.name+ ".");
    	System.out.println("Establishment             :- "+ super.Establishment+".");
    	System.out.println("River                     :- "+ getRiver()+".");
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
	
	Tehri(String name, int Establishment, String Location, double Capacity,double Initial_cost) 
	{
		super.name = name;
		super.Establishment = Establishment;
		super.Location = Location;
		super.Capacity = Capacity;
		super.Initial_cost = Initial_cost;
	}
}