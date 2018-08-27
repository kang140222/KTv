package bora.dkkang.ktv.base;
import android.content.Context;
import android.media.tv.TvInputService;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class KPlayingSession extends TvInputService.Session {
    private final Context mContext;
    private final View mOverlayView;
    private final TextView mMessageView;
    private final TextView mTunerStatusView;
    private final TextView mAudioStatusView;
    private final KSubtitleView mSubtitleView;
    private final ViewGroup mMessageLayout;
    private final KPlayingSessionWorker mSessionWorker;
    private boolean mReleased = false;

    private final String mInputId;

    public static final int MSG_UI_SHOW_MESSAGE = 1;
    public static final int MSG_UI_HIDE_MESSAGE = 2;
    public static final int MSG_UI_SHOW_AUDIO_UNPLAYABLE = 3;
    public static final int MSG_UI_HIDE_AUDIO_UNPLAYABLE = 4;
    public static final int MSG_UI_SET_STATUS_TEXT = 5;

    public KPlayingSession(Context context, String inputId, KModuleFactory moduleFactory) {
        super(context);
        mContext = context;
        mInputId = inputId;

        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mOverlayView = inflater.inflate(R.layout.overlay_view, null);
        mMessageLayout = (ViewGroup) mOverlayView.findViewById(R.id.message_layout);
        mMessageLayout.setVisibility(View.INVISIBLE);
        mMessageView = (TextView) mOverlayView.findViewById(R.id.message);
        mTunerStatusView = (TextView) mOverlayView.findViewById(R.id.tuner_status);
        mTunerStatusView.setVisibility(View.INVISIBLE);
        mAudioStatusView = (TextView) mOverlayView.findViewById(R.id.audio_status);
        mAudioStatusView.setVisibility(View.INVISIBLE);
        mSubtitleView = (KSubtitleView) mOverlayView.findViewById(R.id.subtitleview);
        mSessionWorker = new KPlayingSessionWorker(context, moduleFactory);
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
