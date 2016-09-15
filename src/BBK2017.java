import java.util.ArrayList;
import java.util.List;

public class BBK2017 {

    public static void main (String[] args){

        List<coche> cochesList = new ArrayList<>();

        coche jaguar = new coche ("2323JDM","Jaguar","F-Type",28000.00,"azul");
        coche audi = new coche ("8674GLK","audi","A-4", 18000.00,"blanco");
        coche mercedes = new coche ("9723HTK","mercedes","Class R",38000.00,"negro");

        cochesList.add(jaguar);
        cochesList.add(audi);
        cochesList.add(mercedes);

        System.out.println("Muestro el jaguar: "+cochesList.get(0));

    }
}