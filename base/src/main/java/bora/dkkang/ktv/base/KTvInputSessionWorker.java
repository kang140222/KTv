package bora.dkkang.ktv.base;
import android.content.Context;

public class KTvInputSessionWorker {
    private final Context mContext;
    private final KChannelDataManager mChannelDataManager;
    private final KDataSourceManager mDataSourceManager;
    private final KEventDetector mEventDetector;
    private final KTvPlayer mTvPlayer;

    public KTvInputSessionWorker(Context context, KModuleFactory factory) {
        mContext = context;
        mChannelDataManager = factory.createOrGetChannelDataManager();
        mDataSourceManager = factory.createOrGetDataSourceManager();
        mEventDetector = factory.createOrGetEventDetector();
        mTvPlayer = factory.createOrGetTvPlayer();
    }
}
