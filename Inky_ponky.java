public class Inky {
 
 public Inky (String a) {
  System.out.println(a);
 }
 public Inky (String a, String b, String c) {
  System.out.println(b + " " + a);
  System.out.println(a + " " + c);
  System.out.println(b + " " + a + " " + c);
 }
 
 public static void main(String[] args) {
  String pinky = "donkey";
  String blinky = "pinky";
  String rinky = "monkey";
  
  Inky ponkey = new Inky(pinky);
  Inky ponkey2 = new Inky(pinky, blinky, rinky);
 }
}