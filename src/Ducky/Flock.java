package Ducky;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        Iterator iterator = quackers.iterator();
        if(iterator.hasNext()){
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
            quacker.quack();
            quacker.quack();
        }
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }
}