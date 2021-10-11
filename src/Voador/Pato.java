package Voador;

public class Pato implements Voador{
    private int energia;

    public Pato(){
        this.energia = 100;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {
        setEnergia(getEnergia()-5);
        System.out.println("Estou voando como um pato");
        System.out.println("Energia atual: "+getEnergia());
    }
}
