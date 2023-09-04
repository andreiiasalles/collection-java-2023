package main.set.OperacoesBassicas;


public class Convidado {

    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }


    @Override
    public String toString() {
        return "{" +
                "" + nome + '\'' +
                ", " + codigoConvite +
                '}';
    }


}
