import java.util.ArrayList;
import java.util.Scanner;

public class CarRacingManager {
    Printer printer = new Printer();
    Scanner scanner = new Scanner(System.in);

    public void entryRegistration(ArrayList<Car> entry) {       // 최초 출력문 출력하고 참가 목록 입력받아 엔트리 생성
        printer.printInitUi();
        String inputCarList = scanner.nextLine();
        String[] carList = inputCarList.split(",");
        entryAdd(entry, carList);
    }

    public void entryAdd(ArrayList<Car> entry, String[] participants) {
        for (String participant : participants) {
            Car newCar = new Car(participant);
            entry.add(newCar);
        }
    }

    public int getAttemptCount() {
        printer.askForAttemptCount();
        return scanner.nextInt();
    }

    public void carMove(ArrayList<Car> entry, int repeatCount){// 차량들 이동
        System.out.println("실행 결과");
        for(int i = 0; i < repeatCount; i++){
            for (Car car : entry) {
                car.move();
            }
            printer.printExecuteResult(entry);
        }
    }

    public int getLongestDistance(ArrayList<Car> entry) {
        int max = 0;
        for (Car car : entry) {
            if(car.getPosition() > max) max = car.getPosition();
        }
        return max;
    }

    public void determineWinner(ArrayList<Car> entry) {
        int max = getLongestDistance(entry);
        ArrayList<String> winnerList = new ArrayList<String>();
        for (Car car : entry) {
            if(car.getPosition() == max) winnerList.add(car.getName());
        }
        printer.printWinner(winnerList);
    }
}