package org.lucas.core;

/**
 * @create: 2018-01-03
 * @description: 服务请求地址
 */
public class URL {

    private final String protocol;

    private final int port;

    private volatile transient String ip;

    protected URL() {
        this.protocol = null;
        this.port = 0;
    }

    public String getProtocol() {
        return protocol;
    }

    public int getPort() {
        return port;
    }

    public String getIp() {
        return ip;
    }
}
