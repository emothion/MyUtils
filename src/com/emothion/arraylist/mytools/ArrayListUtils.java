package com.emothion.arraylist.mytools;

import java.util.List;

/**
 * @ClassName: com.emothion.arraylist.mytools.ArrayListUtils.java
 * @Description: �������͹�����
 * <table border=1>
 * <tr><th>ʱ��</th><th>�޸�����</th></tr>
 * <tr><td>2016��11��25��</td><td>����</td></tr>
 * </table>
 * @version: v1.0.0
 * @author: emothion
 * @date: 2016��11��25�� ����8:25:09
 */
public class ArrayListUtils {

	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isEmpty
	 * @param args
	 * @return
	 * @Description: 1���ж�ListΪ�� 
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��25�� ����8:26:44
	 */
	public static boolean isEmpty(List<Object> args){
		return args == null || args.size() == 0;
	}
	
	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isNotEmpty
	 * @param args
	 * @return
	 * @Description: 2���ж�List��Ϊ��
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��25�� ����8:30:04
	 */
	public static boolean isNotEmpty(List<Object> args) {
		return !isEmpty(args);
	}
	
	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isEmpty
	 * @param args
	 * @return
	 * @Description: 3���ַ������п�
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��25�� ����8:34:18
	 */
	public static boolean isEmpty(String[] args){
		return args == null || args.length == 0;
	}
	
	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isNotEmpty
	 * @param args
	 * @return
	 * @Description: 4���ж��ַ����鲻Ϊ��
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��25�� ����8:35:28
	 */
	public static boolean isNotEmpty(String[] args) {
		return !isEmpty(args);
	}
	
	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isEmpty
	 * @param args
	 * @return
	 * @Description: 5�����������п�
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��25�� ����8:36:06
	 */
	public static boolean isEmpty(Object[] args){
		return args == null || args.length == 0;
	}
	
	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isNotEmpty
	 * @param args
	 * @return
	 * @Description: 6���жϳ������鲻Ϊ��
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016��11��25�� ����8:37:04
	 */
	public static boolean isNotEmpty(Object[] args){
		return !isEmpty(args);
	}
	
}
