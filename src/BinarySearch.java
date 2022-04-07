public class BinarySearch
{
    // RECURSIVE IMPLEMENTATION
    public static int recursiveBinarySearch(int[] intArray, int lowPosition, int highPosition, int target)
    {
        int midPosition;

        // base case: check to see if we have run out of elements by comparing
        // low index and high index; we have "run out" when the two indices "cross over"
        // and the value getting passed in for low index exceeds the value for high index
        if (lowPosition > highPosition)
        {
            // target not found, return -1
            return -1;
        }
        else
        {
            // update middle position
            midPosition = (lowPosition + highPosition) / 2;

            // recursive call: if the value at the midPosition of intArray is LESS than target,
            // make a recursive call to search RIGHT half of remaining aray by setting lowPosition
            // to one index right of midPosition but keeping highPosition unchanged
            if (intArray[midPosition] < target)
            {
                return recursiveBinarySearch(intArray, midPosition +1, highPosition, target);
                /* one missing line of code, should return the value from a recursive call */
            }
            // recursive call: if the value at the midPosition of intArray is MORE than target,
            // make a recursive call to search LEFT half of remaining aray by keeping lowPosition
            // unchanged but setting highPosition to one index left of midPosition
            else if (intArray[midPosition] > target)
            {
                return recursiveBinarySearch(intArray, lowPosition, midPosition - 1, target);
                /* one missing line of code, should return the value from a recursive call */
            }
            else
            {
                // otherwise, we FOUND the target, so return that index
                return midPosition;
            }
        }
    }

    // ITERATIVE, NON-RECURSIVE IMPLEMENTATION -- FOR COMPARISON
    public static int iterativeNonRecursiveBinarySearch(int[] elements, int target)
    {
        // start "lowPosition" boundary at first index and "highPosition" boundary at last index
        int lowPosition = 0;
        int highPosition = elements.length - 1;

        // we want to return as soon as we locate target,
        // but we also want to repeat until there are no more values to check (i.e. target not found);
        // this happens when the lowPosition index "crosses over" the right highPosition,
        // which occurs when we check the final remaining element and it's not the target
        while (lowPosition <= highPosition)
        {
            // set index to check to the middle index; note that if there is an even
            // number of elements (and two middle elements), this integer math truncates,
            // resulting in the "left middle" value chosen as middle
            int midPosition = (lowPosition + highPosition) / 2;

            // if target is less than value at current index,
            // "eliminate" right half by setting the "highPosition" boundary index
            // to the "midPosition" index - 1
            if (target < elements[midPosition])
            {
                highPosition = midPosition - 1;
            }
            // else, if target is greater than value at current index,
            // "eliminate" left half by setting the "lowPosition" boundary index
            // to the "midPosition" index + 1
            else if (target > elements[midPosition])
            {
                lowPosition = midPosition + 1;
            }
            // else, we found the value!  return the index
            else
            {
                return midPosition;
            }
        }

        // value not found, so -1
        return -1;
    }

    public static int bSearch(int[] arr, int left, int right, int target)
    {
        if (right >= left)
        {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] > target)
            {
                return bSearch(arr, left, mid - 1, target);
            }
            else
            {
                return bSearch(arr, mid + 1, right, target);
            }
        }
        return -1;
    }

}
