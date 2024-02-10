package de.telran.javaProPractice.algorithmicTasks;


public class DivideAndRule {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,8};
        int total = sum(arr);
        System.out.println(total);

        int sum = recursiveSum(arr,0);
        System.out.println(sum);

    }

    public static int sum(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length <= 0) return arr[i];
            total += arr[i];
        }
        return total;
    }

    public static int recursiveSum(int[] arr, int index){
        if (index >= arr.length) return 0;
        return arr[index] + recursiveSum(arr,index + 1);
    }
}
