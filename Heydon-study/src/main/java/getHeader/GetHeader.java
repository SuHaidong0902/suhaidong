package getHeader;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;




/**
 * @Author haiDong
 * @Date: 2021/6/19 3:56 下午
 * @Description:
 */
@SuppressWarnings({ "deprecation", "unused" })
public class GetHeader {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
            HttpClient httpclient = new DefaultHttpClient();
            //创建登录请求的URL
            HttpPost httpPost = new HttpPost("https://oauth.youzan.com/login/password?clientId=3ccf8ffd3818f5fa2e&state=123&scope=auth_user&redirectUrl=https%3A%2F%2Fdennis-chain-baihuo.isv-dev.youzan.com");
            //创建登录时候所需要传递的数据
            List<NameValuePair> nvp = new ArrayList<NameValuePair>();
            //此处的key值对应你在浏览器上获取的
            nvp.add(new BasicNameValuePair("userName", "15764233189"));
            nvp.add(new BasicNameValuePair("password", "839708052a"));
            nvp.add(new BasicNameValuePair("rememberMe", "false"));
            String sCharSet = "utf-8";
            httpPost.setEntity(new UrlEncodedFormEntity(nvp, sCharSet));

            HttpResponse response;
            String cookie = "";
            String value = null;
            response = httpclient.execute(httpPost);
            // post请求成功后的返回值
            String str = EntityUtils.toString(response.getEntity());
            System.out.println("-----:"+str);

            //获取response中的cookie值
            Header[] headers = response.getHeaders("Set-Cookie");
            String headerstr = headers.toString();
            //取出所有的cookie值
            for (int i = 0; i < headers.length; i++) {
                value = headers[i].getValue();
                System.out.println("第"+i+"次的值为："+value);
                cookie+=value;
            }
            //需要获取数据的URL
            HttpPost httpost2 = new HttpPost("https://dennis-chain-baihuo.isv-dev.youzan.com/?code=VG72W4knC5VctPK0N4ViDlxPrg4%2BPZpn4qwbJVJVuKi4iirS8jkPPX04SAzmrTlZ&state=123#/nav/FloorList");
            System.out.println("cookie的值为："+cookie);
            // 设置之前获取到的cookie
            httpost2.setHeader("Cookie", cookie);
            httpost2.setHeader("Content-Type", "application/json; charset=UTF-8");

            HttpResponse response2 = httpclient.execute(httpost2);
            // 这里就是我们要的数据了。
            String str2 = EntityUtils.toString(response2.getEntity());
            System.out.println(str2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
