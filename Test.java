import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import connect.Connexion;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne etudiant = new Personne("Diamé", "Seydina", 20, "Fatick");
		Personne etudiant3 = new Personne("Thiam", "Thioro", 35, "Congo");
		Personne etudiant4 = new Personne("Ndiaye", "Kine", 135, "Guinee");
		ArrayList<Personne> etudiants = new ArrayList();
		etudiants.add(etudiant);
		etudiants.add(etudiant3);
		etudiants.add(etudiant4);
		Connection conn = Connexion.getConnection();
		try {
			
			for (int i=0;i<etudiants.size();i++) {
				String sql = "INSERT INTO personne(nom, prenom, age, pays) VALUES (?, ?, ?, ?)";
				PreparedStatement st = conn.prepareStatement(sql);
				st.setString(1, etudiants.get(i).getNom());
				st.setString(2, etudiants.get(i).getPrenom());
				st.setInt(3, etudiants.get(i).getAge());
				st.setString(4, etudiants.get(i).getPays());
				st.executeUpdate();
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
