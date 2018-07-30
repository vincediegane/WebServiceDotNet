package pourDotNet.daoImpl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import pourDotNet.dao.ICRBDao;
import pourDotNet.entite.Crb;

public class CRBDaoImpl extends HibernateDaoSupport implements ICRBDao
{
	@Transactional(readOnly = false)
	public boolean addCRB(Crb CRB)
	{
		getHibernateTemplate().saveOrUpdate(CRB);
		getHibernateTemplate().flush();
		return false;
	}

	@Transactional(readOnly = false)
	public Crb updateCRB(Crb CRB)
	{
		getHibernateTemplate().saveOrUpdate(CRB);
		return CRB;
	}

	@Transactional(readOnly = false)
	public boolean deleteCRB(String numCRB)
	{
		Crb myCRB = getCRBById(numCRB);
		if(myCRB!= null)
			getHibernateTemplate().delete(myCRB);
		return false;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Crb> getAllCRB()
	{
		return (List<Crb>)getHibernateTemplate().find("from Crb");
	}

	public Crb getCRBById(String numCRB)
	{
		Crb myCRB = getHibernateTemplate().get(Crb.class, numCRB);
		return myCRB;
	}
	
	public List<Crb> findCRB(String motCle)
	{
		return null;
	}
}
