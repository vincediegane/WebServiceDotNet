package pourDotNet.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pourDotNet.dao.ICompteGeneralDao;
import pourDotNet.entite.Comptegeneral;

@RestController
public class CompteGeneralAPI
{
	/*@Autowired*/
	private ICompteGeneralDao dao;
	
	@RequestMapping(value = "/allCompteGenerals",method=RequestMethod.GET)
	@ResponseBody
	public List<Comptegeneral> listCompteGenerals()
	{
		return dao.getAllCompteGeneral();
	}
	
	@RequestMapping(value = "/allCompteGenerals{num}",method=RequestMethod.GET)
	@ResponseBody
	public Comptegeneral getCompteGeneralByNum(@PathVariable("num")String num)
	{
		return dao.getCompteGeneralById(num);
	}

	@RequestMapping(value = "/saveCompteGeneral",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveCompteGeneral(@RequestBody Comptegeneral compte)
	{
		return dao.addCompteGeneral(compte);
	}
	@RequestMapping(value = "/editCompteGeneral",method=RequestMethod.PUT)
	@ResponseBody
	public Comptegeneral updateCompteGeneral(@RequestBody Comptegeneral compte)
	{
		return dao.updateCompteGeneral(compte);
	}
	@RequestMapping(value = "/deleteCompteGeneral", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCompteGeneral(@RequestBody String num)
	{		
		dao.deleteCompteGeneral(num);
	}
}
