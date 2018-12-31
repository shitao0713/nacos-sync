package com.alibaba.nacossync.util;

import org.apache.commons.lang3.StringUtils;

import java.io.File;

/**
 * @author paderlol
 * @date: 2018-12-25 21:34
 */
public final class DubboConstants {
    public static final String MONITOR_PATH_FORMAT =
        StringUtils.join(new String[] {"/dubbo", "%s", "providers"}, File.separator);
    public static final String VERSION_KEY = "version";
    public static final String GROUP_KEY = "group";
    public static final String INTERFACE_KEY = "interface";
    public static final String INSTANCE_IP_KEY = "ip";
    public static final String INSTANCE_PORT_KEY = "port";
}