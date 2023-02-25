import java.util.*;

public class TripletSumToZero {
    public static void main(String[] args) {
        System.out.println(
                "Triplet sum to Zero: Given an array of unsorted numbers, find all unique triplets in it that add up to zero.");
        // int[] unsortedArr = new int[] { -3, 0, 1, 2, -1, 1, -2 };
        // int[] unsortedArr = new int[] { -5, 2, -1, -2, 3 };
        // int[] unsortedArr = new int[] { -1, 0, 1, 2, -1, -4 };
        int[] unsortedArr = new int[] { -2, 0, 0, 2, 2 };

        TripletSumToZero tsz = new TripletSumToZero();

        List<List<Integer>> list = tsz.searchTriplets(unsortedArr);
        System.out.println();
        System.out.println(list);
        System.out.println();
    }

    public List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> tripletsList = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            } else {
                int targetSum = -arr[i];
                int leftPointer = i + 1;
                int rightPointer = arr.length - 1;
                while (leftPointer < rightPointer) {
                    int tempSum = arr[leftPointer] + arr[rightPointer];

                    if (tempSum == targetSum) {
                        tripletsList.add(Arrays.asList(targetSum, arr[leftPointer], arr[rightPointer]));
                        leftPointer += 1;
                        rightPointer -= 1;
                        while (leftPointer < rightPointer && arr[leftPointer] == arr[leftPointer - 1])
                            leftPointer += 1;
                        while (leftPointer < rightPointer && arr[rightPointer] == arr[rightPointer + 1])
                            rightPointer -= 1;
                    } else if (tempSum < targetSum)
                        leftPointer += 1;
                    else if (tempSum > targetSum)
                        rightPointer -= 1;
                }
            }
        }
        return tripletsList;
    }

    // Using HashMap
    
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        if (nums.length < 3)
            return new ArrayList<>(res);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0)
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if (sum > 0)
                    k--;
                else if (sum < 0)
                    j++;
            }

        }
        return new ArrayList<>(res);

    }

}
