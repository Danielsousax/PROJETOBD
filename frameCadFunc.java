import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frameCadFunc extends javax.swing.JFrame {
    private static frameCadFunc frCadFunc;
    
    public frameCadFunc() {
        initComponents();
        
    }

    public static frameCadFunc getFrameCadFunc(){
        if(frCadFunc == null){
            frCadFunc = new frameCadFunc();
        }
        return frCadFunc;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadFunc = new javax.swing.JButton();
        ctSalario = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        ctEspecializacao = new javax.swing.JTextField();
        lblEspecializacao = new javax.swing.JLabel();
        lblRegime = new javax.swing.JLabel();
        ctRegime = new javax.swing.JTextField();
        ctAval = new javax.swing.JTextField();
        lblAval = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodosFunc = new javax.swing.JTable();
        tblListarFunc = new javax.swing.JButton();
        btAltFunc = new javax.swing.JButton();
        btDelFunc = new javax.swing.JButton();
        lblTabela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btCadFunc.setText("CADASTRAR");
        btCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadFuncActionPerformed(evt);
            }
        });

        ctSalario.setMinimumSize(new java.awt.Dimension(65, 22));

        lblSalario.setText("Salario:");

        lblCpf.setText("CPF ");

        ctCpf.setMinimumSize(new java.awt.Dimension(65, 22));

        ctEspecializacao.setMinimumSize(new java.awt.Dimension(65, 22));

        lblEspecializacao.setText("Especialização:");

        lblRegime.setText("Regime:");

        ctRegime.setMinimumSize(new java.awt.Dimension(65, 22));
        ctRegime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctRegimeActionPerformed(evt);
            }
        });

        ctAval.setMinimumSize(new java.awt.Dimension(65, 22));

        lblAval.setText("Avaliação:");

        tblTodosFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "EMAIL", "SEXO", "IDADE", "SALARIO", "ESPECIALIZAÇÃO", "REGIME", "AVALIAÇÃO"
            }
        ));
        jScrollPane1.setViewportView(tblTodosFunc);

        tblListarFunc.setText("LISTAR FUNCIONÁRIOS");
        tblListarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblListarFuncActionPerformed(evt);
            }
        });

        btAltFunc.setText("ALTERAR");
        btAltFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltFuncActionPerformed(evt);
            }
        });

        btDelFunc.setText("DELETAR POR CPF");
        btDelFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelFuncActionPerformed(evt);
            }
        });

        lblTabela.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTabela.setText("TABELA COM TODOS OS PACIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSalario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEspecializacao)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRegime)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ctEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblAval)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctAval, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ctRegime, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(btCadFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAltFunc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDelFunc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tblListarFunc)
                                .addGap(186, 186, 186)
                                .addComponent(lblTabela)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf)
                    .addComponent(ctEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEspecializacao)
                    .addComponent(ctAval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalario)
                    .addComponent(ctRegime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadFunc)
                    .addComponent(btAltFunc)
                    .addComponent(btDelFunc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tblListarFunc)
                    .addComponent(lblTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadFuncActionPerformed
        cadFunc();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadFunc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadFunc.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btCadFuncActionPerformed

    private void ctRegimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctRegimeActionPerformed
        
    }//GEN-LAST:event_ctRegimeActionPerformed

    private void tblListarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblListarFuncActionPerformed
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadFunc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadFunc.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_tblListarFuncActionPerformed

    private void btAltFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltFuncActionPerformed
        altFunc();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadFunc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadFunc.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btAltFuncActionPerformed

    private void btDelFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelFuncActionPerformed
        delFunc();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadFunc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadFunc.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btDelFuncActionPerformed

    
    public List<Funcionario> listarTable() throws ClinicaException, SQLException{
        List<Funcionario> funcionarios = new ArrayList<>();
        PreparedStatement stmt = null;
        Conexao conexao = Conexao.getInstance();
        Connection con = conexao.getConnection(); ;
        ResultSet rs = null;
        try {
            
            stmt = con.prepareStatement("SELECT * FROM relatorio_funcionarios");
            rs = stmt.executeQuery();
            while(rs.next()){
                Funcionario funcionario = new Enfermeiro();
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setSal(rs.getInt("salario"));
                funcionario.setEspecializacao(rs.getBoolean("especializacao"));
                funcionario.setRegime(rs.getString("regime"));
                funcionario.setAvaliacao(rs.getFloat("avaliacao"));
                funcionario.setIdade(rs.getInt("idade"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionarios.add(funcionario);

            }
        } catch (SQLException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return funcionarios;
        
        
    }
   
    public void delFunc(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("DELETE FROM funcionario WHERE cpf = ?",Statement.RETURN_GENERATED_KEYS);           
            st.setString(1,ctCpf.getText()); 
            st.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE EXCLUIR UM FUNCIONÁRIO SEM ANTES EXCLUIR OS DADOS EM OUTRA TABELA!","ERRO",1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    public void listarTabela() throws ClinicaException, SQLException{
        DefaultTableModel estruturaTabela = (DefaultTableModel) tblTodosFunc.getModel();
        int posLin = 0;
        estruturaTabela.setRowCount(posLin);
        frameCadFunc func = new frameCadFunc();
        for(Funcionario f: func.listarTable()){
            estruturaTabela.insertRow(posLin, new Object [] {f.getCpf(),f.getNome(),f.getEmail(),f.getSexo(),f.getIdade(),f.getSal(), f.getEspecializacao(), f.getRegime(), f.getAvaliacao()});
            posLin++;
        }
    }

    public void cadFunc(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("INSERT INTO funcionario (cpf,salario,especializacao,regime,avaliacao) VALUES (?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            st.setString(1,ctCpf.getText());             
            st.setFloat(2,Float.parseFloat(ctSalario.getText()));
            st.setBoolean(3,Boolean.parseBoolean(ctEspecializacao.getText()));
            st.setString(4,ctRegime.getText());  
            st.setFloat(5,Float.parseFloat(ctAval.getText()));
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }

    public void altFunc(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("UPDATE funcionario SET salario = ?, especializacao = ?, regime = ?, avaliacao = ? WHERE cpf = ?",Statement.RETURN_GENERATED_KEYS);
            st.setFloat(1,Float.parseFloat(ctSalario.getText()));             
            st.setBoolean(2,Boolean.parseBoolean(ctEspecializacao.getText()));
            st.setString(3,ctRegime.getText());            
            st.setFloat(4,Float.parseFloat(ctAval.getText()));  
            st.setString(5,ctCpf.getText());   
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }

public void limpar(){
        ctCpf.setText("");
        ctSalario.setText("");
        ctEspecializacao.setText("");
        ctRegime.setText("");
        ctAval.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltFunc;
    private javax.swing.JButton btCadFunc;
    private javax.swing.JButton btDelFunc;
    private javax.swing.JTextField ctAval;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctEspecializacao;
    private javax.swing.JTextField ctRegime;
    private javax.swing.JTextField ctSalario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAval;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEspecializacao;
    private javax.swing.JLabel lblRegime;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTabela;
    private javax.swing.JButton tblListarFunc;
    private javax.swing.JTable tblTodosFunc;
    // End of variables declaration//GEN-END:variables
}
