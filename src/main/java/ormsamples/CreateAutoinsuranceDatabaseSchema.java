/**
 * Licensee: seungeok Hwang
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateAutoinsuranceDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(models.AutoinsurancePersistentManager.instance());
			models.AutoinsurancePersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
