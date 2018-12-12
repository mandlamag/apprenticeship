package com.konekt;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.rnziparchive.RNZipArchivePackage;
import com.apsl.versionnumber.RNVersionNumberPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.rnfingerprint.FingerprintAuthPackage;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import cl.json.RNSharePackage;
import io.sentry.RNSentryPackage;
import br.com.classapp.RNSensitiveInfo.RNSensitiveInfoPackage;
import com.bitgo.randombytes.RandomBytesPackage;
import com.surajit.rnrg.RNRadialGradientPackage;
import fr.bamlab.rnimageresizer.ImageResizerPackage;
import com.reactnative.ivpusic.imagepicker.PickerPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.evollu.react.fcm.FIRMessagingPackage;
import com.reactnativedocumentpicker.ReactNativeDocumentPicker;
import org.reactnative.camera.RNCameraPackage;
import io.branch.rnbranch.RNBranchPackage;
import com.tectiv3.aes.RCTAesPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(new MainReactPackage(),
            new RNGestureHandlerPackage(), new RNZipArchivePackage(),
          new RNVersionNumberPackage(), new VectorIconsPackage(), new FingerprintAuthPackage(),
          new SplashScreenReactPackage(), new RNSharePackage(), new RNSentryPackage(), new RNSensitiveInfoPackage(),
          new RandomBytesPackage(), new RNRadialGradientPackage(), new ImageResizerPackage(), new PickerPackage(),
          new RNFetchBlobPackage(), new FIRMessagingPackage(), new ReactNativeDocumentPicker(), new RNCameraPackage(),
          new RNBranchPackage(), new RCTAesPackage());
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
