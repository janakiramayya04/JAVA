import java.util.ArrayList;

public class mergesort {
    static void mersort(int[] arr, int i, int mid, int j) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = i;
        int right = mid + 1;

        while (left <= mid && right <= j) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= j) {
            temp.add(arr[right]);
            right++;
        }

        for (int k = 0; k < temp.size(); k++) {
            arr[i + k] = temp.get(k);
        }
    }

    static void mer(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mer(arr, low, mid);
        mer(arr, mid + 1, high);
        mersort(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        int n = arr.length;
        mer(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
