class Mountain {

    public static void HighestPeak(int num[]) {

        int largest = 0;

        // start from 1 and end till n-2 important
        for (int i = 1; i < num.length - 2;) {

            // find peak
            if (num[i] > num[i - 1] && num[i] > num[i + 1]) {
                int cnt = 1;

                // pointer for counting backward
                int j = i;

                // move backward and count
                while (j >= 1 && num[j] > num[j - 1]) {
                    j--;
                    cnt++;

                }
                // move forward and count
                while (i <= num.length - 2 && num[i] > num[i + 1]) {
                    i++;
                    cnt++;
                }
                largest = Integer.max(largest, cnt);
            } else {
                i++;

            }

        }
        System.out.println(largest);
    }

    public static void main(String args[]) {
        int num[] = { 5, 6, 1, 2, 3, 4, 5, 4, 3, 2, 0, 1, 2, 3, -2, 4 };
        Mountain.HighestPeak(num);
    }

}