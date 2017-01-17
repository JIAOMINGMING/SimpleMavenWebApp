package com.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.controllerBean.HostingForm;
import com.bean.controllerBean.ReturnHostingForm;
import com.bean.controllerBean.UserInformationForm;


@Controller
public class ControlTestClass {

	@RequestMapping(value = "/helloworld", method = POST)
    public ReturnHostingForm home(@RequestBody HostingForm hostingForm) {
        // (3)

		System.out.println("you have access the server side");
		System.out.println("hostingForm.getId()" + hostingForm.getId());

		ReturnHostingForm returnHostingForm = new ReturnHostingForm();

		return returnHostingForm;

    }

	@RequestMapping(value = "/getTime", method = POST)
    public @ResponseBody String getTime() {

		Random rand = new Random();
        float r = rand.nextFloat() * 100;
        String result = "<br>Next Random # is <b>" + r + "</b>. Generated on <b>" + new Date().toString() + "</b>";
        System.out.println("Debug Message from CrunchifySpringAjaxJQuery Controller.." + new Date().toString());
        return result;


    }

	@RequestMapping(value = "/getUserInformation", method = POST)
    public @ResponseBody UserInformationForm getUserInformation() {

		System.out.println("you access the getUserInformation server side");

		UserInformationForm result = new UserInformationForm();

		result.setUserName("jiao ming");
		result.setPassword("123456");

        return result;

    }

	@RequestMapping(value = "/getUserInformationList", method = POST)
    public @ResponseBody List<UserInformationForm> getUserInformationFormList(@RequestBody List<UserInformationForm> userInformationFormList) {
        // (3)

		System.out.println("you have access the server side");

		for(UserInformationForm userInformationForm : userInformationFormList){
			userInformationForm.setUserName(userInformationForm.getUserName() + "serverChange");
			userInformationForm.setPassword(userInformationForm.getPassword() + "serverChange");
		}

		return userInformationFormList;

    }


}
