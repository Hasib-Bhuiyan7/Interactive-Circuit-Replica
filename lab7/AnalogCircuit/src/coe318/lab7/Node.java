/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author
 */
public class Node {
    public int nodeNum;
    public static int nodeNum_count = 0;
    
    public Node(){
        this.nodeNum = nodeNum_count;
        nodeNum_count++;
    }
    
    @Override
    public String toString(){
        return(nodeNum + "");
    }
    
}
