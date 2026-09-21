package com.order.dto;

import java.math.BigDecimal;
import java.util.UUID;


public record CreateOrderRequest(
		
        Long productId,

//        @Min(1)
        Integer quantity,

//        @NotNull
        BigDecimal amount
		
		
		) {

}
