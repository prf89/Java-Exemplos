/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class conexao {
    
    private Connection conexao;
    
    
    /**
     * Método que conecta ao banco de dados e caso não exista cria um
     * 
     * @return true - a conexão foi realizada 
     */
    public boolean conectar() throws ClassNotFoundException
    {
        try
        {
            //comando para abrir a bilbioteca do SqLite
            Class.forName("org.sqlite.JDBC");
            //url de conexao
            String url = "jdbc:sqlite:D:/Repositório GIT/Utilitários/exemplos-java/Sqlite/src/db/teste.db";
            //conectar com o banco
            this.conexao = DriverManager.getConnection(url);
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
            return false; //caso não conecte retorna falso
        }
        System.out.println("Conectou com o banco!\n");
        return true;//caso conecte retorna verdadeiro
    }
    
    /**
     * Método para desconectar do banco de dados
     * 
     * @return true - caso desconecte 
     */
    public boolean desconectar()
    {
        try
        {
            if(this.conexao.isClosed() == false)//se não estiver fechado
                this.conexao.close();//então feche
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
            return false; //caso não desconecte retorna falso
        }
        
        System.out.println("Desconectou com o banco!\n");
        return true;//caso desconecte retorna verdadeiro
        
    }
    
}
