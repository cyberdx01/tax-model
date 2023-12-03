package com.personal.tax.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TaxReliefDto {

    String description;
    Double amount;

}
