package lintcode;

import java.util.HashMap;

public class SumOfTowNums56 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        // key -> num value -> index
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[0] = map.get(target - numbers[i]);
                result[1] = i;
            } else {
                map.put(numbers[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SumOfTowNums56 ins = new SumOfTowNums56();
        int[] result = ins.twoSum(new int[]{15, 2, 7, 11}, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
