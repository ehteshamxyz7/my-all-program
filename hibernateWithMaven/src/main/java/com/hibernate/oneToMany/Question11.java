package com.hibernate.oneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Question_OneToMany")
public class Question11 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int questionId;
	private String question;

	@OneToMany( mappedBy = "question",cascade = CascadeType.ALL		,fetch = FetchType.EAGER)
	private List<Answer11> answer;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer11> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer11> answer) {
		this.answer = answer;
	}

	public Question11() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question11(int questionId, String question, List<Answer11> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

}
