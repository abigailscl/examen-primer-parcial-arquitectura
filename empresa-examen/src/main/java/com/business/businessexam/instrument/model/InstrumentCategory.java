package com.business.businessexam.instrument.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.business.businessexam.general.model.Business;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TES_CATEGORIA_INSTRUMENTO")
public class InstrumentCategory {

    @EmbeddedId
    private InstrumentCategoryPK pk;

    @ManyToOne
    @JoinColumn(name = "COD_EMPRESA", referencedColumnName = "COD_EMPRESA", insertable = false, updatable = false)
    private Business business;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String name;
    
    @Column(name = "TIPO_RENTA", length = 2, nullable = false)
    private String rentType;

    public InstrumentCategory(InstrumentCategoryPK pk){
        this.pk = pk;
    }
}
