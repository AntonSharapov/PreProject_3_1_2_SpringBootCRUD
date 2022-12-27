package com.boot.pp_3_1_2.DAO;

import com.boot.pp_3_1_2.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

//    protected EntityManager getEntityManager() {
//        return this.entityManager;
//    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(Long id) {
        User oldUser = entityManager.find(User.class, id);
        entityManager.remove(oldUser);
    }

    @Override
    public void editUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List getAllUsers() {
        return entityManager.createQuery("from User").getResultList();
    }
}
