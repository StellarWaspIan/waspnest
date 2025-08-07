package j4va.sistemainmuebles;

abstract public class Inmueble {
    int id;
    String calle1;
    String calle2;
    int altura;
    double precio;
    int cantambientes;
    boolean patio;

    public Inmueble(int id, String calle1, String calle2, int altura, double precio, int cantambientes, boolean patio) {
        this.id = id;
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.altura = altura;
        this.precio = precio;
        this.cantambientes = cantambientes;
        this.patio = patio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantambientes() {
        return cantambientes;
    }

    public void setCantambientes(int cantambientes) {
        this.cantambientes = cantambientes;
    }
        
    public boolean getPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    abstract public String toString();
}
