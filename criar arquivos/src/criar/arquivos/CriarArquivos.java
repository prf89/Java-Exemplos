
package criar.arquivos;

import java.io.FileWriter;
import java.io.IOException;


public class CriarArquivos {


    public static void main(String[] args) {
        
        String dir = "D://Repositório GIT//Utilitários//exemplos-java//criar arquivos//src//criar//arquivos";
        String nomeArquivo = "//teste.txt";
        
        try{
            
            FileWriter escrever = new FileWriter(dir + nomeArquivo);
            
            escrever.write("Linha 1\n");
            escrever.write("Linha 2\n");
            escrever.write("Linha 3\n");
            escrever.write("Linha 4\n");
            
            escrever.close();
            
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
