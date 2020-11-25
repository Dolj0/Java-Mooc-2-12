/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;
    
    public List(){
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex=0;
    }
    
    public void add(Type value){
        this.values[this.firstFreeIndex]=value;
        this.firstFreeIndex++;
    }
    
    public void remove(Type value) {
    int indexOfValue = indexOfValue(value);
    if (indexOfValue < 0) {
        return; // not found
    }

    moveToTheLeft(indexOfValue);
    this.firstFreeIndex--;
    }
    
    
    private void moveToTheLeft(int fromIndex) {
    for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
        this.values[i] = this.values[i + 1];
    }
    }
    
    public boolean contains(Type value) {
    return indexOfValue(value) >= 0;
    }
    
    public int indexOfValue(Type value) {
    for (int i = 0; i < this.firstFreeIndex; i++) {
        if (this.values[i].equals(value)) {
            return i;
        }
    }

    return -1;
    }
    
    public int size() {
    return this.firstFreeIndex;
    }

}
