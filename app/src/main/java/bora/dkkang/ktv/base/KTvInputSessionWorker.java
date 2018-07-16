package bora.dkkang.ktv.base;
import android.content.Context;

public class KTvInputSessionWorker {
    private final Context mContext;
    private final KChannelDataManager mChannelDataManager;
    private final KDataSourceManager mDataSourceManager;
    private final KEventDetector mEventDetector;
    public KTvInputSessionWorker(Context context, KChannelDataManager channelDataManager,
        KDataSourceManager dataSourceManager, KEventDetector eventDetector) {
        mContext = context;
        mChannelDataManager = channelDataManager;
        mDataSourceManager = dataSourceManager;
        mEventDetector = eventDetector;
    }

}
