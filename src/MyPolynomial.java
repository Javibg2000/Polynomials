	
	public class MyPolynomial {
	
	
	
		private double[] coeffs;
		
	
	
	
	
	
	
	
	
	public int getDegree() {
		return coeffs.length -1;
		
	}
	@Override
	public String toString() {
		String s = "";
		for(int i=coeffs.length -1; i>=1; i--) {
			if (i==1) {
				s= s+ coeffs[1] + "+";
			} else {
				s= s + coeffs[i]+ "x+";
				
			}
		}
	}
	if(coeffs[0]! = 0.0) {
		s = s + coeffs[0];
	}
	return s;

	public double evaluate(double x) {
		double acc = 0;
		for (int i=0; i<coeffs.length; i++) {
			acc= acc+coeffs[i]
		}
	}
}