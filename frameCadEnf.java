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

public class frameCadEnf extends javax.swing.JFrame {
    private Enfermeiro enfermeiro;
    private static frameCadEnf frCadEnf;
    /**
     * Creates new form frameCadEnf
     */
    private frameCadEnf() {
        initComponents();
        
        
        
    }
    public static frameCadEnf getFrameCadEnf(){
        if(frCadEnf == null){
            frCadEnf = new frameCadEnf();
        }
        return frCadEnf;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadEnf = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        ctCoren = new javax.swing.JTextField();
        lblCoren = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        ctCpf = new javax.swing.JTextField();
        lblCorenEstado = new javax.swing.JLabel();
        ctCorenEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodosEnf = new javax.swing.JTable();
        btConsCpf = new javax.swing.JButton();
        lblTabela = new javax.swing.JLabel();
        btDelEnf = new javax.swing.JButton();
        btAltEnf = new javax.swing.JButton();
        btListarEnf = new javax.swing.JButton();
        btSalEnf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btCadEnf.setText("CADASTRAR");
        btCadEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadEnfActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        ctCoren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCorenActionPerformed(evt);
            }
        });

        lblCoren.setText("COREN:");

        lblCpf.setText("CPF:");

        ctCpf.setMinimumSize(new java.awt.Dimension(65, 22));

        lblCorenEstado.setText("Estado do COREN:");

        tblTodosEnf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "COREN", "COREN ESTADO", "NOME", "EMAIL", "SEXO", "IDADE"
            }
        ));
        jScrollPane1.setViewportView(tblTodosEnf);

        btConsCpf.setText("BUSCAR POR CPF");
        btConsCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsCpfActionPerformed(evt);
            }
        });

        lblTabela.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTabela.setText("TABELA COM TODOS OS ENFERMEIROS");

        btDelEnf.setText("DELETAR POR CPF");
        btDelEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelEnfActionPerformed(evt);
            }
        });

        btAltEnf.setText("ALTERAR POR CPF");
        btAltEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltEnfActionPerformed(evt);
            }
        });

        btListarEnf.setText("LISTAR ENFERMEIROS");
        btListarEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarEnfActionPerformed(evt);
            }
        });

        btSalEnf.setText("SALÁRIO ENFERMEIRO");
        btSalEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalEnfActionPerformed(evt);
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
                            .addComponent(lblCpf)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctCoren, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCoren)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCorenEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctCorenEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btListarEnf)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTabela)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btSalEnf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btDelEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btLimpar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btCadEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btConsCpf)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAltEnf)))
                        .addGap(0, 59, Short.MAX_VALUE)))
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
                    .addComponent(ctCoren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoren))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorenEstado)
                    .addComponent(ctCorenEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadEnf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLimpar)
                    .addComponent(btConsCpf)
                    .addComponent(btDelEnf)
                    .addComponent(btAltEnf)
                    .addComponent(btSalEnf))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTabela)
                    .addComponent(btListarEnf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadEnfActionPerformed
        cadEnf();
        limpar();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadEnf.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadEnf.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btCadEnfActionPerformed
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void ctCorenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCorenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCorenActionPerformed

    private void btConsCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsCpfActionPerformed
        
    }//GEN-LAST:event_btConsCpfActionPerformed

    private void btAltEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltEnfActionPerformed
        altEnf();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadEnf.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadEnf.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btAltEnfActionPerformed

    private void btDelEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelEnfActionPerformed
        delEnf();
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadEnf.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadEnf.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btDelEnfActionPerformed

    private void btListarEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarEnfActionPerformed
        try {
            listarTabela();
        } catch (ClinicaException ex) {
            Logger.getLogger(frameCadEnf.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frameCadEnf.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }//GEN-LAST:event_btListarEnfActionPerformed

    private void btSalEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalEnfActionPerformed
        salEnf();
    }//GEN-LAST:event_btSalEnfActionPerformed
    
       
    public void altEnf(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("UPDATE enfermeiro SET coren = ?, corenestado = ?  WHERE cpfenfermeiro = ?",Statement.RETURN_GENERATED_KEYS);
            st.setInt(1,Integer.parseInt(ctCoren.getText()));
            st.setString(2,ctCorenEstado.getText());            
            st.setString(3,ctCpf.getText()); 
            st.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"HOUVE ALGUM ERRO!","ERRO",1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    
     public List<Enfermeiro> listarTable() throws ClinicaException, SQLException{
        List<Enfermeiro> enfermeiros = new ArrayList<>();
        PreparedStatement stmt = null;
        Conexao conexao = Conexao.getInstance();
        Connection con = conexao.getConnection(); 
        ResultSet rs = null;
        try {
            
            stmt = con.prepareStatement("SELECT * FROM relatorio_enfermeiros");
            rs = stmt.executeQuery();
            while(rs.next()){
                Enfermeiro enfermeiro = new Enfermeiro();
                enfermeiro.setCpf(rs.getString("cpf"));
                enfermeiro.setCoren(rs.getInt("coren"));
                enfermeiro.setCorenEstado(rs.getString("coren"));
                enfermeiro.setNome(rs.getString("nome"));
                enfermeiro.setEmail(rs.getString("email"));
                enfermeiro.setSexo(rs.getString("sexo"));
                enfermeiro.setIdade(rs.getInt("idade"));
                enfermeiros.add(enfermeiro);

            }
        } catch (SQLException ex) {
            Logger.getLogger(frameCadCons.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return enfermeiros;
        
        
    }
   
    public void listarTabela() throws ClinicaException, SQLException{
        DefaultTableModel estruturaTabela = (DefaultTableModel) tblTodosEnf.getModel();
        int posLin = 0;
        estruturaTabela.setRowCount(posLin);
        frameCadEnf enf = new frameCadEnf();
        for(Enfermeiro e: enf.listarTable()){
            estruturaTabela.insertRow(posLin, new Object [] {e.getCpf(),e.getCoren(), e.getCorenEstado(), e.getNome(), e.getEmail(), e.getSexo(), e.getIdade()});
            posLin++;
        }
    }
    
    public void delEnf(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("DELETE FROM enfermeiro WHERE cpfenfermeiro = ?",Statement.RETURN_GENERATED_KEYS);           
            st.setString(1,ctCpf.getText()); 
            st.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"PARA EXCLUIR UM ENFERMEIRO, EXCLUA, ANTES, SEUS DADOS DAS CONSULTA!","VALOR INVÁLIDO",1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    public void limpar(){
        ctCpf.setText("");
        ctCoren.setText("");
        ctCorenEstado.setText("");
    }
    public void cadEnf(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("INSERT INTO enfermeiro (cpfenfermeiro,coren,corenestado) VALUES (?,?,?)",Statement.RETURN_GENERATED_KEYS);
            st.setString(1,ctCpf.getText());
            st.setInt(2,Integer.parseInt(ctCoren.getText()));
            st.setString(3,ctCorenEstado.getText());
            st.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NÃO EXISTE ESTE CPF NA TABELA FUNCIONÁRIOS!","CPF INEXISTENTE",0);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
    public void salEnf(){
        try {            
            ResultSet rs = null;
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("SELECT salario FROM enfermeiro,funcionario WHERE enfermeiro.cpfenfermeiro = funcionario.cpf AND enfermeiro.cpfenfermeiro = ?",Statement.RETURN_GENERATED_KEYS);
            st.setString(1,ctCpf.getText());
            rs = st.executeQuery();
            while(rs.next()){
                JOptionPane.showMessageDialog(null,"Salário: " + rs.getFloat("salario"),"SALÁRIO DO ENFERMEIRO",1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltEnf;
    private javax.swing.JButton btCadEnf;
    private javax.swing.JButton btConsCpf;
    private javax.swing.JButton btDelEnf;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListarEnf;
    private javax.swing.JButton btSalEnf;
    private javax.swing.JTextField ctCoren;
    private javax.swing.JTextField ctCorenEstado;
    private javax.swing.JTextField ctCpf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCoren;
    private javax.swing.JLabel lblCorenEstado;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblTabela;
    private javax.swing.JTable tblTodosEnf;
    // End of variables declaration//GEN-END:variables
}
