package bora.dkkang.ktv.base;
import android.content.Context;
import android.media.tv.TvInputService;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.view.Surface;


public class KTvInputSession extends TvInputService.Session {
    private final KTvInputSessionWorker mSessionWorker;
    private final String mInputId;

    public KTvInputSession(Context context, String inputId, KModuleFactory moduleFactory) {
        super(context);
        mInputId = inputId;
        mSessionWorker = new KTvInputSessionWorker(context, moduleFactory);
    }

    @Override
    public void onRelease() {

    }

    @Override
    public boolean onSetSurface(@Nullable Surface surface) {
        return false;
    }

    @Override
    public void onSetStreamVolume(float volume) {

    }

    @Override
    public boolean onTune(Uri channelUri) {
        return false;
    }

    @Override
    public void onSetCaptionEnabled(boolean enabled) {

    }
}
