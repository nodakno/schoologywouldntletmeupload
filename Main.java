public class Main
{   
	public static void main(String[] args) {
	    
	// -- STRINGS (array of chars)
	
	char j = 'j'; // declare char with val 'j'
	
	System.out.println(j); // print char
	    
	String myString = "Hello World!"; // declares string var
	
    System.out.println(myString); // prints string var
    
    // -- INTEGERS
    
	int x = 123; // declares int with value 123
	
    int y = 23; // declares int with value of 23
    
    //bitwise
    
    int z = x & 1; // should return 0 if number is even
    
    System.out.println(z); // prints 1 as the number isn't even
    
    //division
    
    int a = x / z; // should return the original value of x
    
    System.out.println(a); // prints the orginal value of x
    
    //modulus
    
    int b = x % 2; // Returns one as x is not divisible by two and the remainder is 1
    
    System.out.println(b); // prints the value of b
    
    // -- FLOATS (doubles)
    
    double p = 1.2; // initiates a double with the value of 1.2
    
    double l = 43.3; // initiates a double with the value of 43.3
    
    double m = p * l; //multiplies the two doubles
    
    System.out.print(m); // computer goes insane after trying to multiply doubles (its too stupid)
    
    // -- INCREMENT
    
    for (int i = 0; i < 5; i++) {
    System.out.println(i); // print i which is incremented every loop
    }
    
    // -- DECREMENT
    
    int decrementNum = 100;
    
    for (int i = 0; i < 5; i++) {
        decrementNum--;
        System.out.println(decrementNum); //print decrementNum which is decremented every loop
    }
    
    // -- easy stuffs (self explanatory)
    
    int num1 = 1; 
    
    int num2 = 2;
    
    int sum = num1 + num2;
    
    int difference = num1 - num2;
    
    System.out.println(sum);
    
    System.out.println(difference);
    
    // -- BOOLEANS AND LOGICAL OPERATORS
    if (true && false || !false) {
        System.out.println(!false + "...");
    }
	}
}
