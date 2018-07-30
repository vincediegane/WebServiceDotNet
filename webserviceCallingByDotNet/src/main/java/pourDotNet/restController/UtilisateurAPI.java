package pourDotNet.restController;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import pourDotNet.dao.IUtilisateurDao;
import pourDotNet.entite.Utilisateur;

@RestController
public class UtilisateurAPI
{
	/*@Autowired*/
	private IUtilisateurDao dao;
	
	@RequestMapping(value = "/allUsers",method=RequestMethod.GET)
	@ResponseBody
	public List<Utilisateur> listUsers()
	{
		return dao.getAllUtilisateur();
	}
	
	@RequestMapping(value = "/allUsers{num}",method=RequestMethod.GET)
	@ResponseBody
	public Utilisateur getUserByNum(@PathVariable("num")String num)
	{
		return dao.getUtilisateurById(num);
	}

	@RequestMapping(value = "/saveUser",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveUser(@RequestBody Utilisateur utilisateur)
	{
		return dao.addUtilisateur(utilisateur);
	}
	@RequestMapping(value = "/editUser",method=RequestMethod.PUT)
	@ResponseBody
	public Utilisateur updateUser(@RequestBody Utilisateur utilisateur)
	{
		return dao.updateUtilisateur(utilisateur);
	}
	@RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUser(@RequestBody String num)
	{		
		dao.deleteUtilisateur(num);
	}
}
