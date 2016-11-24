package si.kavica;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import si.kavica.database.DaoMaster;
import si.kavica.database.DaoSession;

/**
 * Created by Gregor on 23. 11. 2016.
 */

public class KavicaApp extends Application {

    private static DaoSession daoSession;

    public static DaoSession getDaoSession() {
        return daoSession;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "kavica-db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }
}
