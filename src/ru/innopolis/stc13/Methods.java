package ru.innopolis.stc13;

public class Methods {
    public static void main(String[] args) {
        MathBox<Number> mathBox1 = new MathBox<>(new Integer[] {5,4,8,56});
        mathBox1.dump();
        mathBox1.summator();
        System.out.println(mathBox1.summator());
        mathBox1.splitter(5);
        System.out.println(mathBox1.splitter(2));
        System.out.println(mathBox1.toString());

        MathBox mathBox2 = new MathBox<>(new Integer[] {5,4,8,7});
        System.out.println(mathBox1.equals(mathBox2));

        System.out.println(mathBox1.hashCode());
        System.out.println(mathBox1.deleteObject(4));
        mathBox1.deleteObject(4);

        ObjectBox<Integer> objectBox = new ObjectBox<>();
    }
}
