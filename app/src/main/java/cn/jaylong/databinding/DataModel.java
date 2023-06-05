package cn.jaylong.databinding;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class DataModel extends BaseObservable {

    public String androidVersion, androidName;

    public DataModel(String androidName, String androidVersion) {
        this.androidName = androidName;
        this.androidVersion = androidVersion;
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Log.i("tag", "onTextChanged " + s);
    }

    @Bindable
    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
        notifyPropertyChanged(BR.androidVersion);
    }

    @Bindable
    public String getAndroidName() {
        return androidName;
    }

    public void setAndroidName(String androidName) {
        this.androidName = androidName;
        notifyPropertyChanged(BR.androidName);
    }
}