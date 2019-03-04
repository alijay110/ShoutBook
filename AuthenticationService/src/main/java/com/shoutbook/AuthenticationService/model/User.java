package com.shoutbook.AuthenticationService.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	
	@Column(name="username")
	private String username;
	
	/**
	 * @param id
	 * @param username
	 */
	public User(String username) {
		this.username = username;
	}

	/**
	 * 
	 */
	public User() {
		super();
	}
	
	@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + username + '\'' +
                '}';
    }
	
	
}
