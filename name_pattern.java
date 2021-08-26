import java.util.*;
public class name_pattern {
	public static void main (String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.println("ENTER STRING TO BE PRINTED");
		String s=in.nextLine();
		s=s.toLowerCase();
		 int i,j;
		int sl=s.length();
		
		for(i=1;i<=5;i++)
		{
			
			for(j=0;j<sl;j++)
			{
			char c=s.charAt(j);
			switch(c)
			{
			 case 'a':
			     switch(i)
			     {
			     case 1:
			     	 System.out.print("AAAAA\t");
			    	 break;

			     case 2:
			    	 System.out.print("A   A\t");
			    	 break;
			    
			     case 3:
			    	 System.out.print("AAAAA\t");
			    	 break;
			     case 4:
			    	 System.out.print("A   A\t");
			    	 break;
			    	
			     case 5:
				     System.out.print("A   A\t");
				     break;
			     }
				 break;
				 
			 case 'b':
				    switch(i)
				    {
				    case 1:
				    	System.out.print("BBBB\t");
				    	break;

				    case 2:
				    	System.out.print("B   B\t");
				    	break;
				    
				    case 3:
				    	System.out.print("BBBB\t");
				    	break;
				    case 4:
				    	System.out.print("B   B\t");
				    	break;
				    	
				    case 5:
					    System.out.print("BBBB\t");
					    break;
				    }
					break;
					
			 case 'c':
				    switch(i)
				    {
				    case 1:
				    	System.out.print("CCCCC\t");
				    	break;

				    case 2:
				    	System.out.print("C    \t");
				    	break;
				    
				    case 3:
				    	System.out.print("C    \t");
				    	break;
				    case 4:
				    	System.out.print("C    \t");
				    	break;
				    	
				    case 5:
					    System.out.print("CCCCC\t");
					    break;
				    }
					break;
					
			 case 'd':
				    switch(i)
				    {
				    case 1:
				    	System.out.print("DDDD \t");
				    	break;

				    case 2:
				    	System.out.print("D    D\t");
				    	break;
				    
				    case 3:
				    	System.out.print("D    D\t");
				    	break;
				    case 4:
				    	System.out.print("D    D\t");
				    	break;
				    	
				    case 5:
					    System.out.print("DDDD \t");
					    break;
				    }
					break;
					
			 case 'e':
				    switch(i)
				    {
				    case 1:
				    	System.out.print("EEEEE\t");
				    	break;

				    case 2:
				    	System.out.print("E    \t");
				    	break;
				    
				    case 3:
				    	System.out.print("EEEEE\t");
				    	break;
				    case 4:
				    	System.out.print("E    \t");
				    	break;
				    	
				    case 5:
					    System.out.print("EEEEE\t");
					    break;
				    }
				    break;
				    
				    case 'f':
					    switch(i)
					    {
					    case 1:
					    	System.out.print("FFFFF\t");
					    	break;

					    case 2:
					    	System.out.print("F\t");
					    	break;
					    
					    case 3:
					    	System.out.print("FFF\t");
					    	break;
					    case 4:
					    	System.out.print("F\t");
					    	break;
					    	
					    case 5:
						    System.out.print("F\t");
						    break;
				    }
					break;
					
				    case 'g':
					    switch(i)
					    {
					    case 1:
					    	System.out.print("GGGGG\t");
					    	break;

					    case 2:
					    	System.out.print("G    \t");
					    	break;
					    
					    case 3:
					    	System.out.print("G  GG\t");
					    	break;
					    case 4:
					    	System.out.print("G   G\t");
					    	break;
					    	
					    case 5:
						    System.out.print("GGGGG\t");
						    break;
					    }
					    break;
					    
					    case 'h':
						    switch(i)
						    {
						    case 1:
						    	System.out.print("H   H\t");
						    	break;

						    case 2:
						    	System.out.print("H   H\t");
						    	break;
						    
						    case 3:
						    	System.out.print("HHHHH\t");
						    	break;
						    case 4:
						    	System.out.print("H   H\t");
						    	break;
						    	
						    case 5:
							    System.out.print("H   H\t");
							    break;
						    }
							break;
							    
						    case 'i':
		                        switch(i)
		                        {
		                        case 1:
		                            System.out.print("IIIII\t");
		                            break;

		                        case 2:
		                            System.out.print("  I  \t");
		                            break;

		                        case 3:
		                            System.out.print("  I  \t");
		                            break;
		                        case 4:
		                            System.out.print("  I  \t");
		                            break;

		                        case 5:
		                            System.out.print("IIIII\t");
		                            break;
		                        }
			                    break;
		                            
		                        case 'j':
		                            switch(i)
		                            {
		                            case 1:
		                                System.out.print("JJJJJ\t");
		                                break;

		                            case 2:
		                                System.out.print("  J  \t");
		                                break;

		                            case 3:
		                                System.out.print("  J  \t");
		                                break;
		                            case 4:
		                                System.out.print("  J  \t");
		                                break;

		                            case 5:
		                                System.out.print("JJJ  \t");
		                                break;
		                            }
			                        break;
			                        
		                            case 'k':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("K   K\t");
		                                    break;

		                                case 2:
		                                    System.out.print("K K  \t");
		                                    break;

		                                case 3:
		                                    System.out.print("KK\t");
		                                    break;
		                                case 4:
		                                    System.out.print("K K  \t");
		                                    break;

		                                case 5:
		                                    System.out.print("K   K\t");
		                                    break;
		                            }
		                            break;
		                        
		                            case 'l':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("L    \t");
		                                    break;

		                                case 2:
		                                    System.out.print("L    \t");
		                                    break;

		                                case 3:
		                                    System.out.print("L    \t");
		                                    break;
		                                case 4:
		                                    System.out.print("L    \t");
		                                    break;

		                                case 5:
		                                    System.out.print("LLLLL\t");
		                                    break;
		                            }
		                            break;
		                    
		                            case 'm':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("M   M\t");
		                                    break;

		                                case 2:
		                                    System.out.print("MM MM\t");
		                                    break;

		                                case 3:
		                                    System.out.print("M M M\t");
		                                    break;
		                                case 4:
		                                    System.out.print("M   M\t");
		                                    break;

		                                case 5:
		                                    System.out.print("M   M\t");
		                                    break;
		                            }
		                            break;
		                            
		                            case 'n':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("NN  N\t");
		                                    break;
		                                case 2:
		                                    System.out.print("NN  N\t");
		                                    break;
		                                case 3:
		                                    System.out.print("N N N\t");
		                                    break;
		                                case 4:
		                                    System.out.print("N  NN\t");
		                                    break;
		                                case 5:
		                                    System.out.print("N  NN\t");
		                                    break;
		                            }
		                            break;
		                            
		                            case 'o':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("OOOOO\t");
		                                    break;
		                                case 2:
		                                    System.out.print("O   O\t");
		                                    break;
		                                case 3:
		                                    System.out.print("O   O\t");
		                                    break;
		                                case 4:
		                                    System.out.print("O   O\t");
		                                    break;
		                                case 5:
		                                    System.out.print("OOOOO\t");
		                                    break;
		                            }
		                            break;
		                            
		                            case 'p':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("PPPPP\t");
		                                    break;
		                                case 2:
		                                    System.out.print("P   P\t");
		                                    break;
		                                case 3:
		                                    System.out.print("PPPPP\t");
		                                    break;
		                                case 4:
		                                    System.out.print("P    \t");
		                                    break;
		                                case 5:
		                                    System.out.print("P     \t");
		                                    break;
		                            }
		                            break;
		                            
		                            case 'q':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("QQQQ \t");
		                                    break;
		                                case 2:
		                                    System.out.print("Q  Q \t");
		                                    break;
		                                case 3:
		                                    System.out.print("Q QQ \t");
		                                    break;
		                                case 4:
		                                    System.out.print("QQQQ \t");
		                                    break;
		                                case 5:
		                                    System.out.print("    Q\t");
		                                    break;
		                            }
		                            break;
		                            
		                            case 'r':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("RRRR \t");
		                                    break;
		                                case 2:
		                                    System.out.print("R   R\t");
		                                    break;
		                                case 3:
		                                    System.out.print("RRRR \t");
		                                    break;
		                                case 4:
		                                    System.out.print("R  R \t");
		                                    break;
		                                case 5:
		                                    System.out.print("R   R\t");
		                                    break;
		                            }
		                            break;
		                            
		                            case 's':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print(" SSSS\t");
		                                    break;
		                                case 2:
		                                    System.out.print("S    \t");
		                                    break;
		                                case 3:
		                                    System.out.print(" SSS \t");
		                                    break;
		                                case 4:
		                                    System.out.print("    S\t");
		                                    break;
		                                case 5:
		                                    System.out.print("SSSS \t");
		                                    break;
		                            }
		                            break;
		                            
		                            case 't':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("TTTTT\t");
		                                    break;
		                                case 2:
		                                    System.out.print("  T  \t");
		                                    break;
		                                case 3:
		                                    System.out.print("  T  \t");
		                                    break;
		                                case 4:
		                                    System.out.print("  T  \t");
		                                    break;
		                                case 5:
		                                    System.out.print("  T  \t");
		                                    break;
		                            }
		                            break;
		                            case 'u':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("U   U\t");
		                                    break;
		                                case 2:
		                                    System.out.print("U   U\t");
		                                    break;
		                                case 3:
		                                    System.out.print("U   U\t");
		                                    break;
		                                case 4:
		                                    System.out.print("U   U\t");
		                                    break;
		                                case 5:
		                                    System.out.print("UUUUU\t");
		                                    break;
		                            }
		                            break;
		                            
		                            
		                            
		                            case 'v':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("V   V\t");
		                                    break;
		                                case 2:
		                                    System.out.print("V   V\t");
		                                    break;
		                                case 3:
		                                    System.out.print("V   V\t");
		                                    break;
		                                case 4:
		                                    System.out.print(" V V \t");
		                                    break;
		                                case 5:
		                                    System.out.print("  V  \t");
		                                    break;
		                            }
		                            break;
		                            
		                            case 'w':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("W   W\t");
		                                    break;
		                                case 2:
		                                    System.out.print("W   W\t");
		                                    break;
		                                case 3:
		                                    System.out.print("W W W\t");
		                                    break;
		                                case 4:
		                                    System.out.print("WW WW\t");
		                                    break;
		                                case 5:
		                                    System.out.print("W   W\t");
		                                    break;
		                            }
		                            break;
		                            
		                            case 'x':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("X   X\t");
		                                    break;
		                                case 2:
		                                    System.out.print(" X X \t");
		                                    break;
		                                case 3:
		                                    System.out.print("  X  \t");
		                                    break;
		                                case 4:
		                                    System.out.print(" X X \t");
		                                    break;
		                                case 5:
		                                    System.out.print("X   X\t");
		                                    break;
		                            }
		                            break;
		                            
		                            case 'y':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("Y   Y\t");
		                                    break;
		                                case 2:
		                                    System.out.print(" Y Y \t");
		                                    break;
		                                case 3:
		                                    System.out.print("  Y  \t");
		                                    break;
		                                case 4:
		                                    System.out.print("  Y  \t");
		                                    break;
		                                case 5:
		                                    System.out.print("  Y  \t");
		                                    break;
		                            }
		                            break;
		                            
		                            case 'z':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("ZZZZZ\t");
		                                    break;

		                                case 2:
		                                    System.out.print("   ZZ\t");
		                                    break;
		                                case 3:
		                                    System.out.print("  ZZ \t");
		                                    break;
		                                case 4:
		                                    System.out.print("ZZ   \t");
		                                    break;
		                                case 5:
		                                    System.out.print("ZZZZZ\t");
		                                    break;
		                            }
		                            break;
		                            

		                            case ' ':
		                                switch(i)
		                                {
		                                case 1:
		                                    System.out.print("     \t");
		                                    break;

		                                case 2:
		                                    System.out.print("     \t");
		                                    break;
		                                case 3:
		                                    System.out.print("     \t");
		                                    break;
		                                case 4:
		                                    System.out.print("     \t");
		                                    break;
		                                case 5:
		                                    System.out.print("     \t");
		                                    break;
		                            }
		                            break;

			 }//end of character switch case
			
			
			}System.out.println();
		}
		}

}

