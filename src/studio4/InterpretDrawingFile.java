package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt(); 
		int blueComponent = in.nextInt(); 
		
		boolean filled  = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double borderX = in.nextDouble();
		double borderY = in.nextDouble();
		//double x = in.nextDouble(); 
		//System.out.println(x);
		if (shapeType.equals("rectangle")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			StdDraw.filledRectangle(x, y, borderX, borderY);

		} else if (shapeType.equals("ellipse")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			StdDraw.filledEllipse(x, y, borderX, borderY);
		} else if (shapeType.equals("triangle")) {
//			double borderZ = in.nextDouble();
//			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
//			StdDraw.filledTriangle(x, y, borderX, borderY, borderZ);
			System.out.println("sorry we can't print triangles");
		}
//		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
//		StdDraw.filledEllipse(x, y, borderX, borderY);
//		
		
		 
	}
}
