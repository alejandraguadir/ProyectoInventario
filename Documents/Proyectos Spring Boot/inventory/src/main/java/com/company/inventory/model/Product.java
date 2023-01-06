package com.company.inventory.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
@Data
@Entity
@Table(name = "products")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7461389651533509262L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int price;
	private int account;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Category category;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "picture", length=1000)
	private byte[] picture;
	
	

}