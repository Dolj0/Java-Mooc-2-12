
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Pipe<T> {
    ArrayList<T> tees;
    
    public Pipe(){
        this.tees = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        tees.add(value);
    }
    
    public T takeFromPipe(){
        T t = tees.get(0);
        tees.remove(tees.get(0));
        return t;
    }
    
    public boolean isInPipe(){
        if (tees.isEmpty()){
            return false;
        }
        return true;
    }
}
