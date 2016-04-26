package com.spider.kittensoup;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class View 
{
	public void display() throws IOException
	{
		boolean done = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("***Welcome to Kitten Soup v.3!***");
		System.out.println("Written by Daniye S. Bartell - April 25, 2016");
		System.out.println();
		
		while(!done){
		System.out.println("What is the url  you would like to crawl?");
		System.out.println("(https://example.edu)");
		String url = scan.nextLine();
		System.out.println("Fetching information from " + url + "...");
		KittenSpider ks = new KittenSpider(url);
		KittenWriter kw = new KittenWriter(ks);
		Stack links = ks.listLinks();
		Stack media = ks.listMedia();
		String linkString = ks.stackToString(links);
		String mediaString = ks.stackToString(media);
		System.out.println("The kitty brought you some info, look!");
		System.out.println("---Links---");
		System.out.println(linkString);
		System.out.println("-----------");
		System.out.println();
		System.out.println("---Media---");
		System.out.println(mediaString);
		System.out.println("-----------");
		System.out.println();
		System.out.println("Would you like to save it to a file? (yes/no)");
		String save = scan.nextLine();
		if(save == "yes")
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
		else if(choice == "no")
		{System.out.println("Okay, bye bye!");
		done = true;}
		else
		{System.out.println("I didn't get that, but I guess I'm gonna terminate now! Bye!");
		done = true;}
		}
	}
}
