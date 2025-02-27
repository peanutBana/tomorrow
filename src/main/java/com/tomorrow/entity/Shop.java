package com.tomorrow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "shop")	// 테이블명 (설정안하면 클래스이름으로 설정됨)
@Getter
@Setter
@ToString
public class Shop {

	@Id
	@Column(name = "shop_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;			// 매장코드
	
	@Column(length = 30, nullable = false)
	private String shopNm;		// 매장 이름
	
	@Column(length = 20)
	private String shopTime;	// 매장 영업시간
	
	@Column(nullable = false)
	private int businessId;		// 사업자번호
	
	@Column(length = 30, nullable = false)
	private String shopPlace;	// 매장위치
	
	@Column(length = 30, nullable = false)
	private String shopType;	// 매장업종
}
