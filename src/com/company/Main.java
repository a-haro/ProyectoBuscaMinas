package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero(8, 8, 7);

        System.out.print("Elija su modo de juego (Escriba el número en cuestión): ");
        System.out.println("1. Fácil" +
                "\n 2. Normal" +
                "\n 3. Difícil" +
                "\n 4. Personalizado");
        int dificultad = sc.nextInt();
        switch (dificultad) {
            case 1:
                tablero = new Tablero(8, 8, 10);
                break;
            case 2:
                tablero = new Tablero(16, 16, 40);
                break;
            case 3:
                tablero = new Tablero(16, 30, 99);
                break;
            case 4:
        }
    }
}
