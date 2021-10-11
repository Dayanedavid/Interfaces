package Voador;

public class Aviao implements Voador{
    private int horas = 0;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public void voar() {
        setHoras(getHoras()+13);
        System.out.println("Estou voando como um avião");
        System.out.println("Horas atual: "+horas);
    }
}
