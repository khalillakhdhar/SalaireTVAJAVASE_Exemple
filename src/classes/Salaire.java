package classes;

public class Salaire {
	private String nom;
	private double salaire;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public Salaire(String nom, double salaire) {
		this.nom = nom;
		this.salaire = salaire;
	}
	
	
	double calculeTaxes()
	{
		if(salaire<500)
			return 0;
		else if (salaire <=1500)
			return salaire *0.1;
		else 
			return salaire *0.15;
		
		
		
	}
	double salaireNette()
	{
		
		return this.salaire-calculeTaxes();
	}
	@Override
	public String toString() {
		return "Détailles de la salaire [nom=" + nom + ", salaire=" + salaire + ", Taxes=" + calculeTaxes()
				+ ", salaire nette=" + salaireNette() + "]";
	}



}
