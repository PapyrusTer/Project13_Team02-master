
package pojos.us_08;


import javax.annotation.processing.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class LessonsResponse {
    public LessonsResponse() {
    }

    public LessonsResponse(String mHttpStatus, String mMessage, Object mObject) {
        this.mHttpStatus = mHttpStatus;
        this.mMessage = mMessage;
        this.mObject = mObject;
    }

    @SerializedName("httpStatus")
    private String mHttpStatus;
    @SerializedName("message")
    private String mMessage;
    @SerializedName("object")
    private Object mObject;

    public String getHttpStatus() {
        return mHttpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        mHttpStatus = httpStatus;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public Object getObject() {
        return mObject;
    }

    public void setObject(Object object) {
        mObject = object;
    }

}
