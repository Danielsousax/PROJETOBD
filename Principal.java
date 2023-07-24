import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    Conexao conexao = Conexao.getInstance();
    public Principal() throws SQLException {
        initComponents();
        Connection con = conexao.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadMedico = new javax.swing.JButton();
        lbMenuPac = new javax.swing.JLabel();
        lbMenuFunc = new javax.swing.JLabel();
        btCadEnfermeiro = new javax.swing.JButton();
        btCadConsulta = new javax.swing.JButton();
        btCadPaciente = new javax.swing.JButton();
        btCadFunc = new javax.swing.JButton();
        menuBarra = new javax.swing.JMenuBar();
        btMenuMenu = new javax.swing.JMenu();
        btMenuCadPes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica");

        btCadMedico.setText("MENU MÉDICO");
        btCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadMedicoActionPerformed(evt);
            }
        });

        lbMenuPac.setText("=== PACIENTES ===");

        lbMenuFunc.setText("=== FUNCIONARIOS ===");

        btCadEnfermeiro.setText("MENU ENFERMEIRO");
        btCadEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadEnfermeiroActionPerformed(evt);
            }
        });

        btCadConsulta.setText("MENU CONSULTA");
        btCadConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadConsultaActionPerformed(evt);
            }
        });

        btCadPaciente.setText("MENU PACIENTE");
        btCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadPacienteActionPerformed(evt);
            }
        });

        btCadFunc.setText("MENU FUNCIONÁRIO");
        btCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadFuncActionPerformed(evt);
            }
        });

        btMenuMenu.setText("Menu");

        btMenuCadPes.setText("MENU PESSOA");
        btMenuCadPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuCadPesActionPerformed(evt);
            }
        });
        btMenuMenu.add(btMenuCadPes);

        menuBarra.add(btMenuMenu);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadPaciente)
                    .addComponent(lbMenuPac, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbMenuFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadEnfermeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMenuFunc)
                    .addComponent(lbMenuPac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadFunc)
                    .addComponent(btCadPaciente))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadEnfermeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadMedico)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btCadConsulta)
                        .addGap(0, 150, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadMedicoActionPerformed
         frameCadMed.getFrameCadMed().setVisible(true);
    }//GEN-LAST:event_btCadMedicoActionPerformed

    private void btCadEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadEnfermeiroActionPerformed
        frameCadEnf.getFrameCadEnf().setVisible(true);
    }//GEN-LAST:event_btCadEnfermeiroActionPerformed

    private void btCadConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadConsultaActionPerformed
        frameCadCons.getFrameCadCons().setVisible(true);
    }//GEN-LAST:event_btCadConsultaActionPerformed

    private void btCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadPacienteActionPerformed
        frameCadPaci.getFrameCadPaci().setVisible(true);
    }//GEN-LAST:event_btCadPacienteActionPerformed

    private void btMenuCadPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuCadPesActionPerformed
        frameCadPes.getFrameCadPes().setVisible(true);
    }//GEN-LAST:event_btMenuCadPesActionPerformed

    private void btCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadFuncActionPerformed
        frameCadFunc.getFrameCadFunc().setVisible(true);
    }//GEN-LAST:event_btCadFuncActionPerformed
       
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });               
    }
    
    
    
    public static void consultaPes(Statement stm){
        
        String query = "SELECT * FROM pessoa";
        try {
            ResultSet result = stm.executeQuery(query);
            while(result.next()){
                JOptionPane.showMessageDialog(null,"CPF: " + result.getString("cpf") + "NOME: " + result.getString("nome") + "EMAIL: " + result.getString("email") + "SEXO: " + result.getString("sexo") + "IDADE: " + result.getInt("idade"),"DADOS CONSULTA",1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"HOUVE ALGUM ERRO COM A CONSULTA, TENTE NOVAMENTE","Consulta",1);
        }
    }
    
    public static void insereDados(Statement stm) throws SQLException{
        String query = "INSERT INTO pessoa VALUES ('13264975824','Josefino','josefino@gmail.com','M',58)";
        
        stm.executeUpdate(query);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadConsulta;
    private javax.swing.JButton btCadEnfermeiro;
    private javax.swing.JButton btCadFunc;
    private javax.swing.JButton btCadMedico;
    private javax.swing.JButton btCadPaciente;
    private javax.swing.JMenuItem btMenuCadPes;
    private javax.swing.JMenu btMenuMenu;
    private javax.swing.JLabel lbMenuFunc;
    private javax.swing.JLabel lbMenuPac;
    private javax.swing.JMenuBar menuBarra;
    // End of variables declaration//GEN-END:variables
}
