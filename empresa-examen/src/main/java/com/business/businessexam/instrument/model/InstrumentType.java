package com.business.businessexam.instrument.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TES_TIPO_INSTRUMENTO")
public class InstrumentType {

    @EmbeddedId
    private InstrumentTypePK pk;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String name;
    
    @Column(name = "TIPO_RENTA", length = 2, nullable = false)
    private String rentType;
    
    @Column(name = "COD_CLASE_INSTRUMENTO", length = 15, nullable = false)
    private String codeClassInstrument;

    @Column(name = "COD_CATEGORIA_INSTRUMENTO", length = 15, nullable = false)
    private String codeCategoryInstruemnt;

    @Column(name = "ESTADO", length = 3, nullable = false)
    private String state;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date creationDate;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "COD_EMPRESA", referencedColumnName = "COD_EMPRESA", insertable = false, updatable = false),
            @JoinColumn(name = "COD_CATEGORIA_INSTRUMENTO", referencedColumnName = "COD_CATEGORIA_INSTRUMENTO", insertable = false, updatable = false),
        })
    private InstrumentCategory client;

    public InstrumentType(InstrumentTypePK pk){
        this.pk = pk;
    }

}