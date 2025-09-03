/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinic
 */
public class VeiculoRepositorio {
    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionar(Veiculo v) {
        veiculos.add(v);
    }

    public void remover(String placa) {
        veiculos.removeIf(v -> v.getPlaca().equalsIgnoreCase(placa));
    }

    public List<Veiculo> listar() {
        return veiculos;
    }

    public Veiculo buscarPorPlaca(String placa) {
        for (Veiculo v : veiculos) {
        if (v.getPlaca().equalsIgnoreCase(placa)) {
            return v;
        }
    }
    return null; // se não encontrar
    }
}