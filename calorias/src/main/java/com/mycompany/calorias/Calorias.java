/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calorias;

import java.util.Scanner;

/**
 *
 * @author Gui
 */
public class Calorias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalCalories = 0;
        
        int mealChoise;
        int dessertChoice;
        int drinkChoise;
        
        do {
            System.out.println("Escolha um prato:");
            System.out.println("1. Vegetariano");
            System.out.println("2. Peixe");
            System.out.println("3. Frango");
            System.out.println("4. Carne");

            mealChoise = scanner.nextInt();
        } while (mealChoise < 1 || mealChoise > 4);
        
        do {
            System.out.println("Escolha uma sobremesa:");
            System.out.println("1. Abacaxi");
            System.out.println("2. Sorvete diet");
            System.out.println("3. Mousse diet");
            System.out.println("4. Mousse chocolate");

            dessertChoice = scanner.nextInt();
        } while (dessertChoice < 1 || dessertChoice > 4);

        do {
            System.out.println("Escolha uma bebida:");
            System.out.println("1. Chá");
            System.out.println("2. Suco de laranja");
            System.out.println("3. Suco de melão");
            System.out.println("4. Refrigerante diet");

            drinkChoise = scanner.nextInt();
        } while (drinkChoise < 1 || drinkChoise > 4);

        switch (mealChoise) {
            case 1:
                totalCalories += 180;
                break;

            case 2:
                totalCalories += 230;
                break;

            case 3:
                totalCalories += 250;
                break;

            default:
                totalCalories += 350;
                break;
        }
        
        switch (dessertChoice) {
            case 1:
                totalCalories += 75;
                break;

            case 2:
                totalCalories += 110;
                break;

            case 3:
                totalCalories += 170;
                break;

            default:
                totalCalories += 200;
                break;
        }
        
        switch (drinkChoise) {
            case 1:
                totalCalories += 20;
                break;

            case 2:
                totalCalories += 70;
                break;

            case 3:
                totalCalories += 100;
                break;

            default:
                totalCalories += 65;
                break;
        }
        
        System.out.print("O total de calorias foram: "+totalCalories+"kcal");
    }
}
