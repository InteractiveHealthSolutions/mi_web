package com.ihsinformatics.micronutrient.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.json.simple.JSONObject;

import com.ihsinformatics.micronutrient.elements.RequestElements;
import com.ihsinformatics.micronutrient.model.pojos.Sp;
import com.ihsinformatics.micronutrient.utils.RestUtil;

public class JSONParser
{

	public static String saveSPVisit(JSONObject form)
	{
		String _response = "1";

		/*
		 * We are assuming here that SP is already created in Database
		 */

		// int visitId;
		Sp sp = new Sp();
		sp.setSpId(Integer.valueOf(form.get(RequestElements.SP_ID).toString()));

		Date visitDate = null;
		String vstDate = form.get(RequestElements.SP_VST_DATE).toString();
		visitDate = RestUtil.stringToDate(vstDate);

		Date date = Calendar.getInstance().getTime();
		DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		String time = timeFormat.format(date);
		String todate = dateFormat.format(date);

		// procedure to store time of visit

		String awareOfIodizationProcess = form.get(RequestElements.SP_AWR_OF_IODZTN).toString();
		String dropMatchesChakki = form.get(RequestElements.DRP_MX_MTCH_CHKI).toString();
		String kio3PreparedAsStandard = form.get(RequestElements.KIO3_PREPRD_BY_STNDRD).toString();
		String totalSaltProduced = form.get(RequestElements.TOTAL_SALT_PRDCD).toString();
		String edibleSaltProduction = form.get(RequestElements.EDBLE_SALT_PRDCTN).toString();
		String iodizedSaltProduced = form.get(RequestElements.IODZD_SALT_PRDCD).toString();
		String uniodizedSaltProduced = form.get(RequestElements.UIODZD_SALT_PRDCD).toString();
		String previousKio3Stock = form.get(RequestElements.PREVS_KIO3_STCK).toString();
		String kio3Received = form.get(RequestElements.KIO3_RCVD).toString();
		String existingStock = form.get(RequestElements.EXISTING_STCK).toString();
		String kio3Utilized = form.get(RequestElements.KIO3_UTLZD).toString();
		String rtkResultsNoIodine = form.get(RequestElements.RTK_RSLT_NO_IODNE).toString();
		String rtkResults115 = form.get(RequestElements.RTK_RSLT_1_15).toString();
		String rtkResults1629 = form.get(RequestElements.RTK_RSLT_16_29).toString();
		String rtkResults30Above = form.get(RequestElements.RTK_RSLT_30_ABVE).toString();
		String dripFeed = form.get(RequestElements.DRIP_FD).toString();
		String dripSet = form.get(RequestElements.DRIP_ST).toString();
		String rtks = form.get(RequestElements.RTKs).toString();
		String noOfSamplesCollectedForQcl = form.get(RequestElements.NO_OF_SMPLS_COLCTD_FOR_QCL).toString();
		String packaging = form.get(RequestElements.PACKAGING).toString();
		String remarks = form.get(RequestElements.RMRKS).toString();




		// SpVisit spVisit = new SpVisit(visitId, sp, visitDate, visitTime,
		// awareOfIodizationProcess, dropMatchesChakki, kio3PreparedAsStandard,
		// totalSaltProduced, edibleSaltProduction, iodizedSaltProduced,
		// uniodizedSaltProduced, previousKio3Stock, kio3Received, existingStock,
		// kio3Utilized, rtkResultsNoIodine, rtkResults115, rtkResults1629,
		// rtkResults30Above, dripFeed, dripSet, rtks, noOfSamplesCollectedForQcl,
		// packaging, remarks);


		return _response;
	}

	public static String saveQCL(JSONObject form)
	{
		String _response = "1";

		return _response;
	}

	public static String saveDistrictLogisticSummary(JSONObject form)
	{
		String _response = "1";

		return _response;
	}
}
