package pourDotNet.daoImpl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import pourDotNet.dao.IRoleDao;
import pourDotNet.entite.Role;

public class RoleDaoImpl extends HibernateDaoSupport implements IRoleDao
{
	public boolean addRole(Role Role)
	{
		getHibernateTemplate().saveOrUpdate(Role);
		getHibernateTemplate().flush();
		return false;
	}
	
	public Role updateRole(Role Role)
	{
		getHibernateTemplate().saveOrUpdate(Role);
		return Role;
	}
	
	public boolean deleteRole(Integer numRole)
	{
		Role myRole = getRoleById(numRole);
		if(myRole!= null)
			getHibernateTemplate().delete(myRole);
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Role> getAllRole()
	{
		return (List<Role>)getHibernateTemplate().find("from Role");
	}
	
	public Role getRoleById(Integer numRole)
	{
		Role myRole = getHibernateTemplate().get(Role.class, numRole);
		return myRole;
	}
	
	public List<Role> findRole(String motCle)
	{
		return null;
	}
}
