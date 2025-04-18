package ex_26_Collection_FrameWorks.List.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab76_Tow_Sum_Problem {
    public static void main(String[] args) {

        int [] nums ={2, 7, 3, 6, 20};
        int target = 9;

        int [] result = twoSum(nums, target);

        if (result != null){
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }else {
            System.out.println("not valid number");
        }

    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int complement = (target - nums[i]);

            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i],i );


        }
        return null;

    }
}
