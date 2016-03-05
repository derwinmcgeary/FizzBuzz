import java.util.Scanner;

public class iFizzBuzz {
    public static void main(String[] args){
	System.out.println("Welcome to iFizzBuzz! Press ctrl-D to exit, or start doing integers.");
	Scanner s = new Scanner(System.in);
	int n=0;
	
	while(s.hasNextLine()) {
	    n=readN(s);
	    if(n>0) {
		System.out.println(response(n));
	    } else {
		reject();
	    }
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
    
    public static int readN(Scanner s) {
	int n=0;
	
	while(!s.hasNextInt()) {
	    try { s.next();
	    }
	    catch(Exception NoSuchElementException) {
		return 0;
	    }
	    reject();
	}
	
	n = s.nextInt();

	return n;
    }
}
