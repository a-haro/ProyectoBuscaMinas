package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Tablero {
    private Scanner sc = new Scanner(System.in);
    private int rows;
    private int colums;
    private int dificultad;
    private int minas;
    private Casilla tablero[][];

    public Tablero(int rows, int colums, int minas){
        this.rows = rows;
        this.colums = colums;
        this.minas = minas;
        tablero = new Casilla[rows][colums];
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
    public void setColums(int colums) {
        this.colums = colums;
    }
    public void setMinas(int minas){this.minas = minas;}
    public int getRows() {
        return rows;
    }
    public int getColums() {
        return colums;
    }
    public int getMinas(){return minas;}

    public void generarTablero(){
        for (int x=0; x < tablero.length; x++){
            for (int y=0; y < tablero[x].length; y++)
                System.out.print(tablero[x]);
        }
    }

    public void generarMinasAleatorias(){
        for (int i = 0; i < minas; i++){
            // posicion random = x, y
            tablero[x][y].setMina(true);
        }
    }

    // imprimirTableroDescubierto()


    public void coords(){
        int x=0, y=0;
        int intento = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del 1 al " + colums);
        System.out.println("Intento :" + intento + ", Ingrese las coordenadas");
        System.out.println("Fila: ");
        x=sc.nextInt();
        System.out.println("Columna: ");
        y=sc.nextInt();
    }
    public void intCoord(int x, int y){
        coords();
        if  (x==0||y==0||x>rows||y<colums||x<rows||y>colums){
            System.out.println("Coordenadas incorrectas");
        }
    }
}
