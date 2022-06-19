import java.util.*;

class Pairs {
    public void PairSum(int num[], int target) {

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < num.length; i++) {
            int value = target - num[i];

            if (set.contains(value)) {
                System.out.println("Pair found " + value + "," + num[i]);
            } else {
                set.add(num[i]);
            }
        }

    }

    public static void main(String args[]) {
        Pairs pairs = new Pairs();
        int num[] = { 10, 5, 2, 3, -6, 9, 11 };
        pairs.PairSum(num, 4);
    }

}