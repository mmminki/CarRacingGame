import java.util.Random;

public class Car {
    private final String name;
    private int position = 0;   // 이동 거리

    public Car(String name){
        this.name = name;
    }

    public void move() {
        Random random = new Random();
        if(random.nextInt(10) >= 4) {
            position++;
            return;
        }
    }

    public String getName() {
        return name;
    }
    public int getPosition() {
        return position;
    }
}
