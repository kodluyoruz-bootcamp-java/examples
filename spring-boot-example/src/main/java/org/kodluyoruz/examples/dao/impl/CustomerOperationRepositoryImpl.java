package org.kodluyoruz.examples.dao.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.kodluyoruz.examples.dao.CustomerOperationRepository;
import org.kodluyoruz.examples.model.dao.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.Collection;


@Slf4j
@Repository
@RequiredArgsConstructor
public class CustomerOperationRepositoryImpl implements CustomerOperationRepository {

    private final EntityManager entityManager;

    @Override
    @Transactional
    public Customer save(Customer customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Override
    @Transactional
    public Customer update(Customer customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        entityManager.createQuery("DELETE FROM Customer c WHERE c.id = :customerId ")
                .setParameter("customerId", id)
                .executeUpdate();
    }

    @Override
    public Collection<Customer> findAllActiveCustomers() {

        Session hibernateSession = entityManager.unwrap(Session.class);
        CriteriaBuilder criteriaBuilder = hibernateSession.getCriteriaBuilder();
        CriteriaQuery<Customer> customerQuery = criteriaBuilder.createQuery(Customer.class);
        Root<Customer> customerRoot = customerQuery.from(Customer.class);
        customerQuery.select(customerRoot)
                .where(criteriaBuilder.equal(customerRoot.get("isActive"), true));
        hibernateSession.createQuery(customerQuery).getResultList();

        return entityManager
                .createQuery("select c from Customer c where c.isActive = true", Customer.class)
                .getResultList();
    }
}


