package ba.unsa.etf.rpr.tut2;

import java.lang.Math;
public class Matematika {

    /**
     * racunanje faktorijela zadanog broja metodom rekurzije
     * @param x je broj ciji faktorijel zelimo
     * @return
     */
    public static double faktorijel(int x){
     int i,fact=1;
     for(i=1;i< x+1;i++){
     fact=fact*i;
     }
     return fact;
     }

    /**
     * racunanje sinusa rastavljanjem u Taylorov red
     * @param x odredjuje ciji sinus zelimo
     * @return vrijednost
     */
     public static double sinus(double x)
     {

     int i = 0;
     double suma = 0;

     for (i = 0; i<10; i++){
     suma = suma + power(-1,i)*power(x, 2*i+1)/faktorijel(2*i+1);
     }
     return suma*180/Math.PI;

     }

    /**
     * implementirana 'nasaa' verzija eksponenata
     * @param n
     * @param pow
     * @return
     */
    public static double power(double n, int pow){
        double proizvod = 1;
        for(int i=0; i<pow; i++){
            proizvod *= n;
        }
        return proizvod;
    }

}