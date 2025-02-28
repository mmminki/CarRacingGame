import java.util.ArrayList;
import java.util.Scanner;

public class CarRacingMain {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Car> entry;
        //
        printer.printInitUi();
        String inputCarList = scanner.nextLine();
    }
}
