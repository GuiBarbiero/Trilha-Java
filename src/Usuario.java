public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        //CONTROLE DE USUARIO (CASO ELE ESTIVESSE MANIPULANDO O SISTEMA)
        //smartTv.desligar();
        //smartTv.aumentarVolume();
        //smartTv.mudarcanal(0);
    
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo Status  -> TV Ligada? " + smartTv.ligada);
    }
}
