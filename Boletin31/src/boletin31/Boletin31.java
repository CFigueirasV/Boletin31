package boletin31;

import java.util.ArrayList;


public class Boletin31 {


    public static void main(String[] args) {
        // Usamos un ArrayList de tipo SeleccionFutbol para poder engadir todas as demás clases xa que extenden de esta
        ArrayList<SeleccionFutbol> lSelec = new ArrayList<>();

        Futbolista fut = new Futbolista(94, "delantero", 1, "Fran", "Collazo", 22);
        Entrenador ent = new Entrenador(124, 2, "Maria", "Vez", 35);
        Masajista mas = new Masajista("Master", 10, 3, "Oliver", "Perez", 45);
        
        lSelec.add(fut);
        lSelec.add(ent);
        lSelec.add(mas);

        for (SeleccionFutbol z : lSelec) {

            System.out.println(z);

        }
    }
    
}