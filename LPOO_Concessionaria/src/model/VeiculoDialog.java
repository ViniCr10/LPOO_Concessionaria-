/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author vinic
 */
public class VeiculoDialog extends JDialog {
    private JTextField txtPlaca, txtCor, txtAnoFab, txtAnoMod, txtValor;
    private JComboBox<Marca> comboMarca;
    private JComboBox<Modelo> comboModelo;
    private JButton btnSalvar;
    private Veiculo veiculo;

    public VeiculoDialog(JFrame parent) {
        super(parent, "Cadastro de Veículo", true);
        setSize(400, 300);
        setLayout(new GridLayout(8, 2));

        txtPlaca = new JTextField();
        txtCor = new JTextField();
        txtAnoFab = new JTextField();
        txtAnoMod = new JTextField();
        txtValor = new JTextField();
        comboMarca = new JComboBox<>(Marca.values());
        comboModelo = new JComboBox<>(Modelo.values());
        btnSalvar = new JButton("Salvar");

        add(new JLabel("Placa:")); add(txtPlaca);
        add(new JLabel("Cor:")); add(txtCor);
        add(new JLabel("Ano Fabricação:")); add(txtAnoFab);
        add(new JLabel("Ano Modelo:")); add(txtAnoMod);
        add(new JLabel("Valor:")); add(txtValor);
        add(new JLabel("Marca:")); add(comboMarca);
        add(new JLabel("Modelo:")); add(comboModelo);
        add(new JLabel("")); add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            veiculo = new Veiculo(
                txtPlaca.getText(),
                txtCor.getText(),
                Integer.parseInt(txtAnoFab.getText()),
                Integer.parseInt(txtAnoMod.getText()),
                Double.parseDouble(txtValor.getText()),
                (Marca) comboMarca.getSelectedItem(),
                (Modelo) comboModelo.getSelectedItem()
            );
            dispose();
        });
    }

    public VeiculoDialog(JFrame parent, Veiculo original) {
        this(parent);
        txtPlaca.setText(original.getPlaca());
        txtCor.setText(original.getCor());
        txtAnoFab.setText(String.valueOf(original.getAnoFabricacao()));
        txtAnoMod.setText(String.valueOf(original.getAnoModelo()));
        txtValor.setText(String.valueOf(original.getValor()));
        comboMarca.setSelectedItem(original.getMarca());
        comboModelo.setSelectedItem(original.getModelo());
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}
