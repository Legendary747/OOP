package weblab;

class Solution {
	
   /**Maps the input month to the corresponding season
    * @param month - a String that represents the month
    * @return the seasons that corresponds to the input month, 
    *         or "unknown" if the month does not exist.
    */
    public static String seasons(String month) {
        switch (month) {
            case "December":
            case "January":
            case "February":
                return "Winter";
            case "March":
            case "April":
            case "May":
                return "Spring";
            case "June":
            case "July":
            case "August":
                return "Summer";
            case "September":
            case "October":
            case "November":
                return "Autumn";
            default:
                return "Unknown";
        }
    }

}