package com.spider.kittensoup;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class CrawlReader 
{
	private Crawler crawl;
	private File text;
	
	public CrawlReader(Crawler crawl)
	{
		this.crawl = crawl;
	}
	
	public String readHTML(File text) throws IOException
	{
		String result = "";
		/*Document doc = Jsoup.parse(text, "UTF-8","");
		result += doc.toString();*/
		return result;
	}
}
