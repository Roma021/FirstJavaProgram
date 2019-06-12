import java.util.Scanner;
public class Completion {
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String name = "Alex";
        String breed = "Dobermann";
        int age = 6;

        System.out.println( "Greetings. What is your pet's name? " + name);
        // name = keyboard.next();

        System.out.println( "What kind of animal is " + name + "? " + breed);
        System.out.println( "How old is " + name + "? " + age);

        System.out.println( name + " is your " + breed + " and it is " + age );
    }


}
