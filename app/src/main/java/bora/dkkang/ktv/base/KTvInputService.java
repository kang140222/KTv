package bora.dkkang.ktv.base;

public abstract class KTvInputService {
    public abstract KChannelDataManager createOrGetChannelDataManager();

    public KTvInputService() {
        KChannelDataManager channelDataManager = createOrGetChannelDataManager();

    }
}
