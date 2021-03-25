package com.example.android.miwok;

public class Word {
    private String mDefaultTransalation,mMiwokTransalation;
    private int mImageResourceId=NO_IMAGE_APPROVED;
    private int mAudioResourceId;
    private static final int NO_IMAGE_APPROVED=-1;
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioResourceId){
        mDefaultTransalation=defaultTranslation;
        mMiwokTransalation=miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;

    }
    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId){
        mDefaultTransalation=defaultTranslation;
        mMiwokTransalation=miwokTranslation;
        mAudioResourceId=audioResourceId;
    }
    public String getMiwokTranslation(){
        return mMiwokTransalation;
    }
    public String getDefaultTranslation(){
        return mDefaultTransalation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_APPROVED;
    }

}
