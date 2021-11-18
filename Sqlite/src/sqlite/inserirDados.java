
package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class inserirDados {
    
    public void inserirDados(String coluna_2, String coluna_3, String coluna_4 ){
        
        String url = "jdbc:sqlite:D:/Repositório GIT/Utilitários/exemplos-java/Sqlite/src/db/teste.db";
        
        String sql = "INSERT INTO teste(coluna_2,coluna_3,coluna_4) VALUES (?,?,?)";
        
        try{
            Connection con = DriverManager.getConnection(url);
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, coluna_2);
            pstmt.setString(2, coluna_3);
            pstmt.setString(3, coluna_4);
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
