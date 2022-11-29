package com.business.businessexam.instrument.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class InstrumentTypePK implements Serializable {

    @Column(name = "CODE_EMPRESA", length = 8, nullable = false)
    private Integer codeBusiness;

    @Column(name = "COD_TIPO_INSTRUMENTO", length = 15, nullable = false)
    private String codeInstrumentType;

    @Column(name = "COD_CATEGORIA_INSTRUMENTO", length = 15, nullable = false)
    private String codeInstrumentCategory;

}
