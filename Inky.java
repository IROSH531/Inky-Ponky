public class Inky {
 
 		
 public Inky(String a) {
  System.out.println(a);
 }
 
		 // Constructor with three parameters
 public Inky(String a, String b, String c) {
  System.out.println(a + " " + b + " " + c);
 }
 
 public static void main(String[] args) {
  // Initializing variables
  String pinky = "donkey"; 		// Variable pinky with value "donkey"
  String blinky = pinky;		// Variable blinky with value of pinky
  String rinky = "monkey"; 		// Variable rinky with value "monkey"

  System.out.println("01. " + "pinkey " + pinky); 		// Print statement for the first output
  System.out.println("02. " + pinky + " " + rinky); 		// Print statement for the second output
  
 		
  Inky ponky2 = new Inky("pinky", "donky", "monky");
 }
}
