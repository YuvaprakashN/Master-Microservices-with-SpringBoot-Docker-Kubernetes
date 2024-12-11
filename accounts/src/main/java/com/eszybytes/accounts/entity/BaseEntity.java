package com.eszybytes.accounts.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    private String creatredBy;
    private String updatedBy;

}
