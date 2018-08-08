package bora.dkkang.ktv.base;
import android.content.Context;


public class KTvInputSession {
    private final KTvInputSessionWorker mSessionWorker;
    private final String mSessionId;
    public KTvInputSession(Context context, String sessionId, KTvInputSessionWorker sessionWorker) {
        mSessionWorker = sessionWorker;
        mSessionId = sessionId;
    }
}
