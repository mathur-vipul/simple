
/**
 * this class respresents numbers in general
 *
 * @author (Rushil and Vipul)
 * @13 Oct 2019
 */
public class Number
{
    // instance variables - replace the example below with your own
    private int decimal_position;
    private boolean sign;
    private int digits[];
    private int MAX_DIGITS;
    private int digitCount;

    /**
     * Constructor for objects of class Number
     */
    public Number(long a)
    {
        // initialise instance variables
        setMAX_DIGITS;
        digits=new int[MAX_DIGITS];
        decimal_position=0;
        
        int i=0;
        if (a>=0)
            {
                sign=true;
            } else {
                sign=false;
                a=a*(-1);
            }
        
        while (a>0)
        {
        digits[i++]=a mod 10;
        a=a/10;
        }
    }
    public Number(double a)
	
{


        // initialise instance variables
        setMAX_DIGITS;
        digits=new int[MAX_DIGITS];

	  	String sNumber;

	  	int nExponent;

		int i=0;

	digitCount=0;	  
if (a>=0)
            
	{

                sign=true;
            
	} else 
	    
	{

                sign=false;
                
		a=a*(-1);
            
	}


        String dblString = Double.toString(a);
        
	char[] ch = dblString.toCharArray();
    
	int exponentPosition=0;
	
	StringBuilder sb = new StringBuilder("");
	
	for(i=0;i<ch.length;i++)
	
	
{
if (ch[i]=='E')
		
{
	
	exponentPosition = i;
		
	i++;
		
while (i<ch.length)
		
{
		    
sb.append(ch[i]);
i++;

}

}
}


if (exponentPosition > 0) 
{
String sExponent = sb.toString();

nExponent = Integer.valueOf(sExponent);
i=0;
sb = new StringBuilder();
	
while (i<exponentPosition)
		
{

sb.append(ch[i]);
i++;

}
	
sNumber = sb.toString();
	} 
else
	
{

	    nExponent=0;
	    
	sNumber = dblString;
	
}

    
	Double dNumber = Double.valueOf(sNumber);
	

int decimalPosition=-1;
	   
for (i=0;i<sNumber.length();i++)
	   
{
	       
if (sNumber.charAt(i) == '.')
	       
{
	           
decimalPosition =i;
	           
i=sNumber.length()-1;
	       
} 
	   
}

	
	
int numberOfDecimalPlaces;
	
int numberofWholeNumberPlaces;
	
if (decimalPosition>=0)
	
{
    	
numberOfDecimalPlaces = sNumber.length()-1-decimalPosition;
    	
numberofWholeNumberPlaces=decimalPosition; //-1 to remove decimal, +1 because position starts from 0
	
} else
	
{
	    
numberOfDecimalPlaces = 0;
	    
numberofWholeNumberPlaces=sNumber.length();
	
}

        // add zeros on the end	if required
	    
i=0;
	    
char c = '0';
	    
while (i<(nExponent-numberOfDecimalPlaces))
	    
{
	           
addDigit(c);
	           
i++;
	    
}
    	 
// add all digits
	    
for (i=sNumber.length()-1;i>=0;i--)
	    
{

	        if (sNumber.charAt(i) != '.')
	        
{
	        
	addDigit(sNumber.charAt(i));
}
	    
}
	    
// add zeros in the beginning if required
        
i=0;
	    
while (i<=((numberofWholeNumberPlaces+nExponent)*-1))
	    
{

	           addDigit(c);

i++;
}


if (nExponent>numberOfDecimalPlaces)
        
{

         //if the exponent number is higher than current decimal places, we will not have a decimal point
  
	setdecimal_position(0);
            
	//System.out.println(0);
        
} 
else if ((nExponent+numberofWholeNumberPlaces)<0)
        
{

        //if the exponent is negative and less than the number of wholenumber places then 
            			setdecimal_position(sNumber.length()-1-(nExponent+numberofWholeNumberPlaces));

} 
else 
        
{
            
// in case zeros have been added neither in the beginning nor in the end
            
setdecimal_position(numberOfDecimalPlaces-nExponent);
            
}
	
	    
}

	

private void addDigit(char c)

{

    digits[digitCount++]=Integer.parseInt(String.valueOf(c));
}

	

private void setdecimal_position(int i)

{
    
decimal_position = i;

}




    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
  
    /**  
     * This simply sets the value of MAX_DIGITS
     *
     * no parameter
     * no value returned
     */
    private void setMAX_DIGITS
    {
     MAX_DIGITS = 100;
    }
}
