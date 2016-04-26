package com.spider.kittensoup;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
public class KittenSpider 
{
	private String URL;
	private File text;
	/*
	 * @param the url you want to crawl
	 */
	public KittenSpider(String URL)
	{
		this.URL = URL;
	}
	/*
	 * @return A stack of every link from the html page
	 */
	public Stack listLinks() throws IOException
	{
		Stack result = new Stack();
		Document doc = Jsoup.connect(URL).get();
		Elements links = doc.select("a[href]");
		for(Element link: links)
		{
			result.push(links);
		}
		return result;
	}
	/*
	 * @return A stack of every media element from the html page
	 */
	public Stack listMedia() throws IOException
	{
		Stack result = new Stack();
		Document doc = Jsoup.connect(URL).get();
		Elements links = doc.select("[src]");
		for(Element link: links)
		{
			result.push(link);
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
