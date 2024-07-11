package SOLID;

public class Circulo implements IFigura{
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    @Override
    public float area() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}'+" Area: "+ area();
    }
}
