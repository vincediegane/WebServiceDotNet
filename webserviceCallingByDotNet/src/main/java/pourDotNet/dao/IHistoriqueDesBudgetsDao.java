package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Historiquedesbudgets;

public interface IHistoriqueDesBudgetsDao {
	public boolean addHistoriqueDesBudgets(Historiquedesbudgets HistoriqueDesBudgets);
	public Historiquedesbudgets updateHistoriqueDesBudgets(Historiquedesbudgets HistoriqueDesBudgets);
	public boolean deleteHistoriqueDesBudgets(Integer numHB);
	public List<Historiquedesbudgets> getAllHistoriqueDesBudgets();
	public Historiquedesbudgets getHistoriqueDesBudgetsById(Integer numHB);
	public List<Historiquedesbudgets> findHistoriqueDesBudgets(String motCle);
}
