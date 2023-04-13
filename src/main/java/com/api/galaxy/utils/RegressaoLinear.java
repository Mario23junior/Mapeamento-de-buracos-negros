package com.api.galaxy.utils;

 
import static smile.math.MathEx.*;

public class RegressaoLinear {
   
//	 CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
 //	        
//	     
//	        	
//	    System.out.printf("  regressaoLinear(x, y, 100));
	  	
	  public static double predicao (double alpha, double beta, double x) {
	    return alpha + beta * x;
	  }
	    
	  public static double[] minimos_quadrados(double[] x, double[] y) {
	    double beta = cor(x, y) * sd(y) / sd(x);
	    double alpha = mean(y) - beta * mean(x);
	    return new double[] {alpha, beta};
	  }

	  public static double regressaoLinearBlackhole(double[] x, double[] y, double z) {
	    double[] alpha_beta = minimos_quadrados(x, y);
	    System.out.println("alpha: " + alpha_beta[0]); // -48.1212291326
	    System.out.println("beta: " + alpha_beta[1]); // 5.6647974510
	    return predicao(alpha_beta[0], alpha_beta[1], z);
	  }
}
