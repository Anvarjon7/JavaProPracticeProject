package de.telran.javaProPractice;

import java.util.Random;

public class TaskIsland {
    public static void greet(String name){
        System.out.println("how are you, " + name + " ?");
    }
    public static void bye(){
        System.out.println("ok,bye");
    }

    public static void greet2(String name){
        System.out.println("hii, " + name  + "!");
        greet(name);
        System.out.println("getting ready to say bye");
        bye();
    }

    public static void main(String[] args) {
        greet2("maggie");
    }
//    public static void main(String[] args) {
//        char rows = 10;
//        char columns = 10;
//        char[][] array = generateRandomArr(rows,columns);
//        System.out.println("кол-во островов: " + howMuchIslands(array));
//
//    }
//
//    private static void markIsland(char[][] matrix, int x, int y) {
//        int xLength = matrix.length;
//        int yLength = matrix[0].length;
//
//        if (x < 0 || y < 0 || x >= xLength || y >= yLength || matrix[x][y] == '0') {
//            return;
//        }
//        matrix[x][y] = '0';
//
//        markIsland(matrix, x - 1, y);
//        markIsland(matrix, x + 1, y);
//        markIsland(matrix, x, y - 1);
//        markIsland(matrix, x, y + 1);
//    }
//
//    private static int howMuchIslands(char[][] matrix) {
//        int xLength = matrix.length;
//        if (xLength == 0) return 0;
//        int yLength = matrix[0].length;
//
//        int numIslands = 0;
//
//        for (int i = 0; i < xLength; i++) {
//            for (int j = 0; j < yLength; j++) {
//                if (matrix[i][j] == '1') {
//                    numIslands++;
//                    markIsland(matrix, i, j);
//                }
//            }
//        }
//        return numIslands;
//    }
//
//    private static char[][] generateRandomArr(char rows, char columns){
//        char[][] arr = new char[][][rows][columns];
//        Random random = new Random();
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                arr[i][j] = (char) random.nextInt(2);
//            }
//        }
//        return arr;
//    }
//    private static void printArr(int[][] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
}
