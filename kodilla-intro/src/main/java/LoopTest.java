public class LoopTest {
    public static void main(String[] args) {
            int[] numbers = new int[10];
            for (int i = 0; i < numbers.length; i = i + 1) {
                numbers[i] = i;
            }

    }

    public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;

    }
}
