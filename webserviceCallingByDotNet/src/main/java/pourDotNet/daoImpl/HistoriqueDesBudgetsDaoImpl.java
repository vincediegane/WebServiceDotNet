package pourDotNet.daoImpl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import pourDotNet.dao.IHistoriqueDesBudgetsDao;
import pourDotNet.entite.Historiquedesbudgets;

public class HistoriqueDesBudgetsDaoImpl extends HibernateDaoSupport implements IHistoriqueDesBudgetsDao
{
	@Transactional(readOnly = false)
	public boolean addHistoriqueDesBudgets(Historiquedesbudgets HistoriqueDesBudgets)
	{
		getHibernateTemplate().saveOrUpdate(HistoriqueDesBudgets);
		getHibernateTemplate().flush();
		return false;
	}
	
	public Historiquedesbudgets updateHistoriqueDesBudgets(Historiquedesbudgets HistoriqueDesBudgets)
	{
		getHibernateTemplate().saveOrUpdate(HistoriqueDesBudgets);
		return HistoriqueDesBudgets;
	}
	
	public boolean deleteHistoriqueDesBudgets(Integer numHB)
	{
		Historiquedesbudgets myHistoriqueDesBudgets = getHistoriqueDesBudgetsById(numHB);
		if(myHistoriqueDesBudgets!= null)
			getHibernateTemplate().delete(myHistoriqueDesBudgets);
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Historiquedesbudgets> getAllHistoriqueDesBudgets()
	{
		return (List<Historiquedesbudgets>)getHibernateTemplate().find("from Historiquedesbudgets");
	}
	
	public Historiquedesbudgets getHistoriqueDesBudgetsById(Integer numHB)
	{
		Historiquedesbudgets myHistoriqueDesBudgets = getHibernateTemplate().get(Historiquedesbudgets.class, numHB);
		return myHistoriqueDesBudgets;
	}
	
	public List<Historiquedesbudgets> findHistoriqueDesBudgets(String motCle)
	{
		return null;
	}
}
