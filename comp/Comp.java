package comp;

import static comp.Comp.x2;
import static comp.methods.mean;

import java.util.ArrayList;

public class Comp {

    public static double[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //55 
    
    public static double[] X = {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.5, 2.5, 1.0, 1.0,
        1.0, 1.0, 1.0, 1.0, 1.5, 1.5, 1.5, 1.0, 1.0, 1.5, 1.5, 1.5, 1.5, 3, 1.5, 1.5};

    public static double[] Y = {4.9176, 5.0208,4.5429, 4.5573, 5.0597, 3.8910, 5.8980, 
        5.6039, 16.4202, 14.4598, 5.8282, 5.3003, 6.2712, 5.9592, 5.0500, 5.6039, 
        8.2464, 6.6969, 7.7841, 9.0384, 5.9894, 7.5422, 8.7951, 6.0931, 8.3607, 8.1400, 9.1416, 12.0000};

    public static double[] x2 = {3.472, 3.531, 2.275, 4.050, 4.455, 4.455, 5.850, 9.520, 9.800, 12.80, 6.435, 4.988, 5.520, 6.666,
        5.000, 9.520, 5.150, 6.902, 7.102, 7.800, 5.520, 4.000, 9.890, 6.726, 9.150, 8.000, 7.326, 5.000};

    public static double[] x3 = {0.998, 1.5, 1.175, 1.232, 1.121, 0.988, 1.240, 1.501, 3.420, 3.000, 1.225, 1.552, 0.975, 1.121,
        1.020, 1.501, 1.664, 1.488, 1.376, 1.500, 1.256, 1.690, 1.820, 1.652, 1.777, 1.504, 1.831, 1.200};

    public static double[] x4 = {1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 2.0, 2.0, 2.0, 
        1.0, 1.0, 2.0, 0.0, 0.0, 2.0, 1.5, 1.0, 1.5, 2.0, 1.0, 2.0, 1.0, 2.0, 2.0, 1.5, 2.0};

    public static double[] x5 = {7, 7, 6, 6, 6, 7, 7, 6, 10, 9, 6, 6, 5, 6, 5, 6, 8, 7, 6, 7, 6, 6, 8, 6, 8, 7, 8, 6};

    public static double[] x6 = {4, 4, 3, 3, 3, 3, 3, 3, 5, 5, 3, 3, 2, 3, 2, 3, 4, 3, 3, 3, 3, 3, 4, 3, 4, 3, 4, 3};

    public static double[] x7 = {42, 62, 40, 54, 42, 56, 51, 32, 42, 14, 32, 30, 30, 32, 46, 32, 50, 22, 17, 23, 40, 22, 50, 44, 48, 3, 31, 30};

    public static ArrayList <Double> a2 = new ArrayList<>();
    
    public static ArrayList<Double> arrayToArrayList(double[] array) {
        ArrayList<Double> list = new ArrayList();
        for (int j = 0; j < array.length; j++) {
            list.add(array[j]);
        }
        return list;
    }



public static void main(String[] args) {
    
 
   
}
}