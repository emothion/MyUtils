package com.emothion.string.mytools;

/**
 * @ClassName: com.emothion.String.mytools.StringUtils.java
 * @Description: �ַ���������
 * <table border=1>
 * <tr><th>ʱ��</th><th>�޸�����</th></tr>
 * <tr><td>2016��11��24��</td><td>����</td></tr>
 * </table>
 * @version: v1.0.0
 * @author: emothion
 * @date: 2016��11��24�� ����9:58:22
 */
public class StringUtils {

	/**
	 * @Function: com.emothion.String.mytools.StringUtils::isEmpty
	 * @param str
	 * @return
	 * @Description: 1���ж��Ƿ�Ϊ��(StringUtil.isEmpty("  ") = false;)
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��25�� ����4:47:05
	 */
	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}
	
	/**
	 * @Function: com.emothion.String.mytools.StringUtils::isBlank
	 * @param str
	 * @return
	 * @Description: 2���ж��Ƿ�Ϊ����Ϊ�հ�(StringUtil.isEmpty("  ") = true;)
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��25�� ����4:49:59
	 */
	public static boolean isBlank(String str) {
		return str == null || str.trim().length() == 0;
	}
	
	/**
	 * @Function: com.emothion.String.mytools.StringUtils::isNotEmpty
	 * @param str
	 * @return
	 * @Description: 3���ж��ַ�����Ϊ��
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��25�� ����4:52:11
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	/**
	 * @Function: com.emothion.String.mytools.StringUtils::isNotBlank
	 * @param str
	 * @return
	 * @Description: 4���ж��ַ�����Ϊ���Ҳ�Ϊ�հ�
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��25�� ����4:53:40
	 */
	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}

	public static String upFirstChar(String str) {
		String upStr = str.toUpperCase();
		return upStr.substring(0, 1)+str.substring(1);
	}
}
