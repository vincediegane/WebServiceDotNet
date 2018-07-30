package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Comptebudgetaire;


public interface ICompteBudgetaireDao {
	public boolean addCompteBudgetaire(Comptebudgetaire CompteBudgetaire);
	public Comptebudgetaire updateCompteBudgetaire(Comptebudgetaire CompteBudgetaire);
	public boolean deleteCompteBudgetaire(String numCB);
	public List<Comptebudgetaire> getAllCompteBudgetaire();
	public Comptebudgetaire getCompteBudgetaireById(String numCB);
	public List<Comptebudgetaire> findCompteBudgetaire(String motCle);
}
