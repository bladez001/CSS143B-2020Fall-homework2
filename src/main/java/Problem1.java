public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:

    Start points to the first element and end points to the last element in the array.

    When the value at index is 0, it goes to first if statement and swaps the numbers in
    the array at start and index, then it increases start and index.

    If the value at index is not 1, it goes to the else if statement and only
    increments index.

    If the value at index is 2, it goes to the last else statement and swaps
    index with the value at end and decrements end.
     */
    //Timothy Muresan
    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int index = 0;
        int temp = 0;

        while (index <= end && start < end) {
            if (nums[index] == 0) {
                    temp = nums[index];
                    nums[index] = nums[start];
                    nums[start] = temp;
                    start++;
                    index++;
            }
            else if (nums[index] == 1) {
                    index++;
            }
            else {
                    temp = nums[index];
                    nums[index] = nums[end];
                    nums[end] = temp;
                    end--;
            }

        }

    }
}
