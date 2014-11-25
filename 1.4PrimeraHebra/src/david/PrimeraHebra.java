package david;

class MiHebra extends Thread{
	public void run(){
		while(true);
	}
}

public class PrimeraHebra {

	public static void main(String[] args) {
		MiHebra mh = new MiHebra();
		mh.start();
		
		while(true);

	}

}
