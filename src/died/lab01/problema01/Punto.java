package died.lab01.problema01;

public class Punto {
	private float x;
	private float y;
	
	public Punto(float px, float py) {
		super();
		this.x=px;
		this.y=py;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public boolean equals(Object otroPunto) {
		if(otroPunto instanceof Punto) {
			float pEnX = ((Punto) otroPunto).getX();
			float pEnY = ((Punto) otroPunto).getY();
			if(this.x == pEnX && this.y ==pEnY) {
				return true;
			}
		}
			return false;
	}
	
}
