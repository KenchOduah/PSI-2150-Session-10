package Practice;

import java.io.*;
import java.util.*;

public class VideoGameWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<VideoGames> games = new LinkedList<VideoGames>();
		//Create some data for the file
		
		games.add(new VideoGames("Cool Game","Cool Guy","100000"));
		games.add(new VideoGames("Cooler Game","Cooler Guy","1000000"));
		games.add(new VideoGames("Coolest Game","Coolest Guy","10000000"));
		
		File originFile;
		PrintWriter outputfile = null;
		
		try {
			//open file for writing
			
			String fileName = "videogameswritten.txt";
			originFile = new File(fileName);
			outputfile = new PrintWriter(originFile);

			} 
		catch (IOException ex) {
			System.out.println("Unable to open that file- check directory information and file name");
		}
		try {

			// print works

			for (VideoGames game : games) {
				outputfile.println(game.getGameName());
				outputfile.println(game.getGameCreator());
				outputfile.println(game.getNumOfCopies());	
			}
		}
	 catch (Exception ex) {
		System.out.println("Error encountered writing to file");
	 } 
	finally {
		outputfile.close();
		}
	}

}
