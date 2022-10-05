package hu.petrik.sokszogoop;

import java.util.ArrayList;
import java.util.Random;

public class Sokszogek {
    private static ArrayList<Sokszog> lista = new ArrayList<>();

    public Sokszogek(){
        Random rnd = new Random();
        Random r = new Random();
        int rnumber = rnd.nextInt(4)+1;
        int listrandom = rnd.nextInt(10)+1;

        for (int i = 0; i < listrandom; i++) {
            if(rnumber == 1){
                lista.add(new Teglalap());
            }
            else if(rnumber == 2){
                lista.add(new Pentagon());
            }
            else if(rnumber == 3){
                lista.add(new Paralelogramma());
            }
            else{
                lista.add(new Haromszog());
            }
        }


    }
    public double osszTerulet(){
        double terulet = 0;
        for (int i = 0; i < lista.size(); i++) {

        }
        return terulet;
    }
}
