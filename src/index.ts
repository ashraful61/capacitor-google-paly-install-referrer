import { registerPlugin } from '@capacitor/core';

import type { CapacitorGooglePlayInstallReferrerPlugin } from './definitions';

const CapacitorGooglePlayInstallReferrer = registerPlugin<CapacitorGooglePlayInstallReferrerPlugin>('CapacitorGooglePlayInstallReferrer', {
  web: () => import('./web').then(m => new m.CapacitorGooglePlayInstallReferrerWeb()),
});

export * from './definitions';
export { CapacitorGooglePlayInstallReferrer };
