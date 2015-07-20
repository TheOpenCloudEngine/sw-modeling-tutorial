package framework;

import models.AutoinsurancePersistentManager;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: kosta
 * Date: 15. 7. 17
 * Time: 오후 2:52
 * To change this template use File | Settings | File Templates.
 */
@Aspect
@Component
public class TransactionAdvice {

    @Before("@annotation(framework.NeedTransaction)")
    public void initiateTransaction() throws PersistentException {
        System.out.println("start tx");
        AutoinsurancePersistentManager.instance().getSession().beginTransaction();
    }

    @AfterReturning("@annotation(framework.NeedTransaction)")
    public void commitTransaction() throws Exception {
        System.out.println("commit");
        AutoinsurancePersistentManager.instance().getSession().getTransaction().commit();
    }

    @AfterThrowing("@annotation(framework.NeedTransaction)")
    public void rollbackTransaction() throws Exception {
        System.out.println("rollback");
        AutoinsurancePersistentManager.instance().getSession().getTransaction().rollback();
    }
}