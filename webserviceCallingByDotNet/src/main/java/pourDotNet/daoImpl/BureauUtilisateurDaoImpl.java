package pourDotNet.daoImpl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import pourDotNet.dao.IBureauUtilisateurDao;
import pourDotNet.entite.Bureauutilisateur;
import pourDotNet.entite.BureauutilisateurId;

public class BureauUtilisateurDaoImpl extends HibernateDaoSupport implements IBureauUtilisateurDao
{
	@Transactional(readOnly = false)
	public boolean addBureauUtilisateur(Bureauutilisateur BureauUtilisateur)
	{
		getHibernateTemplate().saveOrUpdate(BureauUtilisateur);
		getHibernateTemplate().flush();
		return false;
	}
	
	public Bureauutilisateur updateBureauUtilisateur(Bureauutilisateur BureauUtilisateur)
	{
		getHibernateTemplate().saveOrUpdate(BureauUtilisateur);
		return BureauUtilisateur;
	}
	
	public boolean deleteBureauUtilisateur(BureauutilisateurId BureauutilisateurId)
	{
		Bureauutilisateur myBureauUtilisateur = getBureauUtilisateurById(BureauutilisateurId);
		if(myBureauUtilisateur!= null)
			getHibernateTemplate().delete(myBureauUtilisateur);
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Bureauutilisateur> getAllBureauUtilisateur()
	{
		return (List<Bureauutilisateur>)getHibernateTemplate().find("from BureauUtilisateur");
	}

	public Bureauutilisateur getBureauUtilisateurById(BureauutilisateurId BureauutilisateurId)
	{
		Bureauutilisateur myBureauUtilisateur = getHibernateTemplate().get(Bureauutilisateur.class, BureauutilisateurId);
		return myBureauUtilisateur;
	}

	public List<Bureauutilisateur> findBureauUtilisateur(String motCle)
	{
		return null;
	}
}
