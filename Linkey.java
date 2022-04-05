import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Linkey {

	public static void main(String[] args) {
	
		
	
		
		
		/*
		
		String[] Cars = {"BMW", "BENZ", "AUDI", "JAGUAR"};
		List<String> allCars = new LinkedList<>();
		for(String car : Cars) {
			allCars.add(car);
		}
		System.out.println(allCars);
		
		*/
		
		
		
		
		
		LinkedList<String> Linkey = new LinkedList<String>();
	
		Linkey.push("BMW");
		Linkey.push("Benz");
		Linkey.push("Audi");
		Linkey.push("Jaguar");
	
			
		System.out.println(Linkey);
			
		
		Linkey.pop();
		
		System.out.println(Linkey);
		
		Linkey.peek();
		
		System.out.println(Linkey);
		
		System.out.println(Linkey.contains("e"));
		
		
		
		
		/*
		System.out.println("The replaced object is : " + Linkey.set(1, "Volvo"));
		System.out.println("The replaced object is : " + Linkey.set(2, "Jaguar"));
		System.out.println("The new Linkey is : " + Linkey);
		
		System.out.println("The Size of Linkey is : " + Linkey.size());
		
			
		
		Linkey.push("Civic");
		Linkey.push("Verna");
		Linkey.push("City");

		System.out.println(Linkey);
		
		String Delete = Linkey.pop();
		
		System.out.println(Delete);
		
		Linkey.push("Amaze");
		
		System.out.println(Linkey);
		
		Linkey.remove("Civic");
		
		System.out.println(Linkey);
		
		Linkey.clear();
		
		System.out.println(Linkey);
		
		
		*/
		
		
		
		System.out.println(Linkey.get(1));

		System.out.println("The Famous Car Brand is : " + Linkey);
		
		Linkey.offerFirst("Jaguar");
		
		System.out.println("First Added car is : " + Linkey);
		
		Linkey.offerLast("RR");
		
		System.out.println("Last Added car is : " + Linkey);

		
		System.out.println("Index of BMW is : " + Linkey.indexOf("BMW"));
		
		System.out.println("Index of Audi is : " + Linkey.indexOf("Audi"));

		
		
		
		//<String> secondLinkedlist = new LinkedList<String>();
		
		//secondLinkedlist = (LinkedList<String>) Linkey.clone();
		
		//System.out.println("Clone List Are : " + secondLinkedlist);
		
		/* Linkey.add( "Honda");
		Linkey.add( "Suzuki");
		Linkey.add("Hundai"); */
		
		
		
		
		
		
		
		
	}

}
