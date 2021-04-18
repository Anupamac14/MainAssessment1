import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
	 
public class DescendingArrayListEx {

	    public static void main(String[] args)
	    {
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("RED", "BLUE", "BLACK"));
	 
	        Collections.reverse(colors);
	        System.out.println(colors);
	    }
	}




