/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 20241PF.CC0017
 */
public class Veiculo {
    private String placa;
    private String cor;
    private int anoFabricacao;
    private int anoModelo;
    private double valor;
    private Marca marca;
    private Modelo modelo;    

    public Veiculo(String placa, String cor, int anoFabricacao, int anoModelo, double valor, Marca marca, Modelo modelo) {
        this.placa = placa;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.valor = valor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
 
   @Override
   public String toString() {
       return "Placa: " + placa + 
               "\nCor: " + cor + 
               "\nAno Fabricação: " + anoFabricacao + 
               "\nAno Modelo: " + anoModelo + 
               "\nValor: " + valor + 
               "\nMarca: " + marca + 
               "\nModelo: " + modelo ;
   }
}
