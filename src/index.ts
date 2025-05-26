import { registerPlugin } from '@capacitor/core';

import type { CapacitorGooglePlayInstallReferrerPlugin } from './definitions';

const CapacitorGooglePlayInstallReferrer = registerPlugin<CapacitorGooglePlayInstallReferrerPlugin>('CapacitorGooglePlayInstallReferrer');

export * from './definitions';
export { CapacitorGooglePlayInstallReferrer };
