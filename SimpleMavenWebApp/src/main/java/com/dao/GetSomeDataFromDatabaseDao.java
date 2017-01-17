package com.dao;

import java.util.List;

import com.bean.controllerBean.InputForm;

public interface GetSomeDataFromDatabaseDao {

	public List<User> getSomeDataFromDatabase(InputForm inputForm);

}
