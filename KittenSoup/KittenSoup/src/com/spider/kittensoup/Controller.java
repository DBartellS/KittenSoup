package com.spider.kittensoup;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Stack;

import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

public class Controller 
{
	private Button linkButton,mediaButton;
	private TextField htmlTextField;
	private Hyperlink gitLink;
	private Crawler crawl;
	/*
	 * Makes links show up in the htmlTextField
	 */
	public <E> void pullLinks() throws IOException
	{
		crawl = new Crawler(htmlTextField.getText());
		Stack<E> links = crawl.listLinks();
		while(!links.isEmpty())
		{
			System.out.println(links.pop());
		}
	}
	/*
	 * Makes media elements show up in the htmlTextField
	 */
	public <E> void pullMedia() throws IOException
	{
		crawl = new Crawler(htmlTextField.getText());
		Stack<E> links = crawl.listMedia();
		while(!links.isEmpty())
		{
			System.out.println(links.pop());
		}
	}
	/*
	 * Displays all html in the htmlTextField
	 */
	public void pullHTML()
	{
		System.out.println("HTML");
	}
	public void gotoGitHub() throws IOException, URISyntaxException
	{
		if(Desktop.isDesktopSupported())
		{
		  Desktop.getDesktop().browse(new URI("https://github.com/DBartellS/KittenSoup.git"));
		}
	}
}
