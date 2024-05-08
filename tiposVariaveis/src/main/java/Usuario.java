public class Usuario {

    public static void main (String[] args){
        SmartTv smartTv = new SmartTv();

        //Print do estado inicial:
        System.out.println("Tá ligada? : " + smartTv.tvLigada);
        System.out.println("Volume da tv : " + smartTv.tvVolume);
        System.out.println("Numero do canal: " + smartTv.numeroCanal);

        //Métodos
        smartTv.ligarTv();
        System.out.println("Tá ligada? : " + smartTv.tvLigada);

        smartTv.aumentarVolume();
        System.out.println("aumentando o volume para : " + smartTv.tvVolume);


        smartTv.mudarCanal(20);
        System.out.println("Escolheu o canal: " + smartTv.numeroCanal);
    }
}
