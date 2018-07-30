package pourDotNet.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pourDotNet.dao.IDemandeDeConsommationDao;
import pourDotNet.entite.Demandedeconsommation;

@RestController
public class DemandeDeConsommationAPI
{
	/*@Autowired*/
	private IDemandeDeConsommationDao dao;
	
	@RequestMapping(value = "/allDemandeDeConsommations",method=RequestMethod.GET)
	@ResponseBody
	public List<Demandedeconsommation> listDemandeDeCons()
	{
		return dao.getAllDemandeDeConsommation();
	}
	
	@RequestMapping(value = "/allDemandeDeConsommations{num}",method=RequestMethod.GET)
	@ResponseBody
	public Demandedeconsommation getDemandedeconsByNum(@PathVariable("num")int num)
	{
		return dao.getDemandeDeConsommationById(num);
	}

	@RequestMapping(value = "/saveDemandeDeConsommation",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveDemandeDeConsommation(@RequestBody Demandedeconsommation demande)
	{
		return dao.addDemandeDeConsommation(demande);
	}
	@RequestMapping(value = "/editDemandeDeConsommation",method=RequestMethod.PUT)
	@ResponseBody
	public Demandedeconsommation updateUser(@RequestBody Demandedeconsommation demande)
	{
		return dao.updateDemandeDeConsommation(demande);
	}
	@RequestMapping(value = "/deleteDemandeDeConsommation", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDemandeDeConsommation(@RequestBody int num)
	{		
		dao.deleteDemandeDeConsommation(num);
	}
}
