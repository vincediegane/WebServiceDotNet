package pourDotNet.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pourDotNet.dao.ICompteBudgetaireDao;
import pourDotNet.entite.Comptebudgetaire;

@RestController
public class CompteBudgetaiteAPI
{
	/*@Autowired*/
	private ICompteBudgetaireDao dao;
	
	@RequestMapping(value = "/allCompteBudgetaires",method=RequestMethod.GET)
	@ResponseBody
	public List<Comptebudgetaire> listCompteBudgetaires()
	{
		return dao.getAllCompteBudgetaire();
	}
	
	@RequestMapping(value = "/allCompteBudgetaires{num}",method=RequestMethod.GET)
	@ResponseBody
	public Comptebudgetaire getCompteBudgetaireByNum(@PathVariable("num")String num)
	{
		return dao.getCompteBudgetaireById(num);
	}

	@RequestMapping(value = "/saveCompteBudgetaire",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveCompteBudgetaire(@RequestBody Comptebudgetaire compte)
	{
		return dao.addCompteBudgetaire(compte);
	}
	@RequestMapping(value = "/editCompteBudgetaire",method=RequestMethod.PUT)
	@ResponseBody
	public Comptebudgetaire updateCompteBudgetaire(@RequestBody Comptebudgetaire compte)
	{
		return dao.updateCompteBudgetaire(compte);
	}
	@RequestMapping(value = "/deleteCompteBudgetaire", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteCompteBudgetaire(@RequestBody String num)
	{		
		dao.deleteCompteBudgetaire(num);
	}
}
