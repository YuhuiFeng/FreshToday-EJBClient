package edu.osu.cse5234.business.view;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="ITEM")
public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String description;
	private String quantity;
	private String unitPrice;
	
	public Item() { }
	
	public Item(int id, String name, String description, String quantity, String unitPrice) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="NAME")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="QUANTITY")
	public String getQuantity() {
		return quantity;
	}
	
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Column(name="UNIT_PRICE")
	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
}