package stringmethods.url;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;
    private String url;

    public UrlManager(String url) {
        this.url = url;
    }

    int protocolNum;
    public String getProtocol() {
        protocolNum = url.indexOf(":");
        return url.substring(0, protocolNum);
    }

    public String  getHost() {
        int hostNum = url.indexOf("/", 9);
        return url.substring(protocolNum + 3, hostNum);
    }

    public Integer getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public boolean hasProperty(String key) {
    return true;
    }

    public void getProperty(String key) {
        System.out.println();
    }
    
}
