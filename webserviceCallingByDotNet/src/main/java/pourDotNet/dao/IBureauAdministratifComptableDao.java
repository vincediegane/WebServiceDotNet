package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Bureauadministratifcomptable;

public interface IBureauAdministratifComptableDao {
	public boolean addBureauAdministratifComptable(Bureauadministratifcomptable BureauAdministratifComptable);
	public Bureauadministratifcomptable updateBureauAdministratifComptable(Bureauadministratifcomptable BureauAdministratifComptable);
	public boolean deleteBureauAdministratifComptable(String numBAC);
	public List<Bureauadministratifcomptable> getAllBureauAdministratifComptable();
	public Bureauadministratifcomptable getBureauAdministratifComptableById(String numBAC);
	public List<Bureauadministratifcomptable> findBureauAdministratifComptable(String motCle);
}
