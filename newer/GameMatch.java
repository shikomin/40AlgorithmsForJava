package algorithm40ForJava;


public class GameMatch {

	public static void main(String[] args) {
		System.out.println("比赛匹配:");
		char[] teamA = { 'a', 'b', 'c' };
		char[] teamB = { 'x', 'y', 'z' };
		char[][] Match = new char[3][2];
		for (int i = 0; i < teamA.length; i++) {
			for (int j = 0; j < teamB.length; j++) {
				if (teamA[i] == 'a' && teamB[j] == 'z') {
					Match[i][0] = teamA[i];
					Match[i][1] = teamB[j];
				} else if (teamA[i] == 'b' && teamB[j] == 'x') {
					Match[i][0] = teamA[i];
					Match[i][1] = teamB[j];
				} else if (teamA[i] == 'c' && teamB[j] == 'y') {
					Match[i][0] = teamA[i];
					Match[i][1] = teamB[j];
				}
			}
		}
		System.out.println("匹配结果");
		for (int i = 0; i < 3; i++) {
			System.out.println(" " + Match[i][0] + " " + Match[i][1]);
		}

	}

}
/*
 * if(teamA[i]=='a' && teamB[j]!='x') { Match[index][0]=teamA[i];
 * Match[index][1]=teamB[j]; }else if(teamA[i]=='c' && teamB[j]!='x' &&
 * teamB[j]!='z') { Match[index][0]=teamA[i]; Match[index][1]=teamB[j]; }else {
 * Match[index][0]=teamA[i]; Match[index][1]=teamB[j]; }
 */

/*
 * Match[index][0]=teamA[i]; Match[index][1]=teamB[j]; index++;
 */
