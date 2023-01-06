import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

// BIRTHDAY

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Birthday: ");
        String studentBirthday = scan.nextLine();
    

        // Long method
        Pattern pattern = Pattern.compile("\\d{04}-\\d{02}-\\d{02}");
        Matcher matcher = pattern.matcher(studentBirthday);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid birthday");
        } else {
            System.out.println("invalid birthday");
        }
// EMAIL

           Scanner scan1 = new Scanner(System.in);
           System.out.print("Enter Email Address: ");
           String studentEmail = scan.nextLine();
       
   
           // Long method
           Pattern pattern1 = Pattern.compile("\\w+@students.national-u.edu.ph");
           Matcher matcher1 = pattern.matcher(studentEmail);
   
           boolean match1 = matcher.matches();
   
           if (match) {
               System.out.println("valid email address");
           } else {
               System.out.println("invalid email address");
           }
   
// TELEPHONE

           Scanner scan2 = new Scanner(System.in);
           System.out.print("Enter Telephone Number: ");
           String studentNumber = scan.nextLine();
       
   
           // Long method
           Pattern pattern2 = Pattern.compile("\\+63\\d{10}");
           Matcher matcher2 = pattern.matcher(studentNumber);
   
           boolean match2 = matcher.matches();
   
           if (match) {
               System.out.println("valid telephone number");
           } else {
               System.out.println("invalid telephone number");
           }
        }
}
