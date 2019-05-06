package boletin31;

import java.util.ArrayList;


public class Boletin31 {


    public static void main(String[] args) {
        
        ArrayList<SeleccionFutbol> lSelec = new ArrayList<>();

        Futbolista fut = new Futbolista(94, "defensa", 1, "Carlos", "Benzema", 22);
        Entrenador ent = new Entrenador(124, 2, "Iago", "Aspas", 35);
        Masajista mas = new Masajista("Master", 10, 3, "Marta", "Lopez", 45);
        
        lSelec.add(fut);
        lSelec.add(ent);
        lSelec.add(mas);

        for (SeleccionFutbol z : lSelec) {

            System.out.println(z);

        }
    }
    
}