public class FizzBuzz {
    public static void main(String[] args) {
	for(int i=1;i<100;i++) {

	    if(i%3 == 0) System.out.printf("Fizz");

	    if(i%5 == 0) System.out.printf("Buzz");
	    // If we printed Fizz or Buzz, just add a newline
	    if(i%3==0||i%5==0)
		{  System.out.printf("\n"); }
	    // Otherwise, print out the number and a newline
	    else {System.out.printf("%d\n",i);
	    }
	}
    }
}
