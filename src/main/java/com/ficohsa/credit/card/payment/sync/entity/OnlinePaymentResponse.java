/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficohsa.credit.card.payment.sync.entity;

/**
 *
 * @author jospina
 */
public class OnlinePaymentResponse {
	private CreditCardPayment creditCardPayment;
	private String posUserData;
	private String rrn37;
	private String vPrespCode;
	private String systemAction;
	private int reasonActionCode;
	private String actionDescription;
	private String cardValidationResult;
	private String authorizationCode;
	private String descripcionResultado;

	/**
	 * @return the creditCardPayment
	 */
	public CreditCardPayment getCreditCardPayment() {
		return creditCardPayment;
	}

	/**
	 * @param creditCardPayment the creditCardPayment to set
	 */
	public void setCreditCardPayment(CreditCardPayment creditCardPayment) {
		this.creditCardPayment = creditCardPayment;
	}

	/**
	 * @return the posUserData
	 */
	public String getPosUserData() {
		return posUserData;
	}

	/**
	 * @param posUserData the posUserData to set
	 */
	public void setPosUserData(String posUserData) {
		this.posUserData = posUserData;
	}

	/**
	 * @return the systemAction
	 */
	public String getSystemAction() {
		return systemAction;
	}

	/**
	 * @param systemAction the systemAction to set
	 */
	public void setSystemAction(String systemAction) {
		this.systemAction = systemAction;
	}

	/**
	 * @return the reasonActionCode
	 */
	public int getReasonActionCode() {
		return reasonActionCode;
	}

	/**
	 * @param reasonActionCode the reasonActionCode to set
	 */
	public void setReasonActionCode(int reasonActionCode) {
		this.reasonActionCode = reasonActionCode;
	}

	/**
	 * @return the actionDescription
	 */
	public String getActionDescription() {
		return actionDescription;
	}

	/**
	 * @param actionDescription the actionDescription to set
	 */
	public void setActionDescription(String actionDescription) {
		this.actionDescription = actionDescription;
	}

	/**
	 * @return the cardValidationResult
	 */
	public String getCardValidationResult() {
		return cardValidationResult;
	}

	/**
	 * @param cardValidationResult the cardValidationResult to set
	 */
	public void setCardValidationResult(String cardValidationResult) {
		this.cardValidationResult = cardValidationResult;
	}

	/**
	 * @return the authorizationCode
	 */
	public String getAuthorizationCode() {
		return authorizationCode;
	}

	/**
	 * @param authorizationCode the authorizationCode to set
	 */
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	/**
	 * @return the rrn37
	 */
	public String getRrn37() {
		return rrn37;
	}

	/**
	 * @param rrn37 the rrn37 to set
	 */
	public void setRrn37(String rrn37) {
		this.rrn37 = rrn37;
	}

	/**
	 * @return the vPrespCode
	 */
	public String getvPrespCode() {
		return vPrespCode;
	}

	/**
	 * @param vPrespCode the vPrespCode to set
	 */
	public void setvPrespCode(String vPrespCode) {
		this.vPrespCode = vPrespCode;
	}

	public String getDescripcionResultado() {
		return descripcionResultado == null ? "" : descripcionResultado;
	}

	public void setDescripcionResultado(String descripcionResultado) {
		this.descripcionResultado = descripcionResultado;
	}

	@Override
	public String toString() {
		return "OnlinePaymentResponse [creditCardPayment=" + creditCardPayment + ", posUserData=" + posUserData
				+ ", rrn37=" + rrn37 + ", vPrespCode=" + vPrespCode + ", systemAction=" + systemAction
				+ ", reasonActionCode=" + reasonActionCode + ", actionDescription=" + actionDescription
				+ ", cardValidationResult=" + cardValidationResult + ", authorizationCode=" + authorizationCode
				+ ", descripcionResultado=" + descripcionResultado + "]";
	}

}