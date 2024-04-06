# Cordova AdMob Plugin

Cordova AdMob Plugin is a plugin for integrating AdMob ads into your Cordova applications.

## Installation

You can install the plugin using the Cordova CLI:

```bash
cordova plugin add cordova-plugin-admob
```

## Usage

To use the AdMob Plugin in your Cordova application, follow these steps:

Import the plugin in your JavaScript/TypeScript code:

```js
import AdMob from 'cordova-plugin-admob';

// Use AdMob functions
AdMob.initializeInterstitialAd('YOUR_AD_UNIT_ID')
    .then(() => {
        console.log('Interstitial Ad initialized successfully');
        return AdMob.loadInterstitialAd();
    })
    .then(() => {
        console.log('Interstitial Ad loaded successfully');
        return AdMob.showInterstitialAd();
    })
    .catch(error => {
        console.error('Error:', error);
    });
```
Replace 'YOUR_AD_UNIT_ID' with your actual AdMob ad unit ID.

## License

This plugin is released under the MIT License.