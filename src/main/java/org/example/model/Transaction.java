package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    Long transactionPk;
    String transactionAlias;
    String userAlias;
    String stockAlias;
    Float amount;
}
