/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isi.diti5.service;


import com.isi.diti5.model.Client;
import com.isi.diti5.utils.HibernateUtil;
import org.hibernate.Session;


import javax.ejb.Stateless;

/**
 *
 * @author mac
 */
@Stateless
public class ClientFacade extends AbstractFacade<Client> implements ClientFacadeLocal {
    private Session  session;
    @Override
    protected Session getSession() {
        session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }

    public ClientFacade() {
        super(Client.class);
    }


    
}