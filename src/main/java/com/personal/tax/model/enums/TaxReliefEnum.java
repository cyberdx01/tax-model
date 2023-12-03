package com.personal.tax.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TaxReliefEnum {

    RELIEF_1("Individual and dependent relatives", 9000.0),
    RELIEF_2("Medical treatment, special needs and carer expenses for parents", 8000.0),
    RELIEF_3("Purchase of basic supporting equipment for disabled self, spouse, child or parent", 6000.0),
    RELIEF_4("Disabled individual", 6000.0),
    RELIEF_5("Education fees (Self)", 7000.0),
    RELIEF_6("Medical expenses", 8000.0),
    RELIEF_7("Lifestyle – Expenses for the use / benefit of self, spouse or child", 2500.0),
    RELIEF_8("Lifestyle – Additional relief for the use / benefit of self, spouse or child", 500.0),
    RELIEF_9("Lifestyle – Purchase of personal computer, smartphone or tablet for own use / benefit or for spouse or child and not for business use", 2500.0),
    RELIEF_10("Purchase of breastfeeding equipment for own use for a child aged 2 years and below (Deduction allowed once in every TWO (2) years of assessment)", 1000.0),
    RELIEF_11("Child care fees to a registered child care centre / kindergarten for a child aged 6 years and below", 3000.0),
    RELIEF_12("Net deposit in Skim Simpanan Pendidikan Nasional (Net deposit is the total deposit in 2022 MINUS total withdrawal in 2022)", 8000.0),
    RELIEF_13("Husband / wife / payment of alimony to former wife", 4000.0),
    RELIEF_14("Disabled husband / wife", 5000.0),
    RELIEF_15("Each unmarried child and under the age of 18 years old", 2000.0),
    RELIEF_16("Each unmarried child of 18 years and above who is receiving full-time education", 2000.0),
    RELIEF_17("Each unmarried child of 18 years and above that receiving further education in Malaysia in respect of an award of diploma or higher", 8000.0),
    RELIEF_18("Disabled child", 6000.0),
    RELIEF_19("Additional exemption of RM8,000 disable child age 18 years old and above, not married and pursuing diplomas or above qualification in Malaysia @ bachelor degree or above outside Malaysia in program and in Higher Education Institute that is accredited by related Government authorities", 8000.0),
    RELIEF_20("Life insurance and EPF", 7000.0),
    RELIEF_21("Deferred Annuity and Private Retirement Scheme (PRS)", 3000.0),
    RELIEF_22("Education and medical insurance", 3000.0),
    RELIEF_23("Contribution to the Social Security Organization (SOCSO)", 350.0),
    RELIEF_24("Domestic tourism expenses", 1000.0),
    RELIEF_25("Expenses on charging facilities for Electric Vehicle (Not for business use)", 2500.0);

    private final String description;
    private final Double amount;


}
