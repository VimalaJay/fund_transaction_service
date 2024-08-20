package com.finance.fundtransactionservice.entity;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FundTransaction {
	
	@Id
	private Long transactionId;
	private String transactionStatus;
	private String transactionType;
	private String accountId;
	private Double amount;
	private Instant createdDate = Instant.now();
	private Instant updatedDate = Instant.now();

}
