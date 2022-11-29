package com.business.businessexam.instrument.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TES_TIPO_INSTRUMENTO")
public class InstrumentType {

    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String name;
    
    @Column(name = "TIPO_RENTA", length = 2, nullable = false)
    private BigDecimal rentType;
    
    @Column(name = "COD_CLASE_INSTRUMENTO", length = 15, nullable = false)
    private BigDecimal codeClassInstrument;

    @Column(name = "COD_CATEGORIA_INSTRUMENTO", length = 15, nullable = false)
    private BigDecimal codeCategoryInstruemnt;

    @Column(name = "ESTADO", length = 3, nullable = false)
    private BigDecimal state;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_status_date", nullable = false)
    private Date lastStatusDate;

    public Business(Integer codeBusiness){
        this.codeBusiness = codeBusiness;
    }

}