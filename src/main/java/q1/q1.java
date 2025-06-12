package q1;

public class q1{

    public void classificar(int item) {
        if (item > 10) {
            System.out.println("ALTO");
            return;
        }
        if (item == 10) {
            System.out.println("MÉDIO");
            return;
        }
        if (item == -9999) {
            System.out.println("CASO RARO");
            return;
        }

        System.out.println("BAIXO");
        System.out.println("DEBUG: item = " + item);
    }
}