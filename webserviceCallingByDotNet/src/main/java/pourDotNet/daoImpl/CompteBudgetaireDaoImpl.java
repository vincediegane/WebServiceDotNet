package pourDotNet.daoImpl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import pourDotNet.dao.ICompteBudgetaireDao;
import pourDotNet.entite.Comptebudgetaire;

public class CompteBudgetaireDaoImpl extends HibernateDaoSupport implements ICompteBudgetaireDao
{	
	public boolean addCompteBudgetaire(Comptebudgetaire CompteBudgetaire)
	{
		getHibernateTemplate().saveOrUpdate(CompteBudgetaire);
		getHibernateTemplate().flush();
		return false;
	}
	
	public Comptebudgetaire updateCompteBudgetaire(Comptebudgetaire CompteBudgetaire)
	{
		getHibernateTemplate().saveOrUpdate(CompteBudgetaire);
		return CompteBudgetaire;
	}
	
	public boolean deleteCompteBudgetaire(String numCB)
	{
		Comptebudgetaire myCompteBudgetaire = getCompteBudgetaireById(numCB);
		if(myCompteBudgetaire!= null)
			getHibernateTemplate().delete(myCompteBudgetaire);
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Comptebudgetaire> getAllCompteBudgetaire()
	{
		return (List<Comptebudgetaire>)getHibernateTemplate().find("from Comptebudgetaire");
	}

	public Comptebudgetaire getCompteBudgetaireById(String numCB)
	{
		Comptebudgetaire myCompteBudgetaire = getHibernateTemplate().get(Comptebudgetaire.class, numCB);
		return myCompteBudgetaire;
	}

	public List<Comptebudgetaire> findCompteBudgetaire(String motCle)
	{
		return null;
	}
}
