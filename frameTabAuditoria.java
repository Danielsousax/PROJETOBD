import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class frameTabAuditoria extends javax.swing.JFrame {
    private Consulta consulta;
    private static frameTabAuditoria frTabAud;
    
    
    public frameTabAuditoria() {
        initComponents();
           
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRelatorioMed = new javax.swing.JTable();
        btRelMed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblRelatorioMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "CPF DO MEDICO", "CPF DO PACIENTE", "CPF DO ENFERMEIRO", "HORARIO", "DATA", "DATA EXCLUSÃO", "USUÁRIO"
            }
        ));
        jScrollPane1.setViewportView(tblRelatorioMed);

        btRelMed.setText("RELATÓRIO AUDITORIA");
        btRelMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btRelMed)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(btRelMed, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRelMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelMedActionPerformed
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameTabAuditoria.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameTabAuditoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRelMedActionPerformed

    public static frameTabAuditoria getFrameTabAuditoria(){
        if(frTabAud == null){
            frTabAud = new frameTabAuditoria();
        }
        return frTabAud;
    }
    
    
    public List<AuditoriaConsulta> listarTable() throws ClinicaException, SQLException{
        List<AuditoriaConsulta> auditorias = new ArrayList<>();
        PreparedStatement stmt = null;
        Conexao conexao = Conexao.getInstance();
        Connection con = conexao.getConnection(); 
        ResultSet rs = null;
        try {
            
            stmt = con.prepareStatement("SELECT * FROM consultaBackup");
            rs = stmt.executeQuery();
            while(rs.next()){
                AuditoriaConsulta auditoria = new AuditoriaConsulta();
                auditoria.setCodigocons(rs.getInt("codigocons"));
                auditoria.setCpfm(rs.getString("cpfmedico"));
                auditoria.setCpfe(rs.getString("cpfenfermeiro"));
                auditoria.setCpfp(rs.getString("cpfpaciente"));
                auditoria.setData(rs.getString("data"));
                auditoria.setHorario(rs.getString("horario"));
                auditoria.setData_exc(rs.getString("data_exc"));
                auditoria.setUsuario(rs.getString("usuario"));
                auditorias.add(auditoria);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        }
        return auditorias;
                
    }
    
    public void listarTabela() throws ClinicaException, SQLException{
        DefaultTableModel estruturaTabela = (DefaultTableModel) tblRelatorioMed.getModel();
        int posLin = 0;
        estruturaTabela.setRowCount(posLin);
        frameTabAuditoria au = new frameTabAuditoria();
        for(AuditoriaConsulta audi: au.listarTable()){
            estruturaTabela.insertRow(posLin, new Object [] {audi.getCodigocons(),audi.getCpfm(), audi.getCpfe(), audi.getCpfp(), audi.getData(), audi.getHorario(),audi.getData_exc(), audi.getUsuario()});
            posLin++;
        }
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRelMed;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRelatorioMed;
    // End of variables declaration//GEN-END:variables
}
