package com.bootcamp.multipolar.accountbank.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document
public class AccountHolder {
    private String nik;
    private String name;
    private String address;
}
