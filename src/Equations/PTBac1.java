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
public class PTBac1 {
    private float a;
    private float b;
    
    public PTBac1(){
        this.a = 0;
        this.b = 0;
    }

    public PTBac1(float b, float a) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    
    public float[] solve(){
        float result = 0;
        float[] values = null;
        if(b == 0){
            if(a == 0){
                System.out.println("PT co Vo So Nghiem");
            }else {
                System.out.println("PT Vo Nghiem");
            }
        }else {
            values = new float[1];
            System.out.println("Nghiem cua PT la: "+(float)(-a)/b);
            values[0] = (float)(-a)/b;
            
        }
        return values;
    }
    @Override
    public String toString(){
        return "day la PT bac 1";
    }
}
