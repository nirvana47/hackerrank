public class SquareSort {
    public static void main(String[] args) {
        System.out.println("Squaring a sorted Array of integers");

        int[] arr = new int[] {-13, -11, -9, -8, 12};
        SquareSort ss = new SquareSort();

        int[] squareArr;
        squareArr = ss.makeSquare(arr);
        
        for (int arrItem : arr)
            System.out.print(arrItem + " ");
        System.out.println();
        for (int arrItem : squareArr)
            System.out.print(arrItem + " ");
        System.out.println();
    }

    public int[] makeSquare(int[] arr) {
        int leftPointer = 0; 
        int rightPointer = arr.length - 1;
        int arrLen = arr.length - 1;
        int[] squarrArr = new int[arr.length];

        while (leftPointer <= rightPointer) {
            int leftSq = arr[leftPointer] * arr[leftPointer];
            int rightSq = arr[rightPointer] * arr[rightPointer];
            System.out.println("Left Pointer: " + leftPointer + " | Right Pointer: " + rightPointer);

            if (leftSq > rightSq) {
                squarrArr[arrLen] = leftSq;
                leftPointer += 1;
            } else {
                squarrArr[arrLen] = rightSq;
                rightPointer -= 1;    
            }
            
            arrLen -= 1;
        }
        return squarrArr;
    }
}
