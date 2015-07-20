package controllers;

import framework.NeedTransaction;
import models.*;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class NameAndAddressTab {

	Customer model;

	/**
	 * 견적을 시작함. 견적 시작 버튼이 눌려지면, 고객 정보를 저장하고, VehiclesTab 으로 이동함.
	 */
	@org.metaworks.annotation.ServiceMethod(callByContent=true)
    @NeedTransaction
    @RequestMapping("/startMyQuote")
	public VehiclesTab startMyQuote() throws PersistentException {
		System.out.println("Hello, " + getModel().getFirstName());

        models.AutoinsurancePersistentManager.instance().getSession().save(getModel());

        return new VehiclesTab();
	}

	public NameAndAddressTab() {
		setModel(new Customer());
	}

	public Customer getModel() {
		return this.model;
	}

	/**
	 * 
	 * @param model
	 */
	public void setModel(Customer model) {
		this.model = model;
	}

}