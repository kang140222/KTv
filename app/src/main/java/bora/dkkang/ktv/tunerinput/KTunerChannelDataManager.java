package bora.dkkang.ktv.tunerinput;

import bora.dkkang.ktv.base.KChannelDataManager;

public class KTunerChannelDataManager extends KChannelDataManager{
    private final KTunerHal mTunerHal;
    public KTunerChannelDataManager(KTunerHal tunerHal) {
        mTunerHal = tunerHal;
    }
}
