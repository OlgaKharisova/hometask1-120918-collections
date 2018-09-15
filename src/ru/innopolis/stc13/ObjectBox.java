package ru.innopolis.stc13;

import java.util.TreeSet;

public class ObjectBox<T extends Object> {

    protected TreeSet<T> treeSet = new TreeSet<>();

    public void addObject(T element) {
        treeSet.add(element);
    }

    public boolean deleteObject(T element) {
        if (!(treeSet.remove(element))) {
            System.out.println("Объект не найден");
            return false;
        } else {
            return true;
        }
    }

    public void dump() {
        System.out.println(treeSet);
    }
}
