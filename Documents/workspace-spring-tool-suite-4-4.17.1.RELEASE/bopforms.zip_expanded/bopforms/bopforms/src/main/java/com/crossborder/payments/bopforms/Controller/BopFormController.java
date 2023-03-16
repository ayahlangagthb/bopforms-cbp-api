package com.crossborder.payments.bopforms.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crossborder.payments.bopforms.Models.BopFormModel;

import com.crossborder.payments.bopforms.Repo.BopFormModelRepo;
import com.crossborder.payments.bopforms.service.BopFormService;
import com.google.gson.Gson;

@RestController
public class BopFormController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BopFormController.class);
	private static final String INFO = "INFO: "; // private static final String DB = "DB: ";
	List<BopFormModel> newforms = new ArrayList<>();
	BopFormModel bopform = new BopFormModel();
	BopFormModel bopform2 = new BopFormModel();
	

	String bopformreq;
	@Autowired
	private BopFormModelRepo bopFormModelRepo;
	@Autowired
    private BopFormService bopFormService;
	void setUp() {
		
		bopform.setDebitAccNo("1211121121");
		bopform.setDebitValDate("22-03-2023");
		bopform.setDebitAmount("R33.9");
		bopform.setBeneficiaryAccNo("beneficiaryAccNo");
		bopform.setBeneficiaryName("SaySay");
		bopform.setBeneficiary2Address("beneficiary2Address");
		bopform.setBeneficiary3Address("beneficiary3Address");
		bopform.setBeneficiary4Address("beneficiary4Address");	
		bopform.setBeneficiary5Address("beneficiary5Address");
		bopform.setCreditCurrency("USD");
		bopform.setCreditAccount("5555555");
		bopform.setForeignCtpyType("BITCOIN");
		bopform.setCustomerReference("Ayanda the Student of ukzn");
		bopform.setOrderingInstitution("UKZN");
		bopform.setAccWithInstitution1name("Acc With Institution 1 name");
		bopform.setAccWithInstitution2Address("22222222");
		bopform.setAccWithInstitution3Address("33333333");
		bopform.setAccWithInstitution4Address("44444444");
		bopform.setDetailsOfCharges(" these are the details of charge");
		bopform.setBopCategory("the category");
		bopform.setBopSubCategory("the sub category");
		bopform.setRulingsSection("ABCD");
		bopform.setLocationCountry("USD");
		bopform.setCountry("RSA");
		newforms.add(bopform);
		
		
		bopform2.setDebitAccNo("1111111111");
		bopform2.setDebitValDate("22-03-2023");
		bopform2.setDebitAmount("R33.9");
		bopform2.setBeneficiaryAccNo("beneficiaryAccNo");
		bopform2.setBeneficiaryName("SaySay");
		bopform2.setBeneficiary2Address("beneficiary2Address");
		bopform2.setBeneficiary3Address("beneficiary3Address");
		bopform2.setBeneficiary4Address("beneficiary4Address");	
		bopform2.setBeneficiary5Address("beneficiary5Address");
		bopform2.setCreditCurrency("USD");
		bopform2.setCreditAccount("5555555");
		bopform2.setForeignCtpyType("BITCOIN");
		bopform2.setCustomerReference("Ayanda the Student of ukzn");
		bopform2.setOrderingInstitution("UKZN");
		bopform2.setAccWithInstitution1name("Acc With Institution 1 name");
		bopform2.setAccWithInstitution2Address("22222222");
		bopform2.setAccWithInstitution3Address("33333333");
		bopform2.setAccWithInstitution4Address("44444444");
		bopform2.setDetailsOfCharges(" these are the details of charge");
		bopform2.setBopCategory("the category");
		bopform2.setBopSubCategory("the sub category");
		bopform2.setRulingsSection("ABCD");
		bopform2.setLocationCountry("USD");
		bopform2.setCountry("RSA");
		
		newforms.add(bopform2);
		
		bopformreq = new Gson().toJson(bopform);
	}

	@GetMapping(value = "/")
	public String getPage() {
		this.setUp();
		String resultMsg = INFO + "Welcome to Bop Forms, Use this mock request for testing \n" + bopformreq;
		LOGGER.info(resultMsg);
		return resultMsg;
	}

	@PostMapping(value = "/save")
	public String addBopForms(BopFormModel bopFormModel) {
		bopFormModelRepo.save(bopform);
	
		bopFormService.addBopForm(new Gson().toJson(bopform));
		LOGGER.info("Added Bop Form : ", bopform.toString());
		return "SAVED BOPFORM: \n" + bopform.toString();

	}

	@GetMapping("/bopforms")
	public List<BopFormModel> getAllBopForms() {
		LOGGER.info("finding all Bop Forms:... ");
		return bopFormModelRepo.findAll();
	}

	@PutMapping("/update/{id}")
	public String updateBopForms(@PathVariable long id, @RequestBody BopFormModel bopFormModel) {
		BopFormModel updateBopForm = bopFormModelRepo.findById(id).get();
		bopform.setDebitAccNo("666666666");
		bopFormModelRepo.save(updateBopForm);
		LOGGER.info("Updated Bop Form with ID: ", id);
		return "The BopForm With ref ID[ " + id + " ] have been updated and saved successfully.";
	}

	@DeleteMapping(value = "delete/{id}")
	public String DeleteBopForms(@PathVariable long id) {
		bopFormModelRepo.deleteById(id);
		LOGGER.info("Deleted Bop Form with ID: ", id);
		return "The BopForm With ref ID[ " + id + " ] have been deleted/removed successfully.";
	}
}
