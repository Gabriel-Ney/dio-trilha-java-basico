public class SmartTv {

    boolean tvLigada;
    int numeroCanal;
    int tvVolume = 0;


    public void mudarCanal(int novoCanal){
        numeroCanal = novoCanal;
    }
    public void aumentarCanal(){
        numeroCanal ++;
    }
    public void diminuirCanal(){
        numeroCanal --;
    }
    public void ligarTv(){
        tvLigada = true;
    }

    public void desligarTv(){
        tvLigada = false;
    }

    public void aumentarVolume(){
        tvVolume ++;
    }

    public void diminuirrVolume(){
        tvVolume --;
    }


    public void volumeMaximo(){
        for(tvVolume = 0; tvVolume <= 100; tvVolume++){

        }
    }

}
