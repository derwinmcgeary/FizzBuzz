import java.util.Scanner;

public class iFizzBuzz {
    public static void main(String[] args){
	System.out.println("Welcome to iFizzBuzz! Press ctrl-C to exit, or start doing integers.");
	Scanner s = new Scanner(System.in);
	int n;
	
	while(true) {
	    
	    try {
		n = s.nextInt();
	    }
	    catch(Exception InputMismatchException) {
		reject();
		s.nextLine();
		continue;
	    }

<<<<<<< HEAD
	    if(n <= 0) {
		reject();
		s.nextLine();
		continue;
	    }
	    
=======
	    int n;
	    Scanner s = new Scanner(System.in);
	    try {
	    n = s.nextInt();
	    }
	    catch(Exception InputMismatchException) {
		reject();
		continue;
	    }

	    if(n < 0) {
		reject();
		continue;
	    }

	    if(n==0) {
		System.out.println("Nice try, good testing skills. Still not a positive integer");
		continue;
	    }
>>>>>>> 9245e0f4d31504af2a41ec3a5a3d0d9eecc68302
	    System.out.println(response(n));
	}
    }
    
    public static String response(int n) {
	String out = new String("");
	if(n%3==0) out += "Fizz";
	if(n%5==0) out += "Buzz";
	if(out.length() == 0) out += Integer.toString(n);
	return out;
	
    }

    public static void reject() {
	    String rejected = new String("That's not a positive integer!");
	    System.out.println(rejected);
    }
}
