package com.zfp;


import java.util.LinkedList;
import java.util.List;

public class Digui {
	int num =0;
    /**
     * @author zfp
     * @version 1.0
     * @serialData 2016��3��2��
     * ������������ʾһ�������ȫ���
     * ���˼·������������ֻ��һ������ ���ǿ��Ժ����׵���ʾ����������ȫ�����
     */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	void ListAll(List<String> array,String prefix){
		//�ж������Ƿ�Ϊ��
		if(array.isEmpty()) {
			System.out.println(prefix);
		
		}
		//����������Ϊ�յ���� 
		for(int i =0;i<array.size();i++)
		{
			List temp = new LinkedList(array);
			String strTemp = prefix+temp.remove(i);
			if(!temp.isEmpty()){
				System.out.println(strTemp);
			}
			ListAll(temp,strTemp);
		}
		
	}
	
	//����һ��5λ������abcde*4 =edcba;
	void CalNum()
	{
		for(int i =10000;i<99999;i++)
		{
			int temp = i*4;
			if(temp/10000==i%10&&i/10000==temp%10&&
					(temp/1000)%10==(i%100)/10&&(i/1000)%10==(temp%100)/10&&
					  (temp/100)%10==(i/100)%10&&(i/100)%10==(temp/100)%10)
				System.out.println(i);
			
		
	     }
	}
}
