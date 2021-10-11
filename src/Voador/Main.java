package Voador;

public class Main {
    public static void main(String[] args) {
        Pato pato1= new Pato();
        Aviao aviao1 = new Aviao();
        SuperHomem superman1 = new SuperHomem();
        TorreDeControle torreDeControle = new TorreDeControle();

        torreDeControle.adicionarVoador(pato1);
        torreDeControle.adicionarVoador(aviao1);
        torreDeControle.adicionarVoador(superman1);

        torreDeControle.voemTodos();
        torreDeControle.voemTodos();
        torreDeControle.voemTodos();

    }
}
