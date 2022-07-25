/*
 * Lab 12
 * Meisam Amjad
 * 
 * A lab in which you analyze the performance of
 * Bubble Sort and Binary Search
 *
 */
import java.util.Random;

public class SortSearchLab {
  public static void main(String[] args) {
    
    // Creates an array of of 5 elements with
    // values ranging from 0 to 49:
    int[] data = randomArray(100000,1000);
    bubbleSort(data);
    System.out.println(binarySearch(data, 7));
    
    
    
    
    
    //for (int n : data) System.out.print(n + " ");
    System.out.println();
    
  }
  
  // Sorting methods have a return type of void,
  // typically.  That's because the method has
  // access to the original array and can directly modify
  // it.  In other words, it does not need to create
  // and return a new array.  It just changes the existing array.
  public static void bubbleSort(int[] data) {
    boolean didMakeChange = false;
    int passes, swaps = 0 , compairisons = 0;
    
    for (passes = 0; passes < data.length - 1; passes++){
      didMakeChange = false; 
      
      for (int i = 0; i < data.length - 1; i++){
        int value1 = data[i];
        int value2 = data[i + 1];
        compairisons++;
        if (value1 > value2) {
          data[i] = value2;
          data[i + 1] = value1;
          didMakeChange = true;
          swaps++;
        }
      }
      if (didMakeChange = false) break;
    }
    
    System.out.println("Passes: "+ passes);
    System.out.println("Comparisons: "+ compairisons);
    System.out.println("Swaps: "+ swaps);
  }
  
  
  /**
   * Linear search method
   * Worst case scenario takes O(n) big o of n time
   * to find the key
   * @param int key
   * @param int[] array
   * @return int index of key, or -1
   */
  public static int linearSearch(int key, int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (key == array[i]) {
        System.out.printf("Number of values checked" +
                          "in Linear Search: %d\n", (i+1));
        return i;
      }
    }
    return -1;
  }
  
  public static int binarySearch(int[] data, int key){
    int indexCheck = data.length / 2;
    int min = 0;
    int max = data.length - 1;
    int loops = 1;
    int lastIndex = 0;
    while (max > min){
      if (data[indexCheck] == key){
        System.out.println(loops);
        return indexCheck;
      }
      else if (data[indexCheck] < key) min = indexCheck + 1;
      else if (data[indexCheck] > key) max = indexCheck - 1;
      loops++;
    }
    System.out.println(loops);
    return -1;
    
    
  }
  
  // Returns an array of random int values ranging
  // from 0 to (max-1).  Don't change any of this
  // code.  142857 is a "seed".  It guarantees that the
  // stream of random numbers will be the same
  // each time the method is called.
  public static int[] randomArray(int max, int size) {
    Random rnd = new Random(142857);
    
    int[] result = new int[size];
    
    for (int i = 0; i < size; result[i++] = rnd.nextInt(max));
    
    return result;
  }
  
}