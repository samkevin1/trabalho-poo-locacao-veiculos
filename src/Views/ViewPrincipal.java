package Views;

import Controllers.AutomovelController;
import Controllers.ClienteController;
import Controllers.EnderecoController;
import Controllers.LocacaoController;
import Controllers.MarcaController;
import Controllers.ModeloController;
import Models.Automovel;
import Models.Cliente;
import Models.Endereco;
import Models.Locacao;
import Models.Marca;
import Models.Modelo;
import Utils.Alerta;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ViewPrincipal extends javax.swing.JPanel {

    public ViewPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JTabbedPane();
        marcasPanel = new javax.swing.JPanel();
        inserirMarca = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        inputNomeMarca = new javax.swing.JTextField();
        txtLabelNome2 = new javax.swing.JLabel();
        inputDescricaoMarca = new javax.swing.JTextField();
        txtLabelMarca2 = new javax.swing.JLabel();
        btnCadastrarMarca = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        containerModelos2 = new javax.swing.JPanel();
        clientesPanel = new javax.swing.JPanel();
        inserirCliente = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        inputNomeCliente = new javax.swing.JTextField();
        txtLabelNome3 = new javax.swing.JLabel();
        inputSobrenomeCliente = new javax.swing.JTextField();
        txtLabelMarca3 = new javax.swing.JLabel();
        txtLabelCpf = new javax.swing.JLabel();
        inputCnhCliente = new javax.swing.JTextField();
        txtLabelCnh = new javax.swing.JLabel();
        inputTelefoneCliente = new javax.swing.JTextField();
        txtLabelCpf1 = new javax.swing.JLabel();
        inputCPFCliente = new javax.swing.JTextField();
        btnCadastrarCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtLabelNome4 = new javax.swing.JLabel();
        inputCEPEndereco = new javax.swing.JTextField();
        txtLabelNome5 = new javax.swing.JLabel();
        inputNumeroEndereco = new javax.swing.JTextField();
        txtLabelNome6 = new javax.swing.JLabel();
        inputClienteEndereco = new javax.swing.JTextField();
        txtLabelNome7 = new javax.swing.JLabel();
        inputBairroEndereco = new javax.swing.JTextField();
        txtLabelNome8 = new javax.swing.JLabel();
        inputLogradouroEndereco = new javax.swing.JTextField();
        txtLabelNome9 = new javax.swing.JLabel();
        inputCidadeEndereco = new javax.swing.JTextField();
        txtLabelNome10 = new javax.swing.JLabel();
        inputPaisEndereco = new javax.swing.JTextField();
        btnCadastrarEndereco = new javax.swing.JButton();
        inputIdClienteEndereco = new javax.swing.JTextField();
        txtLabelNome13 = new javax.swing.JLabel();
        modelosPanel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        inputIdMarcaModelo = new javax.swing.JTextField();
        txtLabelMarca1 = new javax.swing.JLabel();
        btnCadastrarModelo = new javax.swing.JButton();
        inputDescricaoModelo = new javax.swing.JTextField();
        txtLabelMarca8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        automovelPanel = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        inputBuscaPorPlaca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        inputPlacaAutomovel = new javax.swing.JTextField();
        txtLabelNome11 = new javax.swing.JLabel();
        inputChassiAutomovel = new javax.swing.JTextField();
        txtLabelMarca4 = new javax.swing.JLabel();
        btnCadastrarAutomovel = new javax.swing.JButton();
        inputRenavamAutomovel = new javax.swing.JTextField();
        txtLabelNome12 = new javax.swing.JLabel();
        inputValorLocacaoAutomovel = new javax.swing.JTextField();
        txtLabelMarca5 = new javax.swing.JLabel();
        inputTipoCombustivelAutomovel = new javax.swing.JTextField();
        txtLabelMarca6 = new javax.swing.JLabel();
        inputIdModeloAutomovel = new javax.swing.JTextField();
        txtLabelMarca7 = new javax.swing.JLabel();
        inputCorAutomovel1 = new javax.swing.JTextField();
        txtLabelMarca9 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        automovelPanel1 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        inputDtLocacao = new javax.swing.JTextField();
        txtLabelNome14 = new javax.swing.JLabel();
        inputValorKm = new javax.swing.JTextField();
        txtLabelMarca10 = new javax.swing.JLabel();
        btnCadastrarLocacao = new javax.swing.JButton();
        inputValorLocacao = new javax.swing.JTextField();
        txtLabelNome15 = new javax.swing.JLabel();
        inputKmLocacao = new javax.swing.JTextField();
        txtLabelMarca11 = new javax.swing.JLabel();
        inputIdAutomovelLocacao = new javax.swing.JTextField();
        txtLabelMarca12 = new javax.swing.JLabel();
        inputBonusLocacao = new javax.swing.JTextField();
        txtLabelMarca13 = new javax.swing.JLabel();
        inputIdClienteLocacao = new javax.swing.JTextField();
        txtLabelMarca14 = new javax.swing.JLabel();
        inputDtDevolucaoLocacao = new javax.swing.JTextField();
        txtLabelMarca15 = new javax.swing.JLabel();

        inputNomeMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeMarcaActionPerformed(evt);
            }
        });

        txtLabelNome2.setText("Nome da marca:");

        txtLabelMarca2.setText("Descrição da marca:");

        btnCadastrarMarca.setText("Cadastrar");
        btnCadastrarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputNomeMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrarMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(inputDescricaoMarca)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLabelNome2)
                            .addComponent(txtLabelMarca2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLabelNome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNomeMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLabelMarca2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputDescricaoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarMarca)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inserirMarca.addTab("+ Inserir nova marca", jPanel6);

        clientesPanel.setBackground(new Color(255, 255, 240));

        javax.swing.GroupLayout containerModelos2Layout = new javax.swing.GroupLayout(containerModelos2);
        containerModelos2.setLayout(containerModelos2Layout);
        containerModelos2Layout.setHorizontalGroup(
            containerModelos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        containerModelos2Layout.setVerticalGroup(
            containerModelos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerModelos2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerModelos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        inserirMarca.addTab("Lista de marcas cadastradas", jPanel3);

        javax.swing.GroupLayout marcasPanelLayout = new javax.swing.GroupLayout(marcasPanel);
        marcasPanel.setLayout(marcasPanelLayout);
        marcasPanelLayout.setHorizontalGroup(
            marcasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(marcasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(marcasPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(inserirMarca)
                    .addGap(0, 0, 0)))
        );
        marcasPanelLayout.setVerticalGroup(
            marcasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(marcasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(marcasPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(inserirMarca)
                    .addGap(0, 0, 0)))
        );

        panelPrincipal.addTab("Marcas", marcasPanel);

        clientesPanel.setBackground(new Color(255, 255, 240));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        inserirCliente.addTab("Lista de clientes cadastrados", jPanel8);

        inputNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeClienteActionPerformed(evt);
            }
        });

        txtLabelNome3.setText("Nome do cliente:");

        txtLabelMarca3.setText("Sobrenome do cliente:");

        txtLabelCpf.setText("CPF do cliente:");

        inputCnhCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCnhClienteActionPerformed(evt);
            }
        });

        txtLabelCnh.setText("Carteira nacional do cliente: (CNH)");

        inputTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTelefoneClienteActionPerformed(evt);
            }
        });

        txtLabelCpf1.setText("Telefone do cliente:");

        inputCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCPFClienteActionPerformed(evt);
            }
        });

        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtLabelNome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(146, 146, 146))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtLabelCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLabelMarca3)
                            .addComponent(txtLabelCnh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtLabelCpf1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(inputTelefoneCliente)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputCPFCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(inputNomeCliente))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputSobrenomeCliente)
                            .addComponent(inputCnhCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelNome3)
                    .addComponent(txtLabelMarca3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSobrenomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelCpf)
                    .addComponent(txtLabelCnh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCnhCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtLabelCpf1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnCadastrarCliente)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inserirCliente.addTab("+ Inserir novo cliente", jPanel9);

        txtLabelNome4.setText("Cliente:");

        inputCEPEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCEPEnderecoActionPerformed(evt);
            }
        });

        txtLabelNome5.setText("CEP:");

        inputNumeroEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumeroEnderecoActionPerformed(evt);
            }
        });

        txtLabelNome6.setText("Logradouro:");

        inputClienteEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClienteEnderecoActionPerformed(evt);
            }
        });

        txtLabelNome7.setText("Número:");

        inputBairroEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBairroEnderecoActionPerformed(evt);
            }
        });

        txtLabelNome8.setText("Bairro:");

        inputLogradouroEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLogradouroEnderecoActionPerformed(evt);
            }
        });

        txtLabelNome9.setText("País:");

        inputCidadeEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCidadeEnderecoActionPerformed(evt);
            }
        });

        txtLabelNome10.setText("Cidade:");

        inputPaisEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPaisEnderecoActionPerformed(evt);
            }
        });

        btnCadastrarEndereco.setText("Cadastrar");
        btnCadastrarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEnderecoActionPerformed(evt);
            }
        });

        inputIdClienteEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdClienteEnderecoActionPerformed(evt);
            }
        });

        txtLabelNome13.setText("ID do cliente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtLabelNome6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(183, 183, 183)
                        .addComponent(txtLabelNome7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(inputLogradouroEndereco)
                        .addGap(39, 39, 39)
                        .addComponent(inputNumeroEndereco)
                        .addContainerGap())
                    .addComponent(btnCadastrarEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLabelNome8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(214, 214, 214)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputIdClienteEndereco)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtLabelNome10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(171, 171, 171))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(inputBairroEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                            .addComponent(inputPaisEndereco, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(39, 39, 39))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtLabelNome9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addGap(125, 125, 125)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtLabelNome13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118))
                                    .addComponent(inputCidadeEndereco))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputClienteEndereco)
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLabelNome4, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                .addGap(210, 210, 210)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLabelNome5, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                .addGap(193, 193, 193))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputCEPEndereco)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelNome4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLabelNome5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCEPEndereco)
                    .addComponent(inputClienteEndereco))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelNome6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLabelNome7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNumeroEndereco)
                    .addComponent(inputLogradouroEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelNome8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLabelNome10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBairroEndereco)
                    .addComponent(inputCidadeEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelNome9)
                    .addComponent(txtLabelNome13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPaisEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIdClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarEndereco)
                .addGap(175, 175, 175))
        );

        inserirCliente.addTab("+ Inserir endereço cliente", jPanel1);

        javax.swing.GroupLayout clientesPanelLayout = new javax.swing.GroupLayout(clientesPanel);
        clientesPanel.setLayout(clientesPanelLayout);
        clientesPanelLayout.setHorizontalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(clientesPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(inserirCliente)
                    .addGap(0, 0, 0)))
        );
        clientesPanelLayout.setVerticalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(clientesPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(inserirCliente)
                    .addGap(0, 0, 0)))
        );

        panelPrincipal.addTab("Clientes", clientesPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        modelosPanel.addTab("Lista de modelos cadastrados", jPanel2);

        txtLabelMarca1.setText("Descrição:");

        btnCadastrarModelo.setText("Cadastrar");
        btnCadastrarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarModeloActionPerformed(evt);
            }
        });

        txtLabelMarca8.setText("ID da marca:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnCadastrarModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLabelMarca1)
                            .addComponent(inputDescricaoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputIdMarcaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLabelMarca8))
                        .addGap(14, 14, 14))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelMarca8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLabelMarca1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDescricaoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIdMarcaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarModelo)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
        );

        modelosPanel.addTab("+ Inserir novo modelo", jPanel4);

        panelPrincipal.addTab("Modelos", modelosPanel);

        jLabel1.setText("Buscar automóvel por placa:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(inputBuscaPorPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 325, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBuscaPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(403, Short.MAX_VALUE))
        );

        automovelPanel.addTab("Lista de automóveis cadastrados", jPanel12);

        inputPlacaAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPlacaAutomovelActionPerformed(evt);
            }
        });

        txtLabelNome11.setText("Placa:");

        txtLabelMarca4.setText("CHASSI:");

        btnCadastrarAutomovel.setText("Cadastrar");
        btnCadastrarAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAutomovelActionPerformed(evt);
            }
        });

        inputRenavamAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRenavamAutomovelActionPerformed(evt);
            }
        });

        txtLabelNome12.setText("RENAVAM:");

        txtLabelMarca5.setText("Valor da locação:");

        txtLabelMarca6.setText("Tipo do combustível:");

        txtLabelMarca7.setText("Cor do automóvel:");

        txtLabelMarca9.setText("ID do modelo:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(txtLabelMarca7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(inputCorAutomovel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputChassiAutomovel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputPlacaAutomovel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtLabelNome11, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLabelMarca4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(inputIdModeloAutomovel))
                                .addGap(49, 49, 49)))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputTipoCombustivelAutomovel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputRenavamAutomovel, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(inputValorLocacaoAutomovel)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLabelMarca6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLabelNome12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLabelMarca5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 69, Short.MAX_VALUE))))
                    .addComponent(btnCadastrarAutomovel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtLabelMarca9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelNome11)
                    .addComponent(txtLabelNome12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPlacaAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputRenavamAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelMarca4)
                    .addComponent(txtLabelMarca5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputChassiAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputValorLocacaoAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelMarca6)
                    .addComponent(txtLabelMarca7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTipoCombustivelAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCorAutomovel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLabelMarca9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputIdModeloAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnCadastrarAutomovel)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        automovelPanel.addTab("+ Inserir novo automóvel", jPanel13);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(automovelPanel)
                    .addGap(0, 0, 0)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(automovelPanel)
                    .addGap(0, 0, 0)))
        );

        panelPrincipal.addTab("Automóveis", jPanel11);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        automovelPanel1.addTab("Locações", jPanel16);

        inputDtLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDtLocacaoActionPerformed(evt);
            }
        });

        txtLabelNome14.setText("Data locação:");

        txtLabelMarca10.setText("Valor km:");

        btnCadastrarLocacao.setText("Cadastrar");
        btnCadastrarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLocacaoActionPerformed(evt);
            }
        });

        inputValorLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorLocacaoActionPerformed(evt);
            }
        });

        txtLabelNome15.setText("Valor locação:");

        txtLabelMarca11.setText("KM:");

        txtLabelMarca12.setText("Id do automóvel:");

        txtLabelMarca13.setText("Id do cliente:");

        txtLabelMarca14.setText("Data de devolução:");

        txtLabelMarca15.setText("Bônus R$:");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(txtLabelMarca13, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(inputIdClienteLocacao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputValorKm, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputDtLocacao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtLabelNome14, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLabelMarca10, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(49, 49, 49)))
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputIdAutomovelLocacao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputValorLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(inputKmLocacao)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLabelMarca12, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLabelNome15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLabelMarca11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 69, Short.MAX_VALUE))))
                    .addComponent(btnCadastrarLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputDtDevolucaoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLabelMarca14, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLabelMarca15, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputBonusLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelNome14)
                    .addComponent(txtLabelNome15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDtLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelMarca10)
                    .addComponent(txtLabelMarca11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputValorKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputKmLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelMarca12)
                    .addComponent(txtLabelMarca13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputIdAutomovelLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIdClienteLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLabelMarca14)
                    .addComponent(txtLabelMarca15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDtDevolucaoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputBonusLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarLocacao)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        automovelPanel1.addTab("+ Inserir nova locação", jPanel17);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(automovelPanel1)
                    .addGap(0, 0, 0)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(automovelPanel1)
                    .addGap(0, 0, 0)))
        );

        panelPrincipal.addTab("Locação", jPanel15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeClienteActionPerformed

    private void inputCnhClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCnhClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCnhClienteActionPerformed

    private void inputTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTelefoneClienteActionPerformed

    private void inputCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCPFClienteActionPerformed

    private void inputCEPEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCEPEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCEPEnderecoActionPerformed

    private void inputNumeroEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumeroEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumeroEnderecoActionPerformed

    private void inputClienteEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClienteEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputClienteEnderecoActionPerformed

    private void inputBairroEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBairroEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBairroEnderecoActionPerformed

    private void inputLogradouroEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLogradouroEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLogradouroEnderecoActionPerformed

    private void inputCidadeEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCidadeEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCidadeEnderecoActionPerformed

    private void inputPaisEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPaisEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPaisEnderecoActionPerformed

    //cadastra novo cliente
    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        ClienteController controller = null;
        String nome = inputNomeCliente.getText();
        String sobrenome = inputSobrenomeCliente.getText();
        String cpf = inputCPFCliente.getText();
        String cnh = inputCnhCliente.getText();
        String telefone = inputTelefoneCliente.getText();
        
        if(nome.length() < 1 || sobrenome.length() < 1 || cpf.length() < 1 || cnh.length() < 1 || telefone.length() < 1){
            Alerta.display("Preencha todos os campos!", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        }
        else {
            if(nome.length() > 32) {
                Alerta.display("Nome muito grande!", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            }
            else if(sobrenome.length() > 32) {
                Alerta.display("Sobrenome muito grande!", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            }
            else if(cpf.length() > 16) {
                Alerta.display("CPF muito grande!", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            }
            else if(cnh.length() > 20) {
                Alerta.display("CNH muito grande!", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            }
            else if(telefone.length() > 16) {
                Alerta.display("Telefone muito grande!", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    controller = new ClienteController(); 
                    Cliente cliente = new Cliente(nome, sobrenome, cpf, cnh, telefone);
                    if(controller.salvar(cliente)) {
                        Alerta.display("Cliente cadastrado com sucesso!", Alerta.tituloSucesso, JOptionPane.OK_OPTION);
                        inputNomeCliente.setText("");
                        inputSobrenomeCliente.setText("");
                        inputCPFCliente.setText("");
                        inputCnhCliente.setText("");
                        inputTelefoneCliente.setText("");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    Alerta.display("Ocorreu um erro ao tentar cadastrar o cliente.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    Alerta.display("Ocorreu um erro ao tentar cadastrar o cliente.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    //cadastra novo endereco
    private void btnCadastrarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEnderecoActionPerformed
        EnderecoController controller;
        try {
            if(inputIdClienteEndereco.getText().length() < 1) {
                Alerta.display("Informe o id do cliente para cadastrar um endereço.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            } 
            else {
                controller = new EnderecoController();
                String cep = inputCEPEndereco.getText();
                String logradouro = inputLogradouroEndereco.getText();
                String bairro = inputBairroEndereco.getText();
                String cidade = inputCidadeEndereco.getText();
                String pais = inputPaisEndereco.getText();
                int numero = 0;
                int idCliente = 0;
                try {
                    numero = Integer.parseInt(inputNumeroEndereco.getText());
                    idCliente = Integer.parseInt(inputIdClienteEndereco.getText());
                } catch(NumberFormatException ex){
                    Alerta.display("O campo número e idCliente só aceita valor numérico.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                }
                
                if(cidade.length() < 1) {
                    Alerta.display("Informe a cidade do endereço.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                } else if(bairro.length() < 1) {
                    Alerta.display("Informe o bairro do endereço.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                } else if(pais.length() < 1) {
                    Alerta.display("Informe o país do endereço.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                } else if(bairro.length() > 32) {
                    Alerta.display("Nome do bairro muito grande.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                } else if(cidade.length() > 32) {
                    Alerta.display("Nome da cidade muito grande.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                } else if(pais.length() > 32) {
                    Alerta.display("Nome do pais muito grande.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                } else if(idCliente != 0) {
                    Endereco endereco = new Endereco(cep, logradouro, numero, bairro, cidade, pais, idCliente);
                    if(controller.salvar(endereco)){
                        Alerta.display("Endereco cadastrado com sucesso!", Alerta.tituloSucesso, JOptionPane.OK_OPTION);
                        inputCEPEndereco.setText("");
                        inputLogradouroEndereco.setText("");
                        inputNumeroEndereco.setText("");
                        inputBairroEndereco.setText("");
                        inputCidadeEndereco.setText("");
                        inputPaisEndereco.setText("");
                        inputIdClienteEndereco.setText("");
                    } else {
                        Alerta.display("Ocorreu um erro ao tentar cadastrar o endereco.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                    }
                }           
            }
        } catch (ClassNotFoundException ex) {
            Alerta.display("Ocorreu um erro ao tentar cadastrar o endereco.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Alerta.display("Ocorreu um erro ao tentar cadastrar o endereco.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCadastrarEnderecoActionPerformed

    private void inputIdClienteEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdClienteEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdClienteEnderecoActionPerformed

    //cadastra modelo
    private void btnCadastrarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarModeloActionPerformed
        ModeloController controller;
        try {
            controller = new ModeloController();
            String descricao = inputDescricaoModelo.getText();
            int idMarca = Integer.parseInt(inputIdMarcaModelo.getText());
            Modelo modelo = new Modelo(descricao, idMarca);
            if(controller.salvar(modelo)){
                Alerta.display("Modelo cadastrado com sucesso!", Alerta.tituloSucesso, JOptionPane.OK_OPTION);
                inputDescricaoMarca.setText("");
                inputIdMarcaModelo.setText("");
            } else {
                Alerta.display("Ocorreu um erro ao tentar cadastrar o modelo.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            Alerta.display("Ocorreu um erro ao tentar cadastrar o modelo.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            Alerta.display("Ocorreu um erro ao tentar cadastrar o modelo.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCadastrarModeloActionPerformed

//GEN-FIRST:event_btnCadastrarMarcaActionPerformed
    private void btnCadastrarMarcaActionPerformed(java.awt.event.ActionEvent evt) {  
        MarcaController controller;
        try {
            controller = new MarcaController();
            String descricao = inputDescricaoMarca.getText();
            Marca marca = new Marca(descricao);
            if(controller.salvar(marca)){
                Alerta.display("Marca cadastrado com sucesso!", Alerta.tituloSucesso, JOptionPane.OK_OPTION);
                inputDescricaoMarca.setText("");
                inputIdMarcaModelo.setText("");
            } else {
                Alerta.display("Ocorreu um erro ao tentar cadastrar a marca.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            Alerta.display("Ocorreu um erro ao tentar cadastrar a marca.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            Alerta.display("Ocorreu um erro ao tentar cadastrar o modelo.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    
//GEN-LAST:event_btnCadastrarMarcaActionPerformed

    private void inputNomeMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeMarcaActionPerformed

    private void inputRenavamAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRenavamAutomovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRenavamAutomovelActionPerformed

    //cadastrar automóvel
    private void btnCadastrarAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAutomovelActionPerformed
        AutomovelController controller;
        String placa = inputPlacaAutomovel.getText();
        String renavam = inputRenavamAutomovel.getText();
        String chassi = inputChassiAutomovel.getText();
        float valorLocacao = Float.parseFloat(inputValorLocacaoAutomovel.getText());
        String cor = inputCorAutomovel1.getText();
        String tipoCombustivel = inputTipoCombustivelAutomovel.getText();
        int idModelo = Integer.parseInt(inputIdModeloAutomovel.getText());

        if(placa.length() < 1) {
            Alerta.display("Informe a placa do automóvel.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } else if(renavam.length() < 1) {
            Alerta.display("Informe o renavam do automóvel.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } else if(chassi.length() < 1) {
            Alerta.display("Informe o chassi do automóvel.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } else if(cor.length() < 1) {
            Alerta.display("Informe a cor do automóvel.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } else if(tipoCombustivel.length() < 1) {
            Alerta.display("Informe o tipo do combustível do automóvel.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } else if(tipoCombustivel.length() > 32) {
            Alerta.display("Tipo do combustível do automóvel muito grande.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } else if(placa.length() > 32) {
            Alerta.display("Placa do automóvel muito grande.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } else if(renavam.length() > 32) {
            Alerta.display("Renavam do automóvel muito grande.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } else if(chassi.length() > 32) {
            Alerta.display("Chassi do automóvel muito grande.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } else {
            Automovel automovel = new Automovel(placa, renavam, chassi, valorLocacao, cor, tipoCombustivel, idModelo);

            try {
                controller = new AutomovelController();
                if(controller.salvar(automovel)) {
                    Alerta.display("Automovel cadastrado com sucesso!", Alerta.tituloSucesso, JOptionPane.OK_OPTION);
                    inputPlacaAutomovel.setText("");
                    inputRenavamAutomovel.setText("");
                    inputChassiAutomovel.setText("");
                    inputValorLocacaoAutomovel.setText("");
                    inputCorAutomovel1.setText("");
                    inputTipoCombustivelAutomovel.setText("");
                    inputIdModeloAutomovel.setText("");
                } else {
                    Alerta.display("Ocorreu um erro ao tentar cadastrar o automóvel.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                Alerta.display("Ocorreu um erro ao tentar cadastrar o automóvel.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                Alerta.display("Ocorreu um erro ao tentar cadastrar o automóvel.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarAutomovelActionPerformed

    private void inputPlacaAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPlacaAutomovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPlacaAutomovelActionPerformed

    private void inputDtLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDtLocacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDtLocacaoActionPerformed

    //cadastra locacao
    private void btnCadastrarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLocacaoActionPerformed
        LocacaoController controller;
        try {
            controller = new LocacaoController();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                java.sql.Date dtLocacao = (java.sql.Date) sdf.parse(inputDtLocacao.getText());
                java.sql.Date dtDevolucao = (java.sql.Date) sdf.parse(inputDtDevolucaoLocacao.getText());
                Locacao locacao = new Locacao(dtLocacao,
                    dtDevolucao, Float.parseFloat(inputKmLocacao.getText()),
                    Float.parseFloat(inputValorLocacao.getText()), Float.parseFloat(inputValorKm.getText()), 
                    Float.parseFloat(inputBonusLocacao.getText()),
                    Integer.parseInt(inputIdClienteLocacao.getText()), Integer.parseInt(inputIdAutomovelLocacao.getText())
                );
            
                if(controller.salvar(locacao)) {
                    Alerta.display("Locação cadastrada com sucesso!", Alerta.tituloSucesso, JOptionPane.OK_OPTION);
                    inputKmLocacao.setText("");
                    inputValorLocacao.setText("");
                    inputValorKm.setText("");
                    inputBonusLocacao.setText("");
                    inputIdClienteLocacao.setText("");
                    inputIdAutomovelLocacao.setText("");
                } else {
                    Alerta.display("Ocorreu um erro ao tentar cadastrar a locação.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
                }
            } catch (ParseException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            Alerta.display("Ocorreu um erro ao tentar cadastrar a locação.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            Alerta.display("Ocorreu um erro ao tentar cadastrar a locação.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarLocacaoActionPerformed

    private void inputValorLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorLocacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorLocacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String placa = inputBuscaPorPlaca.getText();
        
        if(placa.length() < 1){
            Alerta.display("Informe a placa do veículo.", Alerta.tituloError, JOptionPane.ERROR_MESSAGE);
        } else {
            AutomovelController controller;
            try {
                controller = new AutomovelController();
                List automoveis = controller.consultar(placa);
                ArrayList<String> formatedAutomoveis = new ArrayList();
                
                automoveis.forEach(automovel -> {
                    formatedAutomoveis.add(automovel.toString());
                });
                
                Alerta.display(formatedAutomoveis, Alerta.tituloSucesso, JOptionPane.OK_OPTION);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane automovelPanel;
    private javax.swing.JTabbedPane automovelPanel1;
    private javax.swing.JButton btnCadastrarAutomovel;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCadastrarEndereco;
    private javax.swing.JButton btnCadastrarLocacao;
    private javax.swing.JButton btnCadastrarMarca;
    private javax.swing.JButton btnCadastrarModelo;
    private javax.swing.JPanel clientesPanel;
    private javax.swing.JPanel containerModelos2;
    private javax.swing.JTextField inputBairroEndereco;
    private javax.swing.JTextField inputBonusLocacao;
    private javax.swing.JTextField inputBuscaPorPlaca;
    private javax.swing.JTextField inputCEPEndereco;
    private javax.swing.JTextField inputCPFCliente;
    private javax.swing.JTextField inputChassiAutomovel;
    private javax.swing.JTextField inputCidadeEndereco;
    private javax.swing.JTextField inputClienteEndereco;
    private javax.swing.JTextField inputCnhCliente;
    private javax.swing.JTextField inputCorAutomovel1;
    private javax.swing.JTextField inputDescricaoMarca;
    private javax.swing.JTextField inputDescricaoModelo;
    private javax.swing.JTextField inputDtDevolucaoLocacao;
    private javax.swing.JTextField inputDtLocacao;
    private javax.swing.JTextField inputIdAutomovelLocacao;
    private javax.swing.JTextField inputIdClienteEndereco;
    private javax.swing.JTextField inputIdClienteLocacao;
    private javax.swing.JTextField inputIdMarcaModelo;
    private javax.swing.JTextField inputIdModeloAutomovel;
    private javax.swing.JTextField inputKmLocacao;
    private javax.swing.JTextField inputLogradouroEndereco;
    private javax.swing.JTextField inputNomeCliente;
    private javax.swing.JTextField inputNomeMarca;
    private javax.swing.JTextField inputNumeroEndereco;
    private javax.swing.JTextField inputPaisEndereco;
    private javax.swing.JTextField inputPlacaAutomovel;
    private javax.swing.JTextField inputRenavamAutomovel;
    private javax.swing.JTextField inputSobrenomeCliente;
    private javax.swing.JTextField inputTelefoneCliente;
    private javax.swing.JTextField inputTipoCombustivelAutomovel;
    private javax.swing.JTextField inputValorKm;
    private javax.swing.JTextField inputValorLocacao;
    private javax.swing.JTextField inputValorLocacaoAutomovel;
    private javax.swing.JTabbedPane inserirCliente;
    private javax.swing.JTabbedPane inserirMarca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel marcasPanel;
    private javax.swing.JTabbedPane modelosPanel;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JLabel txtLabelCnh;
    private javax.swing.JLabel txtLabelCpf;
    private javax.swing.JLabel txtLabelCpf1;
    private javax.swing.JLabel txtLabelMarca1;
    private javax.swing.JLabel txtLabelMarca10;
    private javax.swing.JLabel txtLabelMarca11;
    private javax.swing.JLabel txtLabelMarca12;
    private javax.swing.JLabel txtLabelMarca13;
    private javax.swing.JLabel txtLabelMarca14;
    private javax.swing.JLabel txtLabelMarca15;
    private javax.swing.JLabel txtLabelMarca2;
    private javax.swing.JLabel txtLabelMarca3;
    private javax.swing.JLabel txtLabelMarca4;
    private javax.swing.JLabel txtLabelMarca5;
    private javax.swing.JLabel txtLabelMarca6;
    private javax.swing.JLabel txtLabelMarca7;
    private javax.swing.JLabel txtLabelMarca8;
    private javax.swing.JLabel txtLabelMarca9;
    private javax.swing.JLabel txtLabelNome10;
    private javax.swing.JLabel txtLabelNome11;
    private javax.swing.JLabel txtLabelNome12;
    private javax.swing.JLabel txtLabelNome13;
    private javax.swing.JLabel txtLabelNome14;
    private javax.swing.JLabel txtLabelNome15;
    private javax.swing.JLabel txtLabelNome2;
    private javax.swing.JLabel txtLabelNome3;
    private javax.swing.JLabel txtLabelNome4;
    private javax.swing.JLabel txtLabelNome5;
    private javax.swing.JLabel txtLabelNome6;
    private javax.swing.JLabel txtLabelNome7;
    private javax.swing.JLabel txtLabelNome8;
    private javax.swing.JLabel txtLabelNome9;
    // End of variables declaration//GEN-END:variables

}
