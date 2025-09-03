/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Veiculo;
import model.VeiculoRepositorio;
import java.awt.*;
/**
 *
 * @author vinic
 */
public class VeiculoFrame extends JFrame {
    private JTable tabela;
    private DefaultTableModel modeloTabela;
    private VeiculoRepositorio repo;

    public VeiculoFrame() {
        repo = new VeiculoRepositorio();
        setTitle("Gerenciador de Veículos");
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Tabela
        modeloTabela = new DefaultTableModel(new Object[]{"Placa", "Cor", "Ano Fab", "Ano Mod", "Valor", "Marca", "Modelo"}, 0);
        tabela = new JTable(modeloTabela);
        JScrollPane scroll = new JScrollPane(tabela);
        add(scroll, BorderLayout.CENTER);

        // Botões
        JPanel painelBotoes = new JPanel();
        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnEditar = new JButton("Editar");
        JButton btnExcluir = new JButton("Excluir");

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnEditar);
        painelBotoes.add(btnExcluir);
        add(painelBotoes, BorderLayout.SOUTH);

        // Ações
        btnCadastrar.addActionListener(e -> {
            Veiculo novo = CadastroVeiculoJOptionPane.cadastrarVeiculo();
            repo.adicionar(novo);
            atualizarTabela();
        });

        btnEditar.addActionListener(e -> {
            int linha = tabela.getSelectedRow();
            if (linha >= 0) {
                String placa = (String) modeloTabela.getValueAt(linha, 0);
                Veiculo original = repo.buscarPorPlaca(placa);
                Veiculo atualizado = CadastroVeiculoJOptionPane.editarVeiculo(original);
                repo.remover(placa);
                repo.adicionar(atualizado);
                atualizarTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um veículo para editar.");
            }
        });


        btnExcluir.addActionListener(e -> {
            int linha = tabela.getSelectedRow();
            if (linha >= 0) {
                String placa = (String) modeloTabela.getValueAt(linha, 0);
                repo.remover(placa);
                atualizarTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um veículo para excluir.");
            }
        });

        atualizarTabela();
        setVisible(true);
    }

    private void atualizarTabela() {
        modeloTabela.setRowCount(0); // limpa tabela
        for (Veiculo v : repo.listar()) {
            modeloTabela.addRow(new Object[]{
                v.getPlaca(), v.getCor(), v.getAnoFabricacao(), v.getAnoModelo(),
                v.getValor(), v.getMarca(), v.getModelo()
            });
        }
    }
}