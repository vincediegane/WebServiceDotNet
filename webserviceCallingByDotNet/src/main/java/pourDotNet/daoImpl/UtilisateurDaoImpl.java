package pourDotNet.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import pourDotNet.dao.IUtilisateurDao;
import pourDotNet.entite.Utilisateur;

public class UtilisateurDaoImpl extends HibernateDaoSupport implements IUtilisateurDao
{
	@Override
	@Transactional(readOnly = false)
	public boolean addUtilisateur(Utilisateur Utilisateur)
	{
		getHibernateTemplate().saveOrUpdate(Utilisateur);
		getHibernateTemplate().flush();
		return false;		
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur Utilisateur)
	{
		return null;
	}

	@Override
	public boolean deleteUtilisateur(String numUtilisateur)
	{
		Utilisateur myUt = getUtilisateurById(numUtilisateur) ;
		if(myUt!= null)
			getHibernateTemplate().delete(myUt);
		return false;
	}

	@Override
	public boolean signInUtilisateur(String login, String password)
	{
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Utilisateur> getAllUtilisateur()
	{
		return (List<Utilisateur>)getHibernateTemplate().find("from Utilisateur");
	}

	@Override
	public Utilisateur getUtilisateurById(String numUtilisateur)
	{
		Utilisateur myCRB = getHibernateTemplate().get(Utilisateur.class, numUtilisateur);
		return myCRB;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Utilisateur> findUtilisateur(String motCle)
	{
		return (List<Utilisateur>)getHibernateTemplate().find("from Utilisateur");
	}
}
