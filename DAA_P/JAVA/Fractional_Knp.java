// ratio = value / weight

// weight = 10 , 20 ,30
// value = 60 ,100, 120
// w = 50

import java.util.*;

public class Fractional_Knp{

    public static void main(String args[])
    {
        int val[]={60,100,120};
        int weight[] ={10,20,30}; 
        int W = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col = original idx
        // 1st col = ratio

        for(int i = 0; i<val.length; i++)
        {
            ratio[i][0]= i;
            ratio[i][1] = val[i] / (double)weight[i];
        }

       // Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); //lambda function

        int capacity = W;
        int finalVal = 0;
        // decending order
        for(int i = ratio.length-1 ; i>=0 ; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx])  // include full item}
                { 
                    finalVal = finalVal + val[idx];
                    capacity = capacity - weight[idx];
                }
            else
                {
                    //include fractional item
                    finalVal += (ratio[i][1] * capacity);
                    capacity = 0;
                    break;
                }
        }
        System.out.println("final value = " + finalVal);
    }
}

