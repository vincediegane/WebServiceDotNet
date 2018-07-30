package pourDotNet.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pourDotNet.dao.IBureauAdministratifComptableDao;
import pourDotNet.entite.Bureauadministratifcomptable;

@RestController
public class BureauAdministratifComptableAPI
{
	/*@Autowired*/
	private IBureauAdministratifComptableDao dao;
	
	@RequestMapping(value = "/allBureauAdministratifComptables",method=RequestMethod.GET)
	@ResponseBody
	public List<Bureauadministratifcomptable> listBureauAdministratifComptable()
	{
		return dao.getAllBureauAdministratifComptable();
	}
	
	@RequestMapping(value = "/allBureauAdministratifComptables{num}",method=RequestMethod.GET)
	@ResponseBody
	public Bureauadministratifcomptable getBureauAdministratifComptableByNum(@PathVariable("num")String num)
	{
		return dao.getBureauAdministratifComptableById(num);
	}

	@RequestMapping(value = "/saveBureauAdministratifComptable",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveBureauAdministratifComptable(@RequestBody Bureauadministratifcomptable bureau)
	{
		return dao.addBureauAdministratifComptable(bureau);
	}
	@RequestMapping(value = "/editBureauAdministratifComptable",method=RequestMethod.PUT)
	@ResponseBody
	public Bureauadministratifcomptable updateBureauAdministratifComptable(@RequestBody Bureauadministratifcomptable bureau)
	{
		return dao.updateBureauAdministratifComptable(bureau);
	}
	@RequestMapping(value = "/deleteBureauAdministratifComptable", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBureauAdministratifComptable(@RequestBody String num)
	{		
		dao.deleteBureauAdministratifComptable(num);
	}
}
