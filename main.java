package basketballtournament;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Scanner;

public static void main(String[] args) throws IOException{		
		while(true){
			String East1 = null, East2 = null, East3 = null, East4 = null, East5 = null, East6 = null, 
					East7 = null, East8 = null, East9 = null, East10 = null, East11 = null, East12 = null, East13 = null, 
					East14 = null, East15 = null, East16 = null, West1 = null, West2 = null, West3 = null, West4 = null, 
					West5 = null, West6 = null, West7 = null, West8 = null, West9 = null, West10 = null, West11 = null, 
					West12 = null, West13 = null, West14 = null, West15 = null, West16 = null, Midwest1 = null, Midwest2 = null, 
					Midwest3 = null, Midwest4 = null, Midwest5 = null, Midwest6 = null, Midwest7 = null, Midwest8 = null, 
					Midwest9 = null, Midwest10 = null, Midwest11 = null, Midwest12 = null, Midwest13 = null, Midwest14 = null, 
					Midwest15 = null, Midwest16 = null, South1 = null, South2 = null, South3 = null, South4 = null, South5 = null, 
					South6 = null, South7 = null, South8 = null, South9 = null, South10 = null, South11 = null, South12 = null, 
					South13 = null, South14 = null, South15 = null, South16 = null;
	
	
	
	
			Scanner scan = new Scanner(System.in);
			System.out.println("Input Type: 1 (File) 2 (Manual Input)");
			int input = scan.nextInt();
			if (input == 1){
				System.out.println("Type the file name (include .txt):");
				scan.nextLine();
				String fileName = scan.nextLine();
		        Scanner in;
		        try {
		            in = new Scanner(new File(fileName));
		        } catch (FileNotFoundException e) {
		            System.out.println("File not found.");
		            return;
		        }
				East1 = in.nextLine();
				East16 = in.nextLine();
				East8 = in.nextLine();
				East9 = in.nextLine();
				East5 = in.nextLine();
				East12 = in.nextLine();
				East4 = in.nextLine();
				East13 = in.nextLine();
				East6 = in.nextLine();
				East11 = in.nextLine();
				East3 = in.nextLine();
				East14 = in.nextLine();
				East7 = in.nextLine();
				East10 = in.nextLine();
				East2 = in.nextLine();
				East15 = in.nextLine();
				West1 = in.nextLine();
				West16 = in.nextLine();
				West8 = in.nextLine();
				West9 = in.nextLine();
				West5 = in.nextLine();
				West12 = in.nextLine();
				West4 = in.nextLine();
				West13 = in.nextLine();
				West6 = in.nextLine();
				West11 = in.nextLine();
				West3 = in.nextLine();
				West14 = in.nextLine();
				West7 = in.nextLine();
				West10 = in.nextLine();
				West2 = in.nextLine();
				West15 = in.nextLine();
				Midwest1 = in.nextLine();
				Midwest16 = in.nextLine();
				Midwest8 = in.nextLine();
				Midwest9 = in.nextLine();
				Midwest5 = in.nextLine();
				Midwest12 = in.nextLine();
				Midwest4 = in.nextLine();
				Midwest13 = in.nextLine();
				Midwest6 = in.nextLine();
				Midwest11 = in.nextLine();
				Midwest3 = in.nextLine();
				Midwest14 = in.nextLine();
				Midwest7 = in.nextLine();
				Midwest10 = in.nextLine();
				Midwest2 = in.nextLine();
				Midwest15 = in.nextLine();
				South1 = in.nextLine();
				South16 = in.nextLine();
				South8 = in.nextLine();
				South9 = in.nextLine();
				South5 = in.nextLine();
				South12 = in.nextLine();
				South4 = in.nextLine();
				South13 = in.nextLine();
				South6 = in.nextLine();
				South11 = in.nextLine();
				South3 = in.nextLine();
				South14 = in.nextLine();
				South7 = in.nextLine();
				South10 = in.nextLine();
				South2 = in.nextLine();
				South15 = in.nextLine();
				in.close();
			}
			
			else{
				/**
				 * East Region
				 */
				System.out.println("     ");
				System.out.println("East Region");
				System.out.println("Enter the #1 seed in the East");
				scan.nextLine();
				East1 = scan.nextLine();
				System.out.println("Enter the #16 seed in the East");
				East16 = scan.nextLine();
				System.out.println("Enter the #8 seed in the East");
				East8 = scan.nextLine();
				System.out.println("Enter the #9 seed in the East");
				East9 = scan.nextLine();
				System.out.println("Enter the #5 seed in the East");
				East5 = scan.nextLine();
				System.out.println("Enter the #12 seed in the East");
				East12 = scan.nextLine();
				System.out.println("Enter the #4 seed in the East");
				East4 = scan.nextLine();
				System.out.println("Enter the #13 seed in the East");
				East13 = scan.nextLine();
				System.out.println("Enter the #6 seed in the East");
				East6 = scan.nextLine();
				System.out.println("Enter the #11 seed in the East");
				East11 = scan.nextLine();
				System.out.println("Enter the #3 seed in the East");
				East3 = scan.nextLine();
				System.out.println("Enter the #14 seed in the East");
				East14 = scan.nextLine();
				System.out.println("Enter the #7 seed in the East");
				East7 = scan.nextLine();
				System.out.println("Enter the #10 seed in the East");
				East10 = scan.nextLine();
				System.out.println("Enter the #2 seed in the East");
				East2 = scan.nextLine();
				System.out.println("Enter the #15 seed in the East");
				East15 = scan.nextLine();
				
				/**
				 * West Region
				 */
				System.out.println("West Region");
				System.out.println("Enter the #1 seed in the West");
				West1 = scan.nextLine();
				System.out.println("Enter the #16 seed in the West");
				West16 = scan.nextLine();
				System.out.println("Enter the #8 seed in the West");
				West8 = scan.nextLine();
				System.out.println("Enter the #9 seed in the West");
				West9 = scan.nextLine();
				System.out.println("Enter the #5 seed in the West");
				West5 = scan.nextLine();
				System.out.println("Enter the #12 seed in the West");
				West12 = scan.nextLine();
				System.out.println("Enter the #4 seed in the West");
				West4 = scan.nextLine();
				System.out.println("Enter the #13 seed in the West");
				West13 = scan.nextLine();
				System.out.println("Enter the #6 seed in the West");
				West6 = scan.nextLine();
				System.out.println("Enter the #11 seed in the West");
				West11 = scan.nextLine();
				System.out.println("Enter the #3 seed in the West");
				West3 = scan.nextLine();
				System.out.println("Enter the #14 seed in the West");
				West14 = scan.nextLine();
				System.out.println("Enter the #7 seed in the West");
				West7 = scan.nextLine();
				System.out.println("Enter the #10 seed in the West");
				West10 = scan.nextLine();
				System.out.println("Enter the #2 seed in the West");
				West2 = scan.nextLine();
				System.out.println("Enter the #15 seed in the West");
				West15 = scan.nextLine();
				
				/**
				 * Midwest Region
				 */
				System.out.println("Midwest Region");
				System.out.println("Enter the #1 seed in the Midwest");
				Midwest1 = scan.nextLine();
				System.out.println("Enter the #16 seed in the Midwest");
				Midwest16 = scan.nextLine();
				System.out.println("Enter the #8 seed in the Midwest");
				Midwest8 = scan.nextLine();
				System.out.println("Enter the #9 seed in the Midwest");
				Midwest9 = scan.nextLine();
				System.out.println("Enter the #5 seed in the Midwest");
				Midwest5 = scan.nextLine();
				System.out.println("Enter the #12 seed in the Midwest");
				Midwest12 = scan.nextLine();
				System.out.println("Enter the #4 seed in the Midwest");
				Midwest4 = scan.nextLine();
				System.out.println("Enter the #13 seed in the Midwest");
				Midwest13 = scan.nextLine();
				System.out.println("Enter the #6 seed in the Midwest");
				Midwest6 = scan.nextLine();
				System.out.println("Enter the #11 seed in the Midwest");
				Midwest11 = scan.nextLine();
				System.out.println("Enter the #3 seed in the Midwest");
				Midwest3 = scan.nextLine();
				System.out.println("Enter the #14 seed in the Midwest");
				Midwest14 = scan.nextLine();
				System.out.println("Enter the #7 seed in the Midwest");
				Midwest7 = scan.nextLine();
				System.out.println("Enter the #10 seed in the Midwest");
				Midwest10 = scan.nextLine();
				System.out.println("Enter the #2 seed in the Midwest");
				Midwest2 = scan.nextLine();
				System.out.println("Enter the #15 seed in the Midwest");
				Midwest15 = scan.nextLine();
	
		
				/**
				 * South Region
				 */
				System.out.println("South Region");
				System.out.println("Enter the #1 seed in the South");
				South1 = scan.nextLine();
				System.out.println("Enter the #16 seed in the South");
				South16 = scan.nextLine();
				System.out.println("Enter the #8 seed in the South");
				South8 = scan.nextLine();
				System.out.println("Enter the #9 seed in the South");
				South9 = scan.nextLine();
				System.out.println("Enter the #5 seed in the South");
				South5 = scan.nextLine();
				System.out.println("Enter the #12 seed in the South");
				South12 = scan.nextLine();
				System.out.println("Enter the #4 seed in the South");
				South4 = scan.nextLine();
				System.out.println("Enter the #13 seed in the South");
				South13 = scan.nextLine();
				System.out.println("Enter the #6 seed in the South");
				South6 = scan.nextLine();
				System.out.println("Enter the #11 seed in the South");
				South11 = scan.nextLine();
				System.out.println("Enter the #3 seed in the South");
				South3 = scan.nextLine();
				System.out.println("Enter the #14 seed in the South");
				South14 = scan.nextLine();
				System.out.println("Enter the #7 seed in the South");
				South7 = scan.nextLine();
				System.out.println("Enter the #10 seed in the South");
				South10 = scan.nextLine();
				System.out.println("Enter the #2 seed in the South");
				South2 = scan.nextLine();
				System.out.println("Enter the #15 seed in the South");
				South15 = scan.nextLine();
			}
			
			
			
			
			 
			/**
			 * Bracket
			 */
			
			int Eastr2game1, Eastr2game2, Eastr2game3, Eastr2game4, Eastr2game5, Eastr2game6, Eastr2game7, Eastr2game8, 
			Westr2game1, Westr2game2, Westr2game3, Westr2game4, Westr2game5, Westr2game6, Westr2game7, Westr2game8, 
			Midwestr2game1, Midwestr2game2, Midwestr2game3, Midwestr2game4, Midwestr2game5, Midwestr2game6, Midwestr2game7, 
			Midwestr2game8, Southr2game1, Southr2game2, Southr2game3, Southr2game4, Southr2game5, Southr2game6, 
			Southr2game7, Southr2game8, Eastr3game1, Eastr3game2, Eastr3game3, Eastr3game4, Westr3game1, Westr3game2, Westr3game3, 
			Westr3game4, Midwestr3game1, Midwestr3game2, Midwestr3game3, Midwestr3game4, Southr3game1, Southr3game2, Southr3game3,
			Southr3game4, Eastr4game1, Eastr4game2, Westr4game1, Westr4game2, Midwestr4game1, Midwestr4game2, Southr4game1, Southr4game2,
			Eastfinalfour, Westfinalfour, Midwestfinalfour, Southfinalfour, nationalchampionshipteam1 = 0, nationalchampionshipteam2 = 0,
			pickteam, test, matchup, game;
			
			String Eastr2game1string, Eastr2game2string, Eastr2game3string, Eastr2game4string, Eastr2game5string, Eastr2game6string,
			Eastr2game7string, Eastr2game8string, Westr2game1string, Westr2game2string, Westr2game3string, Westr2game4string, Westr2game5string, Westr2game6string,
			Westr2game7string, Westr2game8string, Midwestr2game1string, Midwestr2game2string, Midwestr2game3string, Midwestr2game4string, Midwestr2game5string, Midwestr2game6string,
			Midwestr2game7string, Midwestr2game8string, Southr2game1string, Southr2game2string, Southr2game3string, Southr2game4string, Southr2game5string, Southr2game6string,
			Southr2game7string, Southr2game8string, Eastr3game1string, Eastr3game2string, Eastr3game3string, Eastr3game4string, Westr3game1string, Westr3game2string, 
			Westr3game3string, Westr3game4string, Midwestr3game1string, Midwestr3game2string, Midwestr3game3string, Midwestr3game4string, 
			Southr3game1string, Southr3game2string, Southr3game3string, Southr3game4string, Eastr4game1string, Eastr4game2string, 
			Westr4game1string, Westr4game2string, Midwestr4game1string, Midwestr4game2string, Southr4game1string, Southr4game2string,
			Eastfinalfourstring, Westfinalfourstring, Midwestfinalfourstring, Southfinalfourstring, 
			nationalchampionshipteam1string = null, nationalchampionshipteam2string = null, nationalchampionstring = null;



		
			System.out.println("				");
			System.out.println("				");
			System.out.println("				");
			System.out.println("NCAA TOURNAMENT BRACKET");
			System.out.println("EAST (ROUND OF 64)");
			System.out.println("				");
			game = result(116);
			System.out.println("1 " + East1);
			if(game == 1){
				System.out.println("			" + "1 " + East1);
				Eastr2game1 = 1;
				Eastr2game1string = "1 " + East1;
			}
			else{
				System.out.println("			" + "16 " + East16);
				Eastr2game1 = 16;
				Eastr2game1string = "16 " + East1;
			}
			System.out.println("16 " + East16);
			System.out.println("				");
			game = result(89);
			System.out.println("8 " + East8);
			if(game == 8){
				System.out.println("			" + "8 " + East8);
				Eastr2game2 = 8;
				Eastr2game2string = "8 " + East8;
			}
			else{
				System.out.println("			" + "9 " + East9);
				Eastr2game2 = 9;
				Eastr2game2string = "9 " + East9;
			}
			System.out.println("9 " + East9);
			System.out.println("				");
			game = result(512);
			System.out.println("5 " + East5);
			if(game == 5){
				System.out.println("			" + "5 " + East5);
				Eastr2game3 = 5;
				Eastr2game3string = "5 " + East5;
			}
			else{
				System.out.println("			" + "12 " + East12);
				Eastr2game3 = 12;
				Eastr2game3string = "12 " + East12;
			}
			System.out.println("12 " + East12);
			System.out.println("				");
			game = result(413);
			System.out.println("4 " + East4);
			if(game == 4){
				System.out.println("			" + "4 " + East4);
				Eastr2game4 = 4;
				Eastr2game4string = "4 " + East4;
			}
			else{
				System.out.println("			" + "13 " + East13);
				Eastr2game4 = 13;
				Eastr2game4string = "13 " + East13;
			}
			System.out.println("13 " + East13);
			System.out.println("				");
			game = result(611);
			System.out.println("6 " + East6);
			if(game == 6){
				System.out.println("			" + "6 " + East6);
				Eastr2game5 = 6;
				Eastr2game5string = "6 " + East6;
			}
			else{
				System.out.println("			" + "11 " + East11);
				Eastr2game5 = 11;
				Eastr2game5string = "11 " + East11;
			}
			System.out.println("11 " + East11);
			System.out.println("				");
			game = result(311);
			System.out.println("3 " + East3);
			if(game == 3){
				System.out.println("			" + "3 " + East3);
				Eastr2game6 = 3;
				Eastr2game6string = "3 " + East3;
			}
			else{
				System.out.println("			" + "14 " + East14);
				Eastr2game6 = 14;
				Eastr2game6string = "14 " + East14;
			}
			System.out.println("14 " + East14);
			System.out.println("				");
			game = result(710);
			System.out.println("7 " + East7);
			if(game == 7){
				System.out.println("			" + "7 " + East7);
				Eastr2game7 = 7;
				Eastr2game7string = "7 " + East7;
			}
			else{
				System.out.println("			" + "10 " + East10);
				Eastr2game7 = 10;
				Eastr2game7string = "10 " + East10;
			}
			System.out.println("10 " + East10);
			System.out.println("				");
			game = result(215);
			System.out.println("2 " + East2);
			if(game == 2){
				System.out.println("			" + "2 " + East2);
				Eastr2game8 = 2;
				Eastr2game8string = "2 " + East2;
			}
			else{
				System.out.println("			" + "15 " + East15);
				Eastr2game8 = 15;
				Eastr2game8string = "15 " + East15;
			}
			System.out.println("15 " + East15);
			System.out.println("       ");
			
			
			
			
			System.out.println("WEST REGION (Round of 64)");
			System.out.println("				");
			game = result(116);
			System.out.println("1 " + West1);
			if(game == 1){
				System.out.println("			" + "1 " + West1);
				Westr2game1 = 1;
				Westr2game1string = "1 " + West1;
			}
			else{
				System.out.println("			" + "16 " + West16);
				Westr2game1 = 16;
				Westr2game1string = "16 " + West1;
			}
			System.out.println("16 " + West16);
			System.out.println("				");
			game = result(89);
			System.out.println("8 " + West8);
			if(game == 8){
				System.out.println("			" + "8 " + West8);
				Westr2game2 = 8;
				Westr2game2string = "8 " + West8;
			}
			else{
				System.out.println("			" + "9 " + West9);
				Westr2game2 = 9;
				Westr2game2string = "9 " + West9;
			}
			System.out.println("9 " + West9);
			System.out.println("				");
			game = result(512);
			System.out.println("5 " + West5);
			if(game == 5){
				System.out.println("			" + "5 " + West5);
				Westr2game3 = 5;
				Westr2game3string = "5 " + West5;
			}
			else{
				System.out.println("			" + "12 " + West12);
				Westr2game3 = 12;
				Westr2game3string = "12 " + West12;
			}
			System.out.println("12 " + West12);
			System.out.println("				");
			game = result(413);
			System.out.println("4 " + West4);
			if(game == 4){
				System.out.println("			" + "4 " + West4);
				Westr2game4 = 4;
				Westr2game4string = "4 " + West4;
			}
			else{
				System.out.println("			" + "13 " + West13);
				Westr2game4 = 13;
				Westr2game4string = "13 " + West13;
			}
			System.out.println("13 " + West13);
			System.out.println("				");
			game = result(611);
			System.out.println("6 " + West6);
			if(game == 6){
				System.out.println("			" + "6 " + West6);
				Westr2game5 = 6;
				Westr2game5string = "6 " + West6;
			}
			else{
				System.out.println("			" + "11 " + West11);
				Westr2game5 = 11;
				Westr2game5string = "11 " + West11;
			}
			System.out.println("11 " + West11);
			System.out.println("				");
			game = result(311);
			System.out.println("3 " + West3);
			if(game == 3){
				System.out.println("			" + "3 " + West3);
				Westr2game6 = 3;
				Westr2game6string = "3 " + West3;
			}
			else{
				System.out.println("			" + "14 " + West14);
				Westr2game6 = 14;
				Westr2game6string = "14 " + West14;
			}
			System.out.println("14 " + West14);
			System.out.println("				");
			game = result(710);
			System.out.println("7 " + West7);
			if(game == 7){
				System.out.println("			" + "7 " + West7);
				Westr2game7 = 7;
				Westr2game7string = "7 " + West7;
			}
			else{
				System.out.println("			" + "10 " + West10);
				Westr2game7 = 10;
				Westr2game7string = "10 " + West10;
			}
			System.out.println("10 " + West10);
			System.out.println("				");
			game = result(215);
			System.out.println("2 " + West2);
			if(game == 2){
				System.out.println("			" + "2 " + West2);
				Westr2game8 = 2;
				Westr2game8string = "2 " + West2;
			}
			else{
				System.out.println("			" + "15 " + West15);
				Westr2game8 = 15;
				Westr2game8string = "15 " + West15;
			}
			System.out.println("15 " + West15);
			System.out.println("       ");
			
			
			
			
			System.out.println("MIDWEST REGION (Round of 64)");
			System.out.println("				");
			game = result(116);
			System.out.println("1 " + Midwest1);
			if(game == 1){
				System.out.println("			" + "1 " + Midwest1);
				Midwestr2game1 = 1;
				Midwestr2game1string = "1 " + Midwest1;
			}
			else{
				System.out.println("			" + "16 " + Midwest16);
				Midwestr2game1 = 16;
				Midwestr2game1string = "16 " + Midwest1;
			}
			System.out.println("16 " + Midwest16);
			System.out.println("				");
			game = result(89);
			System.out.println("8 " + Midwest8);
			if(game == 8){
				System.out.println("			" + "8 " + Midwest8);
				Midwestr2game2 = 8;
				Midwestr2game2string = "8 " + Midwest8;
			}
			else{
				System.out.println("			" + "9 " + Midwest9);
				Midwestr2game2 = 9;
				Midwestr2game2string = "9 " + Midwest9;
			}
			System.out.println("9 " + Midwest9);
			System.out.println("				");
			game = result(512);
			System.out.println("5 " + Midwest5);
			if(game == 5){
				System.out.println("			" + "5 " + Midwest5);
				Midwestr2game3 = 5;
				Midwestr2game3string = "5 " + Midwest5;
			}
			else{
				System.out.println("			" + "12 " + Midwest12);
				Midwestr2game3 = 12;
				Midwestr2game3string = "12 " + Midwest12;
			}
			System.out.println("12 " + Midwest12);
			System.out.println("				");
			game = result(413);
			System.out.println("4 " + Midwest4);
			if(game == 4){
				System.out.println("			" + "4 " + Midwest4);
				Midwestr2game4 = 4;
				Midwestr2game4string = "4 " + Midwest4;
			}
			else{
				System.out.println("			" + "13 " + Midwest13);
				Midwestr2game4 = 13;
				Midwestr2game4string = "13 " + Midwest13;
			}
			System.out.println("13 " + Midwest13);
			System.out.println("				");
			game = result(611);
			System.out.println("6 " + Midwest6);
			if(game == 6){
				System.out.println("			" + "6 " + Midwest6);
				Midwestr2game5 = 6;
				Midwestr2game5string = "6 " + Midwest6;
			}
			else{
				System.out.println("			" + "11 " + Midwest11);
				Midwestr2game5 = 11;
				Midwestr2game5string = "11 " + Midwest11;
			}
			System.out.println("11 " + Midwest11);
			System.out.println("				");
			game = result(311);
			System.out.println("3 " + Midwest3);
			if(game == 3){
				System.out.println("			" + "3 " + Midwest3);
				Midwestr2game6 = 3;
				Midwestr2game6string = "3 " + Midwest3;
			}
			else{
				System.out.println("			" + "14 " + Midwest14);
				Midwestr2game6 = 14;
				Midwestr2game6string = "14 " + Midwest14;
			}
			System.out.println("14 " + Midwest14);
			System.out.println("				");
			game = result(710);
			System.out.println("7 " + Midwest7);
			if(game == 7){
				System.out.println("			" + "7 " + Midwest7);
				Midwestr2game7 = 7;
				Midwestr2game7string = "7 " + Midwest7;
			}
			else{
				System.out.println("			" + "10 " + Midwest10);
				Midwestr2game7 = 10;
				Midwestr2game7string = "10 " + Midwest10;
			}
			System.out.println("10 " + Midwest10);
			System.out.println("				");
			game = result(215);
			System.out.println("2 " + Midwest2);
			if(game == 2){
				System.out.println("			" + "2 " + Midwest2);
				Midwestr2game8 = 2;
				Midwestr2game8string = "2 " + Midwest2;
			}
			else{
				System.out.println("			" + "15 " + Midwest15);
				Midwestr2game8 = 15;
				Midwestr2game8string = "15 " + Midwest15;
			}
			System.out.println("15 " + Midwest15);
			System.out.println("       ");
	
	
	
	
	
	
	
			System.out.println("SOUTH REGION (Round of 64)");
			System.out.println("				");
			game = result(116);
			System.out.println("1 " + South1);
			if(game == 1){
				System.out.println("			" + "1 " + South1);
				Southr2game1 = 1;
				Southr2game1string = "1 " + South1;
			}
			else{
				System.out.println("			" + "16 " + South16);
				Southr2game1 = 16;
				Southr2game1string = "16 " + South1;
			}
			System.out.println("16 " + South16);
			System.out.println("				");
			game = result(89);
			System.out.println("8 " + South8);
			if(game == 8){
				System.out.println("			" + "8 " + South8);
				Southr2game2 = 8;
				Southr2game2string = "8 " + South8;
			}
			else{
				System.out.println("			" + "9 " + South9);
				Southr2game2 = 9;
				Southr2game2string = "9 " + South9;
			}
			System.out.println("9 " + South9);
			System.out.println("				");
			game = result(512);
			System.out.println("5 " + South5);
			if(game == 5){
				System.out.println("			" + "5 " + South5);
				Southr2game3 = 5;
				Southr2game3string = "5 " + South5;
			}
			else{
				System.out.println("			" + "12 " + South12);
				Southr2game3 = 12;
				Southr2game3string = "12 " + South12;
			}
			System.out.println("12 " + South12);
			System.out.println("				");
			game = result(413);
			System.out.println("4 " + South4);
			if(game == 4){
				System.out.println("			" + "4 " + South4);
				Southr2game4 = 4;
				Southr2game4string = "4 " + South4;
			}
			else{
				System.out.println("			" + "13 " + South13);
				Southr2game4 = 13;
				Southr2game4string = "13 " + South13;
			}
			System.out.println("13 " + South13);
			System.out.println("				");
			game = result(611);
			System.out.println("6 " + South6);
			if(game == 6){
				System.out.println("			" + "6 " + South6);
				Southr2game5 = 6;
				Southr2game5string = "6 " + South6;
			}
			else{
				System.out.println("			" + "11 " + South11);
				Southr2game5 = 11;
				Southr2game5string = "11 " + South11;
			}
			System.out.println("11 " + South11);
			System.out.println("				");
			game = result(311);
			System.out.println("3 " + South3);
			if(game == 3){
				System.out.println("			" + "3 " + South3);
				Southr2game6 = 3;
				Southr2game6string = "3 " + South3;
			}
			else{
				System.out.println("			" + "14 " + South14);
				Southr2game6 = 14;
				Southr2game6string = "14 " + South14;
			}
			System.out.println("14 " + South14);
			System.out.println("				");
			game = result(710);
			System.out.println("7 " + South7);
			if(game == 7){
				System.out.println("			" + "7 " + South7);
				Southr2game7 = 7;
				Southr2game7string = "7 " + South7;
			}
			else{
				System.out.println("			" + "10 " + South10);
				Southr2game7 = 10;
				Southr2game7string = "10 " + South10;
			}
			System.out.println("10 " + South10);
			System.out.println("				");
			game = result(215);
			System.out.println("2 " + South2);
			if(game == 2){
				System.out.println("			" + "2 " + South2);
				Southr2game8 = 2;
				Southr2game8string = "2 " + South2;
			}
			else{
				System.out.println("			" + "15 " + South15);
				Southr2game8 = 15;
				Southr2game8string = "15 " + South15;
			}
			System.out.println("15 " + South15);
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			
			
			
			
			System.out.println("ROUND OF 32");
			System.out.println("EAST REGION (Round of 32)");
			System.out.println("       ");
			String Eastgame1string = Integer.toString(Eastr2game1);
			String Eastgame2string = Integer.toString(Eastr2game2);
			String Eastr2game1stringmatchup = Eastgame1string+Eastgame2string;
			matchup = Integer.parseInt(Eastr2game1stringmatchup);
			game = result(matchup);
			System.out.println(Eastr2game1string);
			if(game == Eastr2game1){
				System.out.println("			" + Eastr2game1string);
				Eastr3game1 = Eastr2game1;
				Eastr3game1string = Eastr2game1string;
			}
			else{
				System.out.println("			" + Eastr2game2string);
				Eastr3game1 = Eastr2game2;
				Eastr3game1string = Eastr2game2string;
			}
			System.out.println(Eastr2game2string);
		    System.out.println("       ");
		    
			String Eastgame3string = Integer.toString(Eastr2game3);
			String Eastgame4string = Integer.toString(Eastr2game4);
			String Eastr2game2stringmatchup = Eastgame3string+Eastgame4string;
			matchup = Integer.parseInt(Eastr2game2stringmatchup);
			game = result(matchup);
			System.out.println(Eastr2game3string);
			if(game == Eastr2game3){
				System.out.println("			" + Eastr2game3string);
				Eastr3game2 = Eastr2game3;
				Eastr3game2string = Eastr2game3string;
			}
			else{
				System.out.println("			" + Eastr2game4string);
				Eastr3game2 = Eastr2game4;
				Eastr3game2string = Eastr2game4string;
			}
			System.out.println(Eastr2game4string);
		    System.out.println("       ");
		    
			String Eastgame5string = Integer.toString(Eastr2game5);
			String Eastgame6string = Integer.toString(Eastr2game6);
			String Eastr2game3stringmatchup = Eastgame5string+Eastgame6string;
			matchup = Integer.parseInt(Eastr2game3stringmatchup);
			game = result(matchup);
			System.out.println(Eastr2game5string);
			if(game == Eastr2game5){
				System.out.println("			" + Eastr2game5string);
				Eastr3game3 = Eastr2game5;
				Eastr3game3string = Eastr2game5string;
			}
			else{
				System.out.println("			" + Eastr2game6string);
				Eastr3game3 = Eastr2game6;
				Eastr3game3string = Eastr2game6string;
			}
			System.out.println(Eastr2game6string);
		    System.out.println("       ");
		    
			String Eastgame7string = Integer.toString(Eastr2game7);
			String Eastgame8string = Integer.toString(Eastr2game8);
			String Eastr2game4stringmatchup = Eastgame7string+Eastgame8string;
			matchup = Integer.parseInt(Eastr2game4stringmatchup);
			game = result(matchup);
			System.out.println(Eastr2game7string);
			if(game == Eastr2game7){
				System.out.println("			" + Eastr2game7string);
				Eastr3game4 = Eastr2game7;
				Eastr3game4string = Eastr2game7string;
			}
			else{
				System.out.println("			" + Eastr2game8string);
				Eastr3game4 = Eastr2game8;
				Eastr3game4string =  Eastr2game8string;
			}
			System.out.println(Eastr2game8string);
		    System.out.println("       ");
		    
		    
		    
		    
			System.out.println("WEST REGION (Round of 32)");
			System.out.println("       ");
			String Westgame1string = Integer.toString(Westr2game1);
			String Westgame2string = Integer.toString(Westr2game2);
			String Westr2game1stringmatchup = Westgame1string+Westgame2string;
			matchup = Integer.parseInt(Westr2game1stringmatchup);
			game = result(matchup);
			System.out.println(Westr2game1string);
			if(game == Westr2game1){
				System.out.println("			" + Westr2game1string);
				Westr3game1 = Westr2game1;
				Westr3game1string = Westr2game1string;
			}
			else{
				System.out.println("			" + Westr2game2string);
				Westr3game1 = Westr2game2;
				Westr3game1string = Westr2game2string;
			}
			System.out.println(Westr2game2string);
		    System.out.println("       ");
		    
			String Westgame3string = Integer.toString(Westr2game3);
			String Westgame4string = Integer.toString(Westr2game4);
			String Westr2game2stringmatchup = Westgame3string+Westgame4string;
			matchup = Integer.parseInt(Westr2game2stringmatchup);
			game = result(matchup);
			System.out.println(Westr2game3string);
			if(game == Westr2game3){
				System.out.println("			" + Westr2game3string);
				Westr3game2 = Westr2game3;
				Westr3game2string = Westr2game3string;
			}
			else{
				System.out.println("			" + Westr2game4string);
				Westr3game2 = Westr2game4;
				Westr3game2string = Westr2game4string;
			}
			System.out.println(Westr2game4string);
		    System.out.println("       ");
		    
			String Westgame5string = Integer.toString(Westr2game5);
			String Westgame6string = Integer.toString(Westr2game6);
			String Westr2game3stringmatchup = Westgame5string+Westgame6string;
			matchup = Integer.parseInt(Westr2game3stringmatchup);
			game = result(matchup);
			System.out.println(Westr2game5string);
			if(game == Westr2game5){
				System.out.println("			" + Westr2game5string);
				Westr3game3 = Westr2game5;
				Westr3game3string = Westr2game5string;
			}
			else{
				System.out.println("			" + Westr2game6string);
				Westr3game3 = Westr2game6;
				Westr3game3string = Westr2game6string;
			}
			System.out.println(Westr2game6string);
		    System.out.println("       ");
		    
			String Westgame7string = Integer.toString(Westr2game7);
			String Westgame8string = Integer.toString(Westr2game8);
			String Westr2game4stringmatchup = Westgame7string+Westgame8string;
			matchup = Integer.parseInt(Westr2game4stringmatchup);
			game = result(matchup);
			System.out.println(Westr2game7string);
			if(game == Westr2game7){
				System.out.println("			" + Westr2game7string);
				Westr3game4 = Westr2game7;
				Westr3game4string = Westr2game7string;
			}
			else{
				System.out.println("			" + Westr2game8string);
				Westr3game4 = Westr2game8;
				Westr3game4string =  Westr2game8string;
			}
			System.out.println(Westr2game8string);
		    System.out.println("       ");
	
		    
		    
			System.out.println("MIDWEST REGION (Round of 32)");
			System.out.println("       ");
			String Midwestgame1string = Integer.toString(Midwestr2game1);
			String Midwestgame2string = Integer.toString(Midwestr2game2);
			String Midwestr2game1stringmatchup = Midwestgame1string+Midwestgame2string;
			matchup = Integer.parseInt(Midwestr2game1stringmatchup);
			game = result(matchup);
			System.out.println(Midwestr2game1string);
			if(game == Midwestr2game1){
				System.out.println("			" + Midwestr2game1string);
				Midwestr3game1 = Midwestr2game1;
				Midwestr3game1string = Midwestr2game1string;
			}
			else{
				System.out.println("			" + Midwestr2game2string);
				Midwestr3game1 = Midwestr2game2;
				Midwestr3game1string = Midwestr2game2string;
			}
			System.out.println(Midwestr2game2string);
		    System.out.println("       ");
		    
			String Midwestgame3string = Integer.toString(Midwestr2game3);
			String Midwestgame4string = Integer.toString(Midwestr2game4);
			String Midwestr2game2stringmatchup = Midwestgame3string+Midwestgame4string;
			matchup = Integer.parseInt(Midwestr2game2stringmatchup);
			game = result(matchup);
			System.out.println(Midwestr2game3string);
			if(game == Midwestr2game3){
				System.out.println("			" + Midwestr2game3string);
				Midwestr3game2 = Midwestr2game3;
				Midwestr3game2string = Midwestr2game3string;
			}
			else{
				System.out.println("			" + Midwestr2game4string);
				Midwestr3game2 = Midwestr2game4;
				Midwestr3game2string = Midwestr2game4string;
			}
			System.out.println(Midwestr2game4string);
		    System.out.println("       ");
		    
			String Midwestgame5string = Integer.toString(Midwestr2game5);
			String Midwestgame6string = Integer.toString(Midwestr2game6);
			String Midwestr2game3stringmatchup = Midwestgame5string+Midwestgame6string;
			matchup = Integer.parseInt(Midwestr2game3stringmatchup);
			game = result(matchup);
			System.out.println(Midwestr2game5string);
			if(game == Midwestr2game5){
				System.out.println("			" + Midwestr2game5string);
				Midwestr3game3 = Midwestr2game5;
				Midwestr3game3string = Midwestr2game5string;
			}
			else{
				System.out.println("			" + Midwestr2game6string);
				Midwestr3game3 = Midwestr2game6;
				Midwestr3game3string = Midwestr2game6string;
			}
			System.out.println(Midwestr2game6string);
		    System.out.println("       ");
		    
			String Midwestgame7string = Integer.toString(Midwestr2game7);
			String Midwestgame8string = Integer.toString(Midwestr2game8);
			String Midwestr2game4stringmatchup = Midwestgame7string+Midwestgame8string;
			matchup = Integer.parseInt(Midwestr2game4stringmatchup);
			game = result(matchup);
			System.out.println(Midwestr2game7string);
			if(game == Midwestr2game7){
				System.out.println("			" + Midwestr2game7string);
				Midwestr3game4 = Midwestr2game7;
				Midwestr3game4string = Midwestr2game7string;
			}
			else{
				System.out.println("			" + Midwestr2game8string);
				Midwestr3game4 = Midwestr2game8;
				Midwestr3game4string =  Midwestr2game8string;
			}
			System.out.println(Midwestr2game8string);
		    System.out.println("       ");
	
	
		    
		    
			System.out.println("SOUTH REGION (Round of 32)");
			System.out.println("       ");
			String Southgame1string = Integer.toString(Southr2game1);
			String Southgame2string = Integer.toString(Southr2game2);
			String Southr2game1stringmatchup = Southgame1string+Southgame2string;
			matchup = Integer.parseInt(Southr2game1stringmatchup);
			game = result(matchup);
			System.out.println(Southr2game1string);
			if(game == Southr2game1){
				System.out.println("			" + Southr2game1string);
				Southr3game1 = Southr2game1;
				Southr3game1string = Southr2game1string;
			}
			else{
				System.out.println("			" + Southr2game2string);
				Southr3game1 = Southr2game2;
				Southr3game1string = Southr2game2string;
			}
			System.out.println(Southr2game2string);
		    System.out.println("       ");
		    
			String Southgame3string = Integer.toString(Southr2game3);
			String Southgame4string = Integer.toString(Southr2game4);
			String Southr2game2stringmatchup = Southgame3string+Southgame4string;
			matchup = Integer.parseInt(Southr2game2stringmatchup);
			game = result(matchup);
			System.out.println(Southr2game3string);
			if(game == Southr2game3){
				System.out.println("			" + Southr2game3string);
				Southr3game2 = Southr2game3;
				Southr3game2string = Southr2game3string;
			}
			else{
				System.out.println("			" + Southr2game4string);
				Southr3game2 = Southr2game4;
				Southr3game2string = Southr2game4string;
			}
			System.out.println(Southr2game4string);
		    System.out.println("       ");
		    
			String Southgame5string = Integer.toString(Southr2game5);
			String Southgame6string = Integer.toString(Southr2game6);
			String Southr2game3stringmatchup = Southgame5string+Southgame6string;
			matchup = Integer.parseInt(Southr2game3stringmatchup);
			game = result(matchup);
			System.out.println(Southr2game5string);
			if(game == Southr2game5){
				System.out.println("			" + Southr2game5string);
				Southr3game3 = Southr2game5;
				Southr3game3string = Southr2game5string;
			}
			else{
				System.out.println("			" + Southr2game6string);
				Southr3game3 = Southr2game6;
				Southr3game3string = Southr2game6string;
			}
			System.out.println(Southr2game6string);
		    System.out.println("       ");
		    
			String Southgame7string = Integer.toString(Southr2game7);
			String Southgame8string = Integer.toString(Southr2game8);
			String Southr2game4stringmatchup = Southgame7string+Southgame8string;
			matchup = Integer.parseInt(Southr2game4stringmatchup);
			game = result(matchup);
			System.out.println(Southr2game7string);
			if(game == Southr2game7){
				System.out.println("			" + Southr2game7string);
				Southr3game4 = Southr2game7;
				Southr3game4string = Southr2game7string;
			}
			else{
				System.out.println("			" + Southr2game8string);
				Southr3game4 = Southr2game8;
				Southr3game4string =  Southr2game8string;
			}
			System.out.println(Southr2game8string);
		    System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			
			
			
			
			System.out.println("SWEET 16");
			System.out.println("EAST REGION (SWEET 16)");
			System.out.println("       ");
			String Easts16game1string = Integer.toString(Eastr3game1);
			String Easts16game2string = Integer.toString(Eastr3game2);
			String Eastr3game1stringmatchup = Easts16game1string+Easts16game2string;
			matchup = Integer.parseInt(Eastr3game1stringmatchup);
			game = result(matchup);
			System.out.println(Eastr3game1string);
			if(game == Eastr3game1){
				System.out.println("			" + Eastr3game1string);
				Eastr4game1 = Eastr3game1;
				Eastr4game1string = Eastr3game1string;
			}
			else{
				System.out.println("			" + Eastr3game2string);
				Eastr4game1 = Eastr3game2;
				Eastr4game1string = Eastr3game2string;
			}
			System.out.println(Eastr3game2string);
		    System.out.println("       ");
		    
		    
		    
			String Easts16game3string = Integer.toString(Eastr3game3);
			String Easts16game4string = Integer.toString(Eastr3game4);
			String Eastr3game2stringmatchup = Easts16game3string+Easts16game4string;
			matchup = Integer.parseInt(Eastr3game2stringmatchup);
			game = result(matchup);
			System.out.println(Eastr3game3string);
			if(game == Eastr3game3){
				System.out.println("			" + Eastr3game3string);
				Eastr4game2 = Eastr3game3;
				Eastr4game2string = Eastr3game3string;
			}
			else{
				System.out.println("			" + Eastr3game4string);
				Eastr4game2 = Eastr3game4;
				Eastr4game2string = Eastr3game4string;
			}
			System.out.println(Eastr3game4string);
		    System.out.println("       ");
		    
		    
		    
			System.out.println("WEST REGION (SWEET 16)");
			System.out.println("       ");
			String Wests16game1string = Integer.toString(Westr3game1);
			String Wests16game2string = Integer.toString(Westr3game2);
			String Westr3game1stringmatchup = Wests16game1string+Wests16game2string;
			matchup = Integer.parseInt(Westr3game1stringmatchup);
			game = result(matchup);
			System.out.println(Westr3game1string);
			if(game == Westr3game1){
				System.out.println("			" + Westr3game1string);
				Westr4game1 = Westr3game1;
				Westr4game1string = Westr3game1string;
			}
			else{
				System.out.println("			" + Westr3game2string);
				Westr4game1 = Westr3game2;
				Westr4game1string = Westr3game2string;
			}
			System.out.println(Westr3game2string);
		    System.out.println("       ");
		    
		    
		    
			String Wests16game3string = Integer.toString(Westr3game3);
			String Wests16game4string = Integer.toString(Westr3game4);
			String Westr3game2stringmatchup = Wests16game3string+Wests16game4string;
			matchup = Integer.parseInt(Westr3game2stringmatchup);
			game = result(matchup);
			System.out.println(Westr3game3string);
			if(game == Westr3game3){
				System.out.println("			" + Westr3game3string);
				Westr4game2 = Westr3game3;
				Westr4game2string = Westr3game3string;
			}
			else{
				System.out.println("			" + Westr3game4string);
				Westr4game2 = Westr3game4;
				Westr4game2string = Westr3game4string;
			}
			System.out.println(Westr3game4string);
		    System.out.println("       ");
	
	
	
	
			System.out.println("MIDWEST REGION (SWEET 16)");
			System.out.println("       ");
			String Midwests16game1string = Integer.toString(Midwestr3game1);
			String Midwests16game2string = Integer.toString(Midwestr3game2);
			String Midwestr3game1stringmatchup = Midwests16game1string+Midwests16game2string;
			matchup = Integer.parseInt(Midwestr3game1stringmatchup);
			game = result(matchup);
			System.out.println(Midwestr3game1string);
			if(game == Midwestr3game1){
				System.out.println("			" + Midwestr3game1string);
				Midwestr4game1 = Midwestr3game1;
				Midwestr4game1string = Midwestr3game1string;
			}
			else{
				System.out.println("			" + Midwestr3game2string);
				Midwestr4game1 = Midwestr3game2;
				Midwestr4game1string = Midwestr3game2string;
			}
			System.out.println(Midwestr3game2string);
		    System.out.println("       ");
		    
		    
		    
			String Midwests16game3string = Integer.toString(Midwestr3game3);
			String Midwests16game4string = Integer.toString(Midwestr3game4);
			String Midwestr3game2stringmatchup = Midwests16game3string+Midwests16game4string;
			matchup = Integer.parseInt(Midwestr3game2stringmatchup);
			game = result(matchup);
			System.out.println(Midwestr3game3string);
			if(game == Midwestr3game3){
				System.out.println("			" + Midwestr3game3string);
				Midwestr4game2 = Midwestr3game3;
				Midwestr4game2string = Midwestr3game3string;
			}
			else{
				System.out.println("			" + Midwestr3game4string);
				Midwestr4game2 = Midwestr3game4;
				Midwestr4game2string = Midwestr3game4string;
			}
			System.out.println(Midwestr3game4string);
		    System.out.println("       ");
	
	
		    
		    
			System.out.println("SOUTH REGION (SWEET 16)");
			System.out.println("       ");
			String Souths16game1string = Integer.toString(Southr3game1);
			String Souths16game2string = Integer.toString(Southr3game2);
			String Southr3game1stringmatchup = Souths16game1string+Souths16game2string;
			matchup = Integer.parseInt(Southr3game1stringmatchup);
			game = result(matchup);
			System.out.println(Southr3game1string);
			if(game == Southr3game1){
				System.out.println("			" + Southr3game1string);
				Southr4game1 = Southr3game1;
				Southr4game1string = Southr3game1string;
			}
			else{
				System.out.println("			" + Southr3game2string);
				Southr4game1 = Southr3game2;
				Southr4game1string = Southr3game2string;
			}
			System.out.println(Southr3game2string);
		    System.out.println("       ");
		    
			String Souths16game3string = Integer.toString(Southr3game3);
			String Souths16game4string = Integer.toString(Southr3game4);
			String Southr3game2stringmatchup = Souths16game3string+Souths16game4string;
			matchup = Integer.parseInt(Southr3game2stringmatchup);
			game = result(matchup);
			System.out.println(Southr3game3string);
			if(game == Southr3game3){
				System.out.println("			" + Southr3game3string);
				Southr4game2 = Southr3game3;
				Southr4game2string = Southr3game3string;
			}
			else{
				System.out.println("			" + Southr3game4string);
				Southr4game2 = Southr3game4;
				Southr4game2string = Southr3game4string;
			}
			System.out.println(Southr3game4string);
		    System.out.println("       ");
		    System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			
			
			
			
			System.out.println("ELITE 8");
			System.out.println("EAST REGION (ELITE 8)");
			System.out.println("       ");
			String Easte8game1string = Integer.toString(Eastr4game1);
			String Easte8game2string = Integer.toString(Eastr4game2);
			String Eastr4game1stringmatchup = Easte8game1string+Easte8game2string;
			matchup = Integer.parseInt(Eastr4game1stringmatchup);
			game = result(matchup);
			System.out.println(Eastr4game1string);
			if(game == Eastr4game1){
				System.out.println("			" + Eastr4game1string);
				Eastfinalfour = Eastr4game1;
				Eastfinalfourstring = Eastr4game1string;
			}
			else{
				System.out.println("			" + Eastr4game2string);
				Eastfinalfour = Eastr4game2;
				Eastfinalfourstring = Eastr4game2string;
			}
			System.out.println(Eastr4game2string);
		    System.out.println("       ");
		    
		    
			System.out.println("WEST REGION (ELITE 8)");
			System.out.println("       ");
			String Weste8game1string = Integer.toString(Westr4game1);
			String Weste8game2string = Integer.toString(Westr4game2);
			String Westr4game1stringmatchup = Weste8game1string+Weste8game2string;
			matchup = Integer.parseInt(Westr4game1stringmatchup);
			game = result(matchup);
			System.out.println(Westr4game1string);
			if(game == Westr4game1){
				System.out.println("			" + Westr4game1string);
				Westfinalfour = Westr4game1;
				Westfinalfourstring = Westr4game1string;
			}
			else{
				System.out.println("			" + Westr4game2string);
				Westfinalfour = Westr4game2;
				Westfinalfourstring = Westr4game2string;
			}
			System.out.println(Westr4game2string);
		    System.out.println("       ");
		    
		    
			System.out.println("MIDWEST REGION (ELITE 8)");
			System.out.println("       ");
			String Midweste8game1string = Integer.toString(Midwestr4game1);
			String Midweste8game2string = Integer.toString(Midwestr4game2);
			String Midwestr4game1stringmatchup = Midweste8game1string+Midweste8game2string;
			matchup = Integer.parseInt(Midwestr4game1stringmatchup);
			game = result(matchup);
			System.out.println(Midwestr4game1string);
			if(game == Midwestr4game1){
				System.out.println("			" + Midwestr4game1string);
				Midwestfinalfour = Midwestr4game1;
				Midwestfinalfourstring = Midwestr4game1string;
			}
			else{
				System.out.println("			" + Midwestr4game2string);
				Midwestfinalfour = Midwestr4game2;
				Midwestfinalfourstring = Midwestr4game2string;
			}
			System.out.println(Midwestr4game2string);
		    System.out.println("       ");
		    
		    
			System.out.println("SOUTH REGION (ELITE 8)");
			System.out.println("       ");
			String Southe8game1string = Integer.toString(Southr4game1);
			String Southe8game2string = Integer.toString(Southr4game2);
			String Southr4game1stringmatchup = Southe8game1string+Southe8game2string;
			matchup = Integer.parseInt(Southr4game1stringmatchup);
			game = result(matchup);
			System.out.println(Southr4game1string);
			if(game == Southr4game1){
				System.out.println("			" + Southr4game1string);
				Southfinalfour = Southr4game1;
				Southfinalfourstring = Southr4game1string;
			}
			else{
				System.out.println("			" + Southr4game2string);
				Southfinalfour = Southr4game2;
				Southfinalfourstring = Southr4game2string;
			}
			System.out.println(Southr4game2string);
		    System.out.println("       ");
		    System.out.println("       ");
		    System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			
			
			
			
			System.out.println("FINAL FOUR");
			String eastffstring = Integer.toString(Eastfinalfour);
			String westffstring = Integer.toString(Westfinalfour);
			String finalfourgame1stringmatchup = eastffstring + westffstring;
			matchup = Integer.parseInt(finalfourgame1stringmatchup);
			game = result(matchup);
			System.out.println(Eastfinalfourstring);
			pickteam = 3; //set pickteam to anything, but you'll modify it if needto, otherwise it shouldn't matter
			test = 0;
			if(game == 0){ //If they're the same seed
				pickteam = ((int) Math.random() <= 0.5) ? 0 : 1;
				test = 1; //show that we went in here
			}
			if (game == Eastfinalfour || (pickteam == 0 && test == 1)){
				System.out.println("			" + Eastfinalfourstring);
				nationalchampionshipteam1 = Eastfinalfour;
				nationalchampionshipteam1string = Eastfinalfourstring;
			}
			else if (game == Westfinalfour || (pickteam == 1 && test == 1)){
				System.out.println("			" + Westfinalfourstring);
				nationalchampionshipteam1 = Westfinalfour;
				nationalchampionshipteam1string = Westfinalfourstring;
			}
			System.out.println(Westfinalfourstring);	
		    System.out.println("       ");
		    test = 0;
		    pickteam = 3;
		    
		    
		    
			String midwestffstring = Integer.toString(Midwestfinalfour);
			String southffstring = Integer.toString(Southfinalfour);
			String finalfourgame2stringmatchup = midwestffstring + southffstring;
			matchup = Integer.parseInt(finalfourgame2stringmatchup);
			game = result(matchup);
			System.out.println(Midwestfinalfourstring);
			if(game == 0){ //If they're the same seed
				pickteam = ((int) Math.random() <= 0.5) ? 0 : 1;
				test = 1; //show that we went in here
			}
			if (game == Midwestfinalfour || (pickteam == 0 && test == 1)){
				System.out.println("			" + Midwestfinalfourstring);
				nationalchampionshipteam2 = Midwestfinalfour;
				nationalchampionshipteam2string = Midwestfinalfourstring;
			}
			else if (game == Southfinalfour || (pickteam == 1 && test == 1)){
				System.out.println("			" + Southfinalfourstring);
				nationalchampionshipteam2 = Southfinalfour;
				nationalchampionshipteam2string = Southfinalfourstring;
			}
			System.out.println(Southfinalfourstring);	
		    System.out.println("       ");
		    test = 0;
		    pickteam = 3;
		    System.out.println("       ");
		    System.out.println("       ");
		    System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			System.out.println("       ");
			
			
			
			
			System.out.println("NATIONAL CHAMPIONSHIP GAME");
			String ffgame1string = Integer.toString(nationalchampionshipteam1);
			String ffgame2string = Integer.toString(nationalchampionshipteam2);
			String nationalchampionshipstringmatchup = ffgame1string + ffgame1string;
			matchup = Integer.parseInt(nationalchampionshipstringmatchup);
			game = result(matchup);
			System.out.println(nationalchampionshipteam1string);
			if(game == 0){ //If they're the same seed
				pickteam = ((int) Math.random() <= 0.5) ? 0 : 1;
				test = 1; //show that we went in here
			}
			if (game == nationalchampionshipteam1 || (pickteam == 0 && test == 1)){
				System.out.println("			" + nationalchampionshipteam1string);
				nationalchampionstring = nationalchampionshipteam1string;
			}
			else if (game == nationalchampionshipteam2 || (pickteam == 1 && test == 1)){
				System.out.println("			" + nationalchampionshipteam2string);
				nationalchampionstring = nationalchampionshipteam2string;	
			}
			System.out.println(nationalchampionshipteam2string);
		    System.out.println("       ");
		    System.out.println("       ");
		    System.out.println("       ");
		    System.out.println("CONGRATULATIONS TO " + nationalchampionstring.toUpperCase() + " ON WINNING THE NATIONAL CHAMPIONSHIP!!!!");
		    System.out.println("       ");
		    System.out.println("       ");
		    System.out.println("       ");
		    
		    //Ask if they want to run the program again
		    String response = null;
		    while(true){
			    System.out.println("Would you like to run this again? (Y/N)");
			    response = scan.nextLine();
			    if(response.equals("N") || response.equals("n") || response.equals("no") || response.equals("No")){
			    	break;
			    }
			    else if(response.equals("Y") || response.equals("y") || response.equals("yes") || response.equals("Yes")){
			    	System.out.println("     ");
			    	break;
			    } 
			    else{
			    	System.out.println("I'm sorry, I didn't understand that.");
			    	System.out.println("     ");
			    }
		    }
		    if(response.equals("N") || response.equals("n") || response.equals("no") || response.equals("No")){
		    	break;
		    }
		    else if(response.equals("Y") || response.equals("y") || response.equals("yes") || response.equals("Yes")){
		    } 
		}
