import java.util.List;

public class quicksort {
    static int partition(List<Integer> arr, int low ,int high){
        int pivot = arr.get(low);
        int i = low;
        int j = high;
        while (i < j) {
            while (i <= high && arr.get(i) <= pivot) {
                i++;
            }
            while (j >= low && arr.get(j) > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
    static void qs(List<Integer> arr, int i, int j) {
        if (i < j) {
            int pindex = partition(arr, i, j);
            qs(arr, i, pindex - 1);
            qs(arr, pindex + 1, j);
        }
    }
    public static List<Integer> quick(List<Integer> arr){
        qs(arr,0,(arr.size()-1));
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> arr = new java.util.ArrayList<>(List.of(4,6,2,5,7,9,1,3));
        List<Integer> sortedList = quick(arr);
        System.out.println(sortedList);
    }
}
