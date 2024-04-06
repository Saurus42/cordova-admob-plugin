declare namespace AdMob {
  function initializeInterstitialAd(adUnitId: string): Promise<void>;
  function loadInterstitialAd(): Promise<void>;
  function showInterstitialAd(): Promise<void>;
}

export = AdMob;