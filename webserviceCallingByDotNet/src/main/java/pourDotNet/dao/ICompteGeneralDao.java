package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Comptegeneral;


public interface ICompteGeneralDao {
	public boolean addCompteGeneral(Comptegeneral CompteGeneral);
	public Comptegeneral updateCompteGeneral(Comptegeneral CompteGeneral);
	public boolean deleteCompteGeneral(String numCG);
	public List<Comptegeneral> getAllCompteGeneral();
	public Comptegeneral getCompteGeneralById(String numCG);
	public List<Comptegeneral> findCompteGeneral(String motCle);
}
