public class SmartTv {
   static boolean onScreen =  false;
   int channel = 1;
   int volume = 25;

   public void upTv(){
      onScreen=true;
   }
   public void downTv(){
      onScreen=false;
   }

   public void upVolume(){
      volume++;
      System.out.println("Aumentando o volume para: " + volume);
   }
   public void downVolume(){
      volume--;
      System.out.println("Diminuindo o volume para: " + volume);
   }
   public void turnUpChannel(){
      channel++;
      System.out.println("Mudando para o canal: " + channel);
   }
   public void turnDownChannel(){
      channel--;
      System.out.println("Mudando para o canal: " + channel);
   }
   public void turnChannel(int newChannel){
      channel = newChannel;
      System.out.println("Mudando para o canal: " + channel);
   }
}
