public class maxsummafteropp {
    public static int minSumAfterOperation(int[] arr) {
        int max = arr[0];
        int index ;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        sum = sum - max + (max / 2);
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 7};
        System.out.println(minSumAfterOperation(arr));
    }
}


