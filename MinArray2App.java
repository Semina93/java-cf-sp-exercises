package gr.aueb.cf.ch6;

/**
 * Returns min position.
 */
public class MinArray2App {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        int minPosition;
        minPosition = getMinPosition(arr);
        int maxPosition = getMaxPosition(arr);
        if (minPosition == -1){
            System.out.printf("Error in searching\n");
        }

        System.out.printf("Min value %d, min position %d", arr[minPosition], minPosition + 1);
        System.out.printf("Max value %d, max position %d", arr[maxPosition], maxPosition + 1);
    }
    public static int getMinPosition(int arr[]){
        if (arr == null || arr.length == 0 ) return -1;
        int minPosition = 0;
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min =arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int arr[]){
        if (arr == null || arr.length == 0 ) return -1;
        int maxPosition = 0;
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max =arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
