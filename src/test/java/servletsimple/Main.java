package servletsimple;

public class Main {

    public static void main(String[] args) {
        int[] nums = {3, 1, 4};
        int[] res = twoSum(nums, 5);
        // Use Arrays.toString() to print array contents
       // System.out.println(java.util.Arrays.toString(res));

        System.out.println(isValid("("));

        String name = "Jack";

        //System.out.println(name.charAt(0));

    }

    public static boolean isValid(String s) {

        for(int i = 0; i < s.length(); i++) {
            if("(".equals(s.charAt(i))) {
                for(int j = i; j < s.length(); j++) {
                    if(")".equals(s.charAt(j))){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static int[] twoSum(int[] nums, int target) {
        // Initialize the array with size 2
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            // Start j from i+1 to avoid using same element twice
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res; // Return immediately when found
                }
            }
        }
        return res; // Return (will be [0,0] if no pair found)
    }
}
