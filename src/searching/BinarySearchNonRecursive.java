package searching;

/**
 *
 * @author qtrain
 */
public class BinarySearchNonRecursive {
    
    public static void main(String[] args) {
        
        int [] sorted = new int[]{1,2,3,5,6,7,8,9,10,11};
        int [] unsorted = new int[]{1,3,5,8,7,11,9,10};
        int [] low = new int[]{11,12,13,15,16,17,18,19,20,21};
        int [] middle = new int[]{1,2,3,11,4,5,6};

        
        System.out.println("unit test sorted - should PASS");
        binarySearch(sorted, sorted.length, 11);
        System.out.println("unit test sorted - number not present - should FAIL");
        binarySearch(sorted, sorted.length, 20);
        System.out.println("unit test unsorted - should PASS");
        binarySearch(unsorted, unsorted.length, 11);
        System.out.println("unit test unsorted - target not present - should FAIL");
        binarySearch(unsorted, unsorted.length, 20);
        System.out.println("unit test sortedLow should FAIL");
        binarySearch(low, low.length, 30);
        System.out.println("unit test sortedLow should PASS");
        binarySearch(low, low.length, 11);
        System.out.println("unit test middle should PASS");
        binarySearch(middle, middle.length, 11);
       
    }

    public static int binarySearch(int[] array, int size, int target) {
        System.out.println("");
        System.out.println("------------");
        System.out.println("target is " + target);
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (array[middle] == target) {
                System.out.println("PASS: target found "+ target);
                System.out.println("---------------------");
                System.out.println("");
                return middle;
            }
            else if (array[middle] < target) {
                low = middle + 1;
            }
            else {
                high = middle - 1;
            }
        }
        System.out.println("FAIL: target not found");
        System.out.println("----------------");
        System.out.println("");
        return -1;
    }

}
