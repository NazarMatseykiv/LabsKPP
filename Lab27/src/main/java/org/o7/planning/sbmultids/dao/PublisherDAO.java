package org.o7.planning.sbmultids.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.o7planning.sbmultids.config.Constants;
import org.o7planning.sbmultids.entity1.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PublisherDAO {

    @Autowired
    @PersistenceContext( unitName= Constants.JPA_UNIT_NAME_1)
    private EntityManager entityManager;

    public List<Publisher> listPublishers() {
        String sql = "Select e from " + Publisher.class.getName() + " e ";
        Query query = entityManager.createQuery(sql, Publisher.class);
        return query.getResultList();
    }

    public Publisher findById(Long id) {
        return this.entityManager.find(Publisher.class, id);
    }

}
