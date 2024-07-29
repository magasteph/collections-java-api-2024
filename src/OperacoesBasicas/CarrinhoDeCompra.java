package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> itemList;

    public ListaItem(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item it : itemList){
            if(it.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(it);
            }
        }
        itemList.removeAll(itemParaRemover);
    }
    public void calcularValorTotal(int quantidade, double preco){
        double valorTotal = (quantidade * preco) ;
        System.out.println(valorTotal);
    }

    public void exibirItem(){
        

    }
}
