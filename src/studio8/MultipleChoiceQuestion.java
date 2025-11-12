package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	private String[] choices;

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */

	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
	super(prompt, answer, points);
	this.choices=choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		System.out.println("1: " + this.choices[0]);
		System.out.println("2: " + this.choices[1]);
		System.out.println("3: " + this.choices[2]);
		System.out.println("4: " + this.choices[3]);

	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return this.choices;
	}
	
	public static void main(String[] args) {
	MultipleChoiceQuestion grade = new MultipleChoiceQuestion("What grade will you get?","F", 10, new String[] {"A", "B", "C", "F"});
	grade.displayPrompt();
	}

}
