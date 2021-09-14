package reinoanimal;

public class Mamiferos extends Cordados{

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
        System.out.println("A pele dele possuem pelos bem pequenos");
        System.out.println("-------------------------------------------------");
    }
}
