package com.business.businessexam.instrument.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.business.businessexam.instrument.model.InstrumentCategory;
import com.business.businessexam.instrument.model.InstrumentCategoryPK;

@Repository
public interface InstrumentCategoryRepository  extends JpaRepository<InstrumentCategory, InstrumentCategoryPK> {
    List<InstrumentCategory> getByRentTypeInstrumetCategories(String rentType);
}
