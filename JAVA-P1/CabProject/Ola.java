package CabProject;

public class Ola 
{
    public static void bookingDetails(Cab cab)
    {
        System.out.println("******* Booking Details *******");
        System.out.println("Pickup Location : " + cab.pl);
        System.out.println("Drop Location   : " + cab.dl);

        
        if(cab instanceof Mini)
        {
        	System.out.println(" ----YOUR MINI CAB IS ON THE WAY-------");
        	Mini obj = (Mini) cab;// downCasting
        	System.out.println(" Driver : "+obj.driver);
        	System.out.println("Phone_no : "+obj.phno);
        	System.out.println("Car-Model : "+obj.carModel);
        	System.out.println("Car-Numebr: "+obj.carNum);
        	System.out.println(" Seats : "+ obj.seats);
        	System.out.println("Rating : "+obj.rating);
        	System.out.println("Cost / KM : "+ obj.cost);
        }
        
        else if(cab instanceof Sedan)
        {
        	System.out.println(" ----YOUR PREMIUM SEDAN CAB IS ON THE WAY-------");

        	Sedan obj = (Sedan) cab;
        	System.out.println(" Driver : "+obj.driver);
        	System.out.println("Phone_no : "+obj.phno);
        	System.out.println("Car-Model : "+obj.carModel);
        	System.out.println("Car-Numebr: "+obj.carNum);
        	System.out.println(" Seats : "+ obj.seats);
        	System.out.println("Rating : "+obj.rating);
        	System.out.println("Cost / KM : "+ obj.cost);
        }
        
        else if(cab instanceof Lux)
        {
        	System.out.println(" ----YOUR ULTRA LUXURY CAB IS ON THE WAY-------");

        	Lux obj = (Lux) cab;
        	System.out.println(" Driver : "+obj.driver);
        	System.out.println("Phone_no : "+obj.phno);
        	System.out.println("Car-Model : "+obj.carModel);
        	System.out.println("Car-Numebr: "+obj.carNum);
        	System.out.println(" Seats : "+ obj.seats);
        	System.out.println("Rating : "+obj.rating);
        	System.out.println("Cost / KM : "+ obj.cost);
        }
    }
}
