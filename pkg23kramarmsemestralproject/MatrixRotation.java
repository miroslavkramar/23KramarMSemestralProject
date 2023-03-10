/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23kramarmsemestralproject;

import java.util.Scanner;

/**
 *
 * @author miroslav.kramar
 */
public class MatrixRotation {

    /**
     * Method loads input values into matrix
     * 
     * @param matrix (given matrix as 2D array)
     */
    public static void getMatrix(int[][] matrix) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.nextLine(); // get rid of all other potentional unwanted parameters from last input
    }

    /**
     * Method prints given matrix to standard output
     *
     * @param matrix (given matrix as 2D array)
     */
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.format("%d ", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    /**
     * Method rotates given matrix clockwise
     *
     * @param sourceMatrix (given matrix as 2D array)
     * @return rotated matrix
     */
    public static int[][] rotateMatrixClockwise(int[][] sourceMatrix) {
        int[][] targetMatrix = new int[sourceMatrix[0].length][sourceMatrix.length];

        // for loop for rotating the matrix clockwise
        int iTarg = 0; // help variable for iterating through the tempMatrix
        for (int i = 0; i < targetMatrix.length; i++) {
            int jTarg = 0; // help variable for iterating through the tempMatrix
            for (int j = targetMatrix[0].length - 1; j >= 0; j--) {
                targetMatrix[iTarg][jTarg] = sourceMatrix[j][i];
                jTarg++;
            }
            iTarg++;
        }

        return targetMatrix;
    }

    /**
     * Method rotates given matrix counterclockwise
     *
     * @param sourceMatrix (given matrix as 2D array)
     * @return rotated matrix
     */
    public static int[][] rotateMatrixCounterclockwise(int[][] sourceMatrix) {
        int[][] targetMatrix = new int[sourceMatrix[0].length][sourceMatrix.length];

        // for loop for rotating the matrix clockwise
        int iTarg = 0; // help variable for iterating through the targetMatrix
        for (int i = 0; i < targetMatrix[0].length; i++) {
            int jTarg = 0; // help variable for iterating through the targetMatrix
            for (int j = targetMatrix.length - 1; j >= 0; j--) {
                targetMatrix[jTarg][iTarg] = sourceMatrix[i][j];
                jTarg++;
            }
            iTarg++;
        }

        return targetMatrix;
    }

    /**
     * Method for loading, manipulating and outputting matrices
     */
    public static void matrixRotationProgram() {

        // initialisation: scanner
        Scanner sc = new Scanner(System.in);

        // variables: matrix and its parameters
        int numberOfRows, numberOfColumns;
        int transformation;
        int[][] matrix;

        // print information about how to use the program
        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("| PROGRAM PRO ROTOV??NI MATIC");
        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("| Tento program dok????e rotovat matice o 90 stupn?? proti i po sm??ru hodinov??ch ru??i??ek.");
        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("| Upozorn??n??: program um?? pracovat pouze s cel??mi ????sly, proto se, pros??m, vyvarujte\n| zad??v??n?? jin??ch hodnot.");
        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("| PRO UKON??EN?? PROGRAMU ZADEJTE NA M??STO ROZM??R?? MATICE HODNOTU 0 ??I Z??PORN?? CEL?? ????SLO");
        System.out.println("+---------------------------------------------------------------------------------------+\n");

        // main loop
        System.out.println("Po??et ????dku matice:");
        mainLoop:
        while ((numberOfRows = sc.nextInt()) > 0) { // input: number of rows
            sc.nextLine(); // get rid of all other potentional unwanted parameters from last input

            System.out.println("Po??et sloupc?? matice:"); // input: number of columns
            if (!((numberOfColumns = sc.nextInt()) > 0)) { // check if number of columns is a valid number, if not then break the while loop
                break;
            }
            sc.nextLine(); // get rid of all other potentional unwanted parameters from last input

            // initialisation: matrix
            matrix = new int[numberOfRows][numberOfColumns];

            // input: load values of matrix elements
            System.out.println("Zadejte prvky matice odd??len?? mezerou");
            getMatrix(matrix);

            System.out.println("????slo sm??ru rotace (-1: po sm??ru HR, 0: vypsat matici, 1: proti sm??ru HR, Jin?? hodnota: zadat novou matici):");
            transformationLoop:
            while ((transformation = sc.nextInt()) >= -1 && transformation <= 1) { // input: transformation operation number
                sc.nextLine(); // get rid of all other potentional unwanted parameters from last input

                // switch to perform given transformation
                switch (transformation) {
                    case -1:
                        System.out.println("Rotov??na matice");
                        matrix = rotateMatrixClockwise(matrix);
                        printMatrix(matrix);
                        break;
                    case 0:
                        System.out.println("Rotov??na matice");
                        printMatrix(matrix);
                        break;
                    case 1:
                        System.out.println("Rotov??na matice");
                        matrix = rotateMatrixCounterclockwise(matrix);
                        printMatrix(matrix);

                        break;
                    default:
                        break transformationLoop;
                }

                System.out.println("????slo sm??ru rotace");
            }
            sc.nextLine(); // get rid of all other potentional unwanted parameters from last input

            System.out.println("\nPo??et ????dku matice");
        }
    }

    public static void main(String[] args) {

    }
}
