package died.lab01.problema01;

public class Recta {
	private Punto punto1;
	private Punto punto2;
	private float pendiente;
	
	public Recta() {
		super();
		this.punto1.setX(0.0f);
		this.punto1.setY(0.0f);
		this.punto2.setX(1.0f);
		this.punto2.setY(1.0f);
		this.pendiente = (punto2.getY() - punto1.getY()) / (punto2.getX() - punto1.getX());
	}
	
	public Recta(Punto a, Punto b) {
		super();
		this.punto1 = a;
		this.punto2 = b;
		this.pendiente = (punto2.getY() - punto1.getY()) / (punto2.getX() - punto1.getX());
	}
	
	public float pendiente() {
		return pendiente;	
	}
	
	public boolean paralelas(Recta otraRecta) {
		if (this.pendiente == otraRecta.pendiente()) {
			return true;
		}
		return false;
	}
	
	public boolean equals(Object otraRecta){
		
		if(otraRecta instanceof Recta) {
			
			float pendienteR1 = this.pendiente;
			float pendienteR2 = ((Recta) otraRecta).pendiente();
			
			if(pendienteR1 == pendienteR2) {
			
				if(this.punto1.equals(((Recta) otraRecta).getPunto1()) == true){
					Recta aux = new Recta(this.punto1,((Recta) otraRecta).getPunto2());
						if(aux.pendiente() == pendienteR1) {
							return true;
						}
				}
				else {
					Recta aux = new Recta(this.punto1,((Recta) otraRecta).getPunto1());
					if(aux.pendiente() == pendienteR1) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public Punto getPunto1() {
		return punto1;
	}

	public Punto getPunto2() {
		return punto2;
	}
	
}
