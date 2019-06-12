
public class Quotient implements InterfacePS{

	float d = 0;


	public void quotient(float a, float b){


		d=a/b;



		d = (float)Math.round(d*1000)/(float)1000;




		System.out.printf("The quotient is %.3f \n", d);

	}



	public static void main (String[]args){

		Quotient q  = new Quotient();
		q.quotient(24,7);
	}


}

public class RunnerPerf implements Interfacejava{


	public boolean perfS(int num){


	double sr = Math.sqrt(num);


        return ((sr - Math.floor(sr)) == 0);


}


	public static void main(String[] args){

	RunnerPerf r= new RunnerPerf();
	System.out.print(r.perfS(4));


		}



	}
// I (Annie) did the perfect square and if the square root of  the number was an whole number I made the method return true
// I (Annie) learned how to use GitKraken and Github to work on code with other people more effiecently 
// I (Malaika) did the quotient method which finds the quotient of two floats to 3 decimal places.
// I(Malaika) learned how GitHub and GitKraken make it possible for people to collaborate on code by creating branches allowing you to make changes and then merge to the master runner.  
