package com.company;
/**
 *
 * @author vansh
 */
public class DynamicArray {

    private int list[];
    private int count;
    public DynamicArray(int size){
        list = new int[size];

    }

    public void add(int item){
        if(count < list.length){
            list[count] = item;
            count++;
        }
        else{
            int newList[] = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newList[i]=list[i];
            }
            newList[count] = item;
            list = newList;
            count++;
        }
    }

    public void delete(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        else{
            for (int i = index; i < count; i++) {
                list[index] = list[index+1];
            }

        }
        count--;
    }

    public int search(int item){
        for (int i = 0; i < count; i++) {
            if(list[i] == item)
                return i;
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(list[i]);
        }
    }

}
