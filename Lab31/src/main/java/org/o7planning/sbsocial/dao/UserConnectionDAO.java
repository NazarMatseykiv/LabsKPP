package org.o7planning.sbsocial.dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;

import org.o7planning.sbsocial.entity.UserConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserConnectionDAO {

  @Autowired
  private EntityManager entityManager;

  public UserConnection findUserConnectionByUserProviderId(String userProviderId) {
    try {
      String sql = "Select e from " + UserConnection.class.getName() + " e " //
          + " Where e.userProviderId = :userProviderId ";

      Query query = entityManager.createQuery(sql, UserConnection.class);
      query.setParameter("userProviderId", userProviderId);

      List<UserConnection> list = query.getResultList();

      return list.isEmpty() ? null : list.get(0);
    } catch (NoResultException e) {
      return null;
    }
  }
  
}
