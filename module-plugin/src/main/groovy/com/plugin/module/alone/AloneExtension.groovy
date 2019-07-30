package com.plugin.module.alone

class AloneExtension {

    /**
     * 是否自动注册组件，true则会使用字节码插入的方式自动注册代码
     * false的话，需要手动使用反射的方式来注册
     */
    boolean isRegisterComponentAuto = false

    /**
     * 当前组件的applicationName，用于字节码插入。
     * 当isRegisterComponentAuto==true的时候是必须的
     */
    String applicationName

    boolean runAlone = true
}