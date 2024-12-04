package appUniversidade;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaDeAluno extends JFrame {

    public TelaDeAluno() {
        setTitle("Informações do Aluno");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Layout principal
        setLayout(new BorderLayout(10, 10));

        // Painel de informações do aluno
        JPanel painelInfo = new JPanel();
        painelInfo.setLayout(new BoxLayout(painelInfo, BoxLayout.Y_AXIS));
        painelInfo.setBorder(BorderFactory.createTitledBorder("Dados do Usuário"));

        // Adiciona informação do aluno em label
        painelInfo.add(new JLabel("Nome: Fulaninho da Silva Junior"));
        painelInfo.add(new JLabel("Matrícula: 1234567"));
        painelInfo.add(new JLabel("E-mail: fulaninhojr@email.com"));
        painelInfo.add(new JLabel("Curso: Ciência da Computação"));
        painelInfo.add(new JLabel("Departamento: Departamento de Tecnologia(UCB)"));
        painelInfo.add(new JLabel("Ramal do Departamento: 123-456"));

        // Painel central para tabela
        JPanel painelAulas = new JPanel(new BorderLayout());
        painelAulas.setBorder(BorderFactory.createTitledBorder("Aulas"));

        // Configurações tabela
        DefaultTableModel modeloTabelaAulas = new DefaultTableModel();
        modeloTabelaAulas.addColumn("Disciplina");
        modeloTabelaAulas.addColumn("Professor");
        modeloTabelaAulas.addColumn("Horário");

        // Adicionando aulas
        modeloTabelaAulas.addRow(new Object[]{"Algoritmos e Estruturas de Dados", "Prof. Ana Maria", "Segunda-feira, 14h"});
        modeloTabelaAulas.addRow(new Object[]{"Banco de Dados", "Prof. Carlos Alberto", "Quarta-feira, 10h"});
        modeloTabelaAulas.addRow(new Object[]{"Redes de Computadores", "Prof. Fernanda Lima", "Sexta-feira, 16h"});

        JTable tabelaAulas = new JTable(modeloTabelaAulas);
        JScrollPane scrollPaneAulas = new JScrollPane(tabelaAulas);
        painelAulas.add(scrollPaneAulas, BorderLayout.CENTER);

        // Painel para tabela de notas
        JPanel painelNotas = new JPanel(new BorderLayout());
        painelNotas.setBorder(BorderFactory.createTitledBorder("Notas e Atividades"));

        // Configurações tabela de notas
        DefaultTableModel modeloTabelaNotas = new DefaultTableModel();
        modeloTabelaNotas.addColumn("Disciplina");
        modeloTabelaNotas.addColumn("Nota 1");
        modeloTabelaNotas.addColumn("Nota 2");
        modeloTabelaNotas.addColumn("Nota Atividades");

        // Notas
        modeloTabelaNotas.addRow(new Object[]{"Algoritmos e Estruturas de Dados", 8.5, 9.0, 7.0});
        modeloTabelaNotas.addRow(new Object[]{"Banco de Dados", 7.0, 8.0, 9.5});
        modeloTabelaNotas.addRow(new Object[]{"Redes de Computadores", 9.0, 8.5, 10.0});

        JTable tabelaNotas = new JTable(modeloTabelaNotas);
        JScrollPane scrollPaneNotas = new JScrollPane(tabelaNotas);
        painelNotas.add(scrollPaneNotas, BorderLayout.CENTER);

        // Espaço de notas
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, painelAulas, painelNotas);
        splitPane.setDividerLocation(180); // Altura do divisor

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
        add(splitPane, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.PAGE_END);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	TelaDeAluno telaDeAluno = new TelaDeAluno();
            telaDeAluno.setVisible(true);
        });
    }
}
