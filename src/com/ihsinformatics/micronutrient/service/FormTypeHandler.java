package com.ihsinformatics.micronutrient.service;

import java.util.Date;

import org.json.simple.JSONObject;

import com.ihsinformatics.micronutrient.elements.RequestElements;
import com.ihsinformatics.micronutrient.model.pojos.Sp;
import com.ihsinformatics.micronutrient.model.pojos.SpVisit;
import com.ihsinformatics.micronutrient.utils.FormTypeInfo;
import com.ihsinformatics.micronutrient.utils.RestUtil;

public class FormTypeHandler
{
	public static String saveForm(JSONObject form)
	{
		String response = "dfdf";

		/*
		 * Identify FormType
		 * and invoking appropriate method
		 */

		String formType;
		formType = String.valueOf(form.get(FormTypeInfo.SP_INFO));

		if (formType.equalsIgnoreCase(FormTypeInfo.SP_INFO.getName()))
		{
			response = JSONParser.saveSPVisit(form);
		}

		else if (formType.equalsIgnoreCase(FormTypeInfo.QCL_MONTHLY_DATA.getName()))
		{
			response = JSONParser.saveQCL(form);
		}

		else if (formType.equalsIgnoreCase(FormTypeInfo.MONTHLY_DATA_KIO3_INVENTORY.getName()))
		{
			response = JSONParser.saveDistrictLogisticSummary(form);
		}

		return response;
	}

}
