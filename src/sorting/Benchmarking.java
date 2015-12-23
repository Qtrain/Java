/* Benchmarking.java
 * 
 * CSCI 112 - Spring 2014
 * This code runs 5 sorting algorithms for benchmarking purposes
 * 

 * last edited April 26, 2014 by Michael Quatrani
 */
package sorting;

/**
 *
 * @author mike
 */
public class Benchmarking {

public static void main(String[] arg) throws Exception{
        
        int dataSetSizes[] = {10000, 20000, 100000, 1000000, 2000000};//values can be changed for different size data sets
        int i;
       
        
        for (int dataSetSize : dataSetSizes) {
            
            int array[] = new int [dataSetSize];
            System.out.println("bubble");
            System.out.println(dataSetSize);
            
            for (int k = 1; k<= 100; k++){
                
                for (i=0;i<array.length;i++){
                //for loop that will populate randomNumbers array 
                array[i] = 1 + (int)(Math.random() * 10);//Math.random used to generate values from 1-10 (note: need to add 1+ to eliminate value of zero)
                }//end 2nd nest for loop
        
                // write the array to a data file 
                // WARNING the text file will be 5.7 MB for 1 million items
                //writeLines(a, "before.txt");
        
            // get the start time in nanoseconds
            long startTime = System.nanoTime();

            //call mergesort to sort the entire array
            bubbleSort(array);
            

            // get the end time in nanoseconds
            long endTime = System.nanoTime();

            // calculate elapsed time in nanoseconds
            long duration = endTime - startTime;

            // print the elapsed time in seconds   (nanaoseconds/ 1 billion)
            System.out.printf("%12.8f %n", (double)duration/1000000000) ;
        
                // write the sorted array to a data file 
                // WARNING the file will be 5.7 MB for 1 million items
                //writeLines(a, "after.txt");
           }//end nest for
/*****************************************************************************/
        
    
            System.out.println("insertion");
            System.out.println(dataSetSize);
            
            for (int k = 1; k<= 100; k++){
                
                for (i=0;i<array.length;i++){
                //for loop that will populate randomNumbers array 
                array[i] = 1 + (int)(Math.random() * 10);//Math.random used to generate values from 1-10 (note: need to add 1+ to eliminate value of zero)
                }//end 2nd nest for loop
                
            long startTime = System.nanoTime();

            //call insertionSort to sort the entire array
            insertionSort(array);

            // get the end time in nanoseconds
            long endTime = System.nanoTime();

            // calculate elapsed time in nanoseconds
            long duration = endTime - startTime;
            
            // print the elapsed time in seconds   (nanaoseconds/ 1 billion)
            System.out.printf("%12.8f %n", (double)duration/1000000000) ;
            
            }//end nest for
//            
/*****************************************************************************/
            
            System.out.println("quick sort");
            System.out.println(dataSetSize);
            
            for (int k = 1; k<= 100; k++){
                
                for (i=0;i<array.length;i++){
                //for loop that will populate randomNumbers array 
                array[i] = 1 + (int)(Math.random() * 10);//Math.random used to generate values from 1-10 (note: need to add 1+ to eliminate value of zero)
                }//end 2nd nest for loop
            
            // get the start time in nanoseconds
            long startTime = System.nanoTime();

            //call mergesort to sort the entire array
            quickSort(array, 0, array.length - 1);
            
            // get the end time in nanoseconds
            long endTime = System.nanoTime();

            // calculate elapsed time in nanoseconds
            long duration = endTime - startTime;
            
            // print the elapsed time in seconds   (nanaoseconds/ 1 billion)
            System.out.printf("%12.8f %n", (double)duration/1000000000) ;
            
            }//end nest for
            
/*****************************************************************************/
            
            System.out.println("selection");
            System.out.println(dataSetSize);
            
            for (int k = 1; k<= 100; k++){
                
                for (i=0;i<array.length;i++){
                //for loop that will populate randomNumbers array 
                array[i] = 1 + (int)(Math.random() * 10);//Math.random used to generate values from 1-10 (note: need to add 1+ to eliminate value of zero)
                }//end 2nd nest for loop
          
            // get the start time in nanoseconds
            long startTime = System.nanoTime();

            //call selectionSort to sort the entire array
            selectionSort(array);

            // get the end time in nanoseconds
            long endTime = System.nanoTime();

            // calculate elapsed time in nanoseconds
            long duration = endTime - startTime;
            
            // print the elapsed time in seconds   (nanaoseconds/ 1 billion)
            System.out.printf("%12.8f %n", (double)duration/1000000000) ;
            
            
            }//end nest for

/*****************************************************************************/
            
            System.out.println("merge sort");
            System.out.println(dataSetSize);
            
            for (int k = 1; k<= 100; k++){
                int[] temp = new int[array.length];
                
                    for (i=0;i<array.length;i++){
                    //for loop that will populate randomNumbers array 
                    array[i] = 1 + (int)(Math.random() * 10);//Math.random used to generate values from 1-10 (note: need to add 1+ to eliminate value of zero)
                    }//end 2nd nest for loop
            
                // get the start time in nanoseconds
            long startTime = System.nanoTime();

            //call mergesort to sort the entire array
            mergeSort(array, temp, 0, (array.length - 1));           

            // get the end time in nanoseconds
            long endTime = System.nanoTime();

            // calculate elapsed time in nanoseconds
            long duration = endTime - startTime;
            
            
            
           
            // print the elapsed time in seconds   (nanaoseconds/ 1 billion)
            System.out.printf("%12.8f %n", (double)duration/1000000000) ;
           
            
            }//end nest for
            
//            double output[]=new double[dataSetSize];
//            for(i=0; i<output.length; i++){
//            output[i]=(double)duration/1000000000;
//            }
//            System.out.println("average");
//            System.out.println(calcAverage(output));
            
            
        }//end for
        
    }//end main

/*****************************************************************************/
    
public static void  bubbleSort( int [ ] array){
      
    int temp = 0;
  
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 1; j < (array.length - i); j++) {
                
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    }

                }
            }
        }
  
/*****************************************************************************/
    
public static void insertionSort( int [ ] num){
    
     int j;                     // the number of items sorted so far
     int key;                // the item to be inserted
     int i;  

     for (j = 1; j < num.length; j++){
         
        key = num[ j ];
        
        for(i = j - 1; (i >= 0) && (num[ i ] < key); i--){
                 num[ i+1 ] = num[ i ];
        }
        
        num[ i+1 ] = key;    // Put the key in its proper location
     }
}

/*****************************************************************************/

public static void selectionSort(int[] num){
     int min;
    
      for (int i = 0; i < num.length; i++) {
        // Assume first element is min
        min = i;
        
        for (int j = i + 1; j < num.length; j++) {
            if (num[j] < num[min]) {
                min = j;
            }
        }
        
        if (min != i) {
            final int temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }
       
    }
    
}
        
/*****************************************************************************/
        
public static void quickSort(int[] a, int startIndex, int endIndex) {
    
        int pivotIndex;      // the index of pivot returned by the quicksort partition

        // if the set has more than one element, then partition
        if (startIndex < endIndex) {
            // partition and return the pivotIndex
            pivotIndex = partition(a, startIndex, endIndex);
            // quicksort the low set
            quickSort(a, startIndex, pivotIndex - 1);
            // quiclsort the high set
            quickSort(a, pivotIndex + 1, endIndex);
        } // end if
        
    } // end quickSort()

/*****************************************************************************/

    // This method performs quicksort partitioning on a set of elements in an array.
public static int partition(int[] a, int startIndex, int endIndex) {

        int pivotIndex;             // the index of the chosen pivot element
        int pivot;                  // the value of the chosen pivot
        int midIndex = startIndex;  // boundary element between high and low sets

        // select the center element in the set as the pivot by integer averaging
        pivotIndex = (startIndex + endIndex) / 2;
        pivot = a[pivotIndex];

        // put the pivot at the end of the set so it is out of the way
        swap(a, pivotIndex, endIndex);

        // iterate the set, up to but not including last element
        for (int i = startIndex; i < endIndex; i++) {
            // if a[i] is less than the pivot
            if (a[i] < pivot) {

                // put a[i] in the low half and increment current Index
                swap(a, i, midIndex);
                midIndex = midIndex + 1;
            } // end if
        } // end for 
        
        // partitioning complete -- move pivot from end to middle
        swap(a, midIndex, endIndex);

        // return index of pivot
        return midIndex;
        
    } // end partition

/*****************************************************************************/

    // This method swaps two elements in an integer array
    public static void swap(int[] a, int first, int second) {
        
        int c;  // a catalyst variable used for the swap

        c = a[first];
        a[first] = a[second];
        a[second] = c;

    } // end Swap()
    
/*****************************************************************************/
    
public static void mergeSort(int[] a, int[] temp, int low, int high) {
        //  low is the low index of the part of the array to be sorted
        //  high is the high index of the part of the array to be sorted
        
        int mid;  // the middle of the array – last item in low half
        
        // if high > low then there is more than one item in the list to be sorted
        if (high > low) {

            // split into two halves and mergeSort each part

            // find middle (last element in low half)   
            mid = (low+high)/2;
            mergeSort(a, temp, low, mid );
            mergeSort(a, temp, mid+1, high);
            
            // merge the two halves back together, sorting while merging
            merge(a, temp, low, mid, high);
        } // end if 

        return;
    }// end mergerSort()

/*****************************************************************************/
    
    
    /* This method merges the two halves of the set being sorted back together.
     * the low half goes from a[low] to a[mid]
     * the high half goes from a[mid+1] to a[high]
     * (High and low only refer to index numbers, not the values in the array.)
     * 
     * The work of sorting occurs as the two halves are merged back into one 
     * sorted set.
     * 
     * This version of mergesort copies the set to be sorted into the same 
     * locations in a temporary array, then sorts them as it puts them back.
     * Some versions of mergesort sort into the temporary array then copy it back.
     */

public static void merge(int[] a, int[] temp, int low, int mid, int high) {
        //  low is the low index of the part of the array to be sorted
        //  high is the high index of the part of the array to be sorted
        //  mid is the middle of the array – last item in low half
        
        // copy the two sets from a[] to the same locations in the temporary array
        for (int i = low; i <= high; i++) {
            temp[i] = a[i];
        }

        //set up necessary pointers 
        int lowP = low;         // pointer to current item in low half
        int highP = mid + 1;    // pointer to current item in high half
        int aP = low;           // pointer to where each item will be put back in a[]

        // while the pointers have not yet reached the end of either half)
        while ((lowP <= mid) && (highP <= high)) {

            // if current item in low half <= current item in high half 
            if (temp[lowP] <= temp[highP]) {
                // move item at lowP back to array a and increment low pointer
                a[aP] = temp[lowP];
                lowP++;
            } else {
                // move item at highP back to array a and increment high pointer
                a[aP] = temp[highP];
                highP++;
            } // end if..else
            
            // increment pointer for location in original array
            aP++;
        } // end while

        /* When the while loop is done, either the low half or the high half is done 
         * We now simply move back everything in the half not yet done.
         * Remember, each half is already in order itself.
         */
        // if lowP has reached end of low half, then low half is done, move rest of high half
        if (lowP > mid) 
            for (int i = highP; i <= high; i++) {
                a[aP] = temp[i];
                aP++;
            } // end for
        else // high half is done, move rest of low half
        
            for (int i = lowP; i <= mid; i++) {
                a[aP] = temp[i];
                aP++;
            }// end for
        
        return;
    } // end merge()

/*****************************************************************************/

    /* This method writes an int array to a text data file.  
     * The first parameter is the array. The second parameter
     * is the file name.
     */
public static void writeLines(int[] a, String fileName) throws Exception {
        // create a File class object with the given file name
        java.io.File out = new java.io.File(fileName);
        // Create a PrintWriter output stream and link it to the File object
        java.io.PrintWriter outfile = new java.io.PrintWriter(out);

        // write the elements of an int array, separated by spaces
        for (int i = 0; i < a.length; i++) 
            outfile.print(a[i] + " ");
        
        // print a newline at the end of the list of integers
        outfile.println();

        outfile.close();

    } // end writeTextArray()

    public static double calcAverage(double[]timeArray){
            int i;//integer variable
            double sum=0;//variable sum set equal to zero to be added to iteration value for inputArray
            double mean;//variable that will hold average
            for(i=0;i<timeArray.length;i++)//for loop which will iterate over inputArray using integer variable
            sum=sum + timeArray[i];//statement that will generate value for sum of integers in array
            mean=sum/timeArray.length;//using variable mean declared above to generate average
            
            return mean;//return statement that makes value available to main method
            
}

}//end 
