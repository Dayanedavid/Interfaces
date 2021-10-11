package Voador;

public class SuperHomem implements Voador {
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    private int experiencia=0;

    @Override
    public void voar() {
        setExperiencia(getExperiencia()+5);
        System.out.println("Estou voando como um campeão");
        System.out.println("Experiencia atual: " + getExperiencia());

    }
}
