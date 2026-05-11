public class Q12_BinarySearch {
    public static int binary(int arr[], int left, int right, int key)
    {
        if (left > right)
            return -1;
        int mid = (left + right)/2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return binary(arr, left, mid - 1, key);
        else
            return binary(arr, mid+1, right, key);
    }

    public static void main(String[] args) {
        int arr[] = {12,13,14,15,16,17,18,19,20};
        int key = 17;
        int res = binary(arr, 0, arr.length - 1,key);
        System.out.println("Element found at index: "+res);
    }
}
