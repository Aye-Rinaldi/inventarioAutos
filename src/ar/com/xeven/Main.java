package ar.com.xeven;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Auto> autos = new ArrayList<Auto>();

        autos.add(new Auto("Ford","Fiesta","2019",123341234));
        autos.add(new Auto("Peugeot","5088","2019",111947528));

        //muestro la lista
        System.out.println(autos);
    }
}
