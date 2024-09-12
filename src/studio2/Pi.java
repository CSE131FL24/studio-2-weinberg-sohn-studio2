package studio2;

public class Pi {

	public static void main(String[] args) {
		int totalDarts = (int)Math.pow(10,6);
		int success=0;

		for(int dart=0;dart<totalDarts;dart++) {
			double dartX = 2*Math.random()-1;
			double dartY = 2*Math.random()-1;
			if (Math.pow(dartX, 2)+Math.pow(dartY,2)<1) 
				{ success++; }
		}
		System.out.println((double)4*success/totalDarts);
	}
}