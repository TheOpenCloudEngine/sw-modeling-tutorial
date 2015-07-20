/**
 * Licensee: seungeok Hwang
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListAutoinsuranceData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Customer...");
		java.util.List lCustomerList = models.AutoinsurancePersistentManager.instance().getSession().createQuery("From models.Customer").setMaxResults(ROW_COUNT).list();
		models.Customer[] lmodelsCustomers = (models.Customer[]) lCustomerList.toArray(new models.Customer[lCustomerList.size()]);
		int length = Math.min(lmodelsCustomers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lmodelsCustomers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Vehicle...");
		java.util.List lVehicleList = models.AutoinsurancePersistentManager.instance().getSession().createQuery("From models.Vehicle").setMaxResults(ROW_COUNT).list();
		models.Vehicle[] lmodelsVehicles = (models.Vehicle[]) lVehicleList.toArray(new models.Vehicle[lVehicleList.size()]);
		length = Math.min(lmodelsVehicles.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(lmodelsVehicles[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListAutoinsuranceData listAutoinsuranceData = new ListAutoinsuranceData();
			try {
				listAutoinsuranceData.listTestData();
			}
			finally {
				models.AutoinsurancePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
