package com.emothion.date.mytools;

import java.sql.Timestamp;

/**
 * @ClassName: com.emothion.date.mytools.DateUtils.java
 * @Description: ʱ�乤����
 * <table border=1>
 * <tr><th>ʱ��</th><th>�޸�����</th></tr>
 * <tr><td>2016��11��24��</td><td>�������ݣ�1��2��3</td></tr>
 * </table>
 * @version: v1.0.0
 * @author: emothion
 * @date: 2016��11��24�� ����9:46:45
 */
public class DateUtils {
	
	/**
	 * @Function: com.emothion.date.mytools.DateUtils::getParamMonthLastDay
	 * @param year
	 * @param month
	 * @return
	 * @Description: ��ȡ�������һ��
	 * <table border=1>
	 * <tr><th>ʱ��</th><th>�޸�����</th></tr>
	 * <tr><td>2016��11��24��</td><td>����</td></tr>
	 * </table>
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��24�� ����9:48:07
	 */
	public static String getParamMonthLastDay(int year, int month) {
		StringBuilder retDate = new StringBuilder(String.valueOf(year));
		retDate.append("-").append(month).append("-");
		if (month == 2) {
			if (judgeBissextile(year)) {
				return retDate.append("29").toString();
			} else {
				return retDate.append("28").toString();
			}
		} else {
			if (((month <= 7 && month >= 1) && month % 2 != 0) || ((month >= 8 && month <= 12) && month % 2 == 0)) {
				return retDate.append("31").toString();
			} else {
				return retDate.append("30").toString();
			}
		}
	}

	/**
	 * @Function: com.emothion.date.mytools.DateUtils::judgeBissextile
	 * @param year
	 * @return
	 * @Description: �ж��Ƿ�������
	 * <table border=1>
	 * <tr><th>ʱ��</th><th>�޸�����</th></tr>
	 * <tr><td>2016��11��24��</td><td>����</td></tr>
	 * </table>
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��24�� ����9:52:57
	 */
	public static boolean judgeBissextile(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * @Function: com.emothion.date.mytools.DateUtils::getDefaultSysTime
	 * @return
	 * @Description: ��ȡϵͳ��ǰʱ��
	 * <table border=1>
	 * <tr><th>ʱ��</th><th>�޸�����</th></tr>
	 * <tr><td>2016��11��24��</td><td>����</td></tr>
	 * </table>
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��24�� ����9:56:31
	 */
	public static Timestamp getDefaultSysTime() {
		return new Timestamp(System.currentTimeMillis());
	}
}
