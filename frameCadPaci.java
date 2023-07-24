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

public class frameCadPaci extends javax.swing.JFrame {
    private Paciente paciente;
    private static frameCadPaci frCadPaci;
    
    private frameCadPaci() {
        initComponents();
        
    }
    public static frameCadPaci getFrameCadPaci(){
        if(frCadPaci == null){
            frCadPaci = new frameCadPaci();
        }
        return frCadPaci;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadPaci = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        ctEspecial = new javax.swing.JTextField();
        lblEspecial = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodosPaci = new javax.swing.JTable();
        btConsCpf = new javax.swing.JButton();
        lblTabela = new javax.swing.JLabel();
        btDelPaci = new javax.swing.JButton();
        btAltPaci = new javax.swing.JButton();
        btListarPaci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btCadPaci.setText("CADASTRAR");
        btCadPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadPaciActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lblEspecial.setText("Espec.:");

        ctCpf.setMinimumSize(new java.awt.Dimension(65, 22));

        lblCpf.setText("CPF:");

        tblTodosPaci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "NECESSIDADES ESPECIAIS", "NOME", "EMAIL", "SEXO", "IDADE"
            }
        ));
        jScrollPane1.setViewportView(tblTodosPaci);

        btConsCpf.setText("BUSCAR POR CPF");
        btConsCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsCpfActionPerformed(evt);
            }
        });

        lblTabela.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTabela.setText("TABELA COM TODOS OS PACIENTES");

        btDelPaci.setText("DELETAR POR CPF");
        btDelPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelPaciActionPerformed(evt);
            }
        });

        btAltPaci.setText("ALTERAR POR CPF");
        btAltPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltPaciActionPerformed(evt);
            }
        });

        btListarPaci.setText("LISTAR PACIENTES");
        btListarPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarPaciActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btListarPaci)
                                .addGap(85, 85, 85)
                                .addComponent(lblTabela))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(btDelPaci)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btCadPaci, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btConsCpf)
                                .addGap(18, 18, 18)
                                .addComponent(btAltPaci))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblCpf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblEspecial)
                                    .addGap(18, 18, 18)
                                    .addComponent(ctEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 112, Short.MAX_VALUE)))
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
                    .addComponent(lblEspecial)
                    .addComponent(ctEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btCadPaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btConsCpf)
                    .addComponent(btDelPaci)
                    .addComponent(btAltPaci))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTabela)
                    .addComponent(btListarPaci))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadPaciActionPerformed
        cadPacs();
        limpar();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadPaci.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadPaci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCadPaciActionPerformed
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConsCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsCpfActionPerformed
   
    }//GEN-LAST:event_btConsCpfActionPerformed

    private void btAltPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltPaciActionPerformed
        altPaci();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadPaci.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadPaci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAltPaciActionPerformed

    private void btDelPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelPaciActionPerformed
        delPaci();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadPaci.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadPaci.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpar();
    }//GEN-LAST:event_btDelPaciActionPerformed

    private void btListarPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarPaciActionPerformed
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadPaci.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadPaci.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btListarPaciActionPerformed
     
    public void altPaci(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("UPDATE paciente SET especial = ? WHERE cpfpaciente = ?",Statement.RETURN_GENERATED_KEYS);
            st.setBoolean(1,Boolean.parseBoolean(ctEspecial.getText()));
            st.setString(2,ctCpf.getText());             
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    public List<Paciente> listarTable() throws ClinicaException, SQLException{
        List<Paciente> pacientes = new ArrayList<>();
        PreparedStatement stmt = null;
        Conexao conexao = Conexao.getInstance();
        Connection con = conexao.getConnection(); 
        ResultSet rs = null;
        try {
            
            stmt = con.prepareStatement("SELECT * FROM relatorio_pacientes");
            rs = stmt.executeQuery();
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setCpf(rs.getString("cpf"));
                paciente.setEspecial(rs.getBoolean("especial"));
                paciente.setNome(rs.getString("nome"));
                paciente.setEmail(rs.getString("email"));
                paciente.setSexo(rs.getString("sexo"));
                paciente.setIdade(rs.getInt("idade"));
                pacientes.add(paciente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pacientes;
        
        
    }
   
    public void delPaci(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("DELETE FROM paciente WHERE cpfpaciente = ?",Statement.RETURN_GENERATED_KEYS);           
            st.setString(1,ctCpf.getText()); 
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE EXCLUIR UM PACIENTE SEM ANTES EXCLUIR OS DADOS EM OUTRA TABELA!","ERRO",1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    public void listarTabela() throws ClinicaException, SQLException{
        DefaultTableModel estruturaTabela = (DefaultTableModel) tblTodosPaci.getModel();
        int posLin = 0;
        estruturaTabela.setRowCount(posLin);
        frameCadPaci paci = new frameCadPaci();
        for(Paciente pa: paci.listarTable()){
            estruturaTabela.insertRow(posLin, new Object [] {pa.getCpf(),pa.getEspecial(),pa.getNome(),pa.getEmail(),pa.getSexo(),pa.getIdade()});
            posLin++;
        }
    }
    
 
    
public void limpar(){
        ctCpf.setText("");
        ctEspecial.setText("");
    }
    public void cadPacs(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            con.setAutoCommit(false);
            st = con.prepareStatement("INSERT INTO paciente (cpfpaciente,especial) VALUES (?,?)",Statement.RETURN_GENERATED_KEYS);
            st.setString(1,ctCpf.getText());
            st.setBoolean(2,Boolean.parseBoolean(ctEspecial.getText()));
            st.executeUpdate();
            con.commit();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NÃO EXISTE ESTE CPF NA TABELA PESSOA!","CPF INEXISTENTE",0);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltPaci;
    private javax.swing.JButton btCadPaci;
    private javax.swing.JButton btConsCpf;
    private javax.swing.JButton btDelPaci;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListarPaci;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctEspecial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEspecial;
    private javax.swing.JLabel lblTabela;
    private javax.swing.JTable tblTodosPaci;
    // End of variables declaration//GEN-END:variables
}
