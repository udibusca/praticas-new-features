package br.com.feature.java15;

abstract class CarnivoroEx {
	
	public void euSou() {
		System.out.print(" eu sou carnívoro.\n");
	}
}

abstract class HerbivoroEx {
	
	public void euSou() {
		System.out.print(" eu sou herbívoro.\n");
	}
}

class LeaoEx extends CarnivoroEx {
	
	public void euSou() {
		System.out.print("eu sou um leão,");
		super.euSou();
	}
}

class GatoEx extends CarnivoroEx {
	
	public void euSou() {
		System.out.print("eu sou um gato,");
		super.euSou();
	}
}

class VacaEx extends HerbivoroEx {

	public void euSou() {
		System.out.print("eu sou uma vaca,");
		super.euSou();
	}
}

class CoelhoEx extends HerbivoroEx {
	
	public void euSou() {
		System.out.print("eu sou um coelho,");
		super.euSou();
	}
}


public class ClassesSeladasEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeaoEx l = new LeaoEx();
		l.euSou();
		
		CoelhoEx c = new CoelhoEx();
		c.euSou();
	}
}
