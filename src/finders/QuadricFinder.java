package finders;

import java.util.Vector;

import misc.PolyFunction;

// y = ax^2 + bx + c
// m�gliche nullstellen: 0-2
public class QuadricFinder implements FinderInterface {
	public Vector<Double> find(PolyFunction f) throws InvalidFuncException {
		Vector<Double> nullstellen = new Vector<Double>();
		
		if (f.getMaxGrade() > 2) {
			throw new InvalidFuncException();
		}
		
		double a = f.getKoeff(2);
		double b = f.getKoeff(1);
		double c = f.getKoeff(0);
		
		// (-b +- sqrt(b^2-4ac)) / 2a
		double x1 = (double) ((-b + Math.sqrt(Math.pow(b, 2)-4*a*c)) / 2*a);
		nullstellen.add(x1);
		double x2 = (double) ((-b - Math.sqrt(Math.pow(b, 2)-4*a*c)) / 2*a);
		nullstellen.add(x2);
		
		return nullstellen;
	}
}
