package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Crb;


public interface ICRBDao {
	public boolean addCRB(Crb CRB);
	public Crb updateCRB(Crb CRB);
	public boolean deleteCRB(String numCRB);
	public List<Crb> getAllCRB();
	public Crb getCRBById(String numCRB);
	public List<Crb> findCRB(String motCle);
}
