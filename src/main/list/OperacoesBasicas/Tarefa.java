package main.list.OperacoesBasicas;

public class Tarefa {
    private String Descrição;

    public Tarefa(String descrição) {
        Descrição = descrição;
    }

    public String getDescrição() {
        return Descrição;
    }

    @Override
    public String toString() {
        return  Descrição + "\n";
    }
}
