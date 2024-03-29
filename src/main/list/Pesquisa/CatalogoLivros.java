package main.list.Pesquisa;

import main.list.OperacoesBasicas.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> catalogoDeLivros = new ArrayList<>();

    public CatalogoLivros() {
        this.catalogoDeLivros = catalogoDeLivros;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogoDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosDoAutor = new ArrayList<>();

        if(!catalogoDeLivros.isEmpty()){
            Iterator i = catalogoDeLivros.iterator();
            while (i.hasNext()) {
                Livro livroAutor = (Livro) i.next();
                if (livroAutor.getAutor().equalsIgnoreCase(autor)) {
                    livrosDoAutor.add(livroAutor);
                }
            }
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
        return livrosDoAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosPorAno = new ArrayList<>();

        if(!catalogoDeLivros.isEmpty()){
            for (Livro l : catalogoDeLivros) {
                if (l.getAnoDePublicação() >= anoInicial && l.getAnoDePublicação() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
            return livrosPorAno;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Livro pesquisarPorTitulo(String titulo){

        Livro livroPorTitulo = null;

        if(!catalogoDeLivros.isEmpty()){
            for (Livro l : catalogoDeLivros) {
                if (l.getTítulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }



    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }


}
