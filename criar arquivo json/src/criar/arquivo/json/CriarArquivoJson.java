package criar.arquivo.json;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;


public class CriarArquivoJson {


    public static void main(String[] args) {
        FileWriter fw = null; //criar arquivo
        
        JSONObject jo = new JSONObject();
        
        //armazenar dados no objeto
        
        jo.put("nome", "Maria");
        jo.put("sobrenome", "Farias");
        jo.put("Cidade", "Curitiba");
        jo.put("UF", "Paraná");
        
        try {
            String arquivo_json = "D:\\Repositório GIT\\Utilitários\\exemplos-java\\criar arquivo json\\src\\criar\\arquivo\\json\\arquivo.json";
            fw = new FileWriter(arquivo_json);
            
            fw.write(jo.toJSONString());
            fw.close();
            
        } catch (IOException i) {
            System.err.println(i.getMessage());
        }
        
        System.out.println(jo);
    }
    
}
