
package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class criarTabela {
    
    public void criarTabela(){
        
        String url = "jdbc:sqlite:D:/Repositório GIT/Utilitários/exemplos-java/Sqlite/src/db/teste.db";
        
        String ct = "CREATE TABLE IF NOT EXISTS teste (\n"
                    + "coluna_1 integer PRIMARY KEY, \n"//um campo de id para a pessoa física
                    + "coluna_2 text NOT NULL, \n"
                    + "coluna_3 text NOT NULL, \n"
                    + "coluna_4 text NOT NULL \n"
                    + ");";
        
        try{
            Connection con = DriverManager.getConnection(url);
            Statement stmt = con.createStatement();
            stmt.execute(ct);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
