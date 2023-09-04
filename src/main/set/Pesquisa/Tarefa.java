package main.set.Pesquisa;

public class Tarefa {
    private String descrição;
    private boolean concluida;


    public Tarefa(String descrição) {
        this.descrição = descrição;
    }

    public String getDescrição() {
        return descrição;
    }


    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return descrição + " [ " + concluida + " ]";
    }
}
