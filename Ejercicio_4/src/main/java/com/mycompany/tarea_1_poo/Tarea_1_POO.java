package com.mycompany.tarea_1_poo;

public class Tarea_1_POO {

    public static void main(String[] args) {
        int edjuan = 9;
        int edana, edalber, edmama;
        edalber = 2*(edjuan/3);
        edana = 4*(edjuan/3);
        edmama = edjuan + edalber + edana;
        
        System.out.println("Las edades son:");
        System.out.println("Alberto:" + edalber );
        System.out.println("Juan:" + edjuan);
        System.out.println("Ana:" + edana);
        System.out.println("Mamá:" + edmama);
    }
    
}


