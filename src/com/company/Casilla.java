package com.company;

public class Casilla {
    private boolean mina; // t
    private int numMinasAlrededor; //
    private boolean bandera; // f
    private boolean tapada; // f

    public Casilla (boolean mina, int numMinasAlrededor, boolean bandera, boolean tapada){
        this.mina = mina;
        this.numMinasAlrededor = numMinasAlrededor;
        this.bandera = bandera;
        this.tapada = tapada;
    }
    public void setMina(boolean mina){this.mina = mina;}
    public void setMina(int numMinasAlrededor){this.numMinasAlrededor = numMinasAlrededor;}
    public void setBandera(boolean bandera){this.bandera = bandera;}
    public void setTapada(boolean tapada){this.tapada = tapada;}

    public boolean getMina(){return mina;}
    public int getNumMinasAlrededor(){return numMinasAlrededor;}
    public boolean getBandera(){return bandera;}
    public boolean getTapada(){return tapada;}


}
