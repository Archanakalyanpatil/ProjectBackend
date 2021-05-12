package com.project.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data

public class MoneyTransfer{
	
	@Id
	@GeneratedValue
	private int transferId;
	private long money;
	
	@ManyToOne
	private User user;
	
}
