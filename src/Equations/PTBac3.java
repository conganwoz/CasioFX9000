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
public class PTBac3 extends PTBac2{
    private float d;
    public PTBac3(){
        super();
        this.d = 0;
    }
    
    public PTBac3(float d, float c, float b, float a){
        super(c, b, a);
        this.d = d;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }
    // return array of values it found
    @Override
    public float[] solve(){
        float[] values = null;
        if(this.d == 0){
            values = super.solve();
        }else {
            float delta = (float) Math.pow(this.getC(), 2) - 3*this.d*this.getB();
            
            if(delta != 0){
                values = new float[3];
                float k = (float) ((float)(9*this.d*this.getC()*this.getB() - 2*Math.pow(this.getC(), 3) - 27*this.d*this.d*this.getA())/(2*Math.sqrt(Math.abs(Math.pow(delta, 3)))));
                if(delta > 0){
                    if(Math.abs(k) <= 1){
                        System.out.println("PT co 3 Nghiem phan biet: ");
                        float x1,x2,x3;
                        x1 = (float)(2*Math.sqrt(delta)*Math.cos(Math.acos(k)/3) - this.getC())/(3*this.d);
                        x2 = (float)(2*Math.sqrt(delta)*Math.cos(Math.acos(k)/3 - 2*Math.PI/3) - this.getC())/(3*this.d);
                        x3 = (float)(2*Math.sqrt(delta)*Math.cos(Math.acos(k)/3 + 2*Math.PI/3) - this.getC())/(3*this.d);
                        values[0] = x1;
                        values[1] = x2;
                        values[2] = x3;
                        System.out.printf("x1 = %.3f\n",x1);
                        System.out.printf("x2 = %.3f\n",x2);
                        System.out.printf("x3 = %.3f\n",x3);
                    }else {
                        values = new float[1];
                        System.out.println("PT co mot nghiem duy nhat: ");
                        float ex1 = (float) (Math.abs(k) + Math.sqrt(k*k+1));
                        float ex1Pow = (float) (ex1 > 0?Math.pow(ex1, 1.0/3):-Math.pow(-ex1, 1.0/3));
                        float ex2 = (float) (Math.abs(k) - Math.sqrt(k*k-1));
                        float ex2Pow = (float) (ex2 > 0?Math.pow(ex2, 1.0/3):-Math.pow(-ex2, 1.0/3));
                        float x = (float)(((Math.sqrt(delta)*Math.abs(k))/(3*this.d*k))*(ex1Pow + ex2Pow) - this.getC()/(3*this.d));
                        values[0] = x;
                        System.out.printf("x = %.2f\n",x);
                        
                    }
                }else {
                    values = new float[1];
                    System.out.println("PT co mot nghiem duy nhat: ");
                    float ex1 = (float) (k + Math.sqrt(k*k + 1));
                    float ex1Pow = (float) (ex1 > 0? Math.pow(ex1, 1.0/3):-Math.pow(-ex1, 1.0/3));
                    float ex2 = (float) (k - Math.sqrt(k*k + 1));
                    float ex2Pow = (float) (ex2 > 0? Math.pow(ex2, 1.0/3):-Math.pow(-ex2, 1.0/3));
                    float x = (float) ((Math.sqrt(Math.abs(delta))/(3*this.d))*(ex1Pow + ex2Pow) - this.getC()/(3*this.d));
                    values[0] = x;
                    System.out.printf("x = %.2f\n",x);
                    
                }
            }else{
                values = new float[1];
                    System.out.println("PT co mot nghiem boi: ");
                    float ex = (float) (Math.pow(this.getC(), 3) - 27*this.d*this.d*this.getA());
                    float exPow = (float) (ex > 0? Math.pow(ex, 1.0/3):-Math.pow(-ex, 1.0/3));
                    float x = (float) ((-this.getC() + exPow)/(3*this.d));
                    values[0] = x;
                    System.out.printf("x = %.2f\n",x);
                }
        }
        return values;
    }
    
}
