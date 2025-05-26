// package com.wafisolutions.playinstall;

// import android.util.Log;

// public class CapacitorGooglePlayInstallReferrer {

//     public String echo(String value) {
//         Log.i("Echo", value);
//         return value;
//     }
// }


package com.wafisolutions.playinstall;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

public class CapacitorGooglePlayInstallReferrer {

    public interface ReferrerCallback {
        void onReferrerReceived(String referrer, long clickTime, long installTime);
        void onError(String error);
    }

    public void getInstallReferrer(Context context, ReferrerCallback callback) {
        InstallReferrerClient referrerClient = InstallReferrerClient.newBuilder(context).build();

        referrerClient.startConnection(new InstallReferrerStateListener() {
            @Override
            public void onInstallReferrerSetupFinished(int responseCode) {
                if (responseCode == InstallReferrerClient.InstallReferrerResponse.OK) {
                    try {
                        ReferrerDetails response = referrerClient.getInstallReferrer();
                        callback.onReferrerReceived(
                            response.getInstallReferrer(),
                            response.getReferrerClickTimestampSeconds(),
                            response.getInstallBeginTimestampSeconds()
                        );
                    } catch (Exception e) {
                        callback.onError(e.getMessage());
                    } finally {
                        referrerClient.endConnection();
                    }
                } else {
                    callback.onError("Install referrer not available, code: " + responseCode);
                }
            }

            @Override
            public void onInstallReferrerServiceDisconnected() {
                callback.onError("Install Referrer service disconnected");
            }
        });
    }

    public String echo(String value) {
        return value;
    }
}

