public class FirstClassNew {
    public static void main(String[] args) {
        String example = sayHello();
        System.out.println(example);

    }
    private static String sayHello() {
        String text = "Hello FromFirstClass13";

        return text;

    }
    private static int sum(int a, int b) {
            int result = a + b;
            return result;

    }

}
