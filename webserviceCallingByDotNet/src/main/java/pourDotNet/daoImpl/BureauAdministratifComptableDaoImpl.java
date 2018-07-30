package pourDotNet.daoImpl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import pourDotNet.dao.IBureauAdministratifComptableDao;
import pourDotNet.entite.Bureauadministratifcomptable;

public class BureauAdministratifComptableDaoImpl extends HibernateDaoSupport implements IBureauAdministratifComptableDao
{	
	public boolean addBureauAdministratifComptable(Bureauadministratifcomptable BureauAdministratifComptable)
	{
		getHibernateTemplate().saveOrUpdate(BureauAdministratifComptable);
		getHibernateTemplate().flush();
		return false;
	}

	
	public Bureauadministratifcomptable updateBureauAdministratifComptable(
			Bureauadministratifcomptable BureauAdministratifComptable)
	{
		getHibernateTemplate().saveOrUpdate(BureauAdministratifComptable);
		return BureauAdministratifComptable;
	}

	
	public boolean deleteBureauAdministratifComptable(String numBAC)
	{
		Bureauadministratifcomptable myBureauAdministratifComtable = getBureauAdministratifComptableById(numBAC);
		if(myBureauAdministratifComtable!= null)
			getHibernateTemplate().delete(myBureauAdministratifComtable);
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Bureauadministratifcomptable> getAllBureauAdministratifComptable()
	{
		return (List<Bureauadministratifcomptable>)getHibernateTemplate().find("from Bureauadministratifcomptable");
	}

	public Bureauadministratifcomptable getBureauAdministratifComptableById(String numBAC)
	{
		Bureauadministratifcomptable myBureauAdministratifComtable = getHibernateTemplate().get(Bureauadministratifcomptable.class, numBAC);
		return myBureauAdministratifComtable;
	}

	public List<Bureauadministratifcomptable> findBureauAdministratifComptable(String motCle)
	{
		return null;
	}
}
