package pourDotNet.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import pourDotNet.dao.IExerciceBudgetaireDao;
import pourDotNet.entite.Exercicebudgetaire;

public class ExerciceBudgetaireDaoImpl extends HibernateDaoSupport implements IExerciceBudgetaireDao
{
	@Transactional(readOnly = false)
	public boolean addExerciceBudgetaire(Exercicebudgetaire ExerciceBudgetaire)
	 {
		getHibernateTemplate().saveOrUpdate(ExerciceBudgetaire);
		getHibernateTemplate().flush();
		return false;
	}
	
	public Exercicebudgetaire updateExerciceBudgetaire(Exercicebudgetaire ExerciceBudgetaire)
	{
		getHibernateTemplate().saveOrUpdate(ExerciceBudgetaire);
		return ExerciceBudgetaire;
	}
	
	public boolean deleteExerciceBudgetaire(String anneeBudg)
	{
		Exercicebudgetaire myExerciceBudgetaire = getExerciceBudgetaireById(anneeBudg);
		if(myExerciceBudgetaire!= null)
			getHibernateTemplate().delete(myExerciceBudgetaire);
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Exercicebudgetaire> getAllExerciceBudgetaire()
	{
		return (List<Exercicebudgetaire>)getHibernateTemplate().find("from Exercicebudgetaire");
	}
	
	public Exercicebudgetaire getExerciceBudgetaireById(String anneeBudg)
	{
		Exercicebudgetaire myExerciceBudgetaire = getHibernateTemplate().get(Exercicebudgetaire.class, anneeBudg);
		return myExerciceBudgetaire;
	}
	
	public List<Exercicebudgetaire> findExerciceBudgetaire(String motCle)
	{
		return null;
	}
}
