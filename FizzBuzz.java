public class FizzBuzz {
    int fizz;
    int buzz;
    
    public FizzBuzz(int fizz, int buzz) {
	this.fizz=fizz;
	this.buzz=buzz;
    }

    public String respond(int number) {
	if(number==0) return ("" + number);
	String out = new String("");
	if(number%fizz==0) out += "Fizz";
	if(number%buzz==0) out += "Buzz";
	if(out.length() == 0) out += number;
	return out;

    }
    
    public static void main(String[] args) {
	FizzBuzz fb = new FizzBuzz(3,5);
	for(int i=1;i<100;i++) {
	    System.out.println(fb.respond(i));   
	}
    }
}
