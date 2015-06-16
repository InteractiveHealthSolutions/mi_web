package com.ihsinformatics.micronutrient.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.ihsinformatics.micronutrient.utils.HibernateUtil;

@Path("/service")
public class MobileService
{
	@Path("/save")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String addForm(String json)
	{
		JSONParser parser = new JSONParser();
		try
		{
			JSONObject obj = (JSONObject) parser.parse(json);
			String response = FormTypeHandler.saveForm(obj);
			return response;
		}
		catch (ParseException e)
		{
			e.printStackTrace();
			// return ResponseBuilder.buildResponse(ResponseStatus.STATUS_INCORRECT_DATA_FORMAT_ERROR, null);
			return "Error agaya";
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			// return ResponseBuilder.buildResponse(ResponseStatus.STATUS_INTERNAL_ERROR, null);
			return "Error agaya";
		}
	}

}
