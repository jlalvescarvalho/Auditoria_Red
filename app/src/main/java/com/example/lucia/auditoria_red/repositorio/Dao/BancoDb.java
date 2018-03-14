package com.example.lucia.auditoria_red.repositorio.Dao;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoDb extends SQLiteOpenHelper{

    private static String NOME_DB = "MyDB";
    private static int VERSAO = 1;
    public static String TABELA_CLIENTE = "TABELA_CLIENTE";

    private static BancoDb mySelf;

    public static BancoDb getInstance(){
        if(mySelf == null) new BancoDb();
        return mySelf;
    }


    private BancoDb() {
        super(MyApp.getContext(), NOME_DB, null, VERSAO);
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
