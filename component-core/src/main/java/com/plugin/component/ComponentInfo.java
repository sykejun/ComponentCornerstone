package com.plugin.component;

import android.util.ArrayMap;

/**
 * 运行时完成收集
 */
public class ComponentInfo {

    public ComponentInfo(Class componentClass) {
        this.componentClass = componentClass;
    }

    public ComponentInfo(IComponent componentImpl) {
        this.componentClass = componentImpl.getClass();
        this.componentImpl = componentImpl;
    }

    public Class componentClass;
    public IComponent componentImpl;

    private ArrayMap<Class, Object> sdkMap = new ArrayMap<>();


    public void registerSdk(Class sdkClass, Object sdkImpl) {
        sdkMap.put(sdkClass, sdkImpl);
    }

    public boolean unregisterSdk(Class sdkKey) {
        if (sdkMap.containsKey(sdkKey)) {
            sdkMap.remove(sdkKey);
            return true;
        }
        return false;
    }

    public boolean hasSdk(Class sdkKey) {
        return sdkMap.containsKey(sdkKey);
    }

    public Object getSdk(Class sdkKey) {
        return sdkMap.get(sdkKey);
    }
}