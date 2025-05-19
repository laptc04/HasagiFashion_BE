package com.graduate.hasagifashion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AbstractModel {
    @Column(name = "createDate")
    @Temporal(TemporalType.TIMESTAMP)
    Timestamp createDate;

    @Column(name = "modifyDate")
    @Temporal(TemporalType.TIMESTAMP)
    Timestamp modifyDate;

    @Column(name = "createBy")
    String createBy;

    @Column(name = "modifyBy")
    String modifyBy;
}
