/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: seungeok Hwang
 * License Type: Purchased
 */
package models;

import org.metaworks.annotation.Hidden;
import org.metaworks.annotation.Range;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Vehicle")
public class Vehicle implements Serializable {
	public Vehicle() {
	}
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_VEHICLE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_VEHICLE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=models.Customer.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="CustomerID", referencedColumnName="ID", nullable=false) })	
	private models.Customer customer;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Type", nullable=true, length=255)	
	private String type;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setType(String value) {
		this.type = value;
	}

    @Range(options = {"sedan", "SUV"}, values ={"1", "2"})
	public String getType() {
		return type;
	}
	
	public void setCustomer(models.Customer value) {
		this.customer = value;
	}

    @Hidden
	public models.Customer getCustomer() {
		return customer;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
