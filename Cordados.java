package reinoanimal;

public class Cordados {
    private String nome;
    private boolean colVertebral;
    private boolean terrestre;
    private boolean aquatico;
    private boolean aereo;
    
    
    public void Status(){
        System.out.println("O animal é um "+this.getNome());
        System.out.println(this.getNome()+" é do filos dos cordados");
        if(colVertebral){
            System.out.println(this.getNome()+" possue coluna vertebral");
        }
    }
    
    
    public void locomoção (){
        System.out.println("Está se movendo!!");
    }
    
    public void pele(){
        System.out.println("A pele dele é mais evoluida");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTerrestre() {
        return terrestre;
    }

    public void setTerrestre(boolean terrestre) {
        this.terrestre = terrestre;
    }

    public boolean isAquatico() {
        return aquatico;
    }

    public void setAquatico(boolean aquatico) {
        this.aquatico = aquatico;
    }

    public boolean isAereo() {
        return aereo;
    }

    public void setAereo(boolean aereo) {
        this.aereo = aereo;
    }

    public boolean isColVertebral() {
        return colVertebral;
    }

    public void setColVertebral(boolean colVertebral) {
        this.colVertebral = colVertebral;
    }
    
    
}
