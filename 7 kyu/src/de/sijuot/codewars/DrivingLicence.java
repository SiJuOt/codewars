package de.sijuot.codewars;

public class DrivingLicence {

    /**
     * Making the UK License IDs
     * <p>
     * Structure of the UK Drivers License:
     * 1-5: First Five characters of the surname (padded with 9s if less than 5)
     * 6: The Decade Digit from the year of birth (e.g. 1987 it would be 8)
     * 7-8: Month of Birth (7th Character incremented by 5 if driver is female i.e. 51-62 instead of 01-12)
     * 9-10: The Date within het month of birth
     * 11: The year Digit from the year of birth (e.g. for 1987 it would be 7)
     * 12-13: The Inital Letter of the first name and middle name, padded with 9 if no middle name.
     * 14: Arbitrary digit – usually 9, but decremented to differentiate drivers with the first 13 characters in common. We will always use 9
     * 15-16: Two Computer Check Digits. We will always use "AA"
     *
     * @param data {First Name, Middle Name, Surname, Birthday, Gender (M/F) }
     * @return The Drivers Lincense
     */
    public static String driver(final String[] data) {
        StringBuilder output = new StringBuilder();

        if (data[0].isEmpty() || data[2].isEmpty() || data[3].isEmpty() || data[4].isEmpty()) {
            return "INVALID";
        }
        String firstName = data[0];
        String middleName = data[1];
        String surName = data[2];

        String[] birthDate = data[3].split("-");
        String birthDay = birthDate[0];
        String birthMonth = birthDate[1];
        String birthYear = birthDate[2];

        String gender = data[4];

        if (surName.length() >= 5) {
            output.append(surName.substring(0, 5));
        } else {
            int length = surName.length();
            output.append(surName);
            output.append("9".repeat(5 - length));
        }
        // Decade Digit
        output.append(birthYear.charAt(2));

        // Month Val
        output.append(getMonthValue(birthMonth, gender));

        // Day Val
        output.append(String.format("%02d", Integer.parseInt(birthDay)));

        // Year Digit
        output.append(birthYear.charAt(3));

        // First + Middle (if available)
        output.append(firstName.charAt(0));
        output.append(middleName.isEmpty() ? "9" : middleName.charAt(0));

        // Arbitrary digit
        output.append("9");

        // Check digit
        output.append("AA");

        return output.toString().toUpperCase();
    }

    private static String getMonthValue(String birthMonth, String gender) {
        int monthValue = 0;
        if (birthMonth.startsWith("Jan")) {
            monthValue = 1;
        } else if (birthMonth.startsWith("Feb")) {
            monthValue = 2;
        } else if (birthMonth.startsWith("Mar")) {
            monthValue = 3;
        } else if (birthMonth.startsWith("Apr")) {
            monthValue = 4;
        } else if (birthMonth.startsWith("May")) {
            monthValue = 5;
        } else if (birthMonth.startsWith("Jun")) {
            monthValue = 6;
        } else if (birthMonth.startsWith("Jul")) {
            monthValue = 7;
        } else if (birthMonth.startsWith("Aug")) {
            monthValue = 8;
        } else if (birthMonth.startsWith("Sep")) {
            monthValue = 9;
        } else if (birthMonth.startsWith("Oct")) {
            monthValue = 10;
        } else if (birthMonth.startsWith("Nov")) {
            monthValue = 11;
        } else if (birthMonth.startsWith("Dec")) {
            monthValue = 12;
        }
        if(gender.equals("F"))
            monthValue += 50;
        return String.format("%02d", monthValue);
    }

}
