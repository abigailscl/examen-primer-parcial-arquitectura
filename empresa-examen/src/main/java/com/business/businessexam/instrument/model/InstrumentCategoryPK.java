package com.business.businessexam.instrument.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class InstrumentCategoryPK implements Serializable {

    @Column(name = "CODE_EMPRESA", nullable = false)
    private Integer codeBusiness;

    @Column(name = "COD_CATEGORIA_INSTRUMENTO", length = 15, nullable = false)
    private String codeInstrumentCategory;

}
