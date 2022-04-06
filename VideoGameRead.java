package Practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class VideoGameRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoGameRead game = new VideoGameRead();
		LinkedList<VideoGames> games = new LinkedList<VideoGames>();
		games = game.readFile(games);
		
		for(int i = 0; i < games.size(); i++) {
			System.out.println(games.get(i) + "\n");
		}
		
	}
	public LinkedList<VideoGames> readFile(LinkedList<VideoGames> list){
		
		String fileName = "videogamelist.txt";
		File originFile = null;
		Scanner inputFile = null;
		
		try {
			//Opens file that will be read from
			originFile = new File(fileName);
			inputFile = new Scanner(originFile);
		}
		catch (FileNotFoundException ex) {
		System.out.println("Cannot open file");
		return list;
	}
		try {
			while(inputFile.hasNextLine()) {
				String gameName = inputFile.nextLine();
				String gameCreator = inputFile.nextLine();
				String numOfCopies = inputFile.nextLine();
				int numCopies = Integer.parseInt(numOfCopies);
				VideoGames game1 = new VideoGames(gameName, gameCreator, numOfCopies);
				list.add(game1);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Problem Occured While Reading File");
		}
		finally {
			inputFile.close();
			}
		return list;
		}
}
