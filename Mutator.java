
/**
 *
 * @author Habib Daneshpajouh and Nordin Zakaria
 * @email habib.dpajouh@gmail.com
 *
 **/


public interface Mutator<T> {

	
	public void op(GAGenome<T> g, double prob);
}
