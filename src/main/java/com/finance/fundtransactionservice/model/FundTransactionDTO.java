package com.finance.fundtransactionservice.model;

import java.time.Instant;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Validated
public class FundTransactionDTO {
	
	private Long transactionId;
	private String transactionStatus;
	private String transactionType;
	@NotBlank
	private String accountId;
	private Double amount;
	private Instant createdDate;
	private Instant updatedDate;

}
