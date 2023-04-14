/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ibge;

import java.util.Scanner;

/**
 *
 * @author Gui
 */
public class Ibge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numHabitantes = 0; // contador de habitantes cadastrados
        int numMulheres18a35CastanhoCastanho = 0; // contador de mulheres com as características desejadas
        
        while (true) {
            System.out.println("Cadastro do habitante " + (numHabitantes + 1));
            
            // leitura dos dados do habitante
            System.out.print("Sexo (m/f): ");
            char sexo = sc.next().charAt(0);
            if (sexo != 'm' && sexo != 'f') {
                System.out.println("Sexo inválido. Cadastro cancelado.");
                continue; // volta para o início do loop para cadastrar outro habitante
            }
            
            System.out.print("Cor dos olhos (a/v/c/p): ");
            char corOlhos = sc.next().charAt(0);
            if (corOlhos != 'a' && corOlhos != 'v' && corOlhos != 'c' && corOlhos != 'p') {
                System.out.println("Cor dos olhos inválida. Cadastro cancelado.");
                continue;
            }
            
            System.out.print("Cor dos cabelos (l/c/p/r): ");
            char corCabelos = sc.next().charAt(0);
            if (corCabelos != 'l' && corCabelos != 'c' && corCabelos != 'p' && corCabelos != 'r') {
                System.out.println("Cor dos cabelos inválida. Cadastro cancelado.");
                continue;
            }
            
            System.out.print("Idade (entre 10 e 100 anos): ");
            int idade = sc.nextInt();
            if (idade == -1) {
                System.out.println("Cadastro encerrado.");
                break; // sai do loop para encerrar o cadastro
            }
            if (idade < 10 || idade > 100) {
                System.out.println("Idade inválida. Cadastro cancelado.");
                continue;
            }
            
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            if (salario < 0) {
                System.out.println("Salário inválido. Cadastro cancelado.");
                continue;
            }
            
            // contagem de mulheres com as características desejadas
            if (sexo == 'f' && idade >= 18 && idade <= 35 && corOlhos == 'c' && corCabelos == 'c') {
                numMulheres18a35CastanhoCastanho++;
            }
            
            numHabitantes++;
        }
        
        // cálculo da porcentagem de mulheres com as características desejadas
        double porcentagem = (double) numMulheres18a35CastanhoCastanho / numHabitantes * 100;
        System.out.println("Porcentagem de mulheres com idade entre 18 e 35 anos, olhos castanhos e cabelos castanhos: " + porcentagem + "%");
        
        sc.close();
    }
}
