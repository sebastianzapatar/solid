import SOLID.*;
public class Main {
    public static void main(String[] args) {
        Fila a=new FIFO();
        a.push(3);
        a.push(4);
        a.push(5);
        System.out.println(a.pop());
    }
}