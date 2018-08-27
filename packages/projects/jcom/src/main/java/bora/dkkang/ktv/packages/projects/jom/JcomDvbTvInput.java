package bora.dkkang.ktv.packages.projects.jom;

import bora.dkkang.ktv.base.KChannelDataManager;
import bora.dkkang.ktv.base.KDataSourceManager;
import bora.dkkang.ktv.base.KEventDetector;
import bora.dkkang.ktv.base.KModuleFactory;
import bora.dkkang.ktv.base.KTvInputService;
import bora.dkkang.ktv.base.KTvPlayer;
import dkkang.bora.yongin.mylibrary.KDvbChannelDataManager;
import dkkang.bora.yongin.mylibrary.KDvbDataSourceManager;
import dkkang.bora.yongin.mylibrary.KDvbEventDetector;
import dkkang.bora.yongin.mylibrary.KDvbTvPlayer;

public class JcomDvbTvInput extends KTvInputService{
    @Override
    public KModuleFactory createModuleFactory() {
        return new KModuleFactory() {
            @Override
            public KChannelDataManager createChannelDataManager() {
                return new KDvbChannelDataManager();
            }

            @Override
            public KDataSourceManager createDataSourceManager() {
                return new KDvbDataSourceManager();
            }

            @Override
            public KEventDetector createEventDetector() {
                return new KDvbEventDetector();
            }

            @Override
            public KTvPlayer createTvPlayer() {
                return new KDvbTvPlayer();
            }
        };
    }
}
