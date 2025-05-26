# capacitor-google-play-install-referrer

Get play store referrer

## Install

```bash
npm install capacitor-google-play-install-referrer
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`getReferrer()`](#getreferrer)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### getReferrer()

```typescript
getReferrer() => Promise<{ referrer: string; clickTime: number; installTime: number; }>
```

**Returns:** <code>Promise&lt;{ referrer: string; clickTime: number; installTime: number; }&gt;</code>

--------------------

</docgen-api>


### Example:

```bash
import { CapacitorGooglePlayInstallReferrer } from 'capacitor-google-play-install-referrer';

const result: any = await CapacitorGooglePlayInstallReferrer.getReferrer();

example link:
https://play.google.com/store/apps/details?id={packageName}&referrer={dynamicCode}
https://play.google.com/store/apps/details?id=com.example.app&referrer=Test234
```
