package calculator;

import java.util.ArrayList;
import java.util.List;



class StringCalculator {

  
public int add(String input) {
    if (input.isEmpty()) {
    	return 0;
    	
    }
    else {
    	return Integer.parseInt(input);
    }
}
public int calculate(String text) {
    List<String> negatives = new ArrayList<String>();

    if (text == null || text.isEmpty()) {
        return 0;
    }
	return 0;
}

}