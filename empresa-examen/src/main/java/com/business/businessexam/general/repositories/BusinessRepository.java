package com.business.businessexam.general.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.business.businessexam.general.model.Business;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Integer> {
    List<Business> getByNameBusiness(String name);
}
