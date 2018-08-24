package bora.dkkang.ktv.packages.projects.jom.tunerinput;

import bora.dkkang.ktv.base.KChannelDataManager;
import bora.dkkang.ktv.base.KSectionDataSource;
import bora.dkkang.ktv.base.KTsDataSource;
import bora.dkkang.ktv.base.KTuneParam;

public class KTunerChannelDataManager extends KChannelDataManager{
    private final KTunerHal mTunerHal;
    public KTunerChannelDataManager(KTunerHal tunerHal) {
        mTunerHal = tunerHal;
    }

    @Override
    public boolean tune(String sessionId, KTuneParam param) {
        return false;
    }

    @Override
    public KTsDataSource getTsDataSource(String sessionId) {
        return null;
    }

    @Override
    public KSectionDataSource getSectionDataSource(String sessionId) {
        return null;
    }
}
