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

public class bracket {
	
	
	
	public static int result(int matchup){
		
		/**Matchups**/
		double rand = Math.floor(Math.random() * 101); //Random between 0 and 100
		/**First Round**/
		if(matchup == 116 || matchup == 161){ //1 vs 16
			if(rand > 99.9){
				return 16; //16 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 115 || matchup == 151){ //1 vs 15
			if (rand > 97){
				return 15; //15 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 114 || matchup == 141){ //1 vs 14
			if (rand > 96){
				return 14; //14 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 113 || matchup == 131){ //1 vs 13
			if (rand > 95){
				return 13; //13 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 112){ //1 vs 12
			if (rand > 92){
				return 12; //12 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 111){ //1 vs 11
			if (rand > 57.1){
				return 11; //11 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 110 || matchup == 101){ //1 vs 10
			if (rand > 85.7){
				return 10; //10 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 19 || matchup == 91){ //1 vs 9
			if (rand > 90.5){
				return 9; //9 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 18 || matchup == 81){ //1 vs 8
			if (rand > 80){
				return 8; //8 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 17 || matchup == 71){ //1 vs 7
			if (rand > 85.7){
				return 7; //7 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 16 || matchup == 61){ //1 vs 6
			if (rand > 68.8){
				return 6; //6 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 15 || matchup == 51){ //1 vs 5
			if (rand > 84){
				return 5; //5 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 14 || matchup == 41){ //1 vs 4
			if (rand > 69.9){
				return 4; //4 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 13 || matchup == 31){ //1 vs 3
			if (rand > 60){
				return 3; //3 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 12 || matchup == 21){ //1 vs 2
			if (rand > 53.4){
				return 2; //2 seed moves on
			}
			else{
				return 1; // 1 seed moves on
			}
		}
		else if(matchup == 11){ //1 vs 1 
			if (rand > 50){
				return 0; //1 seed moves on (random between the two)
			}
			else{
				return 1; // 1 seed moves on (random between the two)
			}
		}
		else if(matchup == 216 || matchup == 162){ //2 vs 16
			if (rand > 99.9){
				return 16; //16 seed moves on (random between the two)
			}
			else{
				return 2; // 2 seed moves on (random between the two)
			}
		}
		else if(matchup == 215 || matchup == 152){ //2 vs 15
			if (rand > 93.9){
				return 15; //15 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 214 || matchup == 142){ //2 vs 14
			if (rand > 96){
				return 14; //14 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 213 || matchup == 132){ //2 vs 13
			if (rand > 95){
				return 13; //13 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 212){ //1 vs 12
			if (rand > 92){
				return 12; //12 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 211 || matchup == 112){ //2 vs 11
			if (rand > 86.7){
				return 11; //11 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 210 || matchup == 102){ //2 vs 10
			if (rand > 60.7){
				return 10; //10 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 29 || matchup == 92){ //2 vs 9
			if (rand > 50){
				return 9; //9 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 28 || matchup == 82){ //2 vs 8
			if (rand > 44.4){
				return 8; //8 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 27 || matchup == 72){ //2 vs 7
			if (rand > 71){
				return 7; //7 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 26 || matchup == 62){ //2 vs 6
			if (rand > 72.2){
				return 6; //6 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 25 || matchup == 52){ //2 vs 5
			if (rand > 20){
				return 5; //5 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 24 || matchup == 42){ //2 vs 4
			if (rand > 44.4){
				return 4; //4 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 23 || matchup == 32){ //2 vs 3
			if (rand > 62.9){
				return 3; //3 seed moves on
			}
			else{
				return 2; // 2 seed moves on
			}
		}
		else if(matchup == 22){ //2 vs 2 
			if (rand > 53.4){
				return 2; //2 seed moves on
			}
			else{
				return 2; // 2 seed moves on (toss up)
			}
		}
		if(matchup == 316 || matchup == 163){ //3 vs 16
			if(rand > 99.9){
				return 16; //16 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 315 || matchup == 153){ //3 vs 15
			if (rand > 98){
				return 15; //15 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 314 || matchup == 143){ //3 vs 14
			if (rand > 84.1){
				return 14; //14 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 313 || matchup == 133){ //3 vs 13
			if (rand > 95){
				return 13; //13 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 312){ //3 vs 12
			if (rand > 92){
				return 12; //12 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 311){ //3 vs 11
			if (rand > 70.6){
				return 11; //11 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 310 || matchup == 103){ //3 vs 10
			if (rand > 69.2){
				return 10; //10 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 39 || matchup == 93){ //3 vs 9
			if (rand > 50){
				return 9; //9 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 38 || matchup == 83){ //3 vs 8
			if (rand > 50){
				return 8; //8 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 37 || matchup == 73){ //3 vs 7
			if (rand > 58.8){
				return 7; //7 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 36 || matchup == 63){ //3 vs 6
			if (rand > 55.3){
				return 6; //6 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 35 || matchup == 53){ //3 vs 5
			if (rand > 50){
				return 5; //5 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		else if(matchup == 34 || matchup == 43){ //3 vs 4
			if (rand > 62.5){
				return 4; //4 seed moves on
			}
			else{
				return 3; // 1 seed moves on
			}
		}
		else if(matchup == 33){ //3 vs 3 
			if (rand > 50){
				return 0; //3 seed moves on
			}
			else{
				return 3; // 3 seed moves on
			}
		}
		if(matchup == 416 || matchup == 164){ //4 vs 16
			if(rand > 99.9){
				return 16; //16 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		else if(matchup == 415 || matchup == 153){ //4 vs 15
			if (rand > 99){
				return 15; //15 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		else if(matchup == 414 || matchup == 144){ //4 vs 14
			if (rand > 95){
				return 14; //14 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		else if(matchup == 413 || matchup == 134){ //4 vs 13
			if (rand > 80.9){
				return 13; //13 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		else if(matchup == 412){ //4 vs 12
			if (rand > 69.2){
				return 12; //12 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		else if(matchup == 411){ //5 vs 11
			if (rand > 50){
				return 11; //11 seed moves on
			}
			else{
				return 4; // 5 seed moves on
			}
		}
		else if(matchup == 410 || matchup == 104){ //4 vs 10
			if (rand > 50){
				return 10; //10 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		else if(matchup == 49 || matchup == 94){ //4 vs 9
			if (rand > 66.7){
				return 9; //9 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		else if(matchup == 48 || matchup == 84){ //4 vs 8
			if (rand > 36.4){
				return 8; //8 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		else if(matchup == 47 || matchup == 74){ //4 vs 7
			if (rand > 33.3){
				return 7; //7 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		else if(matchup == 46 || matchup == 64){ //4 vs 6
			if (rand > 33.3){
				return 6; //6 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		else if(matchup == 45 || matchup == 54){ //4 vs 5
			if (rand > 56.5){
				return 5; //5 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		else if(matchup == 44){ //4 vs 4 
			if (rand > 50){
				return 0; //4 seed moves on
			}
			else{
				return 4; // 4 seed moves on
			}
		}
		if(matchup == 516 || matchup == 165){ //5 vs 16
			if(rand > 99.9){
				return 16; //16 seed moves on
			}
			else{
				return 5; // 5 seed moves on
			}
		}
		else if(matchup == 515 || matchup == 155){ //5 vs 15
			if (rand > 99){
				return 15; //15 seed moves on
			}
			else{
				return 5; // 5 seed moves on
			}
		}
		else if(matchup == 514 || matchup == 145){ //5 vs 14
			if (rand > 95){
				return 14; //14 seed moves on
			}
			else{
				return 5; // 5 seed moves on
			}
		}
		else if(matchup == 513 || matchup == 135){ //5 vs 13
			if (rand > 80){
				return 13; //13 seed moves on
			}
			else{
				return 5; // 5 seed moves on
			}
		}
		else if(matchup == 512){ //5 vs 12
			if (rand > 67.1){
				return 12; //12 seed moves on
			}
			else{
				return 5; // 5 seed moves on
			}
		}
		else if(matchup == 511){ //5 vs 11
			if (rand > 50){
				return 11; //11 seed moves on
			}
			else{
				return 5; // 5 seed moves on
			}
		}
		else if(matchup == 510 || matchup == 105){ //5 vs 10
			if (rand > 50){
				return 10; //10 seed moves on
			}
			else{
				return 5; // 5 seed moves on
			}
		}
		else if(matchup == 59 || matchup == 95){ //5 vs 9
			if (rand > 33.3){
				return 9; //9 seed moves on
			}
			else{
				return 5; // 5 seed moves on
			}
		}
		else if(matchup == 58 || matchup == 85){ //5 vs 8
			if (rand > 25){
				return 8; //8 seed moves on
			}
			else{
				return 5; // 5 seed moves on
			}
		}
		else if(matchup == 57 || matchup == 75){ //5 vs 7
			if (rand > 50){
				return 7; //7 seed moves on
			}
			else{
				return 5; // 5 seed moves on
			}
		}
		else if(matchup == 56 || matchup == 65){ //5 vs 6
			if (rand > 50){
				return 6; //6 seed moves on
			}
			else{
				return 5; // 4 seed moves on
			}
		}
		else if(matchup == 55){ //5 vs 5 
			if (rand > 50){
				return 0; //5 seed moves on
			}
			else{
				return 5; // 5 seed moves on
			}
		}
		if(matchup == 616 || matchup == 166){ //6 vs 16
			if(rand > 99.9){
				return 16; //16 seed moves on
			}
			else{
				return 6; // 6 seed moves on
			}
		}
		else if(matchup == 615 || matchup == 156){ //6 vs 15
			if (rand > 99){
				return 15; //15 seed moves on
			}
			else{
				return 6; // 6 seed moves on
			}
		}
		else if(matchup == 614 || matchup == 146){ //6 vs 14
			if (rand > 87.5){
				return 14; //14 seed moves on
			}
			else{
				return 6; // 6 seed moves on
			}
		}
		else if(matchup == 613 || matchup == 136){ //6 vs 13
			if (rand > 50){
				return 13; //13 seed moves on
			}
			else{
				return 6; // 6 seed moves on
			}
		}
		else if(matchup == 612){ //6 vs 12
			if (rand > 50){
				return 12; //12 seed moves on
			}
			else{
				return 6; // 6 seed moves on
			}
		}
		else if(matchup == 611){ //6 vs 11
			if (rand > 63.8){
				return 11; //11 seed moves on
			}
			else{
				return 6; // 6 seed moves on
			}
		}
		else if(matchup == 610 || matchup == 106){ //6 vs 10
			if (rand > 60){
				return 10; //10 seed moves on
			}
			else{
				return 6; // 6 seed moves on
			}
		}
		else if(matchup == 69 || matchup == 96){ //6 vs 9
			if (rand > 50){
				return 9; //9 seed moves on
			}
			else{
				return 6; // 6 seed moves on
			}
		}
		else if(matchup == 68 || matchup == 86){ //6 vs 8
			if (rand > 25){
				return 8; //8 seed moves on
			}
			else{
				return 6; // 6 seed moves on
			}
		}
		else if(matchup == 67 || matchup == 76){ //6 vs 7
			if (rand > 62.5){
				return 7; //7 seed moves on
			}
			else{
				return 6; // 6 seed moves on
			}
		}
		else if(matchup == 66){ //6 vs 6 
			if (rand > 50){
				return 6; //6 seed moves on
			}
			else{
				return 6; // 6 seed moves on
			}
		}
		if(matchup == 716 || matchup == 167){ //7 vs 16
			if(rand > 99.9){
				return 16; //16 seed moves on
			}
			else{
				return 7; // 7 seed moves on
			}
		}
		else if(matchup == 715 || matchup == 157){ //7 vs 15
			if (rand > 66.7){
				return 15; //15 seed moves on
			}
			else{
				return 7; // 7 seed moves on
			}
		}
		else if(matchup == 714 || matchup == 147){ //7 vs 14
			if (rand > 90){
				return 14; //14 seed moves on
			}
			else{
				return 7; // 7 seed moves on
			}
		}
		else if(matchup == 713 || matchup == 137){ //7 vs 13
			if (rand > 50){
				return 13; //13 seed moves on
			}
			else{
				return 7; // 7 seed moves on
			}
		}
		else if(matchup == 712){ //7 vs 12
			if (rand > 50){
				return 12; //12 seed moves on
			}
			else{
				return 7; // 7 seed moves on
			}
		}
		else if(matchup == 711){ //7 vs 11
			if (rand > 20){
				return 11; //11 seed moves on
			}
			else{
				return 7; // 7 seed moves on
			}
		}
		else if(matchup == 710 || matchup == 107){ //7 vs 10
			if (rand > 60.9){
				return 10; //10 seed moves on
			}
			else{
				return 7; // 7 seed moves on
			}
		}
		else if(matchup == 79 || matchup == 97){ //7 vs 9
			if (rand > 50){
				return 9; //9 seed moves on
			}
			else{
				return 7; // 7 seed moves on
			}
		}
		else if(matchup == 78 || matchup == 87){ //7 vs 8
			if (rand > 50){
				return 8; //8 seed moves on
			}
			else{
				return 7; // 7 seed moves on
			}
		}
		else if(matchup == 77){ //7 vs 7 
			if (rand > 62.5){
				return 0; //7 seed moves on
			}
			else{
				return 7; // 7 seed moves on
			}
		}
		if(matchup == 816 || matchup == 168){ //8 vs 16
			if(rand > 99.9){
				return 16; //16 seed moves on
			}
			else{
				return 8; // 8 seed moves on
			}
		}
		else if(matchup == 815 || matchup == 158){ //8 vs 15
			if (rand > 95){
				return 15; //15 seed moves on
			}
			else{
				return 7; // 7 seed moves on
			}
		}
		else if(matchup == 814 || matchup == 148){ //8 vs 14
			if (rand > 90){
				return 14; //14 seed moves on
			}
			else{
				return 8; // 8 seed moves on
			}
		}
		else if(matchup == 813 || matchup == 138){ //8 vs 13
			if (rand > 90){
				return 13; //13 seed moves on
			}
			else{
				return 8; // 8 seed moves on
			}
		}
		else if(matchup == 812){ //8 vs 12
			if (rand > 20){
				return 12; //12 seed moves on
			}
			else{
				return 8; // 8 seed moves on
			}
		}
		else if(matchup == 811){ //8 vs 11
			if (rand > 50){
				return 11; //11 seed moves on
			}
			else{
				return 8; // 8 seed moves on
			}
		}
		else if(matchup == 810 || matchup == 108){ //8 vs 10
			if (rand > 50){
				return 10; //10 seed moves on
			}
			else{
				return 8; // 8 seed moves on
			}
		}
		else if(matchup == 89 || matchup == 98){ //8 vs 9
			if (rand > 53.2){
				return 9; //9 seed moves on
			}
			else{
				return 8; // 8 seed moves on
			}
		}
		else if(matchup == 88){ //8 vs 8 
			if (rand > 50){
				return 0; //8 seed moves on 
			}
			else{
				return 8; // 8 seed moves on
			}
		}
		if(matchup == 916 || matchup == 169){ //9 vs 16
			if(rand > 99.9){
				return 16; //16 seed moves on
			}
			else{
				return 9; // 9 seed moves on
			}
		}
		else if(matchup == 915 || matchup == 159){ //9 vs 15
			if (rand > 85){
				return 15; //15 seed moves on
			}
			else{
				return 9; // 9 seed moves on
			}
		}
		else if(matchup == 914 || matchup == 149){ //9 vs 14
			if (rand > 80){
				return 14; //14 seed moves on
			}
			else{
				return 9; // 9 seed moves on
			}
		}
		else if(matchup == 913 || matchup == 139){ //9 vs 13
			if (rand > 50){
				return 13; //13 seed moves on
			}
			else{
				return 9; // 9 seed moves on
			}
		}
		else if(matchup == 912){ //9 vs 12
			if (rand > 50){
				return 12; //12 seed moves on
			}
			else{
				return 9; // 9 seed moves on
			}
		}
		else if(matchup == 911){ //9 vs 11
			if (rand > 50){
				return 11; //11 seed moves on
			}
			else{
				return 9; // 9 seed moves on
			}
		}
		else if(matchup == 910 || matchup == 109){ //9 vs 10
			if (rand > 50){
				return 10; //10 seed moves on
			}
			else{
				return 9; // 9 seed moves on
			}
		}
		else if(matchup == 99){ //9 vs 9 
			if (rand > 50){
				return 0; //9 seed moves on
			}
			else{
				return 9; // 9 seed moves on
			}
		}
		if(matchup == 1016 || matchup == 1610){ //10 vs 16
			if(rand > 99.9){
				return 16; //16 seed moves on
			}
			else{
				return 10; // 10 seed moves on
			}
		}
		else if(matchup == 1015 || matchup == 1510){ //10 vs 15
			if (rand > 85){
				return 15; //15 seed moves on
			}
			else{
				return 10; // 10 seed moves on
			}
		}
		else if(matchup == 1014 || matchup == 1410){ //10 vs 14
			if (rand > 85){
				return 14; //14 seed moves on
			}
			else{
				return 10; // 10 seed moves on
			}
		}
		else if(matchup == 1013 || matchup == 1310){ //10 vs 13
			if (rand > 50){
				return 13; //13 seed moves on
			}
			else{
				return 10; // 10 seed moves on
			}
		}
		else if(matchup == 1012){ //10 vs 12
			if (rand > 50){
				return 12; //12 seed moves on
			}
			else{
				return 10; // 10 seed moves on
			}
		}
		else if(matchup == 1011){ //10 vs 11
			if (rand > 33.3){
				return 11; //11 seed moves on
			}
			else{
				return 10; // 10 seed moves on
			}
		}
		else if(matchup == 1010){ //10 vs 10 
			if (rand > 50){
				return 0; //10 seed moves on
			}
			else{
				return 10; // 10 seed moves on
			}
		}
		if(matchup == 1116 || matchup == 1611){ //11 vs 16
			if(rand > 99.9){
				return 16; //16 seed moves on
			}
			else{
				return 11; // 11 seed moves on
			}
		}
		else if(matchup == 1115 || matchup == 1511){ //11 vs 15
			if (rand > 85){
				return 15; //15 seed moves on
			}
			else{
				return 11; // 11 seed moves on
			}
		}
		else if(matchup == 1114 || matchup == 1411){ //10 vs 14
			if (rand > 85){
				return 14; //14 seed moves on
			}
			else{
				return 11; // 11 seed moves on
			}
		}
		else if(matchup == 1113 || matchup == 1311){ //11 vs 13
			if (rand > 50){
				return 13; //13 seed moves on
			}
			else{
				return 11; // 11 seed moves on
			}
		}
		else if(matchup == 1112){ //10 vs 12
			if (rand > 50){
				return 12; //12 seed moves on
			}
			else{
				return 11; // 11 seed moves on
			}
		}
		else if(matchup == 1111){ //11 vs 11 =
			if (rand > 50){
				return 0; //11 seed moves on
			}
			else{
				return 11; // 11 seed moves on
			}
		}
		if(matchup == 1216 || matchup == 1612){ //12 vs 16
			if(rand > 99.9){
				return 16; //16 seed moves on
			}
			else{
				return 12; // 12 seed moves on
			}
		}
		else if(matchup == 1215 || matchup == 1512){ //12 vs 15
			if (rand > 85){
				return 15; //15 seed moves on
			}
			else{
				return 12; // 11 seed moves on
			}
		}
		else if(matchup == 1214 || matchup == 1412){ //12 vs 14
			if (rand > 75){
				return 14; //14 seed moves on
			}
			else{
				return 12; // 12 seed moves on
			}
		}
		else if(matchup == 1213 || matchup == 13112){ //12 vs 13
			if (rand > 72.7){
				return 13; //13 seed moves on
			}
			else{
				return 12; // 12 seed moves on
			}
		}
		else if(matchup == 1212){ //12 vs 12
			if (rand > 50){
				return 0; //12 seed moves on
			}
			else{
				return 12; // 12 seed moves on
			}
		}
		if(matchup == 1316 || matchup == 1613){ //13 vs 16
			if(rand > 50){
				return 16; //16 seed moves on
			}
			else{
				return 13; // 13 seed moves on
			}
		}
		else if(matchup == 1315 || matchup == 1513){ //13 vs 15
			if (rand > 50){
				return 15; //15 seed moves on
			}
			else{
				return 13; // 13 seed moves on
			}
		}
		else if(matchup == 1314 || matchup == 1413){ //13 vs 14
			if (rand > 50){
				return 14; //14 seed moves on
			}
			else{
				return 13; // 13 seed moves on
			}
		}
		else if(matchup == 1313){ //13 vs 13 
			if (rand > 50){
				return 0; //13 seed moves on 
			}
			else{
				return 13; // 13 seed moves on
			}
		}
		if(matchup == 1416 || matchup == 1614){ //14 vs 16
			if(rand > 50){
				return 16; //16 seed moves on
			}
			else{
				return 14; // 14 seed moves on
			}
		}
		else if(matchup == 1415 || matchup == 1514){ //14 vs 15
			if (rand > 50){
				return 15; //15 seed moves on
			}
			else{
				return 14; // 14 seed moves on
			}
		}
		else if(matchup == 1414){ //14 vs 14 
			if (rand > 50){
				return 0; //14 seed moves on
			}
			else{
				return 14; // 14 seed moves on
			}
		}
		if(matchup == 1516 || matchup == 1615){ //15 vs 16
			if(rand > 50){
				return 16; //16 seed moves on
			}
			else{
				return 15; // 15 seed moves on
			}
		}
		else if(matchup == 1515){ //15 vs 15 
			if (rand > 50){
				return 0; //15 seed moves on
			}
			else{
				return 15; // 15 seed moves on
			}
		}
		if(matchup == 1616 || matchup == 1616){ //16 vs 16 
			if(rand > 50){
				return 0; //16 seed moves on
			}
			else{
				return 16; // 16 seed moves on
			}
		}
		return 0;
	}
	}
}
