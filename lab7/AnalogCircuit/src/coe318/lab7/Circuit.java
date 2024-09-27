/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.ArrayList;
/**
 *
 * @author 
 */
public class Circuit {
    ArrayList<Resistor> circuitResist;
    private static Circuit instance = null; 
    public static Circuit getInstance() {
        if (instance == null){
            instance = new Circuit();
        }
        return instance;
    }
    private Circuit() {
        circuitResist = new ArrayList<Resistor>();
    } //Yes, the constructor is PRIVATE!
    
    public void add(Resistor r){
        circuitResist.add(r);
    }
    
    @Override
    public String toString(){
        String circuitOutput = " ";
        for(int i=0; i<circuitResist.size(); i++){
            circuitOutput+=circuitResist.get(i).toString()+"\n";
        }
        return circuitOutput;
    }
    
}

