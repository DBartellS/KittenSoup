package com.spider.kittensoup;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
/*
 * @author Daniye S. Bartell
 * @version 4/25/2016
 */
public class View 
{
	/*
	 * Runs the entire user interface, for now
	 * Expected to be totally removed in the final version
	 */
	public void display() throws IOException
	{
		boolean done = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("***Welcome to Kitten Soup v0.3!***");
		System.out.println("Written by Daniye S. Bartell - April 25, 2016");
		System.out.println();
		
		while(!done){
		System.out.println("What is the url  you would like to crawl?");
		System.out.println("(https://example.edu)");
		String url = scan.nextLine();
		System.out.println("Fetching information from " + url + "...");
		Crawler ks = new Crawler(url);
		CrawlWriter kw = new CrawlWriter(ks);
		Stack links = ks.listLinks();
		Stack media = ks.listMedia();
		System.out.println("\nThe kitty brought you some info, look!");
		System.out.println("---Links---");
		while(!links.isEmpty())
		{
			System.out.println(links.pop());
		}
		System.out.println("-----------");
		System.out.println();
		System.out.println("---Media---");
		while(!media.isEmpty())
		{
			System.out.println(media.pop());
		}
		System.out.println("-----------");
		System.out.println();
		System.out.println("Would you like to save it to a file? (yes/no)");
		String save = scan.nextLine();
		if(save == "yes")
		//TODO: Find out why this if statement defaults to 'else' despite user input
		{
			System.out.println("What is the path you would like to save the file to?");
			String path = scan.nextLine();
			kw.writeAll(path);
			System.out.println("Looks like I saved it to " + "! If I could, that is.");
		}
		else if(save == "no"){System.out.println("Well okay, suit yourself.");}
		else{System.out.println("Sorry, I didn't get that... Oh well.");}
		System.out.println();
		System.out.println("Would you like to crawl again? (yes/no)");
		String choice = scan.nextLine();
		if(choice == "yes"){System.out.println("IT'S WEB SURFIN' TIME!");}
		//TODO: Find out why this if statement defaults to 'else' despite user input
		else if(choice == "no")
		{System.out.println("Okay, bye bye!");
		done = true;}
		else
		{System.out.println("I didn't get that, but I guess I'm gonna terminate now! Bye!");
		done = true;}
		}
	}
}
