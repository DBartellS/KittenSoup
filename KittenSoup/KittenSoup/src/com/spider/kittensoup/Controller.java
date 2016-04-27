package com.spider.kittensoup;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller 
{
	private Button linkButton,mediaButton;
	private TextField htmlTextField;
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
}
