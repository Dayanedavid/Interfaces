package Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa denis= new Pessoa("denis",2000);
        Pessoa dayane= new Pessoa("denis",2080);

        if(denis.equals(dayane)){
            System.out.println("Pessoas iguais");
        } else{
            System.out.println("Pessoas diferentes");
        }
    }
}
