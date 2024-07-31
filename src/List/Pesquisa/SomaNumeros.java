package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    // atributo
    
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public int calcularSoma(){
        int somaNumeros = 0;
        for(Integer numero : numeroList)
                somaNumeros += numero;
        return somaNumeros;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeroList.isEmpty()){
            for(Integer numero : numeroList){
                if(numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeroList.isEmpty()){
            for(Integer numero : numeroList){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
        return menorNumero;
        }else{
            throw new RuntimeException("A lista esta vazia" );
        }
    }

    public void exibirNumeros(){
        if(!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        }else{
            System.out.println("Lista Vazia");
        }
        
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(100);
        somaNumeros.adicionarNumero(120);
        System.out.println("Numeros adicionados: ");
        somaNumeros.exibirNumeros();
        System.out.println("Soma dos numeros: " + somaNumeros.calcularSoma());
        System.out.println("Maior numero: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());
    }
}
