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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Customer")
public class Customer implements Serializable {
	public Customer() {
	}
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELS_CUSTOMER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELS_CUSTOMER_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="FirstName", nullable=true, length=255)	
	private String firstName;
	
	@OneToMany(mappedBy="customer", targetEntity=models.Vehicle.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set vehicles = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setFirstName(String value) {
		this.firstName = value;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setVehicles(java.util.Set value) {
		this.vehicles = value;
	}
	
	public java.util.Set getVehicles() {
		return vehicles;
	}
	
	
	public void save() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
