package com.zking.temp;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�žų˷���
  for(int i=1;i<=9;i++){
	  for(int j=1;j<=i;j++){
		  System.out.print(j+"��"+i+"="+i*j+"\t");
	  }
	 System.out.println(i);
  }
  System.out.println();
	 //���ѭ�� ÿ�����һ��*
    for (int i = 1; i <= 5; i++) {
        System.out.print("*");
        //�ڲ�ѭ�� ÿ�����һ��*
        for (int j = 1; j <= 5; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    String str="aa123";
    String sb=str.substring(2);
    System.out.println(sb);
	}
}
