package me.stan.wx.web.servlet;


/**
 * accesstoken的数据类型
 */
public class AccessToken {
    //获取凭证
    private String accessToken;
    //获取有效时间
    private int expiresin;

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setExpiresin(int expiresin) {
        this.expiresin = expiresin;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public int getExpiresin() {
        return expiresin;
    }
}
