/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.Veiculo;
import model.Marca;
import model.Modelo;
/**
 *
 * @author vinic
 */
public class CadastroVeiculoJOptionPane {
    public static Veiculo cadastrarVeiculo() {
        String placa = JOptionPane.showInputDialog("Placa do veículo:");
        String cor = JOptionPane.showInputDialog("Cor do veículo:");
        int anoFab = Integer.parseInt(JOptionPane.showInputDialog("Ano de fabricação:"));
        int anoMod = Integer.parseInt(JOptionPane.showInputDialog("Ano do modelo:"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do veículo:"));

        Marca marca = (Marca) JOptionPane.showInputDialog(
            null,
            "Selecione a marca:",
            "Marca",
            JOptionPane.QUESTION_MESSAGE,
            null,
            Marca.values(),
            Marca.values()[0]
        );

        Modelo modelo = (Modelo) JOptionPane.showInputDialog(
            null,
            "Selecione o modelo:",
            "Modelo",
            JOptionPane.QUESTION_MESSAGE,
            null,
            Modelo.values(),
            Modelo.values()[0]
        );

        return new Veiculo(placa, cor, anoFab, anoMod, valor, marca, modelo);
        /*Veiculo veiculo = new Veiculo(placa, cor, anoFab, anoMod, valor, marca, modelo);

        JOptionPane.showMessageDialog(null, veiculo);
*/
    }
    public static Veiculo editarVeiculo(Veiculo original) {
        String placa = JOptionPane.showInputDialog("Placa do veículo:", original.getPlaca());
        String cor = JOptionPane.showInputDialog("Cor do veículo:", original.getCor());
        int anoFab = Integer.parseInt(JOptionPane.showInputDialog("Ano de fabricação:", original.getAnoFabricacao()));
        int anoMod = Integer.parseInt(JOptionPane.showInputDialog("Ano do modelo:", original.getAnoModelo()));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do veículo:", original.getValor()));

        Marca marca = (Marca) JOptionPane.showInputDialog(
            null, "Selecione a marca:", "Marca",
            JOptionPane.QUESTION_MESSAGE, null,
            Marca.values(), original.getMarca()
        );

        Modelo modelo = (Modelo) JOptionPane.showInputDialog(
            null, "Selecione o modelo:", "Modelo",
            JOptionPane.QUESTION_MESSAGE, null,
            Modelo.values(), original.getModelo()
        );

        return new Veiculo(placa, cor, anoFab, anoMod, valor, marca, modelo);
    }
}
