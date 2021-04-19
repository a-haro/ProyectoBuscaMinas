package com.company;
import java.util.Scanner;
import java.util.Random;

public class Tablero {
    private static Scanner sc = new Scanner(System.in);
    private static int rows;
    private static int colums;
    private static int dificultad;
    private static int tablero[][] = new int[rows][colums];

    public Tablero(int rows, int colums){
        this.rows = rows;
        this.colums = colums;
        tablero = new int[rows][colums];
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
    public void setColums(int colums) {
        this.colums = colums;
    }
    public int getRows() {
        return rows;
    }
    public int getColums() {
        return colums;
    }

    public static void generarTablero(){

        for (int x=0; x < tablero.length; x++){
            for (int y=0; y < tablero[x].length; y++)
                System.out.print(tablero[x]);
        }

    }
    public static void setDificultad(){
        System.out.print("Elija su modo de juego (Escriba el número en cuestión): ");
        System.out.println("1. Fácil" +
                        "\n 2. Normal" +
                        "\n 3. Difícil" +
                        "\n 4. Personalizado");
        dificultad = sc.nextInt();
        switch (dificultad){
            case 1: rows = 8; colums = 8; break;
            case 2: rows = 16; colums = 16; break;
            case 3: rows = 16; colums = 30; break;
            case 4:
                System.out.print("Indique las filas: ");
                rows = sc.nextInt();
                System.out.print("Indique las columnas: ");
                colums = sc.nextInt();
                break;
        }
    }
    public void actionCoord(){
        int x=0, y=0;
        int intento = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del 1 al " + colums);
        System.out.println("Intento :" + intento + ", Ingrese las coordenadas");
        System.out.println("Fila: ");
        x=sc.nextInt();
        System.out.println("Columna: ");
        y=sc.nextInt();

        if  (x==0||y==0||x>rows||y==colums){
            System.out.println("Coordenadas incorrectas");
        }
    }
}
