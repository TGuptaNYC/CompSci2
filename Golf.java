public static String AverageParScore(int[] a, int parscore) 
    {
        int average = 0;
        int sum = 0;
        int lowestscore = a[0];
        int highestscore = a[0];
        int overunderpar = 0;
        for (int i = 0;  i<a.length; i++) {
            if (a[i] == 0) {
                break;
            }
            parscore -= a[i];
            sum += a[i];
            average = sum/i;
            if (lowestscore > a[i]) {
                lowestscore = a[i];
            }
            if  (highestscore < a[i]) {
                highestscore = a[i];
            }
        }
        
        String output = "Overunder = " + overunderpar + " Average par = " + average + " Lowest Par = " + lowestpar + " Highest Par = " + highestpar;
        return output;
    }
