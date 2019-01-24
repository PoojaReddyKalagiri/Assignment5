import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class checkRegex{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    Pattern p=Pattern.compile("^[A-Z].*[.]$");
    Matcher m=p.matcher((CharSequence)s);
    System.out.println(m.matches());
  }
}

/*

Test Cases:

Input 1:
Pooja.
Output 1:
true

Input 2:
My name is Pooja.
Output 2:
true

Input 3:
zemoso.
Output 3:
false

Input 4:
?!jnscj??
Output 4:
false

Input 5:
Hey!
Ouput 5:
false

*/


