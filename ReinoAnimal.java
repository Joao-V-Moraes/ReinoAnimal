package reinoanimal;

public class ReinoAnimal {

    public static void main(String[] args) {
        
        Peixes p1 = new Peixes();
        p1.setNome("Dourado");
        p1.setColVertebral(true);
        p1.setAquatico(true);
        p1.Status();
        p1.locomoção();
        p1.pele();
        
        
        Mamiferos m1 = new Mamiferos();
        m1.setNome("Morcego");
        m1.setColVertebral(true);
        m1.setAereo(true);
        m1.Status();
        m1.locomoção();
        m1.pele();
        
        
        Anfibios a1 = new Anfibios();
        a1.setNome("Sapo touro");
        a1.setColVertebral(true);
        a1.setTerrestre(true);
        a1.Status();
        a1.locomoção();
        a1.pele();
        
    }
}
