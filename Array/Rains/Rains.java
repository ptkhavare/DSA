class Rains {

    public static void rainsCalc(int num[]) {

        int length = num.length;
        int[] left_encounter = new int[length];
        int[] right_encounter = new int[length];

        // fill array from left to right with highest element encountered from left to
        // right

        int left_highest = 0;
        for (int i = 0; i < length; i++) {
            if (num[i] > left_highest) {
                left_highest = num[i];
            }
            left_encounter[i] = left_highest;
        }

        // fill array from right to left with highest element encountered from right to
        // left
        int right_highest = 0;
        for (int i = length - 1; i > 0; i--) {
            if (num[i] > right_highest) {
                right_highest = num[i];
            }
            right_encounter[i] = right_highest;
        }

        int water_stored = 0;

        for (int i = 0; i < length; i++) {
            int value = (Integer.min(left_encounter[i], right_encounter[i])) - num[i];
            water_stored += value;
        }

        System.out.println(water_stored);

    }

    public static void main(String args[]) {

        int num[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        Rains.rainsCalc(num);

    }

}