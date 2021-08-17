package figura;

public class Rentangulo {
	double ancho, alto;

	public Rentangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "Rentangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
	public double getPerimetro() {
		return this.alto*2+this.ancho*2;
	}
	

}
