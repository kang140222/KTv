package bora.dkkang.ktv.base;

public abstract class KModuleFactory {
    private KChannelDataManager mChannelDataManager;
    private KDataSourceManager mDataSourceManager;
    private KEventDetector mEventDetector;
    private KTvPlayer mTvPlayer;


    public KChannelDataManager createOrGetChannelDataManager() {
        if (mChannelDataManager == null) {
            mChannelDataManager = createChannelDataManager();
        }
        return mChannelDataManager;
    }

    public KDataSourceManager createOrGetDataSourceManager() {
        if (mDataSourceManager == null) {
            mDataSourceManager = createDataSourceManager();
        }
        return mDataSourceManager;
    }

    public KEventDetector createOrGetEventDetector() {
        if (mEventDetector == null) {
            mEventDetector = createEventDetector();
        }
        return mEventDetector;
    }

    public KTvPlayer createOrGetTvPlayer() {
        if (mTvPlayer == null) {
            mTvPlayer = createTvPlayer();
        }
        return mTvPlayer;
    }

    public abstract KChannelDataManager createChannelDataManager();
    public abstract KDataSourceManager createDataSourceManager();
    public abstract KEventDetector createEventDetector();
    public abstract KTvPlayer createTvPlayer();
}
