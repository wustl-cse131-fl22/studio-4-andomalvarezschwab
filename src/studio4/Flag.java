package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		boolean filled;
		double x;
		double y;
		double borderX;
		double borderY;
		
		Color purple = new Color(220, 77, 244);
		StdDraw.setPenColor(purple);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.3);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.2);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.4, 0.1, 0.03);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.4, 0.6, 0.02, 0.02);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.6, 0.6, 0.02, 0.02);
	}
}