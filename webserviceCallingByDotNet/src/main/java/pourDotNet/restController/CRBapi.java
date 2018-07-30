package pourDotNet.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pourDotNet.dao.ICRBDao;
import pourDotNet.entite.Crb;

@RestController
public class CRBapi
{
	/*@Autowired*/
	private ICRBDao dao;
	
	@RequestMapping(value = "/allCrbs",method=RequestMethod.GET)
	@ResponseBody
	public List<Crb> listCrbs()
	{
		return dao.getAllCRB();
	}
	
	@RequestMapping(value = "/allCrbs{num}",method=RequestMethod.GET)
	@ResponseBody
	public Crb getCrbByNum(@PathVariable("num")String num)
	{
		return dao.getCRBById(num);
	}

	@RequestMapping(value = "/saveCrb",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveCrb(@RequestBody Crb crb)
	{
		return dao.addCRB(crb);
	}
	@RequestMapping(value = "/editCrb",method=RequestMethod.PUT)
	@ResponseBody
	public Crb updateCrb(@RequestBody Crb crb)
	{
		return dao.updateCRB(crb);
	}
	@RequestMapping(value = "/deleteCrb", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCrb(@RequestBody String num)
	{		
		dao.deleteCRB(num);
	}
}
