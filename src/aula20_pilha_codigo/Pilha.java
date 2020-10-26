package aula20_pilha_codigo;

public class Pilha {
    private ListaLigada lista;
    
    public Pilha(){
        this.lista = new ListaLigada();
    }
    
    public void adicionar(String novoValor){
        this.lista.adicionarComeco(novoValor);
    }
    
    public void remover(){
        this.lista.remover(this.get());
    }
    
    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
}
