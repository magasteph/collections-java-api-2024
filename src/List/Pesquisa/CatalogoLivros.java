package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;


public class CatalogoLivros {
    private List<Livro> livrosList;
    
    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao ){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
        
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livrosPorIntervaloAnos;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
        
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
            return livroPorTitulo;
        }else{
            throw new RuntimeException("A lista esta vazia! ");
        }
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("A selva","Jhonny",2002);
        catalogoLivros.adicionarLivro("Dona aranha", "Stephan",1989);
        catalogoLivros.adicionarLivro("Como perder um homem","Domick" ,1990 );
        System.out.println(catalogoLivros.pesquisarPorTitulo("Dona Aranha"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000,2010 ));
      }
}
