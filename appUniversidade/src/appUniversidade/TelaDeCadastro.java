package appUniversidade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaDeCadastro {
    private JFrame frameCadastro;
    private JFrame frameLogin;

    public TelaDeCadastro(JFrame frameLogin) {
        this.frameLogin = frameLogin;

        // Configuração da janela
        frameCadastro = new JFrame("Cadastro");
        frameCadastro.setSize(800, 500);
        frameCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCadastro.setLocationRelativeTo(null);
        frameCadastro.setResizable(false);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);

        //componentes
        JLabel labelNome = new JLabel("Nome:");
        JTextField campoNome = new JTextField();
        JLabel labelCPF = new JLabel("CPF:");
        JTextField campoCPF = new JTextField();

        JLabel labelEndereco = new JLabel("Endereço:");
        JTextField campoEndereco = new JTextField();
        JLabel labelDataNascimento = new JLabel("Data de Nascimento:");
        JTextField campoDataNascimento = new JTextField();

        JLabel labelSexo = new JLabel("Sexo:");
        JComboBox<String> campoSexo = new JComboBox<>(new String[]{"Selecione","Masculino", "Feminino", "Outro"});

        JLabel labelTurma = new JLabel("Turma:");
        JTextField campoTurma = new JTextField();

        JLabel labelDepartamentoPrincipal = new JLabel("Departamento Principal:");
        JComboBox<String> campoDepartamentoPrincipal = new JComboBox<>(new String[]{
                "Selecione","Departamento de Artes(UCB)", "Departamento de Educação(UCB)", "Departamento de Ciências(UCB)","Departamento de Tecnologia(UCB)"});

        JLabel labelDepartamentoSecundario = new JLabel("Departamento Secundário:");
        JComboBox<String> campoDepartamentoSecundario = new JComboBox<>(new String[]{
                "Nenhum", "Departamento de Artes(UCB)", "Departamento de Educação(UCB)", "Departamento de Ciências(UCB)","Departamento de Tecnologia(UCB)"});

        JLabel labelPrograma = new JLabel("Programa de Formação:");
        JComboBox<String> campoPrograma = new JComboBox<>(new String[]{"Selecione","Graduação", "Mestrado", "Doutorado"});

        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoVoltar = new JButton("Voltar");

        //tamanho e posição
        int larguraCampo = 320;
        int alturaCampo = 30;
        int espacamento = 40;
        int xEsquerda = 50;
        int xDireita = 400;
        int yAtual = 20;

        labelNome.setBounds(xEsquerda, yAtual, larguraCampo, alturaCampo);
        campoNome.setBounds(xEsquerda, yAtual + alturaCampo, larguraCampo, alturaCampo);

        labelCPF.setBounds(xDireita, yAtual, larguraCampo, alturaCampo);
        campoCPF.setBounds(xDireita, yAtual + alturaCampo, larguraCampo, alturaCampo);

        yAtual += alturaCampo + espacamento;

        labelEndereco.setBounds(xEsquerda, yAtual, larguraCampo, alturaCampo);
        campoEndereco.setBounds(xEsquerda, yAtual + alturaCampo, larguraCampo, alturaCampo);

        labelDataNascimento.setBounds(xDireita, yAtual, larguraCampo, alturaCampo);
        campoDataNascimento.setBounds(xDireita, yAtual + alturaCampo, larguraCampo, alturaCampo);

        yAtual += alturaCampo + espacamento;

        labelSexo.setBounds(xEsquerda, yAtual, larguraCampo, alturaCampo);
        campoSexo.setBounds(xEsquerda, yAtual + alturaCampo, larguraCampo, alturaCampo);

        labelTurma.setBounds(xDireita, yAtual, larguraCampo, alturaCampo);
        campoTurma.setBounds(xDireita, yAtual + alturaCampo, larguraCampo, alturaCampo);

        yAtual += alturaCampo + espacamento;

        labelDepartamentoPrincipal.setBounds(xEsquerda, yAtual, larguraCampo, alturaCampo);
        campoDepartamentoPrincipal.setBounds(xEsquerda, yAtual + alturaCampo, larguraCampo, alturaCampo);

        labelDepartamentoSecundario.setBounds(xDireita, yAtual, larguraCampo, alturaCampo);
        campoDepartamentoSecundario.setBounds(xDireita, yAtual + alturaCampo, larguraCampo, alturaCampo);

        yAtual += alturaCampo + espacamento;

        labelPrograma.setBounds(xEsquerda, yAtual, larguraCampo, alturaCampo);
        campoPrograma.setBounds(xEsquerda, yAtual + alturaCampo, larguraCampo, alturaCampo);

        yAtual += alturaCampo + espacamento * 2;

        botaoSalvar.setBounds(xEsquerda +160, yAtual, larguraCampo / 2, alturaCampo);
        botaoVoltar.setBounds(xDireita, yAtual, larguraCampo / 2, alturaCampo);

        // Ação botões
        botaoSalvar.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frameCadastro, "Cadastro realizado com sucesso!");
        });

        botaoVoltar.addActionListener((ActionEvent e) -> {
            frameCadastro.dispose();
            frameLogin.setVisible(true);
        });

        // Adicionar componentes no painel
        painelPrincipal.add(labelNome);
        painelPrincipal.add(campoNome);
        painelPrincipal.add(labelCPF);
        painelPrincipal.add(campoCPF);
        painelPrincipal.add(labelEndereco);
        painelPrincipal.add(campoEndereco);
        painelPrincipal.add(labelDataNascimento);
        painelPrincipal.add(campoDataNascimento);
        painelPrincipal.add(labelSexo);
        painelPrincipal.add(campoSexo);
        painelPrincipal.add(labelTurma);
        painelPrincipal.add(campoTurma);
        painelPrincipal.add(labelDepartamentoPrincipal);
        painelPrincipal.add(campoDepartamentoPrincipal);
        painelPrincipal.add(labelDepartamentoSecundario);
        painelPrincipal.add(campoDepartamentoSecundario);
        painelPrincipal.add(labelPrograma);
        painelPrincipal.add(campoPrograma);
        painelPrincipal.add(botaoSalvar);
        painelPrincipal.add(botaoVoltar);

        // Adicionar painel a janela
        frameCadastro.add(painelPrincipal);
    }

    public void exibir() {
        frameCadastro.setVisible(true);
    }
}
