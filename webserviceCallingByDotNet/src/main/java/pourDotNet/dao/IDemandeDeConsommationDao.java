package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Demandedeconsommation;

public interface IDemandeDeConsommationDao {
	public boolean addDemandeDeConsommation(Demandedeconsommation DemandeDeConsommation);
	public Demandedeconsommation updateDemandeDeConsommation(Demandedeconsommation DemandeDeConsommation);
	public boolean deleteDemandeDeConsommation(Integer numDC);
	public List<Demandedeconsommation> getAllDemandeDeConsommation();
	public Demandedeconsommation getDemandeDeConsommationById(Integer numDC);
	public List<Demandedeconsommation> findDemandeDeConsommation(String motCle);
}
