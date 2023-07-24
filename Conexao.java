import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {
    private static Conexao instance;
    private static Connection con = null;
    
    private Conexao() {
        // Construtor privado
    }
    
    public static Conexao getInstance() {
        if (instance == null) {
            instance = new Conexao();
        }
        return instance;
    }
    
    public Connection getConnection() throws SQLException {
        
        if(con == null){
        String user = "";
        String pass = "";        
        user = JOptionPane.showInputDialog(null,"Digite o usuário: ","LOGIN",0);
        pass = JOptionPane.showInputDialog(null,"Digite a senha: ","LOGIN",0);

        while(user == null && pass == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
        
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TRABALHO",user,pass);
        }
        
        return con;
    }
}

