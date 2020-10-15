public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:

    This algorithm uses two indexes so that one can travel ahead of the other.

    The variable i gets incremented first and if the values at i and index do not
    match, the index is incremented and the values at i and index are swapped.

    If the values match, the for loop keeps going.

    When it reaches the end, the index + 1 is returned.
     */
    //Timothy Muresan
    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        int index = 0;
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }

        return index + 1;
    }
}
