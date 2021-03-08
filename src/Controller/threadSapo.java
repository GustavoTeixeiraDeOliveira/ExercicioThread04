package Controller;

import java.util.Random;

public class threadSapo extends Thread{
	private int numeroSapo;
	
	public threadSapo(int numeroSapo) {
		this.numeroSapo = numeroSapo;
	}
	
	@Override
	public void run(){
	   Corrida(this.numeroSapo);
		
	}
	
	public void Corrida(int numeroSapo) {
		int distacia =50;
		int distanciaPercorrida = 0;
		int salto = 0;
		while(distanciaPercorrida < distacia) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Random num =  new Random();
			salto = num.nextInt(10);
			distanciaPercorrida = distanciaPercorrida + salto;
			System.out.println("O "+ numeroSapo + "º sapo saltou "+ salto+" metros e ja percorreu "+ distanciaPercorrida+" metros");
		}
		System.out.println("O "+ numeroSapo + "º sapo chegou a linha de chegada ");

	}
}
