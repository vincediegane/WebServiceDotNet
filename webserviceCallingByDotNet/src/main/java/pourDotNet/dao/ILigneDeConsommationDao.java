package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Lignedeconsommation;

public interface ILigneDeConsommationDao {
	public boolean addLigneDeConsommation(Lignedeconsommation LigneDeConsommation);
	public Lignedeconsommation updateLigneDeConsommation(Lignedeconsommation LigneDeConsommation);
	public boolean deleteLigneDeConsommation(Integer numLC);
	public List<Lignedeconsommation> getAllLigneDeConsommation();
	public Lignedeconsommation getLigneDeConsommationById(Integer numLC);
	public List<Lignedeconsommation> findLigneDeConsommation(String motCle);
}
