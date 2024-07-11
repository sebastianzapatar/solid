package SOLID;

public class Rectangulo implements IFigura {
    private int alto;
    private int ancho;

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public float area() {
        return alto * ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                '}'+ " Area: "+ area() ;
    }
}
