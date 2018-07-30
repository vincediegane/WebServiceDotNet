package pourDotNet.dao;

import java.util.List;
import pourDotNet.entite.Article;


public interface IArticleDao {
	public boolean addArticle(Article Article);
	public Article updateArticle(Article Article);
	public boolean deleteArticle(String numArt);
	public List<Article> getAllArticle();
	public Article getArticleById(String numArt);
	public List<Article> findArticle(String motCle);
}
