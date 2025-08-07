package j4va.sistemainmuebles;

public class Departamento extends Inmueble{

    boolean balcon;
    int piso;
    
    public Departamento(int id, String calle1, String calle2, int altura, double precio, int cantambientes, boolean patio, boolean balcon, int piso) {
        super(id, calle1, calle2, altura, precio, cantambientes, patio);
        this.balcon=balcon;
        this.piso=piso;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "algo";
    }
    
}
