package java.unidad1.sistemainmuebles;

public class Departamento extends Inmueble{

    boolean balcon;
    int piso;
    
    public Departamento(int id, String calle1, String calle2, int altura, double precio, int cantambientes, boolean patio, boolean balcon, int piso) {
        super(id, calle1, calle2, altura, precio, cantambientes, patio);
        this.balcon=balcon;
        this.piso=piso;
    }

    @Override
    public String toString() {
        return "algo";
    }
    
}
