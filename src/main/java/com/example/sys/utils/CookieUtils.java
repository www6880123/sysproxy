package com.example.sys.utils;/**
 * Created with IntelliJ IDEA
 * Uuser: Lucky(李文鑫)
 * Date: 2018/2/28-16:25
 */
/*by lucky 2016  
 //						   _ooOoo_							              _ooOoo_    
 //						  o8888888o							             o8888888o    
 //						  88" . "88							             88" . "88    
 //						  (| -_- |)							             (| -_- |)    
 //						  O\  =  /O							             O\  =  /O    
 //					   ____/`---'\____						   	      ____/`---'\____    
 //					 .'  \\|     |//  `.						     .   ' \\| |//   `.    
 //					/  \\|||  :  |||//  \						    /  \\|||  :  |||//  \    
 //				   /  _||||| -:- |||||-  \						   /  _||||| -:- |||||-  \    
 //				   |   | \\\  -  /// |   |						   |   | \\\  -  /// |   |    
 //				   | \_|  ''\---/''  |   |						   | \_|  ''\---/''  |   |    
 //				   \  .-\__  `-`  ___/-. /						    \  .-\__ `-` ___/-.  /    
 //			     ___`. .'  /--.--\  `. . __					  	  ___`. .' /--.--\ `. . __    
 //			  ."" '<  `.___\_<|>_/___.'  >'"".				   ."" '< `.___\_<|>_/___.' >'"".    
 //			 | | :  `- \`.;`\ _ /`;.`/ - ` : | |			 | | : `- \`.;`\ _ /`;.`/ - ` : | |    
 //			 \  \ `-.   \_ __\ /__ _/   .-` /  /			   \ \ `-. \_ __\ /__ _/ .-` / /    
 //		 ======`-.____`-.___\_____/___.-`____.-'====== ======`-.____`-.___\_____/___.-`____.-'======    
 //					       	`=---='    
 //
 //		^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  .............................................      
 //			     	  佛祖保佑             永无BUG   									佛祖保佑       永无BUG
 //			佛曰:    
 //				写字楼里写字间，写字间里程序员；    
 //				程序人员写程序，又拿程序换酒钱。    
 //				酒醒只在网上坐，酒醉还来网下眠；    
 //				酒醉酒醒日复日，网上网下年复年。    
 //				但愿老死电脑间，不愿鞠躬老板前；    
 //				奔驰宝马贵者趣，公交自行程序员。    
 //				别人笑我忒疯癫，我笑自己命太贱；    
 //				不见满街漂亮妹，哪个归得程序员？  
 //										-------by 见死不救    
 */

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 针对cookie的一些操作
 * @Author Lucky(李文鑫)
 * @Date 2018/2/28-16:25
 * @email 578581198@qq.com
 */
public class CookieUtils {

    /**
     * Cookie封装到Map集合
     * @Author Lucky(李文鑫)
     * @Date 2018/3/1-11:18
     * @email 578581198@qq.com
     * @param request
     * @return
     */
    public static Map<String, Cookie> readCookieMap(HttpServletRequest request) {
        Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
        Cookie[] cookies = request.getCookies();
        if (null != cookies) {
            for (Cookie cookie : cookies) {
                cookieMap.put(cookie.getName(), cookie);
            }
        }
        return cookieMap;
    }

    /**
     * 获取cookie中指定字段值
     * @Author Lucky(李文鑫)
     * @Date 2018/2/28-16:27
     * @email 578581198@qq.com
     * @param request
     * @param key
     * @return
     */
    public static String getValue(HttpServletRequest request,String key){
        Map<String, Cookie> map = readCookieMap(request);
        if(map.containsKey(key)){
            return map.get(key).getValue();
        }
        return null;
    }

    /**
     * 添加cookie
     * @Author Lucky(李文鑫)
     * @Date 2018/3/1-11:14
     * @email 578581198@qq.com
     * @param response
     * @param map
     */
    public static void addCookie(HttpServletResponse response, Map<String,String> map){
        Cookie cookie = new Cookie(map.get("name"),map.get("value"));
        if (map.containsKey("path")) {//有效路径
            cookie.setPath(map.get("path"));
        }else {
            cookie.setPath("/");
        }
        if (map.containsKey("domain")){//作用域
            cookie.setDomain(map.get("domain"));
        }
        if (map.containsKey("maxAge")){//有效时间
            cookie.setMaxAge(Integer.parseInt(map.get("maxAge")));
        }
        response.addCookie(cookie);
    }

    /**
     * 删除cookie
     * @Author Lucky(李文鑫)
     * @Date 2018/3/1-11:22
     * @email 578581198@qq.com
     * @param request
     * @param response
     * @param key
     */
    public static void removeCookie(HttpServletRequest request, HttpServletResponse response,String key){
        Map<String, Cookie> map = readCookieMap(request);
        if(map.containsKey(key)){
            Cookie cookie = map.get(key);
            cookie.setMaxAge(0);
            cookie.setPath("/");
            cookie.setValue(null);
            response.addCookie(cookie);
        }
    }
    
    /**
     * 删除cookie
     * @Author Lucky(李文鑫)
     * @Date 2018/3/1-11:22
     * @email 578581198@qq.com
     * @param request
     * @param response
     * @param key
     * @param path 路径
     */
    public static void removeCookie(HttpServletRequest request, HttpServletResponse response,String key,String path){
        Map<String, Cookie> map = readCookieMap(request);
        if(map.containsKey(key)){
            Cookie cookie = map.get(key);
            cookie.setMaxAge(0);
            cookie.setPath(path);
            cookie.setValue(null);
            response.addCookie(cookie);
        }
    }

    /**
     * 校验是否存在，值是否相等
     * @Author Lucky(李文鑫)
     * @Date 2018/3/1-14:25
     * @email 578581198@qq.com
     * @param request
     * @param key
     * @param value
     * @return
     */
    public static boolean sginCookie(HttpServletRequest request,String key,String value){
        String cookie = getValue(request, key);
        if (cookie == null) {
            return false;
        }else {
            return cookie.equals(value);
        }
    }
}
