package hy.pro.jpa.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Person {
	
	@Id // JPA. PK(Primary Key)�� �����ϱ� ���� ����Ѵ�.
	@GeneratedValue // JPA, PKŰ�� �ڵ� ���� ������ ����Ѵ�.
	private long id;
	
	@Column // JPA, �ʵ带 �÷��� �����ϱ� ���� ����Ѵ�.
	private String name;
	
	@Column
	private String password;
	
}
