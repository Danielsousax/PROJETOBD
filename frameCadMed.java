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

public class frameCadMed extends javax.swing.JFrame {
    private Medico medico;
    private static frameCadMed frCadMed;
    private Consulta consulta;
   
    private frameCadMed() {
        initComponents();
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCpf = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        lblCrm = new javax.swing.JLabel();
        lblCrmEstado = new javax.swing.JLabel();
        ctCrm = new javax.swing.JTextField();
        ctCrmEstado = new javax.swing.JTextField();
        btCadMed = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btConsCpf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodosMed = new javax.swing.JTable();
        lblTabela = new javax.swing.JLabel();
        btAltMed = new javax.swing.JButton();
        btDelMed = new javax.swing.JButton();
        btListarTab = new javax.swing.JButton();
        btSalMed = new javax.swing.JButton();
        btRelMedico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Médico");

        lblCpf.setText("CPF:");

        ctCpf.setMinimumSize(new java.awt.Dimension(65, 22));

        lblCrm.setText("CRM:");

        lblCrmEstado.setText("Estado do CRM:");

        btCadMed.setText("CADASTRAR");
        btCadMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadMedActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btConsCpf.setText("BUSCAR POR CPF");
        btConsCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsCpfActionPerformed(evt);
            }
        });

        tblTodosMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "CRM", "CRM ESTADO", "NOME", "IDADE", "EMAIL", "SEXO"
            }
        ));
        jScrollPane1.setViewportView(tblTodosMed);

        lblTabela.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTabela.setText("TABELA COM TODOS OS MÉDICOS");

        btAltMed.setText("ALTERAR POR CPF");
        btAltMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltMedActionPerformed(evt);
            }
        });

        btDelMed.setText("DELETAR POR CPF");
        btDelMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelMedActionPerformed(evt);
            }
        });

        btListarTab.setText("LISTAR TABELA");
        btListarTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTabActionPerformed(evt);
            }
        });

        btSalMed.setText("SALÁRIO MÉDICO");
        btSalMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalMedActionPerformed(evt);
            }
        });

        btRelMedico.setText("RELATÓRIO MÉDICOS");
        btRelMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCrm)
                            .addComponent(lblCpf)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ctCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCrmEstado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctCrmEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btSalMed, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDelMed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCadMed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btConsCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAltMed))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btListarTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btRelMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(76, 76, 76)
                                .addComponent(lblTabela)))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCrm)
                    .addComponent(ctCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCrmEstado)
                    .addComponent(ctCrmEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btCadMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btConsCpf)
                    .addComponent(btAltMed)
                    .addComponent(btDelMed)
                    .addComponent(btSalMed))
                .addGap(18, 18, 18)
                .addComponent(btRelMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTabela)
                    .addComponent(btListarTab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static frameCadMed getFrameCadMed(){
        if(frCadMed == null){
            frCadMed = new frameCadMed();
        }
        return frCadMed;
    }
    
    private void btCadMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadMedActionPerformed
        cadMeds();
        limpar();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadMed.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadMed.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
       
    }//GEN-LAST:event_btCadMedActionPerformed
    
    public void salMed(){
        try {            
            ResultSet rs = null;
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("SELECT salario FROM medico,funcionario WHERE medico.cpfmedico = funcionario.cpf AND medico.cpfmedico = ?",Statement.RETURN_GENERATED_KEYS);
            st.setString(1,ctCpf.getText());
            rs = st.executeQuery();
            while(rs.next()){
                JOptionPane.showMessageDialog(null,"Salário: " + rs.getFloat("salario"),"SALÁRIO DO MÉDICO",1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Medico> listarTable() throws ClinicaException, SQLException{
        List<Medico> medicos = new ArrayList<>();
        PreparedStatement stmt = null;
        Conexao conexao = Conexao.getInstance();
        Connection con = conexao.getConnection(); 
        ResultSet rs = null;
        try {
            
            stmt = con.prepareStatement("SELECT * FROM relatorio_medicos");
            rs = stmt.executeQuery();
            while(rs.next()){
                Medico medico = new Medico();
                medico.setCpf(rs.getString("cpf"));
                medico.setCrm(rs.getInt("crm"));
                medico.setCrmEstado(rs.getString("crmestado"));
                medico.setNome(rs.getString("nome"));
                medico.setEmail(rs.getString("email"));
                medico.setSexo(rs.getString("sexo"));
                medico.setIdade(rs.getInt("idade"));
                medicos.add(medico);

            }
        } catch (SQLException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return medicos;
        
        
    }
   
    public void altMed(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("UPDATE medico SET crm = ?, crmestado = ?  WHERE cpfmedico = ?",Statement.RETURN_GENERATED_KEYS);
            st.setInt(1,Integer.parseInt(ctCrm.getText()));
            st.setString(2,ctCrmEstado.getText());            
            st.setString(3,ctCpf.getText()); 
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    public void delMed(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("DELETE FROM medico WHERE cpfmedico = ?",Statement.RETURN_GENERATED_KEYS);           
            st.setString(1,ctCpf.getText()); 
            st.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"PARA EXCLUIR UM MÉDICO, EXCLUA, ANTES, SEUS DADOS DAS CONSULTA!","VALOR INVÁLIDO",1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    public void listarTabela() throws ClinicaException, SQLException{
        DefaultTableModel estruturaTabela = (DefaultTableModel) tblTodosMed.getModel();
        int posLin = 0;
        estruturaTabela.setRowCount(posLin);
        frameCadMed med = new frameCadMed();
        for(Medico m: med.listarTable()){
            estruturaTabela.insertRow(posLin, new Object [] {m.getCpf(),m.getCrm(), m.getCrmEstado(), m.getNome(), m.getIdade(), m.getEmail(), m.getSexo()});
            posLin++;
        }
    }
    
    public void cadMeds(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("INSERT INTO medico (cpfmedico,crm,crmestado) VALUES (?,?,?)",Statement.RETURN_GENERATED_KEYS);
            st.setString(1,ctCpf.getText());
            st.setInt(2,Integer.parseInt(ctCrm.getText()));
            st.setString(3,ctCrmEstado.getText());
            st.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NÃO EXISTE ESTE CPF NA TABELA FUNCIONÁRIOS!","CPF INEXISTENTE",0);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    
  
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConsCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsCpfActionPerformed
       
    }//GEN-LAST:event_btConsCpfActionPerformed

    private void btAltMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltMedActionPerformed
        altMed();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadMed.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadMed.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btAltMedActionPerformed

    private void btDelMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelMedActionPerformed
        delMed();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadMed.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadMed.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
        limpar();
    }//GEN-LAST:event_btDelMedActionPerformed

    private void btListarTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTabActionPerformed
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadMed.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadMed.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btListarTabActionPerformed

    private void btSalMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalMedActionPerformed
        salMed();
    }//GEN-LAST:event_btSalMedActionPerformed

    private void btRelMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelMedicoActionPerformed
        frameRelMedico.getFrameRelMedico().setVisible(true);
    }//GEN-LAST:event_btRelMedicoActionPerformed
    
    public void limpar(){
        ctCpf.setText("");
        ctCrm.setText("");
        ctCrmEstado.setText("");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltMed;
    private javax.swing.JButton btCadMed;
    private javax.swing.JButton btConsCpf;
    private javax.swing.JButton btDelMed;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListarTab;
    private javax.swing.JButton btRelMedico;
    private javax.swing.JButton btSalMed;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctCrm;
    private javax.swing.JTextField ctCrmEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCrm;
    private javax.swing.JLabel lblCrmEstado;
    private javax.swing.JLabel lblTabela;
    private javax.swing.JTable tblTodosMed;
    // End of variables declaration//GEN-END:variables
}
