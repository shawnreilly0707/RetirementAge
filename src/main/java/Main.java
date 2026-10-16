import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner age = new Scanner(System.in);
        System.out.println("What is your age? ");
        int user_age = age.nextInt();

        int retirement_age = 67;

        int user_retirement_age = retirement_age - user_age;
        System.out.println("Retirement age is " + retirement_age + " years old");
        System.out.println("You have " + user_retirement_age + " years until you retire");
    }
}
