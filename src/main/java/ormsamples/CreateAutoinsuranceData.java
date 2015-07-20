/**
 * Licensee: seungeok Hwang
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateAutoinsuranceData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = models.AutoinsurancePersistentManager.instance().getSession().beginTransaction();
		try {
			models.Customer lmodelsCustomer = new models.Customer();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : vehicles
			models.AutoinsurancePersistentManager.instance().getSession().save(lmodelsCustomer);
			
			models.Vehicle lmodelsVehicle = new models.Vehicle();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : customer
			models.AutoinsurancePersistentManager.instance().getSession().save(lmodelsVehicle);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateAutoinsuranceData createAutoinsuranceData = new CreateAutoinsuranceData();
			try {
				createAutoinsuranceData.createTestData();
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
