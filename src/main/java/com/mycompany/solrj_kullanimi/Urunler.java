/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solrj_kullanimi;

import org.apache.solr.client.solrj.beans.Field;

/**
 *
 * @author beyza.suna
 */
public class Urunler {
    
    String id;
    String baslik;
    String fiyat;
    String türü;
   

    public Urunler(String id, String baslik, String fiyat, String türü) {
        super();
        this.id = id;
        this.baslik = baslik;
        this.fiyat = fiyat;
        this.türü=türü;
    }
    
      public String getId() {
        return id;
    }

    @Field("id")
    protected void setId(String id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    @Field("baslik")
    protected void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getFiyat() {
        return fiyat;
    }

    @Field("fiyat")
    protected void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }
        public String getTürü() {
        return türü;
    }

    @Field("türü")
    protected void setTürü(String türü) {
        this.türü = türü;
    }
    
 
    // getters and constructor omitted for space
}
