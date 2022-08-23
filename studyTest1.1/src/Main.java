public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8, 11, 14, 15, 25, 27, 85, 97, 110};
        System.out.println(halfSearch(arr,14));
    }

    public static int halfSearch(int[] arr, int target) {
        int head = 0;
        int end = arr.length;
        int mid = (head + end) / 2;
        while (target != arr[mid]) {
            if (target > arr[mid]) {
                head = mid;
            } else {
                end = mid;
            }
            mid = (head + end) / 2;
        }
        return mid;
    }
}