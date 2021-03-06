package bora.dkkang.ktv.base;

import android.media.tv.TvInputService;

public abstract class KTvInputService extends TvInputService {
    private KModuleFactory mModuleFactory;

    @Override
    public void onCreate() {
        super.onCreate();
        mModuleFactory = createModuleFactory();
    }

    @Override
    public Session onCreateSession(String inputId) {
        KPlayingSession session = null;
        session = new KPlayingSession(this, inputId, mModuleFactory);
        session.setOverlayViewEnabled(true);
        return session;
    }

    public abstract KModuleFactory createModuleFactory();
}
