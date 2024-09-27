/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author 
 */
public class Resistor {
    double resistance;
    int resistNum;
    private static int resistNum_count = 1;
    Node node1;
    Node node2;
    
    public Resistor(double resistance, Node node1, Node node2){
        if(resistance<0){
            throw new IllegalArgumentException("The Resistance has a Negative value, it is invalid");
        }
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("The Resistance is missing a node(null value for node), this reesistor is not connected to the circuit, it is invalid");
        }
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        resistNum = resistNum_count;
        resistNum_count++;
    }
    
    public Node[] getNodes(){
        Node[] resistNodes = {node1, node2};
        return resistNodes;
    }
    
    @Override
    public String toString(){
        return("R"+resistNum+" "+node1+" "+node2+" "+resistance);
    }
    
}
