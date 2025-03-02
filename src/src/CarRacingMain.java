import java.util.ArrayList;
import java.util.Scanner;

public class CarRacingMain {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner(System.in);
        CarRacingManager manager = new CarRacingManager();
        ArrayList<Car> entry = new ArrayList<Car>();

        manager.entryRegistration(entry);
        //printer.printEntryList(entry);
        manager.carMove(entry, manager.getAttemptCount());
        //printer.printWinner(entry);
        manager.determineWinner(entry);
    }
}
