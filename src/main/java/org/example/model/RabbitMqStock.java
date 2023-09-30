package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RabbitMqStock {
    String userAlias;
    String stockAlias;
    String purchaseType;
    Integer units;

    public RabbitMqStock(String userAlias, String stockAlias, String purchaseType, Integer units) {
        this.userAlias = userAlias;
        this.stockAlias = stockAlias;
        this.purchaseType = purchaseType;
        this.units = units;
    }
}
