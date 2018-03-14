package com.example.lucia.auditoria_red.repositorio.Dao;


import android.database.sqlite.SQLiteDatabase;

public class CriacaoDeTabelas {

    public void CriarTabelaCliente(){
        SQLiteDatabase db = BancoDb.getInstance().getWritableDatabase();
        String colunas = "(ID/CODIGO INTEGER, NOME TEXT, LOGRADOURO TEXT, CIDADE TEXT, SUBCANAL INTEGER)";
        String query = "CREATE TABLE IF NOT EXIST"+BancoDb.TABELA_CLIENTE+colunas;
        db.execSQL(query);
    }
}
