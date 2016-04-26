package com.spider.kittensoup;

import java.io.IOException;
import java.util.Stack;
/*
 * @author Daniye S. Bartell
 * @version 4/25/2016
 */
public class Driver 
{
	public static void main(String[] args) throws IOException
	{
		//TODO: implement JavaFX (this won't happen for a while)
		View v = new View();
		
		try 
		{
			v.display();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
