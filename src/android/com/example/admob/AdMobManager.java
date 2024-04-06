package com.example.admob;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class AdMobManager {

    private static final String TAG = "AdMobManager";
    private static InterstitialAd interstitialAd;

    // Metoda inicjalizująca interstycyjną reklamę
    public static void initializeInterstitialAd(Context context, String adUnitId) {
        Log.d(TAG, "Initializing Interstitial Ad...");
        interstitialAd = new InterstitialAd(context);
        interstitialAd.setAdUnitId(adUnitId);
    }

    // Metoda ładowania interstycyjnej reklamy (asynchroniczna)
    public static void loadInterstitialAd(Context context) {
        Log.d(TAG, "Loading Interstitial Ad...");
        AdRequest adRequest = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest);
    }

    // Metoda wyświetlająca interstycyjną reklamę (asynchroniczna)
    public static void showInterstitialAd(Context context) {
        Log.d(TAG, "Showing Interstitial Ad...");
        if (interstitialAd != null && interstitialAd.isLoaded()) {
            interstitialAd.show();
        } else {
            Log.d(TAG, "Interstitial Ad is not loaded yet.");
        }
    }
}
