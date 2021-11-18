package lerarquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class LerArquivo {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("D:\\Repositório GIT\\Utilitários\\exemplos-java\\lerArquivo\\src\\lerarquivo\\teste.txt");
            BufferedReader lerArquivo = new BufferedReader(fr);
            String linha = lerArquivo.readLine();
            while (linha != null) {
                System.out.printf("%s \n", linha);
                linha = lerArquivo.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}