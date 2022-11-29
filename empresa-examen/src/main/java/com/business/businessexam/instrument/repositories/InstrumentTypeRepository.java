package com.business.businessexam.instrument.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.business.businessexam.instrument.model.InstrumentType;
import com.business.businessexam.instrument.model.InstrumentTypePK;

@Repository
public interface InstrumentTypeRepository extends JpaRepository<InstrumentType, InstrumentTypePK> {
    List<InstrumentType> getInstrumentTypes(String rentType);
}
