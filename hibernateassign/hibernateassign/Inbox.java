package com.te.hibernateassign;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;


public class Inbox {

	@Data
	@Entity
	public class inbox {
		
		@Id
		@Column
		private int message_id;
		@Column
		private String message;
		
		@Exclude
		@ManyToOne(cascade = CascadeType.ALL)
		//@JoinColumn(name = "user_id")
		//private Account account;

	}

}
