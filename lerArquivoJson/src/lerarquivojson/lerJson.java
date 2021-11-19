
package lerarquivojson;


public class lerJson {
    
    private String nome;
    private String sobrenome;
    private String cidade;
    private String uf;
    
    @Override
    public String toString(){
        return "Pessoa {" + "nome = " + nome + ", sobrenome = " + sobrenome + ", cidade = " + cidade + ",UF = " + uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
    
    
}
