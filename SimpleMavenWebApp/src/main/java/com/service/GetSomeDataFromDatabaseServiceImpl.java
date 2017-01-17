package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.controllerBean.InputForm;
import com.bean.controllerBean.OutputForm;
import com.dao.GetSomeDataFromDatabaseDao;
import com.dao.User;

@Service
public class GetSomeDataFromDatabaseServiceImpl implements GetSomeDataFromDatabaseService {

	private GetSomeDataFromDatabaseDao getSomeDataFromDatabaseDao;

	@Autowired
	public void getDao(GetSomeDataFromDatabaseDao getSomeDataFromDatabaseDao){
		this.getSomeDataFromDatabaseDao = getSomeDataFromDatabaseDao;
	}

	public List<OutputForm> getSomeDataFromDatabase(InputForm inputForm) {

		List<OutputForm> outputFormList = new ArrayList<OutputForm>();
		System.out.println("you access the service start");

		List<User> userList = getSomeDataFromDatabaseDao.getSomeDataFromDatabase(inputForm);

		for(User user :userList) {
			OutputForm outputForm = new OutputForm();
			outputForm.setUserSex(user.getSex());
			outputForm.setUserAddress(user.getAddress());
			outputForm.setUserDescription(user.getDescription());
			outputFormList.add(outputForm);
		}

		System.out.println("you access the service end");

		return outputFormList;
	}


}
