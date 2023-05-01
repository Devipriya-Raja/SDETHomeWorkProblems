/*https://leetcode.com/problems/count-of-matches-in-tournament/
You are given an integer n, the number of teams in a tournament that has strange rules:

If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
Return the number of matches played in the tournament until a winner is decided.

Example 1:

Input: n = 7
Output: 6
Explanation: Details of the tournament: 
- 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
- 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
- 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 3 + 2 + 1 = 6.
Time Complexity =  O(log n) 
Space Complexity = O(1)
*/

package week1Day5Assignments;

import org.testng.annotations.Test;

public class MatchesLeetCodeProblem {

	public void totalMatches(int teams) {
		// Declare variables
	int totalMatches=0,matches=0; //int teams = 0;
	//Run till teams == 1 
	while (teams != 1) {
	//Divide the teams/2 to get matches
	matches= teams / 2;
	//Minus the matches from the teams 
	teams = teams-matches; 
	//Sum the matches to get total no.of matches
	totalMatches += matches;
	}
	//Print total
	System.out.println(totalMatches);
	}
	
	@Test
	public void printtotalMatches(){
		
	totalMatches(9); 
	totalMatches(14); 
	totalMatches(100); 
	totalMatches(49);
	
}
}
