import java.util.ArrayList;
import java.util.Arrays;

public class Sort
{
    // merge sort method
    // this method modifies the original elements array object!
    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }

    // helper method that gets called recursively
    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp); // recurse
            mergeSortHelper(elements, middle + 1, to, temp); // recurse
            merge(elements, from, middle, to, temp); // merge halves
        }
    }

    private static void merge(int[] elements, int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;

        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }

        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }

        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }

    /* METHODS FOR THE PRINTING VERSION OF MERGESORT ARE BELOW
     * THESE DO EXACTLY THE SAME THING, EXCEPT THERE ARE PRINT
     * STATEMENTS AND A MERGE COUNTER for the purpose of helping
     * you study how the merge sort works!  Use the mergeSortPrintDetails
     * method to perform a merge sort with printed details
     */

    // static variable for the printing version of merge sort
    private static int mergeCounter;

    // VERSION THAT PRINTS DETAILS!
    public static void mergeSortPrintDetails(int[] elements)
    {
        mergeCounter = 0;
        System.out.print(" UNSORTED: ");
        System.out.println(Arrays.toString(elements));
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelperPrintDetails(elements, 0, n - 1, temp);
        System.out.print("\n   SORTED: ");
        System.out.println(Arrays.toString(elements));
        System.out.println("Total Merges for Sort: " + mergeCounter);
    }

    // helper method that gets called recursively
    private static void mergeSortHelperPrintDetails(int[] elements, int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            System.out.print("\n  Halving: [");
            for (int i = from; i < to; i++)
            {
                System.out.print(elements[i] + ", ");
            }
            System.out.print(elements[to] + "]");
            System.out.print("\n-->  Left: [");
            for (int i = from; i < middle; i++)
            {
                System.out.print(elements[i] + ", ");
            }
            System.out.print(elements[middle] + "]");
            System.out.print("\n--> Right: [");
            for (int i = middle + 1; i < to; i++)
            {
                System.out.print(elements[i] + ", ");
            }
            System.out.print(elements[to] + "]");
            System.out.println();

            mergeSortHelperPrintDetails(elements, from, middle, temp); // recurse left
            mergeSortHelperPrintDetails(elements, middle + 1, to, temp); // recurse right
            mergePrintDetails(elements, from, middle, to, temp); // merge halves
            System.out.print("\n  Current: ");
            System.out.println(Arrays.toString(elements));
        }
    }

    private static void mergePrintDetails(int[] elements, int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;

        mergeCounter++;
        System.out.println("\n  Merge #: " + mergeCounter);
        System.out.print("  Merging: [");
        for (int x = i; x < mid; x++)
        {
            System.out.print(elements[x] + ", ");
        }
        System.out.print(elements[mid] + "] and [");
        for (int x = j; x < to; x++)
        {
            System.out.print(elements[x] + ", ");
        }
        System.out.print(elements[to] + "]");

        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j])
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }

        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }

        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }

        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }

        System.out.print("\n   Merged: [");
        for (int idx = from; idx < to; idx++)
        {
            System.out.print(elements[idx] + ", ");
        }
        System.out.print(elements[to] + "]");
    }


    public static void selectionSort(int[] elements)
    {
        // add counter variable outside the for loop so we can return it
        int count = 0;

        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                // increment counter inside the inner for loop, but NOT inside the if statement
                // since we are counting loop iterations and don't want to miss any!
                count++;

                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println("Selection sort, number of iterations: " + count);
    }

    public static void insertionSort(int[] elements)
    {
        // add counter variable outside the for loop so we can return it
        int count = 0;

        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                // increment counter inside the inner while loop
                count++;

                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println("Insertion sort, number of iterations: " + count);
    }

    public static void selectionSortWordList(ArrayList<String> words)
    {
        for (int j = 0; j < words.size() - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < words.size(); k++)
            {
                if (words.get(k).compareTo(words.get(minIndex)) < 0)
                {
                    minIndex = k;
                }
            }
            String temp = words.get(j);
            words.set(j, words.get(minIndex));
            words.set(minIndex, temp);
        }
    }

    public static void insertionSortWordList(ArrayList<String> words)
    {
        for (int j = 1; j < words.size(); j++)
        {
            String temp = words.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && temp.compareTo(words.get(possibleIndex - 1)) < 0)
            {
                words.set(possibleIndex, words.get(possibleIndex - 1));
                possibleIndex--;
            }
            words.set(possibleIndex, temp);
        }
    }
}