public class User {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada?: " + SmartTv.onScreen);
        System.out.println("Canal Inicial?: " + smartTv.channel);
        System.out.println("Volume Inicial: " + smartTv.volume);

        smartTv.upTv();
        System.out.println("Novo Status -> TV Ligada?: " + SmartTv.onScreen);

        smartTv.downTv();
        System.out.println("Novo Status -> TV Ligada?: " + SmartTv.onScreen);

        smartTv.downVolume();
        smartTv.downVolume();
        smartTv.downVolume();
        smartTv.upVolume();

        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.turnChannel(13);
        System.out.println("Canal Atual: " + smartTv.channel);

        smartTv.turnUpChannel();
        smartTv.turnDownChannel();
        smartTv.turnDownChannel();
        System.out.println("Canal Atual: " + smartTv.channel);
    }
}
