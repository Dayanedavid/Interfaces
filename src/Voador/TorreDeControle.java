package Voador;

public class TorreDeControle {

    private Voador[] voadores = new Voador [10];

    public void voemTodos(){
        for(int i=0; i< voadores.length;i++){
            if(voadores[i]==null){
                break;
            } else{
                voadores[i].voar();
            }
        }
    }

    public void adicionarVoador(Voador umVoador){
        for(int i=0; i< voadores.length;i++){
            if(voadores[i] == null){
                voadores[i] =umVoador;
                break;
            }
        }
    }
}
