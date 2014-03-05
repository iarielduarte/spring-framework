package com.pluralsight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.hibernate.validator.constraints.Range;


@Entity
@Table(name="goal")
public class Goal {

	@Id
	@GeneratedValue
	@Column(name="goal_id")
	private Long id;
	
	@Range(min = 1, max = 120)
	@Column(name="minutes")
	private int minutes;

	public Long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
