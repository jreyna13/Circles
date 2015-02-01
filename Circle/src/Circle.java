//Javier Reyna EG1305A
//OK. Ozgur Aktunc
import java.text.DecimalFormat;

public class Circle {

	public static void main(String[] args) {
	
		double radius = 5;
		
		DecimalFormat aFormatter = new DecimalFormat("#");
		System.out.print ("The circle's radius is " + aFormatter.format(radius));
		
		double area = Math.PI * radius * radius;
		
		DecimalFormat bFormatter = new DecimalFormat("##.####");
		//String  area= dFormatter.format(area);
		
		System.out.println (", the area is " + bFormatter.format (area));
		
		System.out.print("and");
		
		double diameter = radius * 2;
		
		DecimalFormat cFormatter = new DecimalFormat("##.####");
		System.out.print(" The diameter is " + cFormatter.format(diameter));
		
		System.out.println(".");
		
}
}
