package com.example.SemTaskB9ZL3Q.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Pool {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;

  private String poolName;

  private String poolType;

  private int noPeople;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPoolName() {
	return poolName;
}

public void setPoolName(String poolName) {
	this.poolName = poolName;
}

public String getPoolType() {
	return poolType;
}

public void setPoolType(String poolType) {
	this.poolType = poolType;
}

public int getNoPeople() {
	return noPeople;
}

public void setNoPeople(int noPeople) {
	this.noPeople = noPeople;
}
}