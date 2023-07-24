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

public class frameCadCons extends javax.swing.JFrame {
    private Consulta consulta;
    private static frameCadCons frCadCons;
    
    public frameCadCons() {
        initComponents();
        
    }
    public static frameCadCons getFrameCadCons(){
        if(frCadCons == null){
            frCadCons = new frameCadCons();
        }
        return frCadCons;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCpfm = new javax.swing.JLabel();
        ctCpfm = new javax.swing.JTextField();
        ctCpfe = new javax.swing.JTextField();
        lblCpfe = new javax.swing.JLabel();
        ctCpfp = new javax.swing.JTextField();
        lblCpfp = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btCadEnf = new javax.swing.JButton();
        btDelCons = new javax.swing.JButton();
        lblTabela = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodasCons = new javax.swing.JTable();
        lblData = new javax.swing.JLabel();
        ctData = new javax.swing.JTextField();
        lblHorario = new javax.swing.JLabel();
        ctHorario = new javax.swing.JTextField();
        btAltCons = new javax.swing.JButton();
        lblCodCons = new javax.swing.JLabel();
        ctCodCons = new javax.swing.JTextField();
        btListCons = new javax.swing.JButton();
        btAuditoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCpfm.setText("CPF do Médico:");

        ctCpfm.setMinimumSize(new java.awt.Dimension(65, 22));

        ctCpfe.setMinimumSize(new java.awt.Dimension(65, 22));

        lblCpfe.setText("CPF do Enfermeiro:");

        ctCpfp.setMinimumSize(new java.awt.Dimension(65, 22));

        lblCpfp.setText("CPF do Paciente:");

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCadEnf.setText("CADASTRAR");
        btCadEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadEnfActionPerformed(evt);
            }
        });

        btDelCons.setText("DELETAR POR CPF(MEDICO)");
        btDelCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelConsActionPerformed(evt);
            }
        });

        lblTabela.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTabela.setText("TABELA COM TODAS AS CONSULTAS");

        tblTodasCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "COD", "CPF do Médico", "CPF do Enfermeiro", "CPF do Paciente", "DATA", "HORARIO"
            }
        ));
        jScrollPane1.setViewportView(tblTodasCons);

        lblData.setText("Data:");

        ctData.setMinimumSize(new java.awt.Dimension(65, 22));

        lblHorario.setText("Horario:");

        ctHorario.setMinimumSize(new java.awt.Dimension(65, 22));
        ctHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctHorarioActionPerformed(evt);
            }
        });

        btAltCons.setText("ALTERAR POR CPF");
        btAltCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltConsActionPerformed(evt);
            }
        });

        lblCodCons.setText("Codigo da Consulta: ");

        ctCodCons.setMinimumSize(new java.awt.Dimension(65, 22));

        btListCons.setText("LISTAR CONSULTAS");
        btListCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListConsActionPerformed(evt);
            }
        });

        btAuditoria.setText("AUDITORIA");
        btAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAuditoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btCadEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btDelCons)
                        .addGap(18, 18, 18)
                        .addComponent(btAltCons))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCpfm)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblData)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ctCpfm, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCpfe))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ctData, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHorario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ctCpfe, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCpfp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ctHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCodCons)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctCodCons, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctCpfp, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btListCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAuditoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTabela)
                        .addContainerGap(86, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCpfm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpfm)
                    .addComponent(ctCpfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpfe)
                    .addComponent(ctCpfp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpfp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHorario)
                    .addComponent(lblCodCons)
                    .addComponent(ctCodCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadEnf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLimpar)
                    .addComponent(btDelCons)
                    .addComponent(btAltCons))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTabela)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btListCons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadEnfActionPerformed
        cadCons();
        limpar();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btCadEnfActionPerformed
    
    public List<Consulta> listarTable() throws ClinicaException, SQLException{
        List<Consulta> consultas = new ArrayList<>();
        PreparedStatement stmt = null;
        Conexao conexao = Conexao.getInstance();
        Connection con = conexao.getConnection(); 
        ResultSet rs = null;
        try {
            
            stmt = con.prepareStatement("SELECT * FROM consulta");
            rs = stmt.executeQuery();
            while(rs.next()){
                Consulta consulta = new Consulta();
                consulta.setCodigocons(rs.getInt("codigocons"));
                consulta.setCpfm(rs.getString("cpfmedico"));
                consulta.setCpfe(rs.getString("cpfenfermeiro"));
                consulta.setCpfp(rs.getString("cpfpaciente"));
                consulta.setData(rs.getString("data"));
                consulta.setHorario(rs.getString("horario"));
                consultas.add(consulta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           
           
        }
        
        return consultas;
        
        
    }
    
    public void listarTabela() throws ClinicaException, SQLException{
        DefaultTableModel estruturaTabela = (DefaultTableModel) tblTodasCons.getModel();
        int posLin = 0;
        estruturaTabela.setRowCount(posLin);
        frameCadCons cons = new frameCadCons();
        for(Consulta c: cons.listarTable()){
            estruturaTabela.insertRow(posLin, new Object [] {c.getCodigocons(),c.getCpfm(), c.getCpfe(), c.getCpfp(), c.getData(), c.getHorario()});
            posLin++;
        }
        
        
    }
    private void btDelConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelConsActionPerformed
        delCons();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btDelConsActionPerformed
    
    private void ctHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctHorarioActionPerformed

    private void btAltConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltConsActionPerformed
       altCons();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btAltConsActionPerformed

    public void altCons(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("UPDATE consulta SET data = ?, horario = ?  WHERE codigocons = ? AND cpfmedico = ? AND cpfenfermeiro = ? AND cpfpaciente = ?",Statement.RETURN_GENERATED_KEYS);
            st.setString(1,ctData.getText());
            st.setString(2,ctHorario.getText());
            st.setInt(3,Integer.parseInt(ctCodCons.getText())); 
            st.setString(4,ctCpfm.getText());
            st.setString(5,ctCpfe.getText());
            st.setString(6,ctCpfp.getText());
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    private void btListConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListConsActionPerformed
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btListConsActionPerformed

    private void btAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAuditoriaActionPerformed
        frameTabAuditoria.getFrameTabAuditoria().setVisible(true);
    }//GEN-LAST:event_btAuditoriaActionPerformed
    
    public void delCons(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("DELETE FROM consulta WHERE cpfmedico = ?",Statement.RETURN_GENERATED_KEYS);           
            st.setString(1,ctCpfm.getText()); 
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    public void limpar(){
        ctCpfm.setText("");
        ctCpfe.setText("");
        ctCpfp.setText("");
        ctData.setText("");
        ctHorario.setText("");  
        ctCodCons.setText(""); 
    }
    
    public void cadCons(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("INSERT INTO consulta (codigocons,cpfmedico,cpfenfermeiro,cpfpaciente,horario,data) VALUES (?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            st.setInt(1,Integer.parseInt(ctCodCons.getText()));
            st.setString(2,ctCpfm.getText());
            st.setString(3,ctCpfe.getText());
            st.setString(4,ctCpfp.getText());
            st.setString(5,ctHorario.getText());
            st.setString(6,ctData.getText());
            st.executeUpdate();
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"DADOS INSERIDOS INCORRETAMENTE, INSIRA NOVAMENTE!","DADOS INCORRETOS",0);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltCons;
    private javax.swing.JButton btAuditoria;
    private javax.swing.JButton btCadEnf;
    private javax.swing.JButton btDelCons;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListCons;
    private javax.swing.JTextField ctCodCons;
    private javax.swing.JTextField ctCpfe;
    private javax.swing.JTextField ctCpfm;
    private javax.swing.JTextField ctCpfp;
    private javax.swing.JTextField ctData;
    private javax.swing.JTextField ctHorario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodCons;
    private javax.swing.JLabel lblCpfe;
    private javax.swing.JLabel lblCpfm;
    private javax.swing.JLabel lblCpfp;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblTabela;
    private javax.swing.JTable tblTodasCons;
    // End of variables declaration//GEN-END:variables
}
