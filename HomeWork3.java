
// @author Sokolova
// @version 14.09.21 /


import java.util.Arrays;

class HomeWork3 {
    public static void main(String[] args){
        int[] arr1 = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 - arr1[i];
        }

        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
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

        int counter = 1;
        int[][] arr4 = new int[3][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                arr4 [i][j] = 1;
                System.out.print(arr4[i][j] + " ");
                counter++;
            }
            System.out.println();
        }

        arr5(6,6);
    }
   static void arr5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}


