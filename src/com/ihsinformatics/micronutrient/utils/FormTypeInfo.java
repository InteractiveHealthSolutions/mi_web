package com.ihsinformatics.micronutrient.utils;


/**
 * Their Ids are set according to table of "privilege" in DB
 */

public enum FormTypeInfo
{
	SP_INFO(1, "SP VISIT COLLECTION"),
	SP_KNOWLEDGEPRACTICE(2, "SP KNOWLEDGE & PRACTICE"),
	SALT_PRODUCTION(3, "SALT PRODUCTION"),
	KIO3_INVENTORY(4, "KIO3 INVENTORY"),
	RTK_RESULTS(5, "RTK RESULTS"),
	DRIP_RTK_SAMPLE(6, "DRIP, RTK and SAMPLE COLECTION STATUS"),
	PACKAGING_AND_REMARKS(7, "PACKAGING AND REMARKS"),
	MONTHLY_DATA_KIO3_INVENTORY(8, "DISTRICT LOGISTICS SUMMARY"),
	QCL_MONTHLY_DATA(9, "QCL MONTHLY DATA");
	// SALT_PRODUCTION(3),

	private final Integer _id;
	private final String _name;

	FormTypeInfo(Integer id, String name)
	{
		this._id = id;
		this._name = name;
	}

	public Integer getId()
	{
		return this._id;
	}

	public String getName()
	{
		return this._name;
	}
}
