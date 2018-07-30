package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Budgetcrb;
import pourDotNet.entite.BudgetcrbId;


public interface IBudgetCRBDao {
	public boolean addBudgetCRB(Budgetcrb BudgetCRB);
	public Budgetcrb updateBudgetCRB(Budgetcrb BudgetCRB);
	public boolean deleteBudgetCRB(BudgetcrbId BudgetcrbId);
	public List<Budgetcrb> getAllBudgetCRB();
	public Budgetcrb getBudgetCRBById(BudgetcrbId BudgetcrbId);
	public List<Budgetcrb> findBudgetCRB(String motCle);
}
