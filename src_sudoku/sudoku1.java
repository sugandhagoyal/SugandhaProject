import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class sudoku1 {
	public static int arr[]=new int[9];
	public static int l=0;
	public static String readfile(String a) {
		
		StringBuilder contents = new StringBuilder();
	    
	    try {
	      
	      BufferedReader input =  new BufferedReader(new FileReader(a));
	      try {
	        String line = null; 
	        while (( line = input.readLine()) != null)
	        {
	          contents.append(line);
	          contents.append(System.getProperty("line.separator"));
	        }
	        
	      }
	      finally {
	        input.close();
	      }
	    }
	    catch (IOException ex){
	     System.out.println(ex);
	    }
	    
	    return contents.toString();
	  }
 
	 public static int[] compareeach(int a[][],int i,int j,int val)
	 {
		 int m, n,m1,m2=0,m3=1,m4=-1;
		  System.out.println("hey");
		 System.out.println("val"+val);
		 //check row (if it finds sme matching values m3++
		for(m=0;m<j;m++)
		{
			if(a[i][m]!=0 && a[i][m]==val)
				{
				  m3++;
				}
			if(a[i][m]!=0 && a[i][m]!=val)
			{
			  m4--;
			}
		}
			
		for(m=j+1;m<9;m++)
		{
			if(a[i][m]!=0 && a[i][m]==val)
			{
				
				  m3++;
				}
			if(a[i][m]!=0 && a[i][m]!=val)
			{
			  m4--;
			}
		}
			
		/////////////check colm
	//	m2=0;m3=1;m4=-1;
		for(m=0;m<i;m++)
		{
			if(a[m][j]!=0 && a[m][j]==val)
			{
			   m3++;
				
			}
				if(a[m][j]!=0 && a[m][j]!=val)
				{
				  m4--;
				}
		}
				
			for(m=i+1;m<9;m++)
			{
				if(a[m][j]!=0 && a[m][j]==val)
				{
					 m3++;
				}
				if(a[m][j]!=0 && a[m][j]!=val)
				{
				  m4--;
				}
			}
				
		// check block
	   // m2=0;m3=1;m4=-1;
		if(i>=0 && i<=2 && j>=0&& j<=2)
		{
			for(m=0;m<3;m++)
		      {
				for(n=0;n<3;n++)
		     	{
					if(m==i && n==j)
				    {}
				    else
				    {	
					    if(a[m][n]!=0 && a[m][n]==val)
					   {
						m3++;
					   }
					    if(a[m][n]!=0 && a[m][n]!=val)
					    {
						  m4--;
					    }
				    }
				 }
		        }
		 }
			else 
		
		if(i>=0 && i<=2 && j>=3 && j<=5)
		{
			for(m=0;m<3;m++)
		      {
				for(n=3;n<=5;n++)
		     	{
					if(m==i && n==j)
				    {}
				    else
				    {	
					    if(a[m][n]!=0 && a[m][n]==val)
					   {
						m3++;
					   }
					    if(a[m][n]!=0 && a[m][n]!=val)
					    {
						  m4--;
					    }
				    }
				 }
		        }
		 }
			else 
		if(i>=0 && i<=2 && j>=6 && j<=8)
		{
			for(m=0;m<3;m++)
		      {
				for(n=6;n<=8;n++)
		     	{
					if(m==i && n==j)
				    {}
				    else
				    {	
					    if(a[m][n]!=0 && a[m][n]==val)
					   {
						m3++;
					   }
					    if(a[m][n]!=0 && a[m][n]!=val)
					    {
						  m4--;
					    }
				    }
				 }
		        }
		 }
			else 
		if(i>=3 && i<=5 && j>=0 && j<=2)
		{
			for(m=3;m<=5;m++)
		      {
				for(n=0;n<3;n++)
		     	{
					if(m==i && n==j)
				    {}
				    else
				    {	
					    if(a[m][n]!=0 && a[m][n]==val)
					   {
						m3++;
					   }
					    if(a[m][n]!=0 && a[m][n]!=val)
					    {
						  m4--;
					    }
				    }
				 }
		        }
		 }
			else 
		if(i>=3 && i<=5 && j>=3 && j<=5)
		{
			for(m=3;m<=5;m++)
		      {
				for(n=3;n<=5;n++)
		     	{
					if(m==i && n==j)
				    {}
				    else
				    {	
					    if(a[m][n]!=0 && a[m][n]==val)
					   {
						m3++;
					   }
					    if(a[m][n]!=0 && a[m][n]!=val)
					    {
						  m4--;
					    }
				    }
				 }
		        }
		 }
			else 
		if(i>=3 && i<=5 && j>=6 && j<=8)
		{
			for(m=3;m<=5;m++)
		      {
				for(n=6;n<=8;n++)
		     	{
					if(m==i && n==j)
				    {}
				    else
				    {	
					    if(a[m][n]!=0 && a[m][n]==val)
					   {
						m3++;
					   }
					    if(a[m][n]!=0 && a[m][n]!=val)
					    {
						  m4--;
					    }
				    }
				 }
		        }
		 }
			else 
		if(i>=6 && i<=8 && j>=0 && j<=2)
		{
			for(m=6;m<=8;m++)
		      {
				for(n=0;n<3;n++)
		     	{
					if(m==i && n==j)
				    {}
				    else
				    {	
					    if(a[m][n]!=0 && a[m][n]==val)
					   {
						m3++;
					   }
					    if(a[m][n]!=0 && a[m][n]!=val)
					    {
						  m4--;
					    }
				    }
				 }
		        }
		 }
			else 
		if(i>=6&& i<=8 && j>=3 && j<=5)
		{
			for(m=6;m<=8;m++)
		      {
				for(n=3;n<=5;n++)
		     	{
					if(m==i && n==j)
				    {}
				    else
				    {	
					    if(a[m][n]!=0 && a[m][n]==val)
					   {
						m3++;
					   }
					    if(a[m][n]!=0 && a[m][n]!=val)
					    {
						  m4--;
					    }
				    }
				 }
		        }
		 }
			else 
		if(i>=6 && i<=8 && j>=6 && j<=8)
		{
			for(m=6;m<=8;m++)
		      {
				for(n=6;n<=8;n++)
		     	{
					if(m==i && n==j)
				    {}
				    else
				    {	
					    if(a[m][n]!=0 && a[m][n]==val)
					   {
						m3++;
					   }
					    if(a[m][n]!=0 && a[m][n]!=val)
					    {
						  m4--;
					    }
				      }
				  }
		        }
		 }
		
		System.out.println("m3"+m3+"m4"+m4);
		if(m3==1 && m4<-1)
		{
			 // if the val doesnt exist in arr b4 hand than add it to arr
		     arr[l]=val;
		    l++;
	   
	    }
		for(m1=0;m1<9;m1++)
		   {
			System.out.println("arr["+m1+"]"+arr[m1]);
		   }
		return(arr);
	 	
		
	 }
	public static void rmv(int a[][])
	{
		int i,j,k,l,m,count=0;
		int err=0;
		int arr1[][][]=new int[9][9][9];
		int arr2[]=new int[9];
		for(i=0;i<9;i++)
			arr2[i]=0;
		///////////// check row conflicts/////////
		
	
		/*j=0;
				for(k=0;k<9;k++)
				{  l=0;
				count=0;
				 for(m=0;m<9;m++)
					 arr[m]=0;
					System.out.println("block:"+j+k);
					if(a[j][k]==0)
					{ 
					   for(m=1;m<=9;m++)
					   {
						   System.out.println("hi");
					    	arr1[k]=compareeach(a,j,k,m);
					   }
					   for(m=0;m<9;m++)
					   {
						   if(arr1[k][m]!=0)
						   { 
							   System.out.println("block00 can take:"+arr1[k][m]);
							   count++;
							   }
					   }
					   System.out.println("couny"+count);
					}
					else
						arr1[k]=arr2;
				}*/
		//	}
		/*System.out.println("row errors:"+err);
		 */
		for(j=0;j<9;j++)
		{
				for(k=0;k<9;k++)
				{  l=0;
				   count=0;
				   for(m=0;m<9;m++)
					arr[m]=0;
					System.out.println("block:"+j+k);
					if(a[j][k]==0)
					{ 
					   for(m=1;m<=9;m++)
					   {
						   System.out.println("hi");
					    	arr1[j][k]=compareeach(a,j,k,m);
					   }
					   for(m=0;m<9;m++)
					   {
						   if(arr1[j][k][m]!=0)
						   { 
							   System.out.println("block"+j+k+" can take:"+arr1[j][k][m]);
							   count++;
						    }
					   }
					   System.out.println("count"+count);
					}
					else
						arr1[j][k]=arr2;
				}
		}
		
		/*///////////// check column conflict ///////////////

		err=0;
		for( i=0;i<9;i++)
		{
			for(j=0;j<9;j++)
			{
				for(k=j+1;k<9;k++)
				{
					if(a[j][i]==a[k][i])
					{
						err++;
					}
				}
			}
		}
		System.out.println("column errors:"+err);
       
		///////////// check block conflict ///////////////
		
		err=0;
		for(m=0;m<9;m++)
		
		   for(l=0;l<3;l++)
		
		       for( i=0;i<3;i++)
		         
			        for(j=0;j<3;j++)
			        
				       for(k=i+1;k<3;k++)
				       
					       switch(m)
					       {
					             case 0: if(a[l][i]==a[j][k])
					            	     err++;
					                     break;
					                     
					             case 1: if(a[l][i+3]==a[j][k+3])
				            	     err++;
				                     break;
				                   
					             case 2: if(a[l][i+6]==a[j][k+6])
				            	     err++;
				                     break;
				                     
					             case 3: if(a[l+3][i]==a[j+3][k])
				            	     err++;
				                     break;
				                     
					             case 4: if(a[l+3][i+3]==a[j+3][k+3])
				            	     err++;
				                     break;
				                     
					             case 5: if(a[l+3][i+6]==a[j+3][k+6])
				            	     err++;
				                     break;
				                     
					             case 6: if(a[l+6][i]==a[j+6][k])
				            	     err++;
				                     break;
				                     
					             case 7: if(a[l+6][i+3]==a[j+6][k+3])
				            	     err++;
				                     break;  
				                     
					             case 8: if(a[l+6][i+6]==a[j+6][k+6])
				            	     err++;
				                     break;
					       }
		System.out.println("block error"+err);*/
	}
   
	/////////////////// CSP ///////////////////////////
	
	public static void main(String args[])
	{
		String s;
		s=readfile("c:/avei/sudoku1.txt");
		System.out.println(s);
		int a[][]=new int[9][9];
		int b[] = new int[81];
		char c;
		int i=0,j=0,k;
	    while(i<s.length())
		{
			c=s.charAt(i);
			if(c=='&')
		      {
		    	  b[j]=0;
		    	  j++;
		    	  
			  }
		     
		    if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
		      {
		    	  
		          b[j]=Character.digit(c, 10);
		          j++;
		    	  
		      }
		      if(c==',')
		      {
		    	  
		      }
		      i++;
		 }
	        i=0;
			for(j=0;j<9;j++)
			{
				for(k=0;k<9;k++)
				{
					a[j][k]=b[i];
					i++;
				}
			}
			
			for(j=0;j<9;j++)
			{
				for(k=0;k<9;k++)
				{
					System.out.print(a[j][k]);
				}
				System.out.print('\n');
			}
			
			rmv(a);
		  
		}

	
}
