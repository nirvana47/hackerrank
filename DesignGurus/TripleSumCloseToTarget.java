import java.util.Arrays;
// import java.util.Collection;
// import java.util.List;

public class TripleSumCloseToTarget {
    public static void main(String[] args) {
        System.out.println(
                "Triplet Sum Close to Target (medium)");

        int[] arr = new int[] { -2, 0, 1, 2 };
        System.out.println(Arrays.toString(arr));
    }

    int TripletSumCloseToTarget(int[] nums, int targetSum) {
        if (nums.length < 3)
            return -1;

        // int numsLength = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            
        }
        return 0;
    }
}
