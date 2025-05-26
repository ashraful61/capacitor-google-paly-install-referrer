export interface CapacitorGooglePlayInstallReferrerPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
    getReferrer(): Promise<{
    referrer: string;
    clickTime: number;
    installTime: number;
  }>;
}
