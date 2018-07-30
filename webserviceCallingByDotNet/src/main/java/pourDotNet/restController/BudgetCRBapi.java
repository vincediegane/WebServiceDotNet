package pourDotNet.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pourDotNet.dao.IBudgetCRBDao;
import pourDotNet.entite.Budgetcrb;
import pourDotNet.entite.BudgetcrbId;

@RestController
public class BudgetCRBapi
{
	/*@Autowired*/
	private IBudgetCRBDao dao;
	
	@RequestMapping(value = "/allBudgetcrbs",method=RequestMethod.GET)
	@ResponseBody
	public List<Budgetcrb> listBudgetcrbs()
	{
		return dao.getAllBudgetCRB();
	}
	
	@RequestMapping(value = "/allBudgetcrbs{num}",method=RequestMethod.GET)
	@ResponseBody
	public Budgetcrb getUserByNum(@PathVariable("num")BudgetcrbId budgetcrbid)
	{
		return dao.getBudgetCRBById(budgetcrbid);
	}

	@RequestMapping(value = "/saveBudgetcrb",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveBudgetcrb(@RequestBody Budgetcrb budgetcrb)
	{
		return dao.addBudgetCRB(budgetcrb);
	}
	@RequestMapping(value = "/editBudgetcrb",method=RequestMethod.PUT)
	@ResponseBody
	public Budgetcrb updateBudgetcrb(@RequestBody Budgetcrb budgetcrb)
	{
		return dao.updateBudgetCRB(budgetcrb);
	}
	@RequestMapping(value = "/deleteBudgetcrb", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteUser(@RequestBody BudgetcrbId budgetcrbId)
	{		
		dao.deleteBudgetCRB(budgetcrbId);
	}
}
