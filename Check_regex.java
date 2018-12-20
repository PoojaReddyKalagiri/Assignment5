import java.util.regex.*;
import java.util.Scanner;
class Check_regex{
  public static void main(String arg0s[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    Pattern p=Pattern.compile("^[A-Z].*[.]$");
    Matcher m=p.matcher((CharSequence)s);
    System.out.println(m.matches());
  }
}
