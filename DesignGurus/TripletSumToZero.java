import java.util.*;

public class TripletSumToZero {
    public static void main(String[] args) {
        System.out.println(
                "Triplet sum to Zero: Given an array of unsorted numbers, find all unique triplets in it that add up to zero.");
        // int[] unsortedArr = new int[] { -3, 0, 1, 2, -1, 1, -2 };
        // int[] unsortedArr = new int[] { -5, 2, -1, -2, 3 };
        int[] unsortedArr = new int[] { -1, 0, 1, 2, -1, -4 };

        // for (int arrItem : unsortedArr)
        // System.out.print(arrItem + " ");
        // System.out.println();

        // Create a new ArrayList of List of integers
        TripletSumToZero tsz = new TripletSumToZero();

        List<List<Integer>> list = tsz.searchTriplets(unsortedArr);
        System.out.println();
        System.out.println(list);
        System.out.println();

        // // Add a new List of integers to the ArrayList
        // list.add(Arrays.asList(1, 2, 3));
        // list.add(Arrays.asList(1, 5, 6));
        // list.add(Arrays.asList(3, 4, 5));

        // for (int i = 0; i < list.size(); i++) {
        // List<Integer> innerList = list.get(i);
        // System.out.print("List " + i + ": ");
        // for (int j = 0; j < innerList.size(); j++) {
        // int value = innerList.get(j);
        // System.out.print(value + " ");
        // }
        // System.out.println();
        // }
    }

    public List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> tripletsList = new ArrayList<>();
        Arrays.sort(arr);
        // System.out.println("Log point 1: " + Arrays.toString(arr));

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
                        while (leftPointer < rightPointer && leftPointer == (leftPointer - 1))
                            leftPointer += 1;
                        while (leftPointer < rightPointer && rightPointer == (rightPointer + 1))
                            rightPointer -= 1;
                    } else if (tempSum < targetSum)
                        leftPointer += 1;
                    else if (tempSum > targetSum)
                        rightPointer -= 1;
                }
                // int[] zeroSumElements = findSumPair(arr, -arr[i], i + 1);
                // List<Integer> innerList = findSumPair(arr, -arr[i], i + 1);
                // if (zeroSumElements.length == 3) {
                // tripletsList.add(Arrays.asList(zeroSumElements[0], zeroSumElements[1],
                // zeroSumElements[2]));
                // }
            }
        }
        return tripletsList;
    }

    // int[] findSumPair(int[] arr, int targetSum, int leftPointer) {
    // List<Integer> findSumPair(int[] arr, int targetSum, int leftPointer) {

    //     int rightPointer = arr.length - 1;
    //     List<List<Integer>> tripletsList = new ArrayList<>();

    //     while (leftPointer < rightPointer) {
    //         int tempSum = arr[leftPointer] + arr[rightPointer];

    //         if (tempSum == targetSum) {
    //             // return new int[] { -targetSum, arr[leftPointer], arr[rightPointer] };
    //             tripletsList.add(Arrays.asList(-targetSum, arr[leftPointer], arr[rightPointer]));
    //             leftPointer += 1;
    //             rightPointer -= 1;
    //         } else if (tempSum < targetSum)
    //             leftPointer += 1;
    //         else if (tempSum > targetSum)
    //             rightPointer -= 1;
    //     }

    //     // return new int[] { -1 };
    //     return tripletsList;
    // }
}
