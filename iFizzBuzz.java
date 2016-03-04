import java.util.Scanner;

public class iFizzBuzz {
    public static void main(String[] args){
	System.out.println("Welcome to iFizzBuzz! Press ctrl-C to exit, or start doing integers.");
	
	while(true) {

	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();

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
}
