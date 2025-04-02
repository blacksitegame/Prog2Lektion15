package opgave01.models;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack<E> implements StackEaaa<E>{
    ArrayList<E> list = new ArrayList<>();

    @Override
    public void push(E element) {
        list.addLast(element);
    }

    @Override
    public E pop() {
        try {
            E element = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return element;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public E peek() {
        try {
            return list.get(list.size() - 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public int size() {
        return list.size();
    }
}
