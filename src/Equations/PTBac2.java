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
public class PTBac2 extends PTBac1{
    private float c;

    public PTBac2(){
        super();
        this.c = 0;
    }
    public PTBac2(float c, float b, float a){
        super(b,a);
        this.c = c;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    @Override
    public float[] solve(){
        float[] values = null;
        if(c == 0){
            values = super.solve();
        }else {
            
            //////////////////////
            float x1, x2;
            float a = super.getA();
            float b = super.getB();
            float delta;
            delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println("PT vo nghiem!(co nghiem phuc)");
                float sqDelta = (float)Math.sqrt(-delta)/(2*this.c);
                System.out.println("nghiem cua PT:");
                System.out.println("x1 = "+(-b/(2*this.c))+" + "+sqDelta+"i");
                System.out.println("x1 = "+(-b/(2*this.c))+" - "+sqDelta+"i");
                
            }else if(delta == 0){
                values = new float[1];
                x1 = -(b/(2*this.c));
                values[0] = x1;
                System.out.println("PT co nghiem kep: "+x1);
            }else {
                values = new float[2];
                x1 = (float)(-b + Math.sqrt(delta))/(2*this.c);
                x2 = (float)(-b - Math.sqrt(delta))/(2*this.c);
                values[0] = x1;
                values[1] = x2;
                System.out.println("PT co 2 nghiem: ");
                System.out.println("x1 = "+x1);
                System.out.println("x1 = "+x2);
            }
            //////////////////////
            
            
        }
        return values;
    }
    
}
