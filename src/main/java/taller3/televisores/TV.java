package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    public static int numTV = 0;

    // Constructor
    public TV(Marca marca, boolean es) {
        this.marca = marca;
        this.estado = es;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        TV.numTV++;
    }

    // Set&Get Marca
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }

    // Set&Get Canal
    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }

    public int getCanal() {
        return canal;
    }

    // Set&Get Precio
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    // Set&Get Estado
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }

    // Set&Get Volumen
    public void setVolumen(int volumen) {
        if (estado == true) {
            if (volumen >= 0 && volumen <= 7) {
                this.volumen = volumen;
            }
        }
    }

    public int getVolumen() {
        return volumen;
    }

    // Set&Get Control
    public void setControl(Control control) {
        this.control = control;
    }

    public Control getControl() {
        return control;
    }

    // Set&Get numTV
    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public static int getNumTV() {
        return numTV;
    }

    // metodo encender
    public void turnOn() {
        estado = true;
    }

    // metodo apagar
    public void turnOff() {
        estado = false;
    }

    // metodo canalDown
    public void canalDown() {
        if (canal >= 1 && canal <= 120) {
            canal -= 1;
        }
    }

    // metodo canalUp
    public void canalUp() {
        if (canal >= 1 && canal <= 120) {
            canal += 1;
        }
    }

    // metodo volumenUp
    public void volumenUp() {
        if (volumen >= 0 && volumen <= 7) {
            volumen += 1;
        }
    }

    // metodo volumenDown
    public void volumenDown() {
        if (volumen >= 0 && volumen <= 7) {
            volumen -= 1;
        }
    }
}
