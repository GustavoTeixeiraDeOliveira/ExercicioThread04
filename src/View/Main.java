package View;
import Controller.threadSapo;
public class Main {

	public static void main(String[] args) {
		for(int s = 1; s<6 ; s++){
			threadSapo threadSapo = new threadSapo(s);
			threadSapo.start();
		}

	}

}
