package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class buscarDados {
    
    public void buscarDados(){
        
        String url = "jdbc:sqlite:D:/Repositório GIT/Utilitários/exemplos-java/Sqlite/src/db/teste.db";
        String sql = "SELECT * FROM teste";
        
        try{
            Connection con = DriverManager.getConnection(url);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                System.out.println(rs.getString("coluna_1") + " " 
                        + rs.getString("coluna_2") + " " 
                        + rs.getString("coluna_3") + " " 
                        + rs.getString("coluna_4"));
            }
            
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    
}
    
}
