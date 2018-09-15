package ru.innopolis.stc13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class MathBox<T extends  Number> extends ObjectBox<T>{

    MathBox(T[] x) {
        for (int i = 0; i < x.length; i++) {
            treeSet.add(x[i]);
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }


    int summator() {
        Iterator<T> iterator = treeSet.iterator();
        int result = 0;
        for (; iterator.hasNext(); ) {
            result += iterator.next().doubleValue();
        }
        return result;
    }

    ArrayList<Double> splitter(int num) {
        Iterator<T> iterator = treeSet.iterator();
        ArrayList<Double> resultSet = new ArrayList<>();
        for (; iterator.hasNext(); ) {
            resultSet.add(iterator.next().doubleValue() / num);
        }
        return resultSet;
    }

    @Override
    public String toString() {
        return ("ru.innopolis.stc13.MathBox " + treeSet);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MathBox)) return false;
        MathBox other = ((MathBox) obj);
        return treeSet.equals(other.treeSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treeSet);
    }
/*
    TreeSet<T> removeIfExist(int x) {
        if (!(treeSet.remove(x))) System.out.println("Введеное число отсутствует");
        return treeSet;
    }*/

/*    public void show() {
        Iterator<T> iterator = treeSet.iterator();
        for (; iterator.hasNext(); ) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }*/
}
