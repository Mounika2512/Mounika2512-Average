public class Average {
    /**
     * Calculates the average of the values in the given array.
     *
     * @param nums an array of integers.
     * @return the average of the values in nums.
     */
    public double getAvg(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0.0; // Return 0 for an empty or null array to avoid division by zero.
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // Convert sum to type double before dividing to ensure decimal values in the result.
        return (double) sum / nums.length;
    }
}