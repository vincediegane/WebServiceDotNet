package pourDotNet.daoImpl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import pourDotNet.dao.IBudgetCRBDao;
import pourDotNet.entite.Budgetcrb;
import pourDotNet.entite.BudgetcrbId;

public class BudgetCRBDaoImpl extends HibernateDaoSupport implements IBudgetCRBDao
{	
	public boolean addBudgetCRB(Budgetcrb BudgetCRB)
	{
		getHibernateTemplate().saveOrUpdate(BudgetCRB);
		getHibernateTemplate().flush();
		return false;
	}

	
	public Budgetcrb updateBudgetCRB(Budgetcrb BudgetCRB)
	{
		getHibernateTemplate().saveOrUpdate(BudgetCRB);
		return BudgetCRB;
	}

	
	public boolean deleteBudgetCRB(BudgetcrbId BudgetcrbId)
	{
		Budgetcrb myBudgetCRB = getBudgetCRBById(BudgetcrbId);
		if(myBudgetCRB!= null)
			getHibernateTemplate().delete(myBudgetCRB);
		return false;
	}

	
	@SuppressWarnings("unchecked")
	public List<Budgetcrb> getAllBudgetCRB()
	{
		return (List<Budgetcrb>)getHibernateTemplate().find("from BudgetCRB");
	}

	public Budgetcrb getBudgetCRBById(BudgetcrbId BudgetcrbId)
	{
		Budgetcrb myBudgetCRB = getHibernateTemplate().get(Budgetcrb.class, BudgetcrbId);
		return myBudgetCRB;
	}

	public List<Budgetcrb> findBudgetCRB(String motCle)
	{
		return null;
	}
}
