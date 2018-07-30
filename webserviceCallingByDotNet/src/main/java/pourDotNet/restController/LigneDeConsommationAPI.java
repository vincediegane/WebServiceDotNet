package pourDotNet.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pourDotNet.dao.ILigneDeConsommationDao;
import pourDotNet.entite.Lignedeconsommation;

@RestController
public class LigneDeConsommationAPI
{
	/*@Autowired*/
	private ILigneDeConsommationDao dao;
	
	@RequestMapping(value = "/allLignes",method=RequestMethod.GET)
	@ResponseBody
	public List<Lignedeconsommation> listLignes()
	{
		return dao.getAllLigneDeConsommation();
	}
	
	@RequestMapping(value = "/allLignes{num}",method=RequestMethod.GET)
	@ResponseBody
	public Lignedeconsommation getLigneByNum(@PathVariable("num")int num)
	{
		return dao.getLigneDeConsommationById(num);
	}

	@RequestMapping(value = "/saveLigne",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveLigne(@RequestBody Lignedeconsommation ligne)
	{
		return dao.addLigneDeConsommation(ligne);
	}
	@RequestMapping(value = "/editLigne",method=RequestMethod.PUT)
	@ResponseBody
	public Lignedeconsommation updateLigne(@RequestBody Lignedeconsommation ligne)
	{
		return dao.updateLigneDeConsommation(ligne);
	}
	@RequestMapping(value = "/deleteLigne", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteLigne(@RequestBody int num)
	{		
		dao.deleteLigneDeConsommation(num);
	}
}
