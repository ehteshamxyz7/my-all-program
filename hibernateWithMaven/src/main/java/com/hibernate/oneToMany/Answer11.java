package com.hibernate.oneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "answer_OneToMany")
public class Answer11 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int answerId;
	private String answer;

	@ManyToOne
	private Question11 question;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question11 getQuestion() {
		return question;
	}

	public void setQuestion(Question11 question) {
		this.question = question;
	}

	public Answer11() {
		super();
	}

	public Answer11(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

}
