package studio8;

import support.cse131.NotYetImplementedException;

public class Question {
	
	private String prompt;
	private String answer;
	private int points;
	
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 */
	public Question(String prompt, String answer, int points) {
		this.prompt = prompt;
		this.answer = answer;
		this.points = points;
	}
	
	public String getPrompt() {
		return this.prompt;
	}
	
	public String getAnswer() {
		return this.answer;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public void setPrompt(String s) {
		this.prompt = s;
	}
	
	public void setAnswer(String s) {
		this.answer = s;
	}
	
	public void setPoints(int p) {
		this.points = p;
	}
	
	
	/**
	 * Prints out the current question's prompt, with a parenthetical 
	 * number of points possible.
	 */
	public void displayPrompt() {
		System.out.println(this.prompt + "(" + this.points + " points)");
	}
	
	/**
	 * Check the answer provided by a user
	 * @param givenAnswer
	 * @return the number of points earned by the givenAnswer
	 */
	public int checkAnswer(String givenAnswer) {
		if(answer.equals(givenAnswer)) { //String comparison
			return this.points;
		} else {
			return 0;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO: Create a Question object of your own!
		
		Question q1 = new Question("What is 5+4?", "9", 1);
		
	}
}
