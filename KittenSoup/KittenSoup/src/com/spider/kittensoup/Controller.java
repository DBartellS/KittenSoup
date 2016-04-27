package com.spider.kittensoup;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

public class Controller 
{
	private Button linkButton,mediaButton;
	private TextField htmlTextField;
	private Hyperlink gitLink;
	/*
	 * Makes links show up in the htmlTextField
	 */
	public void pullLinks()
	{
		System.out.println("Links");
	}
	/*
	 * Makes media elements show up in the htmlTextField
	 */
	public void pullMedia()
	{
		System.out.println("Media");
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
