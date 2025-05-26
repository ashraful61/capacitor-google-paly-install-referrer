// package com.wafisolutions.playinstall;

// import com.getcapacitor.JSObject;
// import com.getcapacitor.Plugin;
// import com.getcapacitor.PluginCall;
// import com.getcapacitor.PluginMethod;
// import com.getcapacitor.annotation.CapacitorPlugin;

// @CapacitorPlugin(name = "CapacitorGooglePlayInstallReferrer")
// public class CapacitorGooglePlayInstallReferrerPlugin extends Plugin {

//     private CapacitorGooglePlayInstallReferrer implementation = new CapacitorGooglePlayInstallReferrer();

//     @PluginMethod
//     public void echo(PluginCall call) {
//         String value = call.getString("value");

//         JSObject ret = new JSObject();
//         ret.put("value", implementation.echo(value));
//         call.resolve(ret);
//     }
// }


package com.wafisolutions.playinstall;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapacitorGooglePlayInstallReferrer")
public class CapacitorGooglePlayInstallReferrerPlugin extends Plugin {

    private CapacitorGooglePlayInstallReferrer implementation = new CapacitorGooglePlayInstallReferrer();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void getReferrer(PluginCall call) {
        implementation.getInstallReferrer(getContext(), new CapacitorGooglePlayInstallReferrer.ReferrerCallback() {
            @Override
            public void onReferrerReceived(String referrer, long clickTime, long installTime) {
                JSObject result = new JSObject();
                result.put("referrer", referrer);
                result.put("clickTime", clickTime);
                result.put("installTime", installTime);
                call.resolve(result);
            }

            @Override
            public void onError(String error) {
                call.reject(error);
            }
        });
    }
}
