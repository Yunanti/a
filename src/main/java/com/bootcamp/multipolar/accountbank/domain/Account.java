package com.bootcamp.multipolar.accountbank.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document
public class Account {
    @Id
    private String id;
    private AccountType accountType;
    private AccountStatus accountStatus;
    private AccountHolder accountHolder;
    private double balance;
    private LocalDateTime openingDate = LocalDateTime.now();
    private LocalDate closingDate;

}
