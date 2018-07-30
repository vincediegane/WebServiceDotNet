package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Utilisateur;

public interface IUtilisateurDao {
	public boolean addUtilisateur(Utilisateur Utilisateur);
	public Utilisateur updateUtilisateur(Utilisateur Utilisateur);
	public boolean deleteUtilisateur(String numUtilisateur);
	public boolean signInUtilisateur(String login, String password);
	public List<Utilisateur> getAllUtilisateur();
	public Utilisateur getUtilisateurById(String numUtilisateur);
	public List<Utilisateur> findUtilisateur(String motCle);
}
