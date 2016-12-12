package com.example.tiago.tabs;

/**
 * Created by Tiago on 09/12/16.
 */

public class Veiculosdata {

    //private variables
    int id;
    String modelo;
    String marca;
    String matricula;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public Veiculosdata(){}

    // getting marca
    public String getMarca() {  return marca; }
        // TODO Auto-generated method stub


    // setting  marca
    public void setMarca(String marca){
        this.marca = marca;
    }

    // getting modelo
    public String getModelo() {  return modelo; }
        // TODO Auto-generated method stub

    // setting  modelo
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

}
