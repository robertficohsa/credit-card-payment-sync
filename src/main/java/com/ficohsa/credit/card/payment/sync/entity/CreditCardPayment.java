/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficohsa.credit.card.payment.sync.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author jospina
 */
public class CreditCardPayment {

	private BigDecimal recordId;
	private long sourceAgency;
	private String merchantNumber;
	private String cardNumber;
	private String operationType;
	private int currencyType;
	private int org;
	private String transactionCurrency;
	private BigDecimal exchangeRate;
	private int transactionType;
	private String userCode;
	private long movementSequence;
	private String sourceSequence;
	private BigDecimal cashAmount;
	private BigDecimal checkAmount;
	private long documentNumber;
	private String authorizationNumber;
	private String recoveryReference;
	private String applied;
	private String applyOnLine;
	private Date additionDate;
	private Date validDate;
	private Date sendDate;
	private Date fileDate;
	private Date authorizationDate;
	private String fileName;
	private String responseCode;
	private int attemptNumber;
	private int checkType;
	private String sourceCountry;
	private String targetCountry;

	/**
	 * @return
	 */
	public BigDecimal getRecordId() {
		return recordId;
	}

	/**
	 * @param recordId
	 */
	public void setRecordId(BigDecimal recordId) {
		this.recordId = recordId;
	}

	/**
	 * @return the sourceAgency
	 */
	public long getSourceAgency() {
		return sourceAgency;
	}

	/**
	 * @param sourceAgency the sourceAgency to set
	 */
	public void setSourceAgency(long sourceAgency) {
		this.sourceAgency = sourceAgency;
	}

	/**
	 * @return the merchantNumber
	 */
	public String getMerchantNumber() {
		return merchantNumber;
	}

	/**
	 * @param merchantNumber the merchantNumber to set
	 */
	public void setMerchantNumber(String merchantNumber) {
		this.merchantNumber = merchantNumber;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the operationType
	 */
	public String getOperationType() {
		return operationType;
	}

	/**
	 * @param operationType the operationType to set
	 */
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	/**
	 * @return the currencyType
	 */
	public int getCurrencyType() {
		return currencyType;
	}

	/**
	 * @param currencyType the currencyType to set
	 */
	public void setCurrencyType(int currencyType) {
		this.currencyType = currencyType;
	}

	/**
	 * @return the org
	 */
	public int getOrg() {
		return org;
	}

	/**
	 * @param org the org to set
	 */
	public void setOrg(int org) {
		this.org = org;
	}

	/**
	 * @return the transactionCurrency
	 */
	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	/**
	 * @param transactionCurrency the transactionCurrency to set
	 */
	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	/**
	 * @return the exchangeRate
	 */
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	/**
	 * @return the transactionType
	 */
	public int getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(int transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * @return the userCode
	 */
	public String getUserCode() {
		return userCode;
	}

	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**
	 * @return the movementSequence
	 */
	public long getMovementSequence() {
		return movementSequence;
	}

	/**
	 * @param movementSequence the movementSequence to set
	 */
	public void setMovementSequence(long movementSequence) {
		this.movementSequence = movementSequence;
	}

	/**
	 * @return the sourceSequence
	 */
	public String getSourceSequence() {
		return sourceSequence;
	}

	/**
	 * @param sourceSequence the sourceSequence to set
	 */
	public void setSourceSequence(String sourceSequence) {
		this.sourceSequence = sourceSequence;
	}

	/**
	 * @return the cashAmount
	 */
	public BigDecimal getCashAmount() {
		return cashAmount;
	}

	/**
	 * @param cashAmount the cashAmount to set
	 */
	public void setCashAmount(BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}

	/**
	 * @return the checkAmount
	 */
	public BigDecimal getCheckAmount() {
		return checkAmount;
	}

	/**
	 * @param checkAmount the checkAmount to set
	 */
	public void setCheckAmount(BigDecimal checkAmount) {
		this.checkAmount = checkAmount;
	}

	/**
	 * @return the documentNumber
	 */
	public long getDocumentNumber() {
		return documentNumber;
	}

	/**
	 * @param documentNumber the documentNumber to set
	 */
	public void setDocumentNumber(long documentNumber) {
		this.documentNumber = documentNumber;
	}

	/**
	 * @return the authorizationNumber
	 */
	public String getAuthorizationNumber() {
		return authorizationNumber;
	}

	/**
	 * @param authorizationNumber the authorizationNumber to set
	 */
	public void setAuthorizationNumber(String authorizationNumber) {
		this.authorizationNumber = authorizationNumber;
	}

	/**
	 * @return the recoveryReference
	 */
	public String getRecoveryReference() {
		return recoveryReference;
	}

	/**
	 * @param recoveryReference the recoveryReference to set
	 */
	public void setRecoveryReference(String recoveryReference) {
		this.recoveryReference = recoveryReference;
	}

	/**
	 * @return the applied
	 */
	public String getApplied() {
		return applied;
	}

	/**
	 * @param applied the applied to set
	 */
	public void setApplied(String applied) {
		this.applied = applied;
	}

	/**
	 * @return the applyOnLine
	 */
	public String getApplyOnLine() {
		return applyOnLine;
	}

	/**
	 * @param applyOnLine the applyOnLine to set
	 */
	public void setApplyOnLine(String applyOnLine) {
		this.applyOnLine = applyOnLine;
	}

	/**
	 * @return the additionDate
	 */
	public Date getAdditionDate() {
		return additionDate;
	}

	/**
	 * @param additionDate the additionDate to set
	 */
	public void setAdditionDate(Date additionDate) {
		this.additionDate = additionDate;
	}

	/**
	 * @return the validDate
	 */
	public Date getValidDate() {
		return validDate;
	}

	/**
	 * @param validDate the validDate to set
	 */
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	/**
	 * @return the sendDate
	 */
	public Date getSendDate() {
		return sendDate;
	}

	/**
	 * @param sendDate the sendDate to set
	 */
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	/**
	 * @return the fileDate
	 */
	public Date getFileDate() {
		return fileDate;
	}

	/**
	 * @param fileDate the fileDate to set
	 */
	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}

	/**
	 * @return the authorizationDate
	 */
	public Date getAuthorizationDate() {
		return authorizationDate;
	}

	/**
	 * @param authorizationDate the authorizationDate to set
	 */
	public void setAuthorizationDate(Date authorizationDate) {
		this.authorizationDate = authorizationDate;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * @return the attemptNumber
	 */
	public int getAttemptNumber() {
		return attemptNumber;
	}

	/**
	 * @param attemptNumber the attemptNumber to set
	 */
	public void setAttemptNumber(int attemptNumber) {
		this.attemptNumber = attemptNumber;
	}

	/**
	 * @return the checkType
	 */
	public int getCheckType() {
		return checkType;
	}

	/**
	 * @param checkType the checkType to set
	 */
	public void setCheckType(int checkType) {
		this.checkType = checkType;
	}

	/**
	 * @return the sourceCountry
	 */
	public String getSourceCountry() {
		return sourceCountry;
	}

	/**
	 * @param sourceCountry the sourceCountry to set
	 */
	public void setSourceCountry(String sourceCountry) {
		this.sourceCountry = sourceCountry;
	}

	/**
	 * @return the targetCountry
	 */
	public String getTargetCountry() {
		return targetCountry;
	}

	/**
	 * @param targetCountry the targetCountry to set
	 */
	public void setTargetCountry(String targetCountry) {
		this.targetCountry = targetCountry;
	}

	@Override
	public String toString() {
		return "CreditCardPayment [recordId=" + recordId + ", sourceAgency=" + sourceAgency + ", merchantNumber="
				+ merchantNumber + ", cardNumber=" + cardNumber + ", operationType=" + operationType + ", currencyType="
				+ currencyType + ", org=" + org + ", transactionCurrency=" + transactionCurrency + ", exchangeRate="
				+ exchangeRate + ", transactionType=" + transactionType + ", userCode=" + userCode
				+ ", movementSequence=" + movementSequence + ", sourceSequence=" + sourceSequence + ", cashAmount="
				+ cashAmount + ", checkAmount=" + checkAmount + ", documentNumber=" + documentNumber
				+ ", authorizationNumber=" + authorizationNumber + ", recoveryReference=" + recoveryReference
				+ ", applied=" + applied + ", applyOnLine=" + applyOnLine + ", additionDate=" + additionDate
				+ ", validDate=" + validDate + ", sendDate=" + sendDate + ", fileDate=" + fileDate
				+ ", authorizationDate=" + authorizationDate + ", fileName=" + fileName + ", responseCode="
				+ responseCode + ", attemptNumber=" + attemptNumber + ", checkType=" + checkType + ", sourceCountry="
				+ sourceCountry + ", targetCountry=" + targetCountry + "]";
	}

}