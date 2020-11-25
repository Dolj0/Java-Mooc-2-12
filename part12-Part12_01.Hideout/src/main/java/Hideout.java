/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Hideout<T> {
    private T t; 
    
    public Hideout(){
        this.t = null;
    }
    public void putIntoHideout(T toHide){
        this.t = toHide;
    }
    
    public T takeFromHideout(){
        if (!(this.t == null)){
            T re = this.t;
            this.t = null;
            return re;
        } else {
            return null;
        }
    }
    
    public boolean isInHideout(){
        if (this.t == null){
            return false;
        } else {
            return true;
        }
    }
    
    
}
