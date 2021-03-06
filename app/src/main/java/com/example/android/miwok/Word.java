package com.example.android.miwok;

/**
 * Created by kevin on 11/26/2017.
 */

    /**
     * {@link Word} represents a vocabulary word that the user wants to learn.
     * It contains a default translation and a Miwok translation for that word.
     */
    public class Word {

        /** Default translation for the word */
        private String mDefaultTranslation;

        /** Miwok translation for the word */
        private String mMiwokTranslation;

        private int mAudioResourceId;

        /** Image resource ID for the word */
        private int mImageResourceId = NO_IMAGE_PROVIDED;

        /** Constant value that represents no image was provided for this word */
        private static final int NO_IMAGE_PROVIDED = -1;

        public Word(String defaultTranslation, String miwokTranslation, int AudioResourceId) {
            mDefaultTranslation = defaultTranslation;
            mMiwokTranslation = miwokTranslation;
            mAudioResourceId = AudioResourceId;
        }

        /**
         * Create a new Word object.
         *
         * @param defaultTranslation is the word in a language that the user is already familiar with
         *                           (such as English)
         * @param miwokTranslation is the word in the Miwok language
         */
        public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId ,int AudioResourceId) {
            mDefaultTranslation = defaultTranslation;
            mMiwokTranslation = miwokTranslation;
            mImageResourceId = ImageResourceId;
            mAudioResourceId = AudioResourceId;
        }

        /**
         * Get the default translation of the word.
         */
        public String getDefaultTranslation() {
            return mDefaultTranslation;
        }


        /**
         * Get the Miwok translation of the word.
         */
        public String getMiwokTranslation() {
            return mMiwokTranslation;
        }



        /**
         * Return the image resource ID of the word.
         */
        public int getImageResourceId() {
            return mImageResourceId;
        }

        /**
         * Returns whether or not there is an image for this word.
         */
        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }



        /**
        * Return the audio resource ID of the word.
        */
        public int getAudioResourceId() {
        return mAudioResourceId;
        }


    }
