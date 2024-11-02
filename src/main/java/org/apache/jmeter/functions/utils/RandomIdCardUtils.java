package org.apache.jmeter.functions.utils;

import java.text.SimpleDateFormat;
import java.util.*;

public class RandomIdCardUtils {
    private static final String[] province = {
            "11", "12", "13", "14", "15", "21", "22", "23",
            "31", "32", "33", "34", "35", "36", "37", "41",
            "42", "43", "44", "45", "46", "50", "51", "52",
            "53", "54", "61", "62", "63", "64", "65", "71",
            "81", "82"
    };

    private static final String[] city = {
            "01", "02", "03", "04", "05", "06", "07", "08",
            "09", "10", "21", "22", "23", "24", "25", "26",
            "27", "28"
    };

    private static final String[] county = {
            "01", "02", "03", "04", "05", "06", "07", "08",
            "09", "10", "21", "22", "23", "24", "25", "26",
            "27", "28", "29", "30", "31", "32", "33", "34",
            "35", "36", "37", "38"
    };

    public static String getRandomID() {
        StringBuffer identityNo = new StringBuffer();

        // Randomly generate province code (1-2)
        identityNo.append(province[new Random().nextInt(province.length - 1)]);

        // Randomly generate city code (3-4)
        identityNo.append(city[new Random().nextInt(city.length - 1)]);

        // Randomly generate county code (5-6)
        identityNo.append(county[new Random().nextInt(county.length - 1)]);

        // Randomly generate birth date (7-14)
        SimpleDateFormat dft = new SimpleDateFormat("yyyyMMdd");
        Date beginDate = new Date();
        Calendar date = Calendar.getInstance();
        date.setTime(beginDate);
        date.set(Calendar.DATE, date.get(Calendar.DATE) - new Random().nextInt(365 * 100));
        identityNo.append(dft.format(date.getTime()));

        // Randomly generate sequence number (15-17)
        identityNo.append(String.format("%03d", new Random().nextInt(999)));

        // Generate verification code (18)
        identityNo.append(getVerifyCode(identityNo));

        return identityNo.toString();
    }


    private static char getVerifyCode(StringBuffer cardId) {

        char[] ValCodeArr = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        int[] Wi = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        int tmp = 0;
        for (int i = 0; i < Wi.length; i++) {
            tmp += Integer.parseInt(String.valueOf(cardId.charAt(i))) * Wi[i];
        }
        return ValCodeArr[tmp % 11];
    }

    public static void main(String[] args) {
        String id = getRandomID();
        System.out.println("Simulated ID Card Number: " + id);
    }
}