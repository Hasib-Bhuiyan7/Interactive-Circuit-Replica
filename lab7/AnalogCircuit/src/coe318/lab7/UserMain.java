/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author 
 */
public class UserMain implements CircuitInterface{
    String in = "";
    Scanner user = new Scanner(System.in);
    ArrayList<Object> Elements = new ArrayList<Object>();
    
    @Override
    public void run(){
        while(true){
            in = user.nextLine().trim();
            if(in.equalsIgnoreCase("end")){
                end();
                break;
            }
            else if(in.equalsIgnoreCase("spice")){
                spice();
            }
            else{
                String[] element = in.split(" ");
                if(element.length==4){
                    if(element[0].equalsIgnoreCase("v")){
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.nodeNum = Integer.parseInt(element[1]);
                        n2.nodeNum = Integer.parseInt(element[2]);
                        double voltage = Double.parseDouble(element[3]);
                        VoltSource s1 = new VoltSource(voltage, n1, n2);
                        Elements.add(s1);
                    }
                    else if(element[0].equalsIgnoreCase("r")){
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.nodeNum = Integer.parseInt(element[1]);
                        n2.nodeNum = Integer.parseInt(element[2]);
                        double resistance = Double.parseDouble(element[3]);
                        Resistor r1 = new Resistor(resistance, n1, n2);
                        Elements.add(r1);
                    }
                    /*else{
                         throw new IllegalArgumentException("Please enter either v(voltage) or r(resistance)");
                    }*/
                }
                else{
                    System.out.println("You are missing input values, please make sure to put: [Element Type], [Node 1], [Node 2], [Element magnitude]");
                }
            }
        }
    }
    
    @Override
    public void intro(){
        System.out.println("Enter the information of the element in the order of: [Element Type], [Node 1], [Node 2], [Element magnitude]");
    }
    
    @Override
    public void spice(){
        for(int i=0; i<Elements.size(); i++){
            System.out.println(Elements.get(i));
        }
    }
    
    @Override
    public void end(){
        System.out.println("All Done");
    }
    
    public static void main(String[] args){
        UserMain m = new UserMain();
        m.intro();
        m.run();
    }
}
