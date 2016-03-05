public class BuzzFizz {
    public static void main(String[] args){
	for(int i=1; i < 100; i++) {
	    String out = new String("");
	    if(i%3==0) out += "Fizz";
	    if(i%5==0) out += "Buzz";
	    if(out.length() == 0) out += i;
	    System.out.println(out);
	}
	       
    }
}
