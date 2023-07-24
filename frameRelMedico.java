
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

    
public class frameRelMedico extends javax.swing.JFrame {
    private static frameRelMedico frameRelMedico;
    
    public frameRelMedico() {
        initComponents();
    }
    
    public static frameRelMedico getFrameRelMedico(){
        if(frameRelMedico == null){
            frameRelMedico = new frameRelMedico();
        }
        return frameRelMedico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAuditoria = new javax.swing.JTable();
        btListAuditoria = new javax.swing.JButton();
        btCpf = new javax.swing.JLabel();
        btNome = new javax.swing.JLabel();
        lblCrm = new javax.swing.JLabel();
        lblCrmEstado = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        cxCrm = new javax.swing.JTextField();
        cxCrmEstado = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        cxIdade = new javax.swing.JTextField();
        cxSexo = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        cxEmail = new javax.swing.JTextField();
        btCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblAuditoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "CRM", "CRM ESTADO", "NOME", "IDADE", "SEXO", "EMAIL"
            }
        ));
        jScrollPane1.setViewportView(tblAuditoria);

        btListAuditoria.setText("RELATÓRIO (VIEW)");
        btListAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListAuditoriaActionPerformed(evt);
            }
        });

        btCpf.setText("CPF:");

        btNome.setText("NOME:");

        lblCrm.setText("CRM:");

        lblCrmEstado.setText("CRM ESTADO:");

        lblIdade.setText("IDADE:");

        lblSexo.setText("SEXO:");

        lblEmail.setText("EMAIL:");

        btCad.setText("CADASTRAR");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btNome)
                            .addComponent(btCpf))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxNome, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(cxCpf))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(btCad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btListAuditoria))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCrm)
                                        .addGap(64, 64, 64)
                                        .addComponent(cxCrm))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCrmEstado)
                                        .addGap(18, 18, 18)
                                        .addComponent(cxCrmEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdade)
                                    .addComponent(lblSexo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(cxSexo))
                                .addGap(27, 27, 27)
                                .addComponent(lblEmail)
                                .addGap(18, 18, 18)
                                .addComponent(cxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(553, 553, 553))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCpf)
                    .addComponent(lblCrm)
                    .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdade)
                    .addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(cxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCrmEstado)
                    .addComponent(cxCrmEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo)
                    .addComponent(cxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListAuditoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btListAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListAuditoriaActionPerformed
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameRelMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameRelMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btListAuditoriaActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
       cadRelMeds();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameRelMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameRelMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCadActionPerformed

    public List<RelMedicos> listarTable() throws ClinicaException, SQLException{
        List<RelMedicos> rmedicos = new ArrayList<>();
        PreparedStatement stmt = null;
        Conexao conexao = Conexao.getInstance();
        Connection con = conexao.getConnection(); 
        ResultSet rs = null;
        try {
            
            stmt = con.prepareStatement("SELECT * FROM rel_medicos");
            rs = stmt.executeQuery();
            while(rs.next()){
                RelMedicos rmedico = new RelMedicos();
                rmedico.setCpf(rs.getString("cpf"));
                rmedico.setCrm(rs.getInt("crm"));
                rmedico.setCrmEstado(rs.getString("crmestado"));
                rmedico.setNome(rs.getString("nome"));
                rmedico.setEmail(rs.getString("email"));
                rmedico.setSexo(rs.getString("sexo"));
                rmedico.setIdade(rs.getInt("idade"));
                rmedicos.add(rmedico);

            }
        } catch (SQLException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rmedicos;
   
    }
    
    public void cadRelMeds(){
                 
        try {
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
        
            st = con.prepareStatement("INSERT INTO rel_medicos (cpf,crm,crmestado,nome,idade,email,sexo)\n" +
                    "             VALUES (?,?,?,?,?,?,?);",Statement.RETURN_GENERATED_KEYS);
        
            st.setString(1,cxCpf.getText());
            
            st.setInt(2,Integer.parseInt(cxCrm.getText()));
            st.setString(3,cxCrmEstado.getText());
            st.setString(4,cxNome.getText());
            st.setInt(5,Integer.parseInt(cxIdade.getText()));
            st.setString(6,cxEmail.getText());
            st.setString(7,cxSexo.getText());
            
            st.executeUpdate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
        
        
    }
    
    public void listarTabela() throws ClinicaException, SQLException{
        DefaultTableModel estruturaTabela = (DefaultTableModel) tblAuditoria.getModel();
        int posLin = 0;
        estruturaTabela.setRowCount(posLin);
        frameRelMedico fmed = new frameRelMedico();
        for(RelMedicos rm: fmed.listarTable()){
            estruturaTabela.insertRow(posLin, new Object [] {rm.getCpf(),rm.getCrm(), rm.getCrmEstado(), rm.getNome(), rm.getIdade(), rm.getSexo(), rm.getEmail()});
            posLin++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JLabel btCpf;
    private javax.swing.JButton btListAuditoria;
    private javax.swing.JLabel btNome;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxCrm;
    private javax.swing.JTextField cxCrmEstado;
    private javax.swing.JTextField cxEmail;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCrm;
    private javax.swing.JLabel lblCrmEstado;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTable tblAuditoria;
    // End of variables declaration//GEN-END:variables
}
