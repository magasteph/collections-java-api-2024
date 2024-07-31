package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhosDeCompras {
    //atributo
    private List<Item> itemList;

    public CarrinhosDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        for(Item it:itemList){
            if(it.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(it);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public void calcularValorTotal(){

        double valorTotal = 0.0;
        for(Item it: itemList){
           valorTotal += it.getPreco() * it.getQuantidade(); 
        }
        System.out.println(valorTotal);
    }

    public void exibirItens(){
        if(itemList.isEmpty()){
            System.out.println("O carrinho esta vazio");
        }else{
            System.out.println("Itens no carrinho: ");
            for(Item it : itemList){
                System.out.println("Nome : " + it.getNome());
                System.out.println("Preco : " + it.getPreco());
                System.out.println("Quantidade : " + it.getQuantidade());
            }
        }
    }

    public static void main(String[] args) {
        CarrinhosDeCompras carrinhoDeCompras = new CarrinhosDeCompras();

        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.adicionarItem("Maça",2.99,3);
        carrinhoDeCompras.adicionarItem("Banana",5.0,10);
        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Banana");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();

    }
}
