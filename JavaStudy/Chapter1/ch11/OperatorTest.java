package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		int myNum = 10;
		int yourNum = 20;
		
		myNum += yourNum; //myNum = myNum + yourNum;
		System.out.println(myNum);
		
		int gameScore = 150;
		
		int lastScore = ++gameScore; // gameScore +=1; gameScore = gameScore + 1;
		
		System.out.println(lastScore); //151
		System.out.println(gameScore); //151
		
		int gameScore2 = 150;
		int lastScore2 = gameScore2++;
		
		System.out.println(lastScore2); //150 
		System.out.println(gameScore2); //151
	}

}
