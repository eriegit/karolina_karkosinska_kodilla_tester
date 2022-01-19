import java.util.Random;

public class RandomNumbers {

    public static int getMin() {
        return min;
    }

    public static int getMax() {
        return max;
    }

    public static int min = 31;
    public static int max = 0;


    public static void main(String[] args) {
        getCountOfRandomNumber(5001);
        System.out.println("min " + getMin() + ", max " + getMax());
    }

    public static void getCountOfRandomNumber(int limit) {
        Random random = new Random();
        int sum = 0;
        while (sum <= limit) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            // System.out.println("temp " + temp + ", sum " + sum);
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }
    }
}