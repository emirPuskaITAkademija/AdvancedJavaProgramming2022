package org.example.one;

import java.util.Arrays;
import java.util.Iterator;

/**
 * <li>1. polja ..capacity, numbers</li>
 * <li>2. mora konstruktor</li>
 * <li>3. add(broj)</li>
 * <li>4. inner klase</li>
 *
 * DynamicArray dynamicArray = new DynamicArray();
 *
 * for(int number: dynamicArray){
 *
 * }ž
 * Moramo:
 * <li>1. implement Iterable<Integer></li>
 * <li>2. Iterator iterator()</li>
 *
 * <DZ>
 *     remove()-> sami uraditi
 * </DZ>
 */
public class DynamicArray implements Iterable<Integer>{
    private int capacity = 0;
    private int[] numbers = new int[capacity];

    public DynamicArray(){
        super();
    }

    public void add(int number){
        capacity++;
        numbers = Arrays.copyOf(numbers, capacity);
        numbers[capacity-1] = number;
    }


    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iterator = new IntegerIterator();
        return iterator;
    }


    private class IntegerIterator implements Iterator<Integer>{
        private int nextIndex = 0;
        @Override
        public boolean hasNext() {
            return (nextIndex<=capacity-1);
        }

        @Override
        public Integer next() {
            int number = numbers[nextIndex];
            nextIndex= nextIndex+2;
            return number;
        }
    }

}
