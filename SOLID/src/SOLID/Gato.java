package SOLID;

public class Gato implements IFelinoCasero{

    @Override
    public void respirar() {
        System.out.println("Respirar como un gato");
    }

    @Override
    public void comer() {
        System.out.println("Comer como un gato");
    }

    @Override
    public void reproducirse() {
        System.out.println("Hya no que pereza (¬_¬ )");
    }

    @Override
    public void morir() {
        System.out.println("Tengo 7 vidas");
    }

    @Override
    public void cazar() {
        System.out.println("Soy un gato que me dan todo no joda");
    }

    @Override
    public void ronronear() {
        System.out.println("Soy tierno y ronroneo mucho");
    }
}
