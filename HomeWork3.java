
// @author Sokolova
// @version 14.09.21 /


import java.util.Arrays;

class HomeWork3 {
    static void main(String args[]){
        int[] arr1 = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 - arr1[i];
        }

        int[] arr2 = new int[100];
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = i;
            System.out.println("arr[" + i + "] = " + arr2[i]);
        }

        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                arr4 [i][j] = counter;
                System.out.print(arr4[i][j] + " ");
                counter++;
            }
            System.out.println();
        }

         static int[] CreateAndReturnArr(int len, int initialValue){
            int arr5[] = new int[len];
            Arrays.fill(arr5, initialValue);
            return arr5;
        }
    }
}

