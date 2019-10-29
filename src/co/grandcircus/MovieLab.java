package co.grandcircus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class MovieLab {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char userReply = 'y';
		String userCategory;
		ArrayList<String> movieCategories = new ArrayList<>();
		MovieLab.add("Star-Wars", "Sci-fi");
		MovieLab.add("Stars", "Sci-fi");
		MovieLab.add("Aliens", "Sci-fi");
		MovieLab.add("Stars & Aliens", "Sci-fi");
		MovieLab.add("Death of Humans", "Sci-fi");
		MovieLab.add("Crying", "Drama");
		MovieLab.add("Cheating", "Drama");
		MovieLab.add("Betrayal", "Drama");
		MovieLab.add("Marriage", "Drama");
		MovieLab.add("Death", "Drama");
		System.out.println("Welcome to the Movie List Application!");
		System.out.println(movieCategories);
//		do { 
//			userCategory = Validator.getString(scnr, "What category are you interested in: " );
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//			
//	        System.out.println("Would you like to continue? (y/n) ");
//	        userReply = scnr.next().charAt(0);
//	        } while (userReply == 'y');
		System.out.println("Good-Bye!");
	}

	private static void add(String string, String string2) {
		
		
	}

}
