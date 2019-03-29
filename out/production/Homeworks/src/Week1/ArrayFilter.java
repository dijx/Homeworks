package Week1;

public class ArrayFilter {

    public static void main(String[] args) {
        String[] testArray = new String[]{"1", "2", "aasf", "1", "123", "123"};
        String [] testedArray = filterArray(testArray);
        for (int i = 0; i <testedArray.length ; i++) {
            System.out.println(testedArray[i]);
        }
    }
    public static String[] filterArray(String[] str) {
        String[] parsedArray = new String[str.length]; //should be ArrayList
        int parsedArrayCounter = 0;
        for (int i = 0; i < str.length; i++) {
            try {
                int temp = Integer.parseInt(str[i]);
                    if (temp >= 0) {
                        boolean isDupe = false;
                        for (int j = 0; j <=parsedArrayCounter ; j++) {
                            if (str[i].equals(parsedArray[j])) {
                                isDupe=true;
                                break;
                            }
                        }
                        if (!isDupe){
                            parsedArray[parsedArrayCounter] = str[i];
                            parsedArrayCounter++;
                        }
                    }
            } catch (Exception e) {
            }
        }
        String [] finalArray = new String[parsedArrayCounter]; //truncating Array do cutoff nulls than copying
        for (int i = 0; i < parsedArrayCounter ; i++) {
            finalArray[i]=parsedArray[i];
        }
        return finalArray;
    }
}
