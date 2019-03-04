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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	
	private String username;
	
//	@Column(name="email")
//	@Email(message = "*Please provide a valid Email")
//	@NotEmpty(message = "*Please provide an email")
//	private String email;
//	
//	@Column(name="password")
//	@Length(min = 5, message = "*Your password must have atleast 5 characters")
//	@NotEmpty(message = "*Please provide your password")
//	private String password;
//	
//	@Column(name="first_name")
//	@NotEmpty(message = "*Please provide your first name")
//	private String firstName;
//	
//	@Column(name="last_name")
//	@NotEmpty(message = "*Please provide your last name")
//	private String lastName;
//	
//	@Column(name="active")
//	private int active;
//	
//	@Column(name="phoneNumber")
//	@NotEmpty(message = "*Please provide your phone number")
//	private String phoneNumber;
//	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "user_role", joinColumns = @JoinColumn( name = "user_id"), inverseJoinColumns = @JoinColumn( name = "role_id"))
//	private Set<Role> roles;

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
        return "Beer{" +
                "id=" + id +
                ", name='" + username + '\'' +
                '}';
    }
	
	
}
