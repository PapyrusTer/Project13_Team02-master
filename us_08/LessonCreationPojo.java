
package pojos.us_08;


import javax.annotation.processing.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class LessonCreationPojo {
    public LessonCreationPojo() {
    }

    public LessonCreationPojo(Boolean mCompulsory, int mCreditScore, String mLessonName) {
        this.mCompulsory = mCompulsory;
        this.mCreditScore = mCreditScore;
        this.mLessonName = mLessonName;
    }


    @SerializedName("compulsory")
    private Boolean mCompulsory;
    @SerializedName("creditScore")
    private int mCreditScore;
    @SerializedName("lessonName")
    private String mLessonName;

    public Boolean getCompulsory() {
        return mCompulsory;
    }

    public int getCreditScore() {
        return mCreditScore;
    }

    public String getLessonName() {
        return mLessonName;
    }

    public static class Builder {

        private Boolean mCompulsory;
        private int mCreditScore;
        private String mLessonName;

        public LessonCreationPojo.Builder withCompulsory(Boolean compulsory) {
            mCompulsory = compulsory;
            return this;
        }

        public LessonCreationPojo.Builder withCreditScore(int creditScore) {
            mCreditScore = creditScore;
            return this;
        }

        public LessonCreationPojo.Builder withLessonName(String lessonName) {
            mLessonName = lessonName;
            return this;
        }

        public LessonCreationPojo build() {
            LessonCreationPojo uS08Pojo = new LessonCreationPojo();
            uS08Pojo.mCompulsory = mCompulsory;
            uS08Pojo.mCreditScore = mCreditScore;
            uS08Pojo.mLessonName = mLessonName;
            return uS08Pojo;
        }

    }

}
