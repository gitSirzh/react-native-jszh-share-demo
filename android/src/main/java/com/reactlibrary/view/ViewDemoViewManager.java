package com.reactlibrary.view;

import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ViewDemoViewManager extends SimpleViewManager<MyPaintView> {

    @Override
    protected MyPaintView createViewInstance(ThemedReactContext reactContext) {
        return new MyPaintView(reactContext);
    }

    @Override
    public String getName() {
        return "NativeViewDemo";
    }

    @ReactProp(name ="color" )
    public void setColor(MyPaintView pView, String color) {
        pView.setColor(color);
    }

    @ReactProp(name ="radius" )
    public void setRadius(MyPaintView pView, Integer radius) {
        pView.setRadius(radius);
    }
}
