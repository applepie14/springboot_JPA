package hy.pro.jpa.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Person {
	
	@Id // JPA. PK(Primary Key)에 매핑하기 위해 사용한다.
	@GeneratedValue // JPA, PK키의 자동 생성 전략을 명시한다.
	private long id;
	
	@Column // JPA, 필드를 컬럼에 매핑하기 위해 사용한다.
	private String name;
	
	@Column
	private String password;
	
}
