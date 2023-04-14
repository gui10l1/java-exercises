/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_carros_usados;

import java.util.Scanner;

/**
 *
 * @author Gui
 */
public class Sistema_carros_usados {

    public static void main(String[] args) {
        //cria um objeto Scanner para ler dados de entrada do usuário
        Scanner input = new Scanner(System.in);
        
        //solicita ao usuário o número de carros vendidos, o valor total de vendas, o salário fixo e o valor por carro vendido
        System.out.print("Digite o número de carros vendidos: ");
        int numCarros = input.nextInt();
        
        System.out.print("Digite o valor total de vendas: ");
        double valorVendas = input.nextDouble();
        
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = input.nextDouble();
        
        System.out.print("Digite o valor que ele recebe por carro vendido: ");
        double valorPorCarro = input.nextDouble();
        
        //calcula o salário final do vendedor
        double comissaoFixa = numCarros * valorPorCarro;
        double comissaoVariavel = valorVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoFixa + comissaoVariavel;
        
        //exibe o resultado
        System.out.println("O salário final do vendedor é: R$" + salarioFinal);  
    }
}
