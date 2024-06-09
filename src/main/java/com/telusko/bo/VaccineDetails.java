package com.telusko.dao.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "VaccineInfo")
public class VaccineDetails {
    @Id
    @Column(name = "ID")
    private Long id;
    private String vaccineName;
    private String vaccineCompany;
    private Integer vaccinePrice;
}
