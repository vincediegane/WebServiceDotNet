package pourDotNet.daoImpl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import pourDotNet.dao.ICompteGeneralDao;
import pourDotNet.entite.Comptegeneral;

public class CompteGeneralDaoImpl extends HibernateDaoSupport implements ICompteGeneralDao
{	
	public boolean addCompteGeneral(Comptegeneral CompteGeneral)
	{
		getHibernateTemplate().saveOrUpdate(CompteGeneral);
		getHibernateTemplate().flush();
		return false;
	}
	
	public Comptegeneral updateCompteGeneral(Comptegeneral CompteGeneral)
	{
		getHibernateTemplate().saveOrUpdate(CompteGeneral);
		return CompteGeneral;
	}

	public boolean deleteCompteGeneral(String numCG)
	{
		Comptegeneral myCompteGeneral = getCompteGeneralById(numCG);
		if(myCompteGeneral!= null)
			getHibernateTemplate().delete(myCompteGeneral);
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public List<Comptegeneral> getAllCompteGeneral()
	{
		return (List<Comptegeneral>)getHibernateTemplate().find("from Comptegeneral");
	}
	
	public Comptegeneral getCompteGeneralById(String numCG)
	{
		Comptegeneral myCompteGeneral = getHibernateTemplate().get(Comptegeneral.class, numCG);
		return myCompteGeneral;
	}
	
	public List<Comptegeneral> findCompteGeneral(String motCle)
	{
		return null;
	}
}
