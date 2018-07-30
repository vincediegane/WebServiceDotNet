package pourDotNet.restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pourDotNet.dao.IArticleDao;
import pourDotNet.entite.Article;

@RestController
public class ArticleAPI
{
	/*@Autowired*/
	private IArticleDao dao;
	
	@RequestMapping(value = "/allArticles",method=RequestMethod.GET)
	@ResponseBody
	public List<Article> listArticles()
	{
		return dao.getAllArticle();
	}
	
	@RequestMapping(value = "/allArticles{num}",method=RequestMethod.GET)
	@ResponseBody
	public Article getArticleByNum(@PathVariable("num")String num)
	{
		return dao.getArticleById(num);
	}

	@RequestMapping(value = "/saveArticle",method=RequestMethod.POST)
	@ResponseBody
	public Boolean saveArticle(@RequestBody Article article)
	{
		return dao.addArticle(article);
	}
	
	@RequestMapping(value = "/editArticle",method=RequestMethod.PUT)
	@ResponseBody
	public Article updateArticle(@RequestBody Article article)
	{
		return dao.updateArticle(article);
	}

	@RequestMapping(value = "/deleteArticle", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteArticle(@RequestBody String num)
	{		
		dao.deleteArticle(num);
	}
}
