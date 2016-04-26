package com.spider.kittensoup;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class KittenWriter 
{
	private KittenSpider ks;
	private File text;
	/*
	 * @param The crawler you want to link to the writer
	 */
	public KittenWriter(KittenSpider ks)
	{
		this.ks = ks;
	}
	/*
	 * @param path you want to write to
	 */
	public void writeLinks(String path)
	{
		try{
		Stack links = ks.listLinks();
		String linkString = ks.stackToString(links);
		text = new File(path);
		if(!text.exists()){text.createNewFile();}
		FileWriter fw = new FileWriter(text.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("---Links---");
		bw.newLine();
		bw.write(linkString);
		bw.newLine();
		bw.write("-----------");
		bw.close();
		}
		catch(IOException e){e.printStackTrace();}
	}
	/*
	 * @param path you want to write to
	 */
	public void writeMedia(String path)
	{
		try{
			Stack media = ks.listMedia();
			String mediaString = ks.stackToString(media);
			text = new File(path);
			if(!text.exists()){text.createNewFile();}
			FileWriter fw = new FileWriter(text.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("---Media---");
			bw.newLine();
			bw.write(mediaString);
			bw.newLine();
			bw.write("-----------");
			bw.close();
			}
			catch(IOException e){e.printStackTrace();}
	}
	/*
	 * @param path you want to write to
	 */
	public void writeAll(String path)
	{
		try
		{
			Stack media = ks.listMedia();
			Stack links = ks.listLinks();
			String mediaString = ks.stackToString(media);
			String linkString = ks.stackToString(links);
			text = new File(path);
			if(!text.exists()){text.createNewFile();}
			FileWriter fw = new FileWriter(text.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("---Media---");
			bw.newLine();
			bw.write(mediaString);
			bw.newLine();
			bw.write("-----------");
			bw.newLine();
			bw.newLine();
			bw.write("---Links---");
			bw.newLine();
			bw.write(linkString);
			bw.newLine();
			bw.write("-----------");
			bw.close();
		}
		catch(IOException e){e.printStackTrace();}
	}
}
