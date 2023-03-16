package com.crossborder.payments.bopforms.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BopFormModel")
public class BopFormModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "recordId")
	private long recordId;
     
	@Column(name = "debitAccNo")
	private String debitAccNo;
	
	@Column(name = "debitValDate")
	private String debitValDate;
	
	@Column(name = "debitAmount")
	private String debitAmount;
	
	@Column(name = "beneficiaryAccNo")
	private String beneficiaryAccNo;
	
	@Column(name = "beneficiaryName")
	private String beneficiaryName;

	@Column(name = "beneficiary2Address")
	private String beneficiary2Address;
	
	@Column(name = "beneficiary3Address")
	private String beneficiary3Address;
	
	@Column(name = "beneficiary4Address")
	private String beneficiary4Address;
	
	@Column(name = "beneficiary5Address")
	private String beneficiary5Address;
	
	@Column(name = "creditCurrency")
	private String creditCurrency;
	
	@Column(name = "creditAccount")
	private String creditAccount;

	@Column(name = "foreignCtpyType")
	private String foreignCtpyType;
	
	@Column(name = "customerReference")
	private String customerReference;
	
	@Column(name = "orderingInstitution")
	private String orderingInstitution;

	@Column(name = "AccWithInstitution1name")
	private String AccWithInstitution1name;
	
	@Column(name = "AccWithInstitution2Address")
	private String AccWithInstitution2Address;
	
	@Column(name = "AccWithInstitution3Address")
	private String AccWithInstitution3Address;
	
	@Column(name = "AccWithInstitution4Address")
	private String AccWithInstitution4Address;
	
	@Column(name = "detailsOfCharges")
	private String  detailsOfCharges;

	@Column(name = "bopCategory")
	private String  bopCategory;
	
	@Column(name = "bopSubCategory")
	private String  bopSubCategory;
	
	@Column(name = "rulingsSection")
	private String  rulingsSection;
	
	@Column(name = "locationCountry")
	private String locationCountry;

	
	@Column(name = "country")
	private String country;


	public long getRecordId() {
		return recordId;
	}


	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}


	public String getDebitAccNo() {
		return debitAccNo;
	}


	public void setDebitAccNo(String debitAccNo) {
		this.debitAccNo = debitAccNo;
	}


	public String getDebitValDate() {
		return debitValDate;
	}


	public void setDebitValDate(String debitValDate) {
		this.debitValDate = debitValDate;
	}


	public String getDebitAmount() {
		return debitAmount;
	}


	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}


	public String getBeneficiaryAccNo() {
		return beneficiaryAccNo;
	}


	public void setBeneficiaryAccNo(String beneficiaryAccNo) {
		this.beneficiaryAccNo = beneficiaryAccNo;
	}


	public String getBeneficiaryName() {
		return beneficiaryName;
	}


	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}


	public String getBeneficiary2Address() {
		return beneficiary2Address;
	}


	public void setBeneficiary2Address(String beneficiary2Address) {
		this.beneficiary2Address = beneficiary2Address;
	}


	public String getBeneficiary3Address() {
		return beneficiary3Address;
	}


	public void setBeneficiary3Address(String beneficiary3Address) {
		this.beneficiary3Address = beneficiary3Address;
	}


	public String getBeneficiary4Address() {
		return beneficiary4Address;
	}


	public void setBeneficiary4Address(String beneficiary4Address) {
		this.beneficiary4Address = beneficiary4Address;
	}


	public String getBeneficiary5Address() {
		return beneficiary5Address;
	}


	public void setBeneficiary5Address(String beneficiary5Address) {
		this.beneficiary5Address = beneficiary5Address;
	}


	public String getCreditCurrency() {
		return creditCurrency;
	}


	public void setCreditCurrency(String creditCurrency) {
		this.creditCurrency = creditCurrency;
	}


	public String getCreditAccount() {
		return creditAccount;
	}


	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}


	public String getForeignCtpyType() {
		return foreignCtpyType;
	}


	public void setForeignCtpyType(String foreignCtpyType) {
		this.foreignCtpyType = foreignCtpyType;
	}


	public String getCustomerReference() {
		return customerReference;
	}


	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}


	public String getOrderingInstitution() {
		return orderingInstitution;
	}


	public void setOrderingInstitution(String orderingInstitution) {
		this.orderingInstitution = orderingInstitution;
	}


	public String getAccWithInstitution1name() {
		return AccWithInstitution1name;
	}


	public void setAccWithInstitution1name(String accWithInstitution1name) {
		AccWithInstitution1name = accWithInstitution1name;
	}


	public String getAccWithInstitution2Address() {
		return AccWithInstitution2Address;
	}


	public void setAccWithInstitution2Address(String accWithInstitution2Address) {
		AccWithInstitution2Address = accWithInstitution2Address;
	}


	public String getAccWithInstitution3Address() {
		return AccWithInstitution3Address;
	}


	public void setAccWithInstitution3Address(String accWithInstitution3Address) {
		AccWithInstitution3Address = accWithInstitution3Address;
	}


	public String getAccWithInstitution4Address() {
		return AccWithInstitution4Address;
	}


	public void setAccWithInstitution4Address(String accWithInstitution4Address) {
		AccWithInstitution4Address = accWithInstitution4Address;
	}


	public String getDetailsOfCharges() {
		return detailsOfCharges;
	}


	public void setDetailsOfCharges(String detailsOfCharges) {
		this.detailsOfCharges = detailsOfCharges;
	}


	public String getBopCategory() {
		return bopCategory;
	}


	public void setBopCategory(String bopCategory) {
		this.bopCategory = bopCategory;
	}


	public String getBopSubCategory() {
		return bopSubCategory;
	}


	public void setBopSubCategory(String bopSubCategory) {
		this.bopSubCategory = bopSubCategory;
	}


	public String getRulingsSection() {
		return rulingsSection;
	}


	public void setRulingsSection(String rulingsSection) {
		this.rulingsSection = rulingsSection;
	}


	public String getLocationCountry() {
		return locationCountry;
	}


	public void setLocationCountry(String locationCountry) {
		this.locationCountry = locationCountry;
	}


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "BopFormModel [recordId=" + recordId + ", debitAccNo=" + debitAccNo + ", debitValDate=" + debitValDate
				+ ", debitAmount=" + debitAmount + ", beneficiaryAccNo=" + beneficiaryAccNo + ", beneficiaryName="
				+ beneficiaryName + ", beneficiary2Address=" + beneficiary2Address + ", beneficiary3Address="
				+ beneficiary3Address + ", beneficiary4Address=" + beneficiary4Address + ", beneficiary5Address="
				+ beneficiary5Address + ", creditCurrency=" + creditCurrency + ", creditAccount=" + creditAccount
				+ ", foreignCtpyType=" + foreignCtpyType + ", customerReference=" + customerReference
				+ ", orderingInstitution=" + orderingInstitution + ", AccWithInstitution1name="
				+ AccWithInstitution1name + ", AccWithInstitution2Address=" + AccWithInstitution2Address
				+ ", AccWithInstitution3Address=" + AccWithInstitution3Address + ", AccWithInstitution4Address="
				+ AccWithInstitution4Address + ", detailsOfCharges=" + detailsOfCharges + ", bopCategory=" + bopCategory
				+ ", bopSubCategory=" + bopSubCategory + ", rulingsSection=" + rulingsSection + ", locationCountry="
				+ locationCountry + ", country=" + country + "]";
	}
	
}
