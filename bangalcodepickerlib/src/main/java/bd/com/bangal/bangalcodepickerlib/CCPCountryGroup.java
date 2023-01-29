package bd.com.bangal.bangalcodepickerlib;

import android.content.Context;
import android.util.SparseArray;

import java.util.HashMap;
import java.util.Map;

/**
 * This all those countries that shares the same country code but can be differentiated based on area code
 */
public class CCPCountryGroup {
    private static SparseArray<CCPCountryGroup> countryGroups = null;
    String defaultNameCode;
    int areaCodeLength;
    private HashMap<String, String> nameCodeToAreaCodesMap;

    private CCPCountryGroup(String defaultNameCode, int areaCodeLength, HashMap<String, String> nameCodeToAreaCodesMap) {
        this.defaultNameCode = defaultNameCode;
        this.areaCodeLength = areaCodeLength;
        this.nameCodeToAreaCodesMap = nameCodeToAreaCodesMap;
    }

    private static void initializeGroups() {

        countryGroups = new SparseArray<>();

        //create group for +1
        addGroupForPhoneCode1();

        //create group for +44
        addGroupForPhoneCode44();

        //create group for +358
        addGroupForPhoneCode358();
    }

    private static void addGroupForPhoneCode358() {
        HashMap<String, String> nameCodeToAreaCodes = new HashMap<>();
        nameCodeToAreaCodes.put("ax", "18"); //Åland Islands
        countryGroups.put(358, new CCPCountryGroup("fi", 2, nameCodeToAreaCodes)); // Finland
    }

    /**
     * +44 group
     */
    private static void addGroupForPhoneCode44() {
        HashMap<String, String> nameCodeToAreaCodes = new HashMap<>();
        nameCodeToAreaCodes.put("gg", "1481"); //Guernsey
        nameCodeToAreaCodes.put("im", "1624"); //ISLE_OF_MAN
        nameCodeToAreaCodes.put("je", "1534"); //Jersey
        countryGroups.put(44, new CCPCountryGroup("gb", 4, nameCodeToAreaCodes)); // UK
    }


    /**
     * NANP countries (+1)
     */
    private static void addGroupForPhoneCode1() {
        HashMap<String, String> nameCodeToAreaCodes = new HashMap<>();
        nameCodeToAreaCodes.put("ag", "268"); //ANTIGUA_AND_BARBUDA_AREA_CODES

        countryGroups.put(1, new CCPCountryGroup("us", 3, nameCodeToAreaCodes)); // USA
    }

    public static CCPCountryGroup getCountryGroupForPhoneCode(int countryCode) {
        if (countryGroups == null) {
            initializeGroups();
        }
        return countryGroups.get(countryCode);
    }

    /**
     * Go though nameCodeToAreaCodesMap entries to find name code of country.
     *
     * @param context
     * @param language
     * @param areaCode for which we are looking for country
     * @return country that matches areaCode. If no country matched, returns default country.
     */
    public CCPCountry getCountryForAreaCode(Context context, CountryCodePicker.Language language, String areaCode) {
        String nameCode = defaultNameCode;
        for (Map.Entry<String, String> entry : nameCodeToAreaCodesMap.entrySet()) {
            if (entry.getValue().contains(areaCode)) {
                nameCode = entry.getKey();
            }
        }
        return CCPCountry.getCountryForNameCodeFromLibraryMasterList(context, language, nameCode);
    }
}
