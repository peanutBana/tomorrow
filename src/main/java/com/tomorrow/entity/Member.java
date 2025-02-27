package com.tomorrow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tomorrow.constant.Role;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "member")	// 테이블명 (설정안하면 클래스이름으로 설정됨)
@Getter
@Setter
@ToString
public class Member {

	@Id
	@Column(name = "member_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;			// 회원 식별자
	
	@Column(length = 25, nullable = false)
	private String userId;		// 유저 회원가입/로그인 시 필요한 id
	
	@Column(length = 20, nullable = false)
	private String userNm;		// 유저 회원가입 시 필요한 이름
	
	@Column(nullable = false)
	private String password;	// 유저 회원가입/로그인 시 필요한 비밀번호
	
	@Column(length = 13, nullable = false)
	private String pNum;		// 유저 회원가입 시 필요한 전화번호
	
	@Enumerated(EnumType.STRING)
	private Role role;			// 유저 권한등급 > 기본 회원가입 시 무조건 USER 등급
	
	private String userProfile;	// 유저 회원가입 시 선택적으로 입력하는 프로필 이미지
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shop_id")
	private Shop shop;			// 매장코드 FK
}
