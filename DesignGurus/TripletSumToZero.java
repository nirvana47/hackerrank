import java.util.*;

public class TripletSumToZero {
    public static void main(String[] args) {
        System.out.println(
                "Triplet sum to Zero: Given an array of unsorted numbers, find all unique triplets in it that add up to zero.");
        int[] unsortedArr = new int[] { -3, 0, 1, 2, -1, 1, -2 };

        for (int arrItem : unsortedArr)
            System.out.print(arrItem + " ");
        System.out.println();

        // Create a new ArrayList of List of integers
        List<List<Integer>> list = new ArrayList<>();

        // Add a new List of integers to the ArrayList
        list.add(Arrays.asList(1, 2, 3));
        list.add(Arrays.asList(1, 5, 6));
        list.add(Arrays.asList(3, 4, 5));

        for (int i = 0; i < list.size(); i++) {
            List<Integer> innerList = list.get(i);
            System.out.print("List " + i + ": ");
            for (int j = 0; j < innerList.size(); j++) {
                int value = innerList.get(j);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public int[] searchTriplets(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            } else {

            }
        }
        return arr;
    }
}
