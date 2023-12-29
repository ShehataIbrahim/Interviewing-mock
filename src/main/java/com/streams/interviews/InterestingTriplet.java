package com.streams.interviews;

/**
 * check if the array has at least one interesting triplet which has arr[i]<arr[j]<arr[k]
 */
public class InterestingTriplet {
    public static void main(String[] args) {
        Integer[] arr = {-2, -1, -5, 3};
        System.out.println("Use-Case 1\t" + checkInterestingTriplet(arr));

        arr = new Integer[]{-5, -6, -7, -8, -10, -15, -30, -31, -32, -33, -34, -35};
        System.out.println("Use-Case 2\t" + checkInterestingTriplet(arr));
    }

    public static boolean checkInterestingTriplet(Integer[] arr) {
        int n = arr.length;
        int minIndex = 0;
        int middleIndex = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < minIndex)
                minIndex = i;
            //   System.out.printf("Min Index %s , with value %s\n",minIndex,arr[minIndex]);
            for (int j = minIndex + 1; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    middleIndex = j;
                    //System.out.printf("Middle Index %s , with value %s\n",middleIndex,arr[middleIndex]);
                    break;
                }
            }
            for (int j = middleIndex + 1; j < n; j++) {
                if (arr[j] > arr[middleIndex]) {
                    System.out.printf("Match is found %s,%s,%s with indexes %s,%s,%s\n", arr[minIndex], arr[middleIndex], arr[j], minIndex, middleIndex, j);
                    return true;
                }
            }
            if (i < middleIndex)
                i = middleIndex;

        }
        return false;
    }
}
