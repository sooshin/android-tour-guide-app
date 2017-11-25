package com.example.android.tourguide;

/**
 * Created by sj on 11/20/2017.
 */

public class Attraction {

    private int mAttractionImageId;
    private String mAttractionName;
    private String mAttractionDescription;
    private String mAttractionAddress;
    private String mAttractionTransportation;
    private String mAttractionPhone;
    private String mAttractionWeb;
    private String mAttractionHours;
    private String mAttractionFee;

    /**
     * Create a new Attraction object.
     *
     * @param attractionImageId is the image resource id of the place
     * @param attractionName is a name of the place
     * @param attractionDescription is the description of the place
     */
    public Attraction(int attractionImageId, String attractionName, String attractionDescription){
        mAttractionImageId = attractionImageId;
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
    }

    public Attraction(int attractionImageId, String attractionName, String attractionDescription,
                      String attractionAddress, String attractionTransportation){
        mAttractionImageId = attractionImageId;
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mAttractionAddress = attractionAddress;
        mAttractionTransportation = attractionTransportation;
    }

    public Attraction(int attractionImageId, String attractionName, String attractionDescription,
                      String attractionAddress, String attractionTransportation, String attractionPhone,
                      String attractionWeb, String attractionHours, String attractionFee) {
        mAttractionImageId = attractionImageId;
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mAttractionAddress = attractionAddress;
        mAttractionTransportation = attractionTransportation;
        mAttractionPhone = attractionPhone;
        mAttractionWeb = attractionWeb;
        mAttractionHours = attractionHours;
        mAttractionFee =attractionFee;
    }

    /**
     * Get the image resource Id of the place
     */
    public int getAttractionImageId() {
        return mAttractionImageId;
    }

    /**
     * Get the name of the place
     */
    public String getAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the description of the place
     */
    public String getAttractionDescription() {
        return mAttractionDescription;
    }

    /**
     * Get the address of the place
     */
    String getAttractionAddress() {
        return mAttractionAddress;
    }

    /**
     * Get the transportation of the place
     */
    String getAttractionTransportation() {
        return mAttractionTransportation;
    }

    /**
     * Get the phone number of the place
     */
    String getAttractionPhone() {
        return mAttractionPhone;
    }

    /**
     * Get the web page of the place
     */
    String getAttractionWeb() {
        return mAttractionWeb;
    }

    /**
     * Get the hours of the place
     */
    String getAttractionHours() {
        return mAttractionHours;
    }

    /**
     * Get the Admission Fee of the place
     */
    String getAttractionFee() {
        return mAttractionFee;
    }

}

