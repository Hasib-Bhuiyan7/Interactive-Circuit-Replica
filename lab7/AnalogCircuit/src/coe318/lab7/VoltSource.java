/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author 
 */
public class VoltSource {
    double voltage;
    int sourceNum;
    private static int sourceNum_count = 1;
    Node node1;
    Node node2;
    
    public VoltSource(double voltage, Node node1, Node node2){
        if(node1 == null || node2 == null || node1==node2){
            throw new IllegalArgumentException("The Voltage is missing a node(null value for node), this voltage source is not connected to the circuit, it is invalid");
        }
        this.voltage = voltage;
        this.node1 = node1;
        this.node2 = node2;
        sourceNum = sourceNum_count;
        sourceNum_count++;
    }
    
    public Node[] getNodes(){
        Node[] voltNodes = {node1, node2};
        return voltNodes;
    }
    
    @Override
    public String toString(){
        if(node1.nodeNum > node2.nodeNum){
            return("V"+sourceNum+" "+node1+" "+node2+" DC "+voltage);
        }
        else{
            return("V"+sourceNum+" "+node1+" "+node2+" DC "+((voltage)*(-1)));
        }
    }
    
}
