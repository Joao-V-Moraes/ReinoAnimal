package reinoanimal;

public class Anfibios extends Cordados{

    @Override
    public void locomoção (){
        if(this.isTerrestre()){
            System.out.println("Ele anda!!");
        }else if(this.isAereo()){
            System.out.println("Ele voa!!");
        }else
            System.out.println("Ele nada!!");
    }
    
    public void pele(){
        System.out.println("A pele dele é meio viscosa");
        System.out.println("-------------------------------------------------");
    }
}        
    
