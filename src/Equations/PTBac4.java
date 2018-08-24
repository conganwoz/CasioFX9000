/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equations;

/**
 *
 * @author Anlu
 */
public class PTBac4 extends PTBac3{
    public PTBac4(){
        super();
    }
    
    public PTBac4(float e, float d, float c, float b , float a){
        super(d/e, c/e, b/e, a/e);
    }

    @Override
    public float[] solve() {
        System.out.println("-----------stupid things go on-------------");
        float[] values = null;
        PTBac3 p3 = new PTBac3(1, -super.getC(), (super.getD()*super.getB()-4*super.getA()), (float) (-Math.pow(super.getB(), 2)-Math.pow(super.getD(), 2)*super.getA()+4*super.getA()*super.getC()));
        for(float y: p3.solve()){
            float a = (float) Math.sqrt(y + super.getD()*super.getD()/4 - super.getC());
            float b = ((super.getD()*y)/2 - super.getB())/(2*a);
            PTBac2 p21 = new PTBac2(1, super.getD()/2 - a, y/2-b);
            for(float item : p21.solve()){
                System.out.printf("nghiem *********** x: %.2f\n",item);
            }
            PTBac2 p22 = new PTBac2(1, super.getD()/2+a, y/2+b);
            for(float item : p22.solve()){
                System.out.printf("nghiem *********** x: %.2f\n",item);
            }
        }
        System.out.println("-------------------you did it boi!----------------");
        return values;
    }
    
    
    
}
