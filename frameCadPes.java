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

public class frameCadPes extends javax.swing.JFrame {
    private static frameCadPes frCadPes;
    Conexao conexao = Conexao.getInstance();
    
    public frameCadPes() {
        initComponents();
        
        
    }

    public static frameCadPes getFrameCadPes(){
        if(frCadPes == null){
            frCadPes = new frameCadPes();
        }
        return frCadPes;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCpf = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        ctEmail = new javax.swing.JTextField();
        ctSexo = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        ctIdade = new javax.swing.JTextField();
        btCadPes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btListarPes = new javax.swing.JButton();
        btAltPes = new javax.swing.JButton();
        btDelPes = new javax.swing.JButton();
        lblTabela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCpf.setText("CPF ");

        ctCpf.setMinimumSize(new java.awt.Dimension(65, 22));

        lblNome.setText("Nome:");

        ctNome.setMinimumSize(new java.awt.Dimension(65, 22));

        lblEmail.setText("Email:");

        lblSexo.setText("Sexo:");

        ctEmail.setMinimumSize(new java.awt.Dimension(65, 22));

        ctSexo.setMinimumSize(new java.awt.Dimension(65, 22));
        ctSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSexoActionPerformed(evt);
            }
        });

        lblIdade.setText("Idade:");

        ctIdade.setMinimumSize(new java.awt.Dimension(65, 22));

        btCadPes.setText("CADASTRAR");
        btCadPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadPesActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF", "NOME", "EMAIL", "SEXO", "IDADE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btListarPes.setText("LISTAR TABELA");
        btListarPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarPesActionPerformed(evt);
            }
        });

        btAltPes.setText("ALTERAR");
        btAltPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltPesActionPerformed(evt);
            }
        });

        btDelPes.setText("DELETAR POR CPF");
        btDelPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelPesActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSexo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ctEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblIdade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ctSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(btCadPes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAltPes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDelPes))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btListarPes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTabela)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf)
                    .addComponent(ctEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(ctIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(ctSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadPes)
                    .addComponent(btAltPes)
                    .addComponent(btDelPes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListarPes)
                    .addComponent(lblTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctSexoActionPerformed

    private void btCadPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadPesActionPerformed
        cadPes();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadPes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadPes.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btCadPesActionPerformed
    
    public void delPes(){
        try {            
            PreparedStatement st = null;
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("DELETE FROM pessoa WHERE cpf = ?",Statement.RETURN_GENERATED_KEYS);           
            st.setString(1,ctCpf.getText()); 
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE EXCLUIR UMA PESSOA SEM ANTES EXCLUIR OS DADOS EM OUTRA TABELA!","ERRO",1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    private void btListarPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarPesActionPerformed
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btListarPesActionPerformed

    private void btAltPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltPesActionPerformed
        altPes();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadPes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadPes.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btAltPesActionPerformed

    private void btDelPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelPesActionPerformed
        delPes();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadPes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadPes.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btDelPesActionPerformed
    
    public void altPes(){
        try {            
            PreparedStatement st = null;
            
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("UPDATE pessoa SET nome = ?, email = ?, sexo = ?, idade = ?  WHERE cpf = ?",Statement.RETURN_GENERATED_KEYS);
            st.setString(1,ctNome.getText());   
            st.setString(2,ctEmail.getText());
            st.setString(3,ctSexo.getText());
            st.setInt(4,Integer.parseInt(ctIdade.getText()));
            st.setString(5,ctCpf.getText());
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    public List<Pessoa> listarTable() throws ClinicaException, SQLException{
        List<Pessoa> pessoas = new ArrayList<>();
        PreparedStatement stmt = null;
        Connection con = conexao.getConnection(); 
        ResultSet rs = null;
        try {
            
            stmt = con.prepareStatement("SELECT * FROM pessoa");
            rs = stmt.executeQuery();
            while(rs.next()){
                Pessoa pessoa = new Pessoa();
                pessoa.setCpf(rs.getString("cpf"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setSexo(rs.getString("sexo"));
                pessoa.setIdade(rs.getInt("idade"));
                pessoas.add(pessoa);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
        
        return pessoas;
        
        
    }
   
    
    
    public void listarTabela() throws  SQLException, ClinicaException{
        DefaultTableModel estruturaTabela = (DefaultTableModel) jTable1.getModel();
        int posLin = 0;
        estruturaTabela.setRowCount(posLin);
        frameCadPes pes = new frameCadPes();
        for(Pessoa p: pes.listarTable()){
            estruturaTabela.insertRow(posLin, new Object [] {p.getCpf(),p.getNome(), p.getEmail(), p.getSexo(), p.getIdade()});
            posLin++;
        }
    }
    public void cadPes(){
        try {
            Connection con = conexao.getConnection();            
            PreparedStatement st = null;
            con.setAutoCommit(false);
            st = con.prepareStatement("INSERT INTO pessoa (cpf,nome,email,sexo,idade) VALUES (?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            st.setString(1,ctCpf.getText());           
            st.setString(2,ctNome.getText());
            st.setString(3,ctEmail.getText());
            st.setString(4,ctSexo.getText());
            
            st.setInt(5,Integer.parseInt(ctIdade.getText()));
            st.executeUpdate();
            con.commit();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltPes;
    private javax.swing.JButton btCadPes;
    private javax.swing.JButton btDelPes;
    private javax.swing.JButton btListarPes;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JTextField ctEmail;
    private javax.swing.JTextField ctIdade;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTabela;
    // End of variables declaration//GEN-END:variables
}
