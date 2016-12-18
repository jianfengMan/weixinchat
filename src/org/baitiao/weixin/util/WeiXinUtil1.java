package org.baitiao.weixin.util;

import java.io.IOException;
import java.util.Date;

import net.sf.json.JSONObject;

import com.gson.util.Tools;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

public class WeiXinUtil1 {
	/**
	 * 获取全局access_token令牌
	 */
//	public static String getAccessToken(String appID, String appSecret) {
//		String url = WxBaseUrl.getTOKEN(appID, appSecret);
//		String result = null;
//		try {
//			result = JavaConnetInternet.httpsRequest(url, "GET", null);
//			System.out.println(result);
//			JSONObject object = JSONObject.fromObject(result);
//			result = object.getString("access_token");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}

	/**
	 * 获取jsapi_ticket令牌
	 */
//	public static String getJsapiticket(String accesstoken) {
//		String url = WxBaseUrl.getJSAPI(accesstoken);
//		String result = null;
//		try {
//			result = JavaConnetInternet.getRespByUrl(url, null);
//			JSONObject object = JSONObject.fromObject(result);
//			if (object.getString("errcode").equals("0")) {
//				result = object.getString("ticket");
//			} else {
//				result = getJsapiticket(accesstoken);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return result;
//	}

	/**
	 * 更新access_token令牌
	 */
//	public static void updateAccessToken() {
//		String str = Tools.readTxtFile(Const.WXCONFIG);// 获取配置信息
//		String appID = "";
//		String appSecret = "";
//		if (null != str && !"".equals(str)) {
//			String strIW[] = str.split(",hc360,");
//			if (strIW.length == 5) {
//				appID = strIW[0];
//				appSecret = strIW[1];
//			}
//		}
//		String access_token = getAccessToken(appID, appSecret);
//		String jsapi_ticket = getJsapiticket(access_token);
//		long time = new Date().getTime();
//		String result = appID + ",hc360," + appSecret + ",hc360," + time
//				+ ",hc360," + access_token + ",hc360," + jsapi_ticket;
//		Tools.writeFile(Const.WXCONFIG, result);
//	}

	/**
	 * 获取微信用户信息
	 * 
	 * @param args
	 */
//	public static PageData getAccessToken(String openid) {
//		String str = Tools.readTxtFile(Const.WXCONFIG);// 获取配置信息
//		String access_token = null;
//		if (null != str && !"".equals(str)) {
//			String strIW[] = str.split(",hc360,");
//			if (strIW.length == 5) {
//				access_token = strIW[3];
//			}
//		}
//		String url = WxBaseUrl.getWEBUSERINFO(access_token, openid);
//		System.out.println(url + "关注请求url");
//		PageData map = new PageData();
//		String result = null;
//		try {
//			result = JavaConnetInternet.getRespByUrl(url, null);
//			if (result.contains("errcode")) {
//				map.put("UID", openid);
//				map.put("REMARK", result);
//			} else {
//				JSONObject object = JSONObject.fromObject(result);
//				String subscribe = object.getString("subscribe");
//				if ("1".equals(subscribe)) {
//					String nickname = object.getString("nickname");
//					String sex = object.getString("sex");
//					int sx = Integer.parseInt(sex);
//					sex = (sx == 1) ? "男" : "女";
//					String country = object.getString("country");
//					String province = object.getString("province");
//					String city = object.getString("city");
//					String headimgurl = object.getString("headimgurl");
//					String remark = object.getString("remark");
//					String groupid = object.getString("groupid");
//					map.put("CUSTOMER_ID", openid);
//					map.put("UID", openid);
//					map.put("NICKNAME", nickname);
//					map.put("SEX", sex);
//					map.put("COUNTRY", country);
//					map.put("PROVINCE", province);
//					map.put("CITY", city);
//					map.put("HEADIMGURL", headimgurl);
//					map.put("REMARK", remark);
//					map.put("GROUPID", groupid);
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return map;
//	}
}
