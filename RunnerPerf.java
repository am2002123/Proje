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