package com.ihsinformatics.micronutrient.elements;

import com.ihsinformatics.micronutrient.utils.FormTypeInfo;



public class RequestElements
{
	/***
	 * Params added for MI
	 */

	/*
	 * Encounter Params
	 */
	public static final String ENCOUNTER_SP_INFO = FormTypeInfo.SP_INFO.getName();
	public static final String ENCOUNTER_SP_KNOWLEDGEPRACTICE = FormTypeInfo.SP_KNOWLEDGEPRACTICE.getName();
	public static final String ENCOUNTER_SALT_PRODUCTION = FormTypeInfo.SALT_PRODUCTION.getName();
	public static final String ENCOUNTER_KIO3_INVENTORY = FormTypeInfo.KIO3_INVENTORY.getName();
	public static final String ENCOUNTER_RTK_RESULTS = FormTypeInfo.RTK_RESULTS.getName();
	public static final String ENCOUNTER_DRIP_RTK_SAMPLE = FormTypeInfo.DRIP_RTK_SAMPLE.getName();
	public static final String ENCOUNTER_PACKAGING_AND_REMARKS = FormTypeInfo.PACKAGING_AND_REMARKS.getName();

	/*
	 * Form Questions Params
	 */

	// SP and Field visit

	// Block 1
	public static final String SP_VST_DATE = "DATE OF VISIT";
	public static final String SP_VST_TME = "TIME OF VISIT";
	public static final String SP_ID = "SP ID";
	public static final String SP_NAME = "SP NAME";
	public static final String SP_ADDRESS = "SP ADDRESS";
	public static final String SP_CONTACT = "SP CONTACT";
	public static final String SP_TEHSIL = "SP TEHSIL";
	public static final String SP_DISTRICT = "SP DISTRICT";

	// Block 2

	public static final String SP_AWR_OF_IODZTN = "SP AWARE OF IODIZATION PROCESS";
	public static final String DRP_MX_MTCH_CHKI = "DROP MIXING MATCHES WITH PRODUCTION OF CHAKKI";
	public static final String KIO3_PREPRD_BY_STNDRD = "KIO3 SOLUTION IS PREPARED AS STANDARD VS WATER RATIO";

	// Block 3
	public static final String TOTAL_SALT_PRDCD = "TOTAL SALT PRODUCED";
	public static final String EDBLE_SALT_PRDCTN = "EDIBLE SALT PRODUCTION";
	public static final String IODZD_SALT_PRDCD = "IODIZED SALT PRODUCED";
	public static final String UIODZD_SALT_PRDCD = "UNIODIZED SALT PRODUCED";

	// Block 4
	public static final String PREVS_KIO3_STCK = "PREVIOUS KIO3 STOCK";
	public static final String KIO3_RCVD = "KIO3 RECEIVED";
	public static final String EXISTING_STCK = "EXISTING STOCK";
	public static final String KIO3_UTLZD = "KIO3 UTILIZED";

	// Block 5
	public static final String RTK_RSLT_NO_IODNE = "NO IODINE";
	public static final String RTK_RSLT_1_15 = "1-15";
	public static final String RTK_RSLT_16_29 = "16-29";
	public static final String RTK_RSLT_30_ABVE = "30 AND ABOVE";

	// Block 6
	public static final String DRIP_FD = "DRIP FEED";
	public static final String DRIP_ST = "DRIP SET";
	public static final String RTKs = "RTKs";
	public static final String NO_OF_SMPLS_COLCTD_FOR_QCL = "NUMBER OF SAMPLES COLLECTED FOR QCL";

	// Block 7
	public static final String PACKAGING = "PACKAGING";
	public static final String RMRKS = "SP VISIT REMARKS";


	// QCL Monthly data collection tool

	// Block 1
	public static final String QCL_PROVINCE = "QCL PROVINCE";
	public static final String QCL_LAB_DSTRCT = "QCL LAB DISTRICT ";
	public static final String QCL_SMPL_DSTRCT = "SAMPLE DISTRICT";
	public static final String QCL_SMPL_SRC = "SAMPLE SOURCE";
	public static final String QCL_SMPL_INFO = "SAMPLE INFORMATION";
	public static final String QCL_SMPL_CTGRY = "SAMPLE CATEGORY";
	public static final String QCL_SMPL_COLLCTN_DATE = "DATE OF SAMPLE COLLECTION";
	public static final String QCL_SMPL_ANALYS_DATE = "DATE OF SAMPLE ANALYSIS";
	public static final String QCL_RSLT = "RESULTS";

	// Monthly data collection tool for District Logistics Summary

	// Block 1
	public static final String SMRY_RPRTNG_MNTH = "REPORTING MONTH";
	public static final String SMRY_OPN_STK_KIO3 = "OPENING STOCK OF KIO3";
	public static final String SMRY_RCVD_FRM_GNRA = "RECEIVED FROM GENERA IN CURRENT MONTH";
	public static final String SMRY_KIO3_SLD = "KIO3 SOLD";
	public static final String SMRY_CLS_STK_KIO3 = "CLOSING STOCK OF KIO3";
	public static final String SMRY_RMRKS = "SUMMARY REMARKS";

}
