/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author u07785254141
 */
public abstract class DaoAbstract {
    public abstract void insert(Object object);
       public abstract void update(Object object);
           public abstract void delet(Object object);
           public abstract void list(Object object);
           public abstract Object listAll();
}
