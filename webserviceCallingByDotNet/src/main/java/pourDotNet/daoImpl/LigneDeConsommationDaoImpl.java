package pourDotNet.daoImpl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import pourDotNet.dao.ILigneDeConsommationDao;
import pourDotNet.entite.Lignedeconsommation;

public class LigneDeConsommationDaoImpl extends HibernateDaoSupport implements ILigneDeConsommationDao
{	
	public boolean addLigneDeConsommation(Lignedeconsommation LigneDeConsommation)
	{
		getHibernateTemplate().saveOrUpdate(LigneDeConsommation);
		getHibernateTemplate().flush();
		return false;
	}
	
	public Lignedeconsommation updateLigneDeConsommation(Lignedeconsommation LigneDeConsommation)
	{
		getHibernateTemplate().saveOrUpdate(LigneDeConsommation);
		return LigneDeConsommation;
	}
	
	public boolean deleteLigneDeConsommation(Integer numLC)
	{
		Lignedeconsommation myLigneDeConsommation = getLigneDeConsommationById(numLC);
		if(myLigneDeConsommation!= null)
			getHibernateTemplate().delete(myLigneDeConsommation);
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Lignedeconsommation> getAllLigneDeConsommation()
	{
		return (List<Lignedeconsommation>)getHibernateTemplate().find("from Lignedeconsommation");
	}
	
	public Lignedeconsommation getLigneDeConsommationById(Integer numLC)
	{
		Lignedeconsommation myLigneDeConsommation = getHibernateTemplate().get(Lignedeconsommation.class, numLC);
		return myLigneDeConsommation;
	}
	
	public List<Lignedeconsommation> findLigneDeConsommation(String motCle)
	{
		return null;
	}
}
