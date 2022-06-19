import java.util.HashSet;
import java.util.Set;

class LongestBand {

    public static void LongestBandCalc(int num[]) {
        Set<Integer> set = new HashSet<Integer>();
        int max = 1;

        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }

        for (int i = 0; i < num.length; i++) {

            // first find parent
            int parent = num[i] - 1;

            // if parent not present start finding band
            if (set.contains(parent) != true) {

                // find next element value
                int next_ele = num[i] + 1;

                // increase count for current element
                int count = 1;

                // while next element is present keep adding to count
                while (set.contains(next_ele)) {

                    // increment element for next iteration
                    next_ele++;

                    // incremet count for found element
                    count++;
                }

                // if longer count is found replace.
                if (count > max) {
                    max = count;
                }
            }
        }

        System.out.println(max);

    }

    public static void main(String[] args) {
        int num[] = { 1, 9, 3, 0, 18, 5, 2, 4, 10, 7, 12, 6 };

        LongestBand.LongestBandCalc(num);
    }

}