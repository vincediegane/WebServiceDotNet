package pourDotNet.daoImpl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import pourDotNet.dao.IDemandeDeConsommationDao;
import pourDotNet.entite.Demandedeconsommation;

public class DemandeDeConsommationDaoImpl extends HibernateDaoSupport implements IDemandeDeConsommationDao
{
	@Transactional(readOnly = false)
	public boolean addDemandeDeConsommation(Demandedeconsommation DemandeDeConsommation)
	{
		getHibernateTemplate().saveOrUpdate(DemandeDeConsommation);
		getHibernateTemplate().flush();
		return false;
	}
	
	public Demandedeconsommation updateDemandeDeConsommation(Demandedeconsommation DemandeDeConsommation)
	{
		getHibernateTemplate().saveOrUpdate(DemandeDeConsommation);
		return DemandeDeConsommation;
	}
	
	public boolean deleteDemandeDeConsommation(Integer numDC)
	{
		Demandedeconsommation myDemandeDeConsommation = getDemandeDeConsommationById(numDC);
		if(myDemandeDeConsommation!= null)
			getHibernateTemplate().delete(myDemandeDeConsommation);
		return false;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Demandedeconsommation> getAllDemandeDeConsommation()
	{
		return (List<Demandedeconsommation>)getHibernateTemplate().find("from Demandedeconsommation");
	}
	
	public Demandedeconsommation getDemandeDeConsommationById(Integer numDC)
	{
		Demandedeconsommation myDemandeDeConsommation = getHibernateTemplate().get(Demandedeconsommation.class, numDC);
		return myDemandeDeConsommation;
	}
	
	public List<Demandedeconsommation> findDemandeDeConsommation(String motCle)
	{
		return null;
	}
}
