import java.util.Scanner;
public class GettingStoring {
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String firstInitial = "P";
        String lastName = "Sherman";
        int houseNumber = 42;
        String streetName = "Wallabay";
        String streetType = "Way";
        String city = "Sydney";

        System.out.println(firstInitial + " " + lastName + " " + houseNumber + " " + streetName + " " + streetType + " " + city);
    }
}
