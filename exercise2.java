import java.util.Scanner;

public class Car {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        car("Driving Skills");
        scan.close();
    }

    static void car(String car) {

        System.out.println("Driving Lessons");
        taste(car);

        String feedback = getFeedBack(car);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            carOn(car);

            // Recursive call
            car(car);
        } else if (feedback.equals("yes")) {
            drive(car);
        }
    }

    static void taste(String car) {
        System.out.println("Examining Driving Skills");
    }

    static String getFeedBack(String car) {
        System.out.println("Is my " + car + " pass the test? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void carOn(String car) {
        System.out.print("Enter skills to improve on : ");
        String Skills = scan.next();
        System.out.println("Skills Added " + Skills);
    }

    static void drive(String car) {
        System.out.println("You can now drive the car based on your " + car);
    }

}
