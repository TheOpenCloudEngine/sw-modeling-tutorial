/**
 * Licensee: seungeok Hwang
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteAutoinsuranceData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = models.AutoinsurancePersistentManager.instance().getSession().beginTransaction();
		try {
			models.Customer lmodelsCustomer= (models.Customer)models.AutoinsurancePersistentManager.instance().getSession().createQuery("From models.Customer").setMaxResults(1).uniqueResult();
			models.AutoinsurancePersistentManager.instance().getSession().delete(lmodelsCustomer);
			
			models.Vehicle lmodelsVehicle= (models.Vehicle)models.AutoinsurancePersistentManager.instance().getSession().createQuery("From models.Vehicle").setMaxResults(1).uniqueResult();
			models.AutoinsurancePersistentManager.instance().getSession().delete(lmodelsVehicle);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			DeleteAutoinsuranceData deleteAutoinsuranceData = new DeleteAutoinsuranceData();
			try {
				deleteAutoinsuranceData.deleteTestData();
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
