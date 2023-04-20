package Power_Plant;
import java.util.Scanner;

public class Driver {
	
	static
	{
		System.out.println("====================================================================");
		System.out.println("|           WELCOME TO LOGIN PAGE OF INDIAN POWER PLANTS           |");
		System.out.println("====================================================================");
	}
	
	public static void main(String[] args) {
		
		Login ref1 = new Login();
		ref1.Pass();
		
		ref1.login();
		
		IndianPowerPlant Obj = new IndianPowerPlant();
		Obj.start();	
		
		Exit obj1 = new Exit();
		obj1.end();
	}
}
