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
        int minDiff = Integer.MAX_VALUE;
        
        if (nums.length < 3)
            return -1;

        // int numsLength = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            else {
                int leftPointer = i + 1;
                int rightPointer = nums.length - 1;
                while (leftPointer < rightPointer) {
                    int tempDiff = targetSum - nums[i] - nums[leftPointer] - nums[rightPointer];
                    if (tempDiff == 0)
                        return nums[i] + nums[leftPointer] + nums[rightPointer];
                    else if (tempDiff < minDiff) {
                        minDiff = tempDiff;
                    }
                    if (tempDiff < 0) {
                        rightPointer -= 1;
                    } else {
                        leftPointer += 1;
                    }
                }
            }
        }
        return targetSum - minDiff;
    }
}
