package sqlite;

public class Sqlite {


    public static void main(String[] args) throws ClassNotFoundException {
        //conectar e criar banco
        conexao cx = new conexao();
        cx.conectar();
        cx.desconectar();
        
        //criar tabela
        criarTabela ct = new criarTabela();
        ct.criarTabela();
        
        //Inserir dados
        inserirDados is = new inserirDados();
        is.inserirDados("teste 1", "teste 1", "teste 1");
        is.inserirDados("teste 2", "teste 2", "teste 2");
        is.inserirDados("teste 3", "teste 3", "teste 3");
        
        //Buscar dados
        buscarDados bd = new buscarDados();
        bd.buscarDados();
        
        //Atualizar dados
        atualizarDados ad = new atualizarDados();
        ad.atualizarDados("atualiza 2", "atualiza 3", "atualiza 4");
        
        //Buscar dados após atualizaçao
        bd.buscarDados();
        
        //deletar dado
        deletarDado dd = new deletarDado();
        dd.deletarDado("1");
    }
    
}
