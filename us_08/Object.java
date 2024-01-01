
package pojos.us_08;


import javax.annotation.processing.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Object {

    @SerializedName("compulsory")
    private Boolean mCompulsory;
    @SerializedName("creditScore")
    private Long mCreditScore;
    @SerializedName("lessonId")
    private Long mLessonId;
    @SerializedName("lessonName")
    private String mLessonName;

    public Boolean getCompulsory() {
        return mCompulsory;
    }

    public void setCompulsory(Boolean compulsory) {
        mCompulsory = compulsory;
    }

    public Long getCreditScore() {
        return mCreditScore;
    }

    public void setCreditScore(Long creditScore) {
        mCreditScore = creditScore;
    }

    public Long getLessonId() {
        return mLessonId;
    }

    public void setLessonId(Long lessonId) {
        mLessonId = lessonId;
    }

    public String getLessonName() {
        return mLessonName;
    }

    public void setLessonName(String lessonName) {
        mLessonName = lessonName;
    }

}
