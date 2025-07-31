package ArrayII.RemoveOcurrence;

public class remove {
    public static void main(String[] args) {
        int key = 10;
        int arr[] = {10, 20, 10, 40, 50, 10};

        int rd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[rd] = arr[i];
                rd++;
            }
        }

        // Print the array without the removed elements
        for (int i = 0; i < rd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
