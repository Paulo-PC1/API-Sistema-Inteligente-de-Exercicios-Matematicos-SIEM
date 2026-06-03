package br.com.devpaulo.siem.domain.model;

import java.util.Objects;

public class UserAnswer {

	private Long id;
	private Double userAnswer;
	private Boolean correct;
	// private Long userId;
	// private Long exerciseId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(Double userAnswer) {
		this.userAnswer = userAnswer;
	}

	public Boolean getCorrect() {
		return correct;
	}

	public void setCorrect(Boolean correct) {
		this.correct = correct;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAnswer other = (UserAnswer) obj;
		return Objects.equals(id, other.id);
	}

}
