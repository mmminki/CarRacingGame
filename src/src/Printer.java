import java.util.ArrayList;
import java.util.Scanner;

public class Printer {
    Scanner scanner = new Scanner(System.in);

    public void printInitUi() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void askForAttemptCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printEntryList(ArrayList<Car> entry) {
        System.out.println("참가자들 목록");
        for (Car car : entry) {
            System.out.println(car.getName());
        }
    }

    public void printExecuteResult(ArrayList<Car> entry) {
        for (Car car : entry) {
            System.out.print(car.getName() + " : ");
            for(int i = 0; i < car.getPosition(); i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printWinner(ArrayList<String> winnerList) {
        System.out.print("우승지 : ");
        for (String s : winnerList) {
            System.out.print(s + " ");
        }
    }
}