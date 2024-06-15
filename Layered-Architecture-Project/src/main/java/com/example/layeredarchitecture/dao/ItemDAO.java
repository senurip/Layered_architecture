package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;

    public void saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public void updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public boolean exitItem(String code) throws SQLException, ClassNotFoundException;

    public void deleteItems(String code) throws SQLException, ClassNotFoundException;

    public String generateId() throws SQLException, ClassNotFoundException;

    public ItemDTO findItem (String code) throws SQLException, ClassNotFoundException ;
}