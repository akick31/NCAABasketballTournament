# NCAABasketballTournament
This repository houses a program which prints out a filled out bracket for the NCAA basketball tournament. The program is completely random, but uses probabilites for certain seed vs seed matchups. For example, a 1 seed is highly favored over a 16 seed, since their record against 16 seeds is undefeated. However, it is a possibility for a 16 seed to usurp a 1 seed, so it's a 99.9% chance that the 1 seed wins in this program. If two seeds hadn't played each other before, I usually played it by ear, but for the most part it's a toss up so I made them 50-50 chances. I took the seed vs seed records from here: http://mcubed.net/ncaab/seeds.shtml

If you desire to input a text file and not manually input teams, look at the 2017tournament.txt for an example on how to do that. The file is ordered from East region to West region to Midwest region to South region with 16 teams in each region. So the first 16 lines are the East, next 16 are West, and so on. Make sure when you're adding the file that you know the directory. If you put it directly under the Java package and not in the src files or a package then you shouldn't need to input a directory. For example, when the console prompts you, type the name of the file, so "2017basketball.txt".

The bracket.java class houses everything for the program and also runs it.


If you have questions, feel free to email me at apkicklighter@gmail.com

------------------------------------------------------------

2/24/18 Update
- bracket.java file updated to include a file selector window so that the user does not have to track their .txt file
- .zip file was uploaded that includes a .jar file and a GUI interface. Simply download the .zip file and extract the contents. It comes with the 2017tournament.txt file, a README, and the application itself. Manual input is currently not available on the GUI and in order to have that feature, you should download the bracket.java file. 
