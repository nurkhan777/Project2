package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Olimpiada {
    private int a = 0;
    public void run(ArrayList<Sprinter> sprinters) {
        for (int i = 0; i < sprinters.size(); i++) {
            if (sprinters.get(i).getAvgStats() > a) {
                a = sprinters.get(i).getAvgStats();
            }
        }
        for (int i = 0; i < sprinters.size(); i++) {
            if (sprinters.get(i).getAvgStats() == a) {
                System.out.println("Winner " + sprinters.get(i).getName() + "!");
                break;
            }
            else {
                System.out.println("Draw!");
            }
        }
    }
}
