package dkkang.bora.yongin.mylibrary;

import bora.dkkang.ktv.base.KChannelDataManager;
import bora.dkkang.ktv.base.KSectionDataSource;
import bora.dkkang.ktv.base.KTsDataSource;
import bora.dkkang.ktv.base.KTuneParam;

public class KDvbChannelDataManager extends KChannelDataManager {
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
