package org.skyeye.api.constant;

/**
 * @author liuliang
 * @date 2020/7/21 下午1:47
 */
public class InterceptorConstant {
    public final static String NGINX = "/nginx.html";
    public final static String DISPATCHER_RECORD_UPDATE = "/dispatcher/record/update";
    public final static String UPLOAD_FILE = "/driver/upload/uploadFile";
    public final static String DRIVER_VIA = "/v1/driver/via/list";
    public final static String DRIVER_SEND_MESSAGE_ON = "/v1/driver/message/sendGetOnCarMessage";
    public final static String DRIVER_SEND_MESSAGE_OFF = "/v1/driver/message/sendGetOffCarMessage";
    public final static String PUSH_MESSAGE = "/v1/driver/push/message";
    public final static String DRIVER_HOME_CHANNEL_NAME = "/v1/driver/home/channelName";
    public static final  String ASSOCIATE_DRIVER_GETSMSCODE = "/v1/driver/associateDriver/getSMSCode";
    public static final  String ASSOCIATE_DRIVER_VERIFYSMSCODE = "/v1/driver/associateDriver/verifySmsCode";
    public static final  String ASSOCIATE_DRIVER_GETISREGISTED = "/v1/driver/associateDriver/getIsRegisted";
    public static final  String ASSOCIATE_DRIVER_GETALLOPENEDCITY = "/v1/driver/associateDriver/getAllOpenedCity";
    public static final  String ASSOCIATE_DRIVER_LICENSUPLOAD = "/v1/driver/associateDriver/licensUpload";
    public static final  String ASSOCIATE_DRIVER_GETAUDITSTATE = "/v1/driver/associateDriver/getAuditState";
    public static final  String ASSOCIATE_DRIVER_REGISTER = "/v1/driver/associateDriver/register";
    public static final  String ASSOCIATE_DRIVER_REGISTER_GEO = "/v1/driver/geo/location/getCityByXy";

    public static final  String DRIVER_REDIS_LOGIN_ADD = "/driver/redis/login/add";

    public static final  String DRIVER_REDIS_GET_VAL = "/driver/redis/get/val";

    public static final  String DRIVER_LOGIN = "/v1/driver/login";

    public static final  String DRIVER_FORGET_PASSWORD = "/v1/driver/forgetPassword";

    public static final  String DRIVER_INFO_UNCHECK_TOKEN = "/v1/driver/personal/uncheck/center";

    public static final  String DRIVER_SCAN_PAY = "/v1/driver/payment/scan";

    public static final  String DRIVER_ADD_DEVICE_INFO = "/v1/driver/addDeviceInfo";




    /**header拦截器不需要拦截的请求*/
    public final static String[] EXCLUDE_HEADER = {DRIVER_SCAN_PAY,DRIVER_FORGET_PASSWORD,DRIVER_REDIS_GET_VAL, DRIVER_REDIS_LOGIN_ADD, DRIVER_HOME_CHANNEL_NAME, DRIVER_SEND_MESSAGE_OFF, DRIVER_SEND_MESSAGE_ON, DRIVER_VIA,UPLOAD_FILE,NGINX,
            ASSOCIATE_DRIVER_GETSMSCODE,ASSOCIATE_DRIVER_VERIFYSMSCODE,ASSOCIATE_DRIVER_GETISREGISTED,ASSOCIATE_DRIVER_GETALLOPENEDCITY,ASSOCIATE_DRIVER_LICENSUPLOAD,ASSOCIATE_DRIVER_GETAUDITSTATE,ASSOCIATE_DRIVER_REGISTER,ASSOCIATE_DRIVER_REGISTER_GEO

    };

    /**token拦截器不需要拦截的请求*/
    public final static String[] EXCLUDE_TOKEN = {DRIVER_SCAN_PAY,DRIVER_LOGIN,DRIVER_ADD_DEVICE_INFO,DRIVER_FORGET_PASSWORD,DRIVER_INFO_UNCHECK_TOKEN,DRIVER_REDIS_GET_VAL, DRIVER_REDIS_LOGIN_ADD, DRIVER_HOME_CHANNEL_NAME, DRIVER_SEND_MESSAGE_OFF,PUSH_MESSAGE, DRIVER_SEND_MESSAGE_ON, DRIVER_VIA,UPLOAD_FILE,NGINX, DISPATCHER_RECORD_UPDATE,
            ASSOCIATE_DRIVER_GETSMSCODE,ASSOCIATE_DRIVER_VERIFYSMSCODE,ASSOCIATE_DRIVER_GETISREGISTED,ASSOCIATE_DRIVER_GETALLOPENEDCITY,ASSOCIATE_DRIVER_LICENSUPLOAD,ASSOCIATE_DRIVER_GETAUDITSTATE,ASSOCIATE_DRIVER_REGISTER,ASSOCIATE_DRIVER_REGISTER_GEO
    };
}
