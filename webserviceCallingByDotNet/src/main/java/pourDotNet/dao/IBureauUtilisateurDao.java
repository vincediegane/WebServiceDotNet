package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Bureauutilisateur;
import pourDotNet.entite.BureauutilisateurId;

public interface IBureauUtilisateurDao {
	public boolean addBureauUtilisateur(Bureauutilisateur BureauUtilisateur);
	public Bureauutilisateur updateBureauUtilisateur(Bureauutilisateur BureauUtilisateur);
	public boolean deleteBureauUtilisateur(BureauutilisateurId BureauUtilisateurId);
	public List<Bureauutilisateur> getAllBureauUtilisateur();
	public Bureauutilisateur getBureauUtilisateurById(BureauutilisateurId BureauutilisateurId);
	public List<Bureauutilisateur> findBureauUtilisateur(String motCle);
}
