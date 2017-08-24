package comp;

import static comp.Comp.*;
import static comp.Comp1.*;
import static comp.methods.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class methods {

    private double x;
    private double y;

    public static double mean(double[] data) {
        double total = total(data);
        double average = total / data.length;
        return average;

    }

    public methods(double X, double Y) {
        x = X;
        y = Y;

    }

    public static double meanX(double[] X) {
        double total = total(X);
        double a = total / X.length;// the method to find out the mean. total is the total sum of X and X.length is the numbers in the array. 
        double average;
        //average =(double)Math.round(a * 100)/ 100;
        return a; // return the value 
        // correct answer. 

    }

    public static double meanY(double[] Y) {
        double total = total(Y);
        double a = total / Y.length;
        double average;
        average = (double) Math.round(a * 100) / 100;
        return average;
// same method as meanX but with Y array instead. 
    }//correct answer 

    public static double total(double[] data) {
        double sum = 0;
        int i;

        for (i = 0; i < data.length; i++) {
            sum += data[i];// work out the total of the data array
        }
        return sum;
    }

    public static double var(double[] X, double meanX) {
        double total = 0;
        int i;
        double sum = 0;
        for (i = 0; i < X.length; i++) {
            total += Math.pow(X[i] - meanX, 2);// sum is the total number in X array subtract the mean of x and then square it
        }// 

        sum = total / 28;// use the values from total and divide by the length of the array
        return sum;
    }// not tested yet

//    public static double variance(double[] X) {
//        double mean = mean(X);
//        double[] difference = new double[X.length];
//
//        int i;
//        for (i = 0; i < difference.length; i++) {
//            difference[i] = X[i] = mean;
//            difference[i] *= difference[i];
//
//        }
//        double result = mean(difference);
//        return result;
//    }// 
    public static double[] X(double[] X, double meanX) {// X bar
        double[] x = new double[X.length];
        for (int i = 0; i < X.length; i++) {
            x[i] = X[i] - meanX;// get the total value of X and divide it by the mean of X
            //x[i] = data[i] *data[i] 
        }
        return x;
// correct answer
    }

    public static double[] Sxx(double[] X, double meanX) {
        double[] x = new double[X.length];
        for (int i = 0; i < X.length; i++) {
            x[i] = (X[i] - meanX) * (X[i] - meanX);
            //x[i] = data[i] *data[i] 
        }
        return x;
// correct answer 
    }

    public static double[] Y(double[] Y, double meanY) {
        double[] y = new double[Y.length];
        for (int i = 0; i < Y.length; i++) {
            y[i] = Y[i] - meanY;
        }
        return y;
// correct answer
    }

    public static double[] XY(double[] Y, double[] X) {
        double[] xy = new double[X.length];
        for (int i = 0; i < Y.length; i++) {
            xy[i] = X[i] * Y[i];
        }
        return xy;
    }// correct answer 

    public static double sumXY(double[] Y, double[] X) {
        double xy = 0;
        for (int i = 0; i < Y.length; i++) {
            xy += X[i] * Y[i];
        }

        //correct answer 
        return xy;
    }

    public static double[] X2(double[] X) {
        double[] x = new double[X.length];
        for (int i = 0; i < X.length; i++) {

            x[i] = X[i] * X[i];
        }
        return x;
//correct answer
//        public static double X2(ArrayList X) {
//        //double[] x = new double[X.length];
//        double a= 0;
//        for (int i = 0; i < X.size(); i++) { 
//            double b = (double) X.get(i);
//           a += Math.pow(b, 2);
//        }
//        return a;
    }

    public static double[] Y2(double[] Y) {
        double[] y = new double[Y.length];
        for (int i = 0; i < Y.length; i++) {

            y[i] = Y[i] * Y[i];
        }
        return y;
//correct answer
    }

    public static double sum(double[] X) {
        double x = 0;
        for (int i = 0; i < X.length; i++) {

            x = x + X[i];
        }
        return x;
//correct answer
    }

    public static double b1(double[] X, double[] Y, double meanX, double meanY) {
        double b = 0;
        
        double Sxx = sum(Sxx(X, meanX));
        double Sxy = sumXY(X(X, meanX), X(Y, meanY));
        b = Sxy / Sxx;

        return b;
    }// y

    public static double b0(double[] X, double meanY, double b1, double meanX) {
        double t = 0;
        double T;

        t = meanY - (b1 * meanX);
        T = (double) Math.round(t * 100) / 100;
        return T;
    }

    public static double g(double X, double X2, double b0, double b1) {
        double y = Mx(X, b1, b0);
        double A;
        double y2 = Mx(X2, b1, b0);
        double a = (y2 - y) / (X2 - X);
        A = (double) Math.round(a * 100) / 100;
        return A;

    }

    public static double Mx(double X, double b1, double b0) {// slope
        return b1 * X + b0;
    }

    public static double R2(double[] X2, double[] Y2, double[] XY) {// R2
        double Sxy = 0;
        double Sxx = 0, Syy = 0;
        double temp = 0;
        double total = 0;
        for (int i = 0; i < X.length; i++) {
            temp = XY[i] * XY[i];
            Sxy += temp;// S2xy

            temp = X2[i] * X2[i];
            Sxx += temp;

            temp = Y2[i] * Y2[i];
            Syy += temp;
        }

        total = Sxy / (Sxx * Syy);
        return total;
    }// correct answer 

    public static void table() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int i;
        for (i = model.getRowCount(); i > 0; i--) {
            model.removeRow(i - 1);
        }
        if (X.length == Y.length) {
            ArrayList<Double> aLx1 = new ArrayList();
            aLx1 = arrayToArrayList(X);
            for (i = 0; i < X.length; i++) {
                Vector<Double> row = new Vector<Double>();
                row.addElement(Y[i]);
                row.addElement(X[i]);
                row.addElement(x2[i]);
                row.addElement(x3[i]);
                row.addElement(x4[i]);
                row.addElement(x5[i]);
                row.addElement(x6[i]);
                row.addElement(x7[i]);

                row.addElement(aLx1.get(i));

                model.addRow(row);
            }
        }
    }

}
