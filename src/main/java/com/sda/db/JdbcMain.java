package com.sda.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
// dostep do bazy danych  tylko
public class JdbcMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Perosn3 perosn = new Perosn3("Mateusz","S",100);
        Adres4 adres = new Adres4("Kwiatek","Kwiatkowa", "20-500");

        entityManager.getTransaction().begin();
        entityManager.persist(adres);
        entityManager.persist(perosn);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
// Hibernate - xamp - maven - mysql
// odswiezyc bazy danych Workbench