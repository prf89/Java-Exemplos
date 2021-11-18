package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class atualizarDados {
    
    public void atualizarDados(String coluna_2, String coluna_3, String coluna_4){
        
        String url = "jdbc:sqlite:D:/Repositório GIT/Utilitários/exemplos-java/Sqlite/src/db/teste.db";
        
        String sql = "UPDATE teste SET coluna_2 = ?, coluna_3 = ?, coluna_4 = ?";
        
        try{
            Connection con = DriverManager.getConnection(url);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, coluna_2);
            stmt.setString(2, coluna_3);
            stmt.setString(3, coluna_4);
            
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
    }
    
}
