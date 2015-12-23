package searching;

import java.util.Arrays;

/**
 *
 * @author qtrain
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 4, 3, 5, 7, 8, 6, 10, 9};

        System.out.println("Array before sorting");
        System.out.println("--------------------");
        System.out.println(Arrays.toString(a));

        //serial search
        System.out.println();
        System.out.println("serial search for the number 4");
        System.out.println("-------------");
        System.out.println(serialSearch(a, 4));
        
        //binary search
      final int[ ] DATA = { 2, 4, 6, 8, 10, 12, 14, 42 };
      final int[ ] EMPTY = new int[0];
      final int MINIMUM = -1;
      final int MAXIMUM = 6;
      
      int target;
      boolean answer;

      System.out.println("fghdghndgndfgndfgdgfbdfgb");
      //answer = has42(DATA, DATA[0], DATA[DATA.length-1]);
      answer = has42(DATA, 0, DATA.length-1);
        System.out.println(answer);
      
//      for (target = MINIMUM; target <= MAXIMUM; target++)
//      {
//          System.out.print("Is " + target + " in the array? ");
//          answer = has42(DATA, MINIMUM, MAXIMUM);
//          if (!answer)
//             System.out.println("No.");
//          else
//             System.out.println("Yes, at index [" + answer + "].");
//      }

        //Insertion sort
        System.out.println();
        insertionSort(a);

    }
    public static boolean has42(int[] data, int start, int end) {
        int target = 42;
        int middle = start + ((end-start)/ 2);
        boolean bFound = false; 
        if(start > end) 
            bFound = false;
        else
        if  (target==data[middle]) {
            bFound = true;
        } else if (data[middle]<target) {
            bFound = has42(data, middle + 1, end);
        } else if (data[middle]>target) {
           bFound = has42(data, start, middle-1);
        }
        return bFound;
    }
    
//    
//    public static boolean has42(int [] data, int start, int end){
//        int target = 42;
//        int low = 0;
//        int high = data.length-1;
//        while(low<=high){
//            int middle = (low+high)/2;
//            if(data[middle]==target){
//                return true;
//            }
//            if(data[middle]<target){
//                low = middle+1;
//            }
//            if(data[middle] > target){
//                high = middle -1;
//            }
//        }
//            return false;
//        
//    
//    
//        }
//    
    
//        public static int binarySearch(int[] a, int first, int size, int target) {
//        int middle;
//
//        if (size <= 0) {
//            return -1;
//        } else {
//            middle = first + size / 2;
//            if (target == a[middle]) {
//                return middle;
//            } else if (target < a[middle]) // The target is less than a[middle], so search before the middle.
//            {
//                return binarySearch(a, first, size / 2, target);
//            } else // The target must be greater than a[middle], so search after the middle.
//            {
//                return binarySearch(a, middle + 1, (size - 1) / 2, target);
//            }
//        }
//    }
    

    public static boolean serialSearch(int[] data, int target) {
        int i;

        for (i = 0; i < data.length; i++) {  // Check whether the target is at data[i].
            if (data[i] == target) {
                return true;
            }

        }

        // The loop finished without finding the target.
        return false;
    }


    public static int[] insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (a[j] <= v) {
                    break;
                }
                a[j + 1] = a[j];
            }
            a[j + 1] = v;
        }
        System.out.println("After Insertion Sort");
        System.out.println("----------");
        System.out.println(Arrays.toString(a));
        return a;

    }

}
