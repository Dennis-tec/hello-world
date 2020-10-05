import java.io.Console;

public class Boolean{
 public static void main(String[] args) {
  Console console = System.console();
  System.out.println("Enter your age");
  String stringAge=console.readLine();
  Integer age = Integer.parseInt(stringAge);
  if (age <= 18) {
  System.out.println("I'm sorry, children are not allowed here");
}  else {
  System.out.println("enjoy your self in the club");
}
  }
}
