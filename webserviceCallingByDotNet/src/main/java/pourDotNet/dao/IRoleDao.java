package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Role;

public interface IRoleDao {
	public boolean addRole(Role Role);
	public Role updateRole(Role Role);
	public boolean deleteRole(Integer numRole);
	public List<Role> getAllRole();
	public Role getRoleById(Integer numRole);
	public List<Role> findRole(String motCle);
}
