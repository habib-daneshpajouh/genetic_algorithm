
/**
 *
 * @author Habib Daneshpajouh and Nordin Zakaria
 * @email habib.dpajouh@gmail.com
 *
 **/


import java.util.Random;


public abstract class GASelectionScheme<T> {

	protected Random randObj;
	protected GAPopulation<T> pop;


	public GASelectionScheme(GAPopulation<T> pop) { 

		randObj = new Random();
		this.pop = pop;
	}


	public abstract GAGenome<T> select()  throws GAException; 
	

	public abstract void setPop(GAPopulation<T> pop);
}