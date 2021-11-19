
package lerarquivojson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class LerArquivoJson {

 
    public static void main(String[] args) {
        
        JSONObject js;
        JSONParser p = new JSONParser();
        
        lerJson lj = new lerJson();
        
        try {
            js = (JSONObject) p.parse(new FileReader("D:\\Repositório GIT\\Utilitários\\exemplos-java\\lerArquivoJson\\src\\lerarquivojson\\arquivo.json"));
            lj.setNome((String) js.get("nome"));
            lj.setSobrenome((String) js.get("sobrenome"));
            lj.setCidade((String) js.get("cidade"));
            lj.setUf((String) js.get("UF"));
            
            System.out.println(lj.toString());
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
    
}
