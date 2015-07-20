package controllers;

import java.util.*;
import models.*;

public class VehiclesTab {

	Collection<Vehicle> model;

	public Collection<Vehicle> getModel() {
		return this.model;
	}

	public void setModel(Collection<Vehicle> model) {
		this.model = model;
	}

	public VehiclesTab() {
		setModel(new ArrayList<Vehicle>());

        {
            Vehicle vehicle = new Vehicle();
            vehicle.setName("BMW");
            getModel().add(vehicle);
        }

        {
            Vehicle vehicle = new Vehicle();
            vehicle.setName("Benz");
            getModel().add(vehicle);
        }


    }



}