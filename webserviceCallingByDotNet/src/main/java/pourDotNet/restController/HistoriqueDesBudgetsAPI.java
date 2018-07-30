package pourDotNet.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pourDotNet.dao.IHistoriqueDesBudgetsDao;
import pourDotNet.entite.Historiquedesbudgets;

@RestController
public class HistoriqueDesBudgetsAPI
{
	/*@Autowired*/
	private IHistoriqueDesBudgetsDao dao;
	
	@RequestMapping(value = "/allHistoriques",method=RequestMethod.GET)
	@ResponseBody
	public List<Historiquedesbudgets> listHistoriques()
	{
		return dao.getAllHistoriqueDesBudgets();
	}
	
	@RequestMapping(value = "/allHistoriques{num}",method=RequestMethod.GET)
	@ResponseBody
	public Historiquedesbudgets getHistoriqueByNum(@PathVariable("num")int num)
	{
		return dao.getHistoriqueDesBudgetsById(num);
	}

	@RequestMapping(value = "/saveHistorique",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveHistorique(@RequestBody Historiquedesbudgets historique)
	{
		return dao.addHistoriqueDesBudgets(historique);
	}
	@RequestMapping(value = "/editHistorique",method=RequestMethod.PUT)
	@ResponseBody
	public Historiquedesbudgets updateHistorique(@RequestBody Historiquedesbudgets historique)
	{
		return dao.updateHistoriqueDesBudgets(historique);
	}
	@RequestMapping(value = "/deleteHistorique", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteHistorique(@RequestBody int num)
	{		
		dao.deleteHistoriqueDesBudgets(num);
	}
}
