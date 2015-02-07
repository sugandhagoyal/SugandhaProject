import java.io.*;
//import java.lang.*;


public class sudoku {

	
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

	public static void conflicts(int a[][])
	{
		int i,j,k,l,m;
		int err=0;
		
		///////////// check row conflicts/////////
		
		for( i=0;i<9;i++)
		{
			for(j=0;j<9;j++)
			{
				for(k=j+1;k<9;k++)
				{
					if(a[i][j]==a[i][k])
					{
						err++;
					}
				}
			}
		}
		System.out.println("row errors:"+err);
		
		///////////// check column conflict ///////////////

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
		System.out.println("block error"+err);
	}
   
	/////////////////// CSP ///////////////////////////
	public static void csp(int a[][])
	{
		
	}
	public static void main(String args[])
	{
		String s;
		s=readfile("b:/avei/sudoku.txt");
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
			
			conflicts(a);
		  
		}

}
