import java.util.ArrayList;
import java.util.Scanner;

public class CarRacingManager {
    Printer printer = new Printer();
    Scanner scanner = new Scanner(System.in);

    public void entryRegistration(ArrayList<Car> entry) {
        String inputString;
        printer.printInitUi();
        inputString = scanner.nextLine();
    }

    public void addParticipant(ArrayList<Car> entry) {    // 참가 차량 엔트리 등록
        entry.add(newCar);
    }

    public void carMove(ArrayList<Car> entry, int repeatCount){       // 차량들 이동
        for(int i = 0; i < repeatCount; i++){
            for (Car car : entry) {
                car.move();
            }
        }
    }
}