package com.company;
import java.util.Scanner;
import java.util.Random;

public class Tablero {
    private Scanner sc = new Scanner(System.in);
    private int rows;
    private int colums;
    private int dificultad;
    private int tablero[][] = new int[rows][colums];

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
    public void generarTablero(){

    }
    public void setDificultad(){
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
}
