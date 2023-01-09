/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23kramarmsemestralproject;

import java.util.Scanner;

/**
 * 23. Program loads one matrix of given size and rotates it 90 degrees
 * clockwise or counterclockwise
 *
 * @author miroslav.kramar
 * @date 17/12/2022
 */
public class UI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean shouldEnd = false;
        
        while (!shouldEnd) {

            System.out.println("+---------------------------------------+");
            System.out.println("| SEMESTRÁLNÍ PRÁCE");
            System.out.println("+---------------------------------------+");
            System.out.println("| MENU");
            System.out.println("+---------------------------------------+");
            System.out.println("| 0: KONEC");
            System.out.println("| 1: SPUSTIT PROGRAM PRO ROTOVÁNÍ MATIC");
            System.out.println("| 2: SPUSTIT VÁNOČNÍ ÚLOHU");
            System.out.println("+---------------------------------------+\n");

            switch (sc.nextInt()) {
                case 0:
                    shouldEnd = true;
                    break;
                case 1:
                    MatrixRotation.matrixRotationProgram();
                    System.out.println("");
                    break;
                case 2:
                    VanocniUloha.VanocniUlohaProgram();
                    System.out.println("");
                    break;
                default:
                    System.out.println("Warning: this input value is prohibited! Try again.\n");
                    break;
            }
            sc.nextLine(); // get rid of all other potentional unwanted parameters from last input
        }

    }

}