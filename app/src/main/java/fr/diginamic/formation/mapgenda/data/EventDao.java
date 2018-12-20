package fr.diginamic.formation.mapgenda.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class EventDao extends SQLiteOpenHelper {

    private static EventDao sInstance;



    private static final String DATABASE_NAME = "mapGendaDatabase";
    private static final int DATABASE_VERSION = 1;

    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_POS_X = "longitude";
    private static final String KEY_POS_Y = "latitude";
    private static final String KEY_STARTING_DATE = "startingDate";
    private static final String KEY_ENDING_DATE = "endingDate";


    private static final String TABLE_EVENT = "EVENT";


    //récupère tous les events
    private static final String QUERY_SELECT_ALL_EVENT = "";
    //récupère les events dont la date de fin est avant la date sélectionnée
    private static final String QUERY_SELECT_EVENT_UNTIL_DATE = "";


    public static synchronized EventDao getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new EventDao(context.getApplicationContext());
        }
        return sInstance;
    }

    private EventDao(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_EVENT);
            onCreate(db);
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_EVENT_TABLE = "CREATE TABLE " +
                TABLE_EVENT + "(" +
                KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                KEY_NAME + " VARCHAR(100)," +
                KEY_DESCRIPTION + " TEXT," +
                KEY_POS_X + " REAL," +
                KEY_POS_Y + " REAL," +
                KEY_STARTING_DATE + " DATE," +
                KEY_ENDING_DATE + " DATE" +
                ")";

        db.execSQL(CREATE_EVENT_TABLE);

    }

}
