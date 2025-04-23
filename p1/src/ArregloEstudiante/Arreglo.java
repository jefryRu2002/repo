package ArregloEstudiante;

public class Arreglo {
	private String Nom;
	private String Ape;
	private String Cod;
	private int n1,n2,n3;
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}

	public String getApe() {
		return Ape;
	}
	public void setApe(String ape) {
		Ape = ape;
	}
	public String getCod() {
		return Cod;
	}
	public void setCod(String cod) {
		Cod = cod;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	public Arreglo(String nom, String ape, String cod, int n1, int n2, int n3) {
		Nom = nom;
		Ape = ape;
		Cod = cod;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public double  promedio()
	{
		
		
		return (n1+n2+n3)/34;
	
	}
	

}
