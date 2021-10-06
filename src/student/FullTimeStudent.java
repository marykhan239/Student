/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author marya
 */
public class FullTimeStudent extends Student {
    
    private int numOfSemesters;
    
    public int getNumOfSemesters(){
        
        return numOfSemesters;
    }
    
    public void setNumOfSemesters(int numOfSemesters){
        
        this.numOfSemesters=numOfSemesters;
    }
    
}
