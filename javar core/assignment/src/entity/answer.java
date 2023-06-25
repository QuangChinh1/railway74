package entity;

public class answer {
	int answerID;
	String content;
	Question questionID;
	isCorrect isCorrect;
	@Override
	public String toString() {
		return "answer [answerID=" + answerID + ", content=" + content + ", questionID=" + questionID + ", isCorrect="
				+ isCorrect + "]";
	}
	
}
