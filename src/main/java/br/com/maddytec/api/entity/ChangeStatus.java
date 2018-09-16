package br.com.maddytec.api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.maddytec.api.enums.StatusEnum;

@Document
public class ChangeStatus {

	@Id
	private String id;
	
	@DBRef(lazy=true)
	private Ticket ticket;
	
	@DBRef(lazy=true)
	private User userChange;
	
	private Date dateChageStatus;
	
	private StatusEnum status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public User getUserChange() {
		return userChange;
	}

	public void setUserChange(User userChange) {
		this.userChange = userChange;
	}

	public Date getDateChageStatus() {
		return dateChageStatus;
	}

	public void setDateChageStatus(Date dateChageStatus) {
		this.dateChageStatus = dateChageStatus;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
}
