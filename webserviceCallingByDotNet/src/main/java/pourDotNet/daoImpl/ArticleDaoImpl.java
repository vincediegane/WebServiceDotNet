package pourDotNet.daoImpl;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import pourDotNet.dao.IArticleDao;
import pourDotNet.entite.Article;

public class ArticleDaoImpl extends HibernateDaoSupport implements IArticleDao
{	
	public boolean addArticle(Article Article)
	{
		getHibernateTemplate().saveOrUpdate(Article);
		getHibernateTemplate().flush();
		return false;
	}

	public Article updateArticle(Article Article)
	{
		getHibernateTemplate().saveOrUpdate(Article);
		return Article;
	}

	public boolean deleteArticle(String numArt)
	{
		Article myArticle = getArticleById(numArt);
		if(myArticle!= null)
			getHibernateTemplate().delete(myArticle);
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Article> getAllArticle()
	{
		return (List<Article>)getHibernateTemplate().find("from Article");
	}

	public Article getArticleById(String numArt)
	{
		Article myArticle = getHibernateTemplate().get(Article.class, numArt);
		return myArticle;
	}

	public List<Article> findArticle(String motCle)
	{
		return null;
	}
	
	public void init()
	{
		System.out.println("init is good----------------");
	}
}

