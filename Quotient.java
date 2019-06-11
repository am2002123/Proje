


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