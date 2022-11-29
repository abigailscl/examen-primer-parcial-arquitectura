package com.business.businessexam.general.model;

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
@Table(name = "GEN_EMPRESA")
public class Business {

    @Id
    @Column(name = "COD_EMPRESA", nullable = false)
    private Integer codeBusiness;

    @Column(name = "NOMBRE", length = 150, nullable = false)
    private String name;
    
    @Column(name = "COD_LOCOGIPO_EMPRESA", scale = 8, nullable = false)
    private BigDecimal codeLogoBusiness;
    
    @Column(name = "COD_LOCOGIPO_REPORTE", scale = 8, nullable = false)
    private BigDecimal codeLogoReport;

    public Business(Integer codeBusiness){
        this.codeBusiness = codeBusiness;
    }
}
