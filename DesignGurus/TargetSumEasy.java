import java.util.HashMap;

/*
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target. 
 * Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.
 */
class TargetSumEasy {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 7, 2, 3, 4, 5 };
        int[] resultArr = new int[2];
        TargetSumEasy t = new TargetSumEasy();

        // resultArr = t.twoSum(arr, 6);
        resultArr = t.twoSumHashMap(arr, 7);

        for (int i : resultArr)
            System.out.print(i + " ");
        System.out.println();
    }

    public int[] twoSum(int[] inputArr, int targetSum) {
        // int[] res = new int[] { 0, 0 };
        int firstPointer = 0;
        int secondPointer = inputArr.length - 1;

        while (firstPointer < secondPointer) {
            int tempSum = inputArr[firstPointer] + inputArr[secondPointer];
            if (tempSum == targetSum)
                return new int[] { firstPointer, secondPointer };
            // res[0] = firstPointer;
            // res[1] = secondPointer;
            // return res;
            else if (tempSum < targetSum)
                firstPointer += 1;
            else if (tempSum > targetSum)
                secondPointer -= 1;
        }
        return new int[] { -1, -1 };
    }

    public int[] twoSumHashMap(int[] inputArr, int targetSum) {
        HashMap<Integer, Integer> valIndex = new HashMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            if (valIndex.containsKey(targetSum - inputArr[i]))
                return new int[] { valIndex.get(targetSum - inputArr[i]), i };
            else
                valIndex.put(inputArr[i], i);
        }
        return new int[] { -1, -1 };
    }
}