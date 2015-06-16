package com.ihsinformatics.micronutrient.database;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ihsinformatics.micronutrient.model.pojos.SpVisit;
import com.ihsinformatics.micronutrient.utils.HibernateUtil;



public class SPVisitDAO
{
	static Logger log = Logger.getLogger(SPVisitDAO.class);

	public static Integer save(SpVisit spVisit)
	{
		Session session = null;

		Integer newlySavedId = -1;

		try
		{
			// if (answer.getAnswerDataList().size() > 0)
			// {
			// for (AnswerData answerData : answer.getAnswerDataList())
			// {
			// answerData.setAnswer(answer);
			// }
			// }

			session = HibernateUtil.getSessionFactory().openSession();

			session.beginTransaction();
			session.persist(spVisit);
			session.getTransaction().commit();
			newlySavedId = spVisit.getVisitId();
		}

		catch (Exception ex)
		{
			Transaction tx = session.getTransaction();
			tx.rollback();
			ex.printStackTrace();
		}

		finally
		{
			if (session.isOpen())
			{
				session.close();
			}
		}

		return newlySavedId;
	}
}
