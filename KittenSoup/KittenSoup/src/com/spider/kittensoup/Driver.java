package com.spider.kittensoup;

import java.io.IOException;

public class Driver 
{
	public static void main(String[] args)
	{
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
