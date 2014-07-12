package com.github.ryankane.standaloneexample.model.dto;

import java.io.Serializable;
import java.util.Date;

public class StandaloneDto implements Serializable {
	private static final long serialVersionUID = -6533754098162412713L;

	private long id;
	private String name;
	private double amount;
	private Date created;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return id + ":" + name + ":" + amount + ":" + created;
	}
}
