import java.util.Arrays;

public class SortTester
{
    public static void main(String[] args)
    {
/*
    // EXPERIMENT A
    System.out.println("----------- EXPERIMENT A: confirming all three sorts -----------");
    confirmSorts(); // see code below
*/

    // EXPERIMENT B
    System.out.println("\n----------- EXPERIMENT B: printing details for array size of 8 -----------");
    int[] arr2 = {78, 14, 18, -3, -17, 10, 30, 9};
    System.out.println("Merge Sort an array with " + arr2.length + " elements\n");
    Sort.mergeSortPrintDetails(arr2);

/*
    // EXPERIMENT C
    System.out.println("\n----------- EXPERIMENT C: printing details for array size of 5 -----------");
    int[] arr3 = {10, 56, 34, 1, 0};
    System.out.println("Merge Sort an array with " + arr3.length + " elements\n");
    Sort.mergeSortPrintDetails(arr3);
*/
/*
    // EXPERIMENT D
    System.out.println("\n----------- EXPERIMENT D: printing details for array size of 12 -----------");
    int[] arr4 = {6, 10, 8, 1, 3, 9, 18, 0, 20, 13, 2, 4};
    System.out.println("Merge Sort an array with " + arr4.length + " elements\n");
    Sort.mergeSortPrintDetails(arr4);
*/
/*
    // EXPERIMENT E
    System.out.println("----------- EXPERIMENT E: printing details for array size of 40 -----------");
    int[] arr5 = {3, -23, 86, -20, 24, 40, -89, 19, -4, 100, 89, 75, 13, 54, 12, 77, -5, 0, 6, 18, 47, -54, 10, 14, 78, -39, 90, 110, 61, -52, 67, 69, 41, 72, 49, -100, 104, 1, 17, -19};
    System.out.println("Merge Sort an array with " + arr5.length + " elements\n");
    Sort.mergeSortPrintDetails(arr5);
*/

/*
    // EXPERIMENT F
    compareSorts();
*/
    }

    public static void confirmSorts()
    {
        /* --- SELECTION SORT --- */
        int[] arr1 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
        // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
        Sort.selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        /* --- INSERTION SORT --- */
        int[] arr2 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
        // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
        Sort.insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        /* --- MERGE SORT --- */
        System.out.println("Merge Sort");
        int[] arr3 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
        // note the merge sort method modifies the original array (rather than returning a new array that is sorted)
        Sort.mergeSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    public static void compareSorts()
    {
        /* --- MERGE SORT --- */
        int[] arr = {3, -23, 86, -20, 24, 40, -89, 19, -4, 100, 89, 75, 13, 54, 12, 77, -5, 0, 6, 18, 47, -54, 10, 14, 78, -39, 90, 110, 61, -52, 67, 69, 41, 72, 49, -100, 104, 1, 17, -19};
        // note the merge sort method modifies the original array (rather than returning a new array that is sorted)
        Sort.mergeSortPrintDetails(arr);
        System.out.println();

        /* --- SELECTION SORT --- */
        int[] arr2 = {3, -23, 86, -20, 24, 40, -89, 19, -4, 100, 89, 75, 13, 54, 12, 77, -5, 0, 6, 18, 47, -54, 10, 14, 78, -39, 90, 110, 61, -52, 67, 69, 41, 72, 49, -100, 104, 1, 17, -19};
        // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
        Sort.selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        /* --- INSERTION SORT --- */
        int[] arr3 = {3, -23, 86, -20, 24, 40, -89, 19, -4, 100, 89, 75, 13, 54, 12, 77, -5, 0, 6, 18, 47, -54, 10, 14, 78, -39, 90, 110, 61, -52, 67, 69, 41, 72, 49, -100, 104, 1, 17, -19};
        // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
        Sort.insertionSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
