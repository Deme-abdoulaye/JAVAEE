
public class Personne {
	private String nom;
	private String prenom;
	private int age;
	private String pays;
	
	
	public Personne(String nom, String prenom, int age, String pays) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.pays = pays;
	}

	

	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getPays() {
		return pays;
	}



	public void setPays(String pays) {
		this.pays = pays;
	}


}
