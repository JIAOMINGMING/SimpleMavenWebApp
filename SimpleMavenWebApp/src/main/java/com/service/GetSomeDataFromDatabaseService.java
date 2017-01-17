package com.service;

import java.util.List;

import com.bean.controllerBean.InputForm;
import com.bean.controllerBean.OutputForm;

public interface GetSomeDataFromDatabaseService {

	public List<OutputForm> getSomeDataFromDatabase(InputForm inputForm);

}
