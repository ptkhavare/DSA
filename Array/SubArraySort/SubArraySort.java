class SubArraySort {

    public static void subArraySorter(int num[]) {
        // initialize two variable smallest and largest.
        // smallest = int_max
        // largest = int_min

        Integer smallest = Integer.MAX_VALUE;
        Integer largest = Integer.MIN_VALUE;

        // iterate over the array
        for (int i = 0; i < num.length; i++) {
            if (outOfOrder(num, i)) {
                int x = num[i];
                // Assign smallest and largest values.
                smallest = Integer.min(smallest, x);
                largest = Integer.max(largest, x);
            }
        }

        // int i = 0;
        // while (smallest > num[i]) {
        // i++;
        // }
        // int j = num.length - 1;
        // while (largest <= num[j]) {
        // j--;
        // }

        int left = 0;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                left++;
                continue;
            }
        }

        int right = num.length - 1;
        for (int i = num.length - 1; i > 0; i--) {
            if (num[i] > largest) {
                right--;
                continue;
            }

        }

        System.out.println("Subarray to Sort Index: " + left + right);

    }

    // helper method to find out of order
    // if index = 0 check second number
    // if index = length-1 check second last
    // else check previous and next number
    private static Boolean outOfOrder(int num[], int index) {
        int x = num[index];
        if (index == 0) {
            return x > num[1];
        }
        if (index == num.length - 1) {
            return x < num[index - 1];
        }

        return x < num[index - 1] || x > num[index + 1];

    }

    public static void main(String args[]) {
        int[] num = { 1, 2, 3, 4, 5, 8, 6, 7, 9, 10, 11 };
        subArraySorter(num);
    }

}