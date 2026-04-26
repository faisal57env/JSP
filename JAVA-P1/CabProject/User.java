package CabProject;
import java.util.Scanner;
public class User 
{
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("1. Mini\n2. Sedan\n3. Luxury");
	        int ch = sc.nextInt();
	        
	        System.out.print("Enter Pickup Location : ");
	        String pl = sc.next();
	        System.out.print("Enter Drop Location   : ");
	        String dl = sc.next();
	        
	        Cab cab; // Reference of Parent Class

	        switch (ch) {
	            case 1 -> {
	                cab = new Mini(pl, dl, "Arun", 9876543210L, "Swift", "TS08Q7777", 4, 4.5, 10);
	                Ola.bookingDetails(cab);
	            }
	            case 2 -> {
	                cab = new Sedan(pl, dl, "Ranjith", 8765432109L, "SLAVIA", "TS09DH9999", 4, 4.2, 15);
	                Ola.bookingDetails(cab);
	            }
	            case 3 -> {
	                
	            	cab = new Lux(pl,dl, "Alex",1233456," RR SILVER GHOST","TG110182",6,5,50);
	            	Ola.bookingDetails(cab);
	            }
	        }
	    }
	}
