/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solrj_kullanimi;

import java.io.IOException;
import org.apache.solr.client.solrj.SolrServerException;
/**
 *
 * @author beyza.suna
 */
public class AnaSayfa {

    /**
     * @param args the command line arguments
     * @throws org.apache.solr.client.solrj.SolrServerException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws SolrServerException, IOException {
        // TODO code application logic here
        String solrUrl="http://localhost:8983/solr/deneme1";
        SolrBaglanti solrBaglanti=new SolrBaglanti(solrUrl);
        
        
        //Urunler - Bean sınıfını kullanarak ekleme
        solrBaglanti.addUrunlerBean(new Urunler("1", "elbise", "59.99","kıyafet"));
        
        //SolrInputDocument sınıfını kullanarak ekleme
        solrBaglanti.addSolrDocument("2", "ıphone x", "9999.99", "telefon");
        
        
        /*Silmek için
        solrBaglanti.deleteSolrDocumentById("2");
        solrBaglanti.deleteSolrDocumentByQuery("id:1");*/
        
        /*basit aramayı görmek için
        solrBaglanti.searchQuery("elbise");*/
    }
    
}
