package com.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.controllerBean.InputForm;
import com.bean.controllerBean.OutputForm;
import com.service.GetSomeDataFromDatabaseService;

@Controller
public class GetSomeDataFromDatabaseController {

	private GetSomeDataFromDatabaseService getSomeDataFromDatabase;

	@Autowired
	public void setService(GetSomeDataFromDatabaseService getSomeDataFromDatabase) {
		this.getSomeDataFromDatabase = getSomeDataFromDatabase;
	}


	@RequestMapping(value = "/getSomeDataFromDatabase", method = POST)
	public @ResponseBody List<OutputForm> getSomeDataFromDatabase(@RequestBody InputForm inputForm) {

		List<OutputForm> outputFormList = new ArrayList<OutputForm>();

		System.out.println("you access the controller start");

		outputFormList = getSomeDataFromDatabase.getSomeDataFromDatabase(inputForm);

		System.out.println("you access the controller end");

		return outputFormList;

	}



}
