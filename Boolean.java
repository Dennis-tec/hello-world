import java.io.Console;

public class Boolean{
/* public static void main(String[] args) {
  Console console = System.console();
  System.out.println("Enter your age");
  String stringAge=console.readLine();
  Integer age = Integer.parseInt(stringAge);
  if (age <= 18) {
  System.out.println("I'm sorry, children are not allowed here");
}  else {
  System.out.println("enjoy your self in the club");
}
}*/
public static void main(String[] args) {
  Console console=System.console();
  String season="summer";
  String week="weekend";

  System.out.println("Which day of the period of the week do you like want to visit the us?");
  String weekDay = console.readLine();
  System.out.println("which season do you want to make your travel arrangements");
  String seasonTime = console.readLine();
  if ((weekDay.equals(week)) && (seasonTime.equals(season))) {
    System.out.println("your travel arrangements will be expensive");
  } else {
    System.out.println("you will probably have an affordable trip");
  }
}
}
