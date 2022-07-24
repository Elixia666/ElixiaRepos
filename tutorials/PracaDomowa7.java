public class PracaDomowa7 {
    public static void main(String[] args) {
        AndroidApp huawei = new AndroidApp("P10 Lite");
        IphoneApp i7 = new IphoneApp("i7");

        huawei.runAndroidApp();
        huawei.appInfo();

        i7.runIphoneApp();
        i7.appInfo();
    }
}
