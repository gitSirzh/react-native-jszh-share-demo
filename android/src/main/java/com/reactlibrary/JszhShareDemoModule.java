package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.IllegalViewOperationException;

import android.widget.Toast;

public class JszhShareDemoModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public JszhShareDemoModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "JszhShareDemo";
    }

    @ReactMethod
    public void alert(String string) {
        Toast.makeText(getReactApplicationContext(), string, Toast.LENGTH_SHORT).show();
    }

    @ReactMethod
    public void callbackData(Promise promise) {
        try {
            WritableMap writableMap = Arguments.createMap();
            writableMap.putString("value", "Native - android");
            promise.resolve(writableMap);
        } catch (IllegalViewOperationException e) {
            promise.reject("500", e.getMessage(), e);
        }
    }

}
