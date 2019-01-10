
public class GG1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 根据(beijing)高考加分政策，计算考生的最终得分(最高20分)
		/*		int  score =  588; // 考生的基础分		
				boolean lieshizinv = false; // 是否烈士子女 +20
				boolean taiwan = true;// 是否台湾 + 10
				boolean jianmeicao = true; // 是否健美操二级 +5
				boolean minority = true; // 是否少数民族 + 5
				int add = 0; // 总的加分		
				if( lieshizinv )
				{
					add += 20;
				}		
				if ( taiwan )
				{
					add += 10;
				}		
				if ( jianmeicao )
				{
					add += 5;
				}
				if( minority)
				{
					add += 5;
				}		
				// 上限控制
				if( add > 20)
				{
					add = 20;
				}		
				System.out.println("加分值: " + add );		
				score += add;
				System.out.println("最终得分: " + score);
*/
//			int a = 124;
//			if (a % 2 == 0)
//			{
//				System.out.print("偶");
//			}
//			else
//			{
//				System.out.print("奇");
//			}


/*			int a=123;
			if(a >= 70 && a <= 80)
			{
				System.out.print(a+"ture");
			}
			else
			{
				System.out.print(a+"false");
			}
*/
		
//		int a = 16;
//		if(a >= 10 && a <= 20)
//		{
//			System.out.print("正确");
//		}
//		else if(a>=50 && a<=60)
//		{
//			System.out.print("正确");
//		}
//		else
//		{
//			System.out.print("错误");
//		}
		
/*		int a = -99;
		if( a<0 )
		{
			a=0-a;//相反数
		}
		System.out.print(+a);
*/
		
//		int a=10,b=10,c=11;
//		if(a==b && b==c)
//		{
//			System.out.print("yes");
//		}
//		else
//		{
//			System.out.print("no");
//		}
		
/*		int a;
		for(a=20;a>0;a--)
		{
			if(a%3==0)
			{
				System.out.println(a+" ");
			}				
		}
*/		
		
//		int t;
//		for(t=1;t<=20;t++)
//		{
//			if(t%4==0)
//			{
//				System.out.print(+t);
//			}
//		}
		
//		int a=10,b=20;
//		int result = a * b;
//		int result =13/5;
//		double result =13.0/5.0;
//		{
//			System.out.print(result);
//		}
		
//		int [ ] a =new int[4];
//		int [ ] b =	 a;	
//		b[1]=66;
//	
		
/*				String id = "20171001";
				String name = "王草";
				boolean sex = true;
				String cellphone = "18610022345";
				
				String id_2 = "20171002";
				String name_2 = "李花";
				boolean sex_2 = false;
				String cellphone_2 = "13820490902";
*/

//		LL0 s1 = new LL0();
//		s1.id = "20171001";
//		s1.name = "王草";
//		s1.sex = true;
//		s1.cellphone ="18377193572";
//		
//		
		
//		int []abc = {29,90,48,92};
//		for (int i=0;i<abc.length;i++)
//		{
//			int n = abc[i];
//			System.out.print(n+" ");
//		}
//		
/*		int[]abc = {20,90,48,92};
		for(int i = 0;i<abc.length;i++ )
		{
			int n=abc[i];
			if (n % 6 == 0)
			{
				System.out.print("第"+(i+1)+"个数："+ n);
			}	
				
		}
*/		
		
//		int []abc= {20,90,48,92};
//		
//		int t  = abc[0];
//		
//		abc[0] =  abc[3];
//		
//		abc[3] =  t;
//		
//		for (int i= 0; i<abc.length; i++)
//		{
//			System.out.print(abc[i]+"  ");
//		}
		
/*		double[]arr = {90.0,-98.34,-10,199};
		
		for (int i = 0; i< arr.length; i++)
		{
			double n = arr[i];
			if(n < 0)
			{
				arr[i] = 0-n;
			}
		}
		System.out.print("AA：");
		for(int i = 0; i<arr.length; i++)
		System.out.print(arr[i]+"  ");
*/		
		
//		double[]src = {4, 5.5, 6, 7.7};
//		double[]dst = new double[4];
//		//长度不一样时，需判断length，防止越界
//		for(int a =0; a<src.length && i<dst.length;i++)
//		{
//			src[a] = dst[a];
//		}
		
		//name			scores
		//AA				97
		//BB				89
		//CC				94
		//DD				93
		
//		String[]name = {"AA","BB","CC","DD"};
//		int[] scores = {97, 89, 94, 93};
//		
//		for(int a=0; a<name.length; a++)
//		{
//			System.out.println(name[a]+" "+scores[a]);
//		}
//	
//		
//		//倒序存储
//		double[]src = {4, 5.5, 6, 7.7};
//		// [0]与[3]对调，[1]与[2]对调
//		//共交换src.length/2 轮
//		for(int i=0;  i< src.length/2;  i++)
//		{
//		double t = src[i];
//		src[i] = src[src.length-1-i];
//		src[src.length-1-i] = t;
//		
//		//int a = src.length;(可以使用a来替代src.length，使语句简短)
//		}
//		System.out.print("OK");
//		
//		//1000以内的质数，存到数组
//		int[] result = new int[50];//最多50
//		int count = 0;
//		
//		for(int i = 2; i<1000; i++)
//		{
//			boolean isPrime = true;
//			for(int a = 2; a<i; a++)
//			{
//				if(i % a  == 0)
//				{
//					isPrime = false;
//					break;
//				}
//			}
//			if( isPrime ) 
//			{
//				result[count] = i;
//				count ++;
//				if (count >= result.length)
//				{
//					break;
//				}
//			}
//				
//		}
//		for(int i = 0; i<count; i++)
//		{
//			System.out.println(result[i]+" ");
//		}
//	
//		
//		package LL0;
//		public class Hello
//		{
//			public static void mian(String[] args)
//			{
//				Student stu = new Student();
//				stu.id = 20182018;
//				stu.name = "龖龘"；
//				stu.cellphone = "1234567890";
//				
//				system,out.println (stu);
//			}
//		}
//	//对象不能直接答应
//		
//
//							package my;
//							public class Example
//							{
//								public void welcome()
//								{
//									System.out.println("**********************");
//									System.out.println("****     龍龖龘   ****");
//									System.out.println("**********************");
//								}
//							}
//								
//		package my;
//		public class word
//		{
//			public static void main(String[]arge)
//			{
//				Example ex = new Example();
//				ex.welcome();
//			}
//		
//		}

		package my;
		public class Example
		{
			public static void main(String[]args)
			{
				Example ex = new Example();
				ex.showSquare( 193.819 );
			}
		}
		
		
	}
}
