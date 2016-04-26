package com.spider.kittensoup;
import java.io.IOException;
import java.util.Stack;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 * @author Daniye S. Bartell
 * @version 4/25/2016
 */
public class Crawler 
{
	//TODO: make the Crawler class a comprehensive web crawler, not just an HTML parser
	private String URL;
	/*
	 * @param the url you want to crawl
	 */
	public Crawler(String URL)
	{
		this.URL = URL;
	}
	/*
	 * @return A stack of every link from the html page
	 */
	public Stack listLinks() throws IOException
	{
		//TODO: possibly make this method return a string and format the string to be human readable
		Stack result = new Stack();
		Document doc = Jsoup.connect(URL).get();
		Elements links = doc.select("a[href]");
		String temp = "";
		String temp2 = "";
		for(Element link: links)
		{
			 temp = "link : " + link.attr("href");  
			 temp2 = "\ntext : " + link.text() + "\n";
			 temp += temp2;
			 result.push(temp);
		}
		return result;
	}
	/*
	 * @return A stack of every media element from the html page
	 */
	public Stack listMedia() throws IOException
	{
		//TODO: possibly make this method return a string and format the string to be human readable
		Stack result = new Stack();
		Document doc = Jsoup.connect(URL).get();
		Elements images =  doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
		String temp = "";
		String temp2 = "";
		for(Element image: images)
		{
			 temp = "src : " + image.attr("src");  
			 temp2 = "\nalt : " + image.attr("alt") + "\n";
			 temp += temp2;
			 result.push(temp);
		}
		return result;
	}
	/*
	 * @param Stack of anything you want to be a string
	 * @return A string of that stack
	 */
	public String stackToString(Stack stack)
	{
		String result = "";
		while(!stack.isEmpty())
		{
			result = stack.pop().toString();
		}
		return result;
	}
	/*
	 * @return A string containing all HTML from a document
	 */
	public String getAllHTML() throws IOException
	{
		Document doc = Jsoup.connect(URL).get();
		String result = doc.toString();
		return result;
	}
	
	public String getURL() 
	{
		return URL;
	}
	/*
	 * @param the url you want to set as the KittenSpider object's URL
	 */
	public void setURL(String uRL) 
	{
		URL = uRL;
	}
	
}
