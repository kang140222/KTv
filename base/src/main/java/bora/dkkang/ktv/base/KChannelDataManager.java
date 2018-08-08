package bora.dkkang.ktv.base;

public abstract class KChannelDataManager {
    public KChannelDataManager() {

    }
    public abstract boolean tune(String sessionId, KTuneParam param);
    public abstract KTsDataSource getTsDataSource(String sessionId);
    public abstract KSectionDataSource getSectionDataSource(String sessionId);
}
