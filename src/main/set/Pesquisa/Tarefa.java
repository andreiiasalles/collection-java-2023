package main.set.Pesquisa;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa)) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescrição(), tarefa.getDescrição());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescrição());
    }

    @Override
    public String toString() {
        return descrição + " [ " + concluida + " ]";
    }
}
