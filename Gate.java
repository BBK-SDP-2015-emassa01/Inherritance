/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Gate {
    int a = 0;
    boolean lock = true;
    
    public void moveInwards(int a){
        this.a = a;
        
    }
    
    public String getLock(){
        String result = "Got Lock";
        return result;
    }

}
