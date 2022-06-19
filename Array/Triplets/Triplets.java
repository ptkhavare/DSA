import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Triplets {

    public static ArrayList<int[]> tripletsCalc(int num[], int target) {

        Arrays.sort(num);
        ArrayList<int[]> result = new ArrayList<int[]>();

        for (int i = 0; i < num.length; i++) {

            int j = i + 1;
            int k = num.length - 1;

            while (j < k) {
                int current_sum = num[i];
                current_sum += num[j];
                current_sum += num[k];

                if (current_sum == target) {
                    int[] arr = new int[3];
                    arr[0] = num[i];
                    arr[1] = num[j];
                    arr[2] = num[k];
                    result.add(arr);
                    j++;
                    k--;
                } else if (current_sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return result;
    }

    public static void main(String args[]) {

        int num[] = { 2, 3, 5, 4, 1, 6, 7, 8, 9, 15 };
        ArrayList<int[]> result = new ArrayList<>();
        result = Triplets.tripletsCalc(num, 18);

        for (int[] array : result) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ",");
            }
            System.out.println();
        }
    }
}