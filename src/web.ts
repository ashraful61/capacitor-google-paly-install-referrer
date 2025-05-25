import { WebPlugin } from '@capacitor/core';

import type { CapacitorGooglePlayInstallReferrerPlugin } from './definitions';

export class CapacitorGooglePlayInstallReferrerWeb extends WebPlugin implements CapacitorGooglePlayInstallReferrerPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
