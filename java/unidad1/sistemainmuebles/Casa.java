package java.unidad1.sistemainmuebles;

public class Casa extends Inmueble {

    boolean garaje;
    
    
    public Casa(int id, String calle1, String calle2, int altura, double precio, int cantambientes, boolean patio, boolean garaje) {
        super(id, calle1, calle2, altura, precio, cantambientes, patio);
        this.garaje=garaje;
    }

    @Override
    public String toString() {
        
        return "Messi";
    }
    
}
