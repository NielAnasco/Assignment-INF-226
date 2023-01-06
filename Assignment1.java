import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
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

        

    }
}