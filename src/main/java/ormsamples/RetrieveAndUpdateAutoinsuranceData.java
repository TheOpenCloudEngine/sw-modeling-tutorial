/**
 * Licensee: seungeok Hwang
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateAutoinsuranceData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = models.AutoinsurancePersistentManager.instance().getSession().beginTransaction();
		try {
			models.Customer lmodelsCustomer= (models.Customer)models.AutoinsurancePersistentManager.instance().getSession().createQuery("From models.Customer").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			models.AutoinsurancePersistentManager.instance().getSession().update(lmodelsCustomer);
			
			models.Vehicle lmodelsVehicle= (models.Vehicle)models.AutoinsurancePersistentManager.instance().getSession().createQuery("From models.Vehicle").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			models.AutoinsurancePersistentManager.instance().getSession().update(lmodelsVehicle);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateAutoinsuranceData retrieveAndUpdateAutoinsuranceData = new RetrieveAndUpdateAutoinsuranceData();
			try {
				retrieveAndUpdateAutoinsuranceData.retrieveAndUpdateTestData();
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
