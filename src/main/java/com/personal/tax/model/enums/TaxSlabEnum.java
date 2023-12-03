package com.personal.tax.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TaxSlabEnum {

    CATEGORY_A(5000.0, 0.0),
    CATEGORY_B(15000.0, 0.01),
    CATEGORY_C(15000.0, 0.03),
    CATEGORY_D(15000.0, 0.06),
    CATEGORY_E(20000.0, 0.11),
    CATEGORY_F(30000.0, 0.19),
    CATEGORY_G(300000.0, 0.25),
    CATEGORY_H(200000.0, 0.26),
    CATEGORY_I(1400000.0, 0.28),
    CATEGORY_J(Double.MAX_VALUE, 0.3);

    private final Double range;
    private final Double rate;


}
