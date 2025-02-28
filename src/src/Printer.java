import java.util.ArrayList;
import java.util.Scanner;

public class Printer {

    Scanner scanner = new Scanner(System.in);

    public void printInitUi() {
        String inputStr;
        String[] carList2;
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        inputStr = scanner.nextLine();
        carList2 = inputStr.split(",");

    }
}