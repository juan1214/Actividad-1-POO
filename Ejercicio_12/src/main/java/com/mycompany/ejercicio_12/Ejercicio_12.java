package com.mycompany.ejercicio_12;


public class Ejercicio_12 {

    public static void main(String[] args) {
        double horas_trabajadas, valor_hora;
        double retención;
        double salario_bruto, salario_neto;
        horas_trabajadas = 48;
        valor_hora = 5000;
        salario_bruto = horas_trabajadas * valor_hora;
        retención = salario_bruto * 0.125;
        salario_neto = salario_bruto - retención;
        
        System.out.println("Salario bruto:"+ salario_bruto );
        System.out.println("Retención en la fuente:"+ retención );
        System.out.println("Salario neto del trabajador:"+ salario_neto );
    }
}
