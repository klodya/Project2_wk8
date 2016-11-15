package com.example.user.bearwithme;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 13/11/2016.
 */

public class Predictions {

    protected ArrayList<String> mPredictions;
//    protected ArrayList<String> mMediocrePredictions;
//    protected ArrayList<String> mGoodPredictions;
//    protected ArrayList<String> mDrunkPredictions;


    public Predictions(){
        mPredictions = new ArrayList<String>();
    }

    public ArrayList<String> getPredictions(){
        return new ArrayList<>();
    }
//
//    public ArrayList<String> getMediocrePredictions(){
//        return new ArrayList<>(mMediocrePredictions);
//    }
//
//    public ArrayList<String> getGoodPredictions(){
//        return new ArrayList<>(mGoodPredictions);
//    }
//
//    public ArrayList<String> getDrunkPredictions(){
//        return new ArrayList<>(mDrunkPredictions);
//    }



    public void createPrediction(String prediction){
        mPredictions.add(prediction);
    }

//    public void createMediocrePrediction(String mediocrePrediction){
//        mMediocrePredictions.add(mediocrePrediction);
//    }
//
//    public void createGoodPrediction(String goodPrediction){
//        mGoodPredictions.add(goodPrediction);
//    }
//
//    public void createDrunkPrediction(String drunkPrediction){
//        mDrunkPredictions.add(drunkPrediction);
//    }



    public int getPredictionsLength(){
        return mPredictions.size();
    }

//    public int getMediocrePredictionsLength(){
//        return mMediocrePredictions.size();
//    }
//
//    public int getGoodPredictionsLength(){
//        return mGoodPredictions.size();
//    }
//
//    public int getDrunkPredictionsLength(){
//        return mDrunkPredictions.size();
//    }



    public String getPredictionAtIndex(int index){
        return mPredictions.get(index);
    }

//    public String getMediocrePredictionAtIndex(int index){
//        return mMediocrePredictions.get(index);
//    }
//
//    public String getGoodPredictionAtIndex(int index){
//        return mGoodPredictions.get(index);
//    }
//
//    public String getDrunkPredictionAtIndex(int index){
//        return mDrunkPredictions.get(index);
//    }



    public String getPrediction(){
        Random rand = new Random();
        int listSize = getPredictionsLength();
        int index = rand.nextInt(listSize);
        String prediction = getPredictionAtIndex(index);
        return prediction;
    }

//    public String getMediocrePrediction(){
//        Random rand = new Random();
//        int listSize = getMediocrePredictionsLength();
//        int index = rand.nextInt(listSize);
//        String prediction = getMediocrePredictionAtIndex(index);
//        return prediction;
//    }
//
//    public String getGoodPrediction(){
//        Random rand = new Random();
//        int listSize = getGoodPredictionsLength();
//        int index = rand.nextInt(listSize);
//        String prediction = getGoodPredictionAtIndex(index);
//        return prediction;
//    }
//
//    public String getDrunkPrediction(){
//        Random rand = new Random();
//        int listSize = getDrunkPredictionsLength();
//        int index = rand.nextInt(listSize);
//        String prediction = getDrunkPredictionAtIndex(index);
//        return prediction;
//    }



//    private void setUpBadPredictions() {
//        String[] badPredictions = {
//                "Shoo Human",
//                "That is irrelevant",
//                "I will eat your face."
//        };
//
//        for (String badPrediction : badPredictions) {
//            mBadPredictions.add(badPrediction);
//        }
//    }
//
//    private void setUpMediocrePredictions() {
//        String[] mediocrePredictions = {
//                "It's hard to tell when I'm still hungry",
//                "Maybe a beer would help me think",
//                "I like the taste of donuts."
//        };
//
//        for (String mediocrePrediction : mediocrePredictions) {
//            mMediocrePredictions.add(mediocrePrediction);
//        }
//    }
//
//    private void setUpGoodPredictions() {
//
//        String[] goodPredictions = {
//                "I would assume that this is possible",
//                "Sure, why not.",
//                "You are very nice."
//        };
//
//        for (String goodPrediction : goodPredictions) {
//            mGoodPredictions.add(goodPrediction);
//        }
//    }
//
//    private void setUpDrunkPredictions(){
//        String[] drunkPredictions = {
//                "ooh *hic* that sure..sounds..*hic*",
//                "Ooft...BURP..*hic*",
//                "Where my honeyz at?!"
//        };
//
//        for (String drunkPrediction : drunkPredictions){
//            mDrunkPredictions.add(drunkPrediction);
//        }
//    }

}




