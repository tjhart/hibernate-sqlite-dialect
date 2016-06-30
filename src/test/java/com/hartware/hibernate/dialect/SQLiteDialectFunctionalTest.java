package com.hartware.hibernate.dialect;

import com.hartware.test.model.TestEntity;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class SQLiteDialectFunctionalTest {

    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeClass
    public static void beforeClass() {
        entityManagerFactory = Persistence.createEntityManagerFactory("com.hartware.hibernate.dialect");
    }

    @Before
    public void before() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @After
    public void after() {
        entityManager.close();
    }

    @AfterClass
    public static void afterClass() {
        entityManagerFactory.close();
    }

    @Test
    public void saveWorks() {
        TestEntity entity = new TestEntity();
        entity.setAnInt(Integer.MAX_VALUE);
        entity.setaShort(Short.MAX_VALUE);
        entity.setBigInteger(BigInteger.valueOf(Long.MAX_VALUE).multiply(BigInteger.valueOf(100L)));
        entity.setaFloat(Float.MAX_VALUE);
        entity.setaDouble(Double.MAX_VALUE);
        entity.setaBigDecimal(
                BigDecimal.ONE.divide(BigDecimal.valueOf(275), 300, RoundingMode.CEILING));

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(entity);
        transaction.commit();
    }
}
