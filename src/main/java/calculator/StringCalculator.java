package calculator;

import java.util.ArrayList;
import java.util.List;



class StringCalculator {

  
private String input;
public int add(String input) {
    if (input.isEmpty()) {
    	return 0;
    	
    }
    else {
    	return Integer.parseInt(input);
    }
}
public int calculate(String input) {
    List<String> negatives = new ArrayList<String>();

    if (input == null || input.isEmpty()) {
        return 0;
    }
	return 0;
}

char Delimiter = getDelimiter(input.split("\n")[0]);

String[] chuncks = (Delimiter == ',') ? 
		input.split(",|\n") : input.split("\n|" + Delimiter);
int total = 0;
int skipFirstLines = (Delimiter == ',') ? 0 : 2;
{


StringCalculator negatives;
for (String item : chuncks) {
    if (skipFirstLines > 0) {
        --skipFirstLines;
    } else {
        int num = Integer.parseInt(item);
        if (num < 0) {
            negatives.add(item);
        }
        total += num;
    }
}
if (!negatives.isEmpty()) {
    throw new IllegalArgumentException(
        "negatives not allowed " + String.join(",", negatives));
}
private char getDelimiter(String string) {
	// TODO Auto-generated method stub
	return 0;
}
return total;
}

private boolean isEmpty() {
	
	return false;
}
}