package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Exercicebudgetaire;

public interface IExerciceBudgetaireDao {
	public boolean addExerciceBudgetaire(Exercicebudgetaire ExerciceBudgetaire);
	public Exercicebudgetaire updateExerciceBudgetaire(Exercicebudgetaire ExerciceBudgetaire);
	public boolean deleteExerciceBudgetaire(String anneeBudg);
	public List<Exercicebudgetaire> getAllExerciceBudgetaire();
	public Exercicebudgetaire getExerciceBudgetaireById(String anneeBudg);
	public List<Exercicebudgetaire> findExerciceBudgetaire(String motCle);
}
