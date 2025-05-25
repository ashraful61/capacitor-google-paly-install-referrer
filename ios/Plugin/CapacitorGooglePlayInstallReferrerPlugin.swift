import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(CapacitorGooglePlayInstallReferrerPlugin)
public class CapacitorGooglePlayInstallReferrerPlugin: CAPPlugin {
    private let implementation = CapacitorGooglePlayInstallReferrer()

    @objc func echo(_ call: CAPPluginCall) {
        let value = call.getString("value") ?? ""
        call.resolve([
            "value": implementation.echo(value)
        ])
    }
}
