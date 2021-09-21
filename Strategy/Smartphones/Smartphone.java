package Strategy.Smartphones;


public abstract class Smartphone {

    Especificacoes e;

    public void informacoesDoCelular(){
        e.informacoes();
    }

    public void setEspecificacoes(Especificacoes E){
        this.e = E;
    }
}
