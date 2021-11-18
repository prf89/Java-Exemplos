
package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class deletarDado {
    
    public void deletarDado(String coluna_1){
        
        String url = "jdbc:sqlite:D:/Repositório GIT/Utilitários/exemplos-java/Sqlite/src/db/teste.db";
        String sql = "Delete from teste WHERE coluna_1 = ?";
        
        try {
            Connection con = DriverManager.getConnection(url);
            PreparedStatement pstmt = con.prepareStatement(sql);
            
           pstmt.setString(1, coluna_1);
           
           pstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
