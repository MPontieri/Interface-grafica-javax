package appUniversidade;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaDeProfessor extends JFrame {

    public TelaDeProfessor() {
        setTitle("Informações do Professor");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Layout principal
        setLayout(new BorderLayout(10, 10));

        // Painel de informações
        JPanel painelInfo = new JPanel();
        painelInfo.setLayout(new BoxLayout(painelInfo, BoxLayout.Y_AXIS));
        painelInfo.setBorder(BorderFactory.createTitledBorder("Dados do Professor"));

        // Informações do professor como label
        painelInfo.add(new JLabel("Nome: Professora Fulana Maria"));
        painelInfo.add(new JLabel("E-mail: fulana@email.com"));
        painelInfo.add(new JLabel("N° de Registro: 987654"));
        painelInfo.add(new JLabel("Departamento: Departamento de Ciência da Computação"));
        painelInfo.add(new JLabel("Ramal do Departamento: 123-456"));

        // Painel tabela
        JPanel painelAulas = new JPanel(new BorderLayout());
        painelAulas.setBorder(BorderFactory.createTitledBorder("Aulas Ministradas"));

        // Configuração tabela
        DefaultTableModel modeloTabelaAulas = new DefaultTableModel();
        modeloTabelaAulas.addColumn("ID da Turma");
        modeloTabelaAulas.addColumn("Disciplina");
        modeloTabelaAulas.addColumn("Horário");
        modeloTabelaAulas.addColumn("Dia da Semana");

        // Aulas
        modeloTabelaAulas.addRow(new Object[]{"TURMA01", "Algoritmos e Estruturas de Dados", "14h - 16h", "Segunda-feira"});
        modeloTabelaAulas.addRow(new Object[]{"TURMA02", "Banco de Dados", "10h - 12h", "Quarta-feira"});
        modeloTabelaAulas.addRow(new Object[]{"TURMA03", "Redes de Computadores", "16h - 18h", "Sexta-feira"});

        JTable tabelaAulas = new JTable(modeloTabelaAulas);
        JScrollPane scrollPaneAulas = new JScrollPane(tabelaAulas);
        painelAulas.add(scrollPaneAulas, BorderLayout.CENTER);

        // Painel inferior botão
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Saindo...");
            dispose();
        });

        painelBotoes.add(botaoSair);

        // Layout principal
        add(painelInfo, BorderLayout.NORTH);
        add(painelAulas, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.PAGE_END);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaDeProfessor telaDeProfessor = new TelaDeProfessor();
            telaDeProfessor.setVisible(true);
        });
    }
}
