package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stock implements Asset {
    Long stockId;
    String stockName;
    String stockAlias;
    Integer stocksIssued;
    Integer stockAvailable;
    Float stockPrice;
}
