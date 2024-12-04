package appUniversidade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDeLogin {
    private JFrame frameLogin;

    public TelaDeLogin() {
        // Configurações da janela de login
        frameLogin = new JFrame("Login");
        frameLogin.setSize(400, 500);
        frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setResizable(false);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout());

        // Painel pra logo
        JPanel painelLogo = new JPanel(new FlowLayout());
        ImageIcon logo = new ImageIcon("src/images/logo.png");
        Image img = logo.getImage();
        Image imagemRedimensionada = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel labelLogo = new JLabel(new ImageIcon(imagemRedimensionada));
        painelLogo.add(labelLogo);
        painelPrincipal.add(painelLogo, BorderLayout.NORTH);

        // Painel central pra login
        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));

        JPanel painelUsuario = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JLabel labelUsuario = new JLabel("Usuário:");
        JTextField campoUsuario = new JTextField();
        campoUsuario.setPreferredSize(new Dimension(200, 30));
        painelUsuario.add(labelUsuario);
        painelUsuario.add(campoUsuario);

        JPanel painelSenha = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        JLabel labelSenha = new JLabel("Senha:");
        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setPreferredSize(new Dimension(200, 30));
        painelSenha.add(labelSenha);
        painelSenha.add(campoSenha);

        // Painel dos botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new BoxLayout(painelBotoes, BoxLayout.Y_AXIS));

        JButton botaoLogin = new JButton("Login");
        botaoLogin.setPreferredSize(new Dimension(200, 40));
        JPanel painelBotaoLogin = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelBotaoLogin.add(botaoLogin);

        JButton botaoCadastro = new JButton("Cadastrar");
        botaoCadastro.setPreferredSize(new Dimension(150, 30));
        JPanel painelBotaoCadastro = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelBotaoCadastro.add(botaoCadastro);

        painelBotoes.add(painelBotaoLogin);
        painelBotoes.add(Box.createRigidArea(new Dimension(0, 10)));
        painelBotoes.add(painelBotaoCadastro);

        painelCentral.add(painelUsuario);
        painelCentral.add(painelSenha);
        painelCentral.add(painelBotoes);

        painelPrincipal.add(painelCentral, BorderLayout.CENTER);
        frameLogin.add(painelPrincipal);

        // Ação botão login
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());

                // Aqui você pode validar as credenciais (exemplo simples, sem banco de dados)
                if (usuario.equals("fulano") && senha.equals("123")) {
                    // Se as credenciais forem corretas, fecha a tela de login e abre a tela de aluno
                    frameLogin.setVisible(false);
                    TelaDeAluno telaDeAluno = new TelaDeAluno();
                    telaDeAluno.setVisible(true);
                } else if(usuario.equals("prof") && senha.equals("123")){
                	frameLogin.setVisible(false);
                    TelaDeProfessor telaDeProfessor = new TelaDeProfessor();
                    telaDeProfessor.setVisible(true);
                }
                else{
                    // Senha ou usuário incorreto
                    JOptionPane.showMessageDialog(frameLogin, "Usuário ou senha incorretos", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Ação botão cadastro
        botaoCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameLogin.setVisible(false);
                TelaDeCadastro telaDeCadastro = new TelaDeCadastro(frameLogin);
                telaDeCadastro.exibir();
            }
        });
    }

    public void exibir() {
        frameLogin.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaDeLogin telaDeLogin = new TelaDeLogin();
            telaDeLogin.exibir();
        });
    }
}
