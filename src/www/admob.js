var exec = require('cordova/exec');

var AdMob = {
    initializeInterstitialAd: function(adUnitId) {
        return new Promise(function(resolve, reject) {
            exec(resolve, reject, 'AdMobManager', 'initializeInterstitialAd', [adUnitId]);
        });
    },
    loadInterstitialAd: function() {
        return new Promise(function(resolve, reject) {
            exec(resolve, reject, 'AdMobManager', 'loadInterstitialAd', []);
        });
    },
    showInterstitialAd: function() {
        return new Promise(function(resolve, reject) {
            exec(resolve, reject, 'AdMobManager', 'showInterstitialAd', []);
        });
    }
};

module.exports = AdMob;