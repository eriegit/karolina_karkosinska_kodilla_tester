public class LoopSumNumbers {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i = i + 1) {
            intArray[i] = i;
        }
        // int[] intArray = new int[]{0,1,2,3,4,5,6,7,8,9};
        int sum;
        sum = sumNumbers(intArray);

    }

    public static int sumNumbers(int[] intArray){
        int result = 0;
        for (int i = 0; i < intArray.length; i = i + 1) {
            result = result + intArray[i];
        }
        System.out.println(result);
        return result;
    }
}