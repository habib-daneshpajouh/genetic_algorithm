
/**
 *
 * @author Habib Daneshpajouh and Nordin Zakaria
 * @email habib.dpajouh@gmail.com
 *
 **/

import java.util.ArrayList;


public interface Crossover<T> {

	public void op(GAGenome<T> g0, GAGenome<T> g1, ArrayList<GAGenome<T>> kids);
}
