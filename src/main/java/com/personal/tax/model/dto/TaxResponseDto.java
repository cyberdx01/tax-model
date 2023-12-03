package com.personal.tax.model.dto;

import com.personal.tax.model.enums.TaxSlabEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TaxResponseDto {

    Double taxAmount;
    TaxSlabEnum taxSlab;
    List<TaxReliefDto> taxClaimOptions;

}
