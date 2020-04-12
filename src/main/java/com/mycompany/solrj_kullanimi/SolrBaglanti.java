/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solrj_kullanimi;

import java.io.IOException;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
/**
 *
 * @author beyza.suna
 */
public class SolrBaglanti {


    private HttpSolrClient solrClient;

    public SolrBaglanti(String clientUrl) {

        solrClient = new HttpSolrClient.Builder(clientUrl).build();
        solrClient.setParser(new XMLResponseParser());
    }

    public void addUrunlerBean(Urunler urunlerBean) throws IOException, SolrServerException {

        solrClient.addBean(urunlerBean);
        solrClient.commit();
    }

    public void addSolrDocument(String documentId, String urunAdi, String urunFiyati, String urunTürü) throws SolrServerException, IOException {

        SolrInputDocument document = new SolrInputDocument();
        document.addField("id", documentId);
        document.addField("baslik", urunAdi);
        document.addField("fiyat", urunFiyati);
        document.addField("türü", urunTürü);
        solrClient.add(document);
        solrClient.commit();
    }

    public void deleteSolrDocumentById(String documentId) throws SolrServerException, IOException {

        solrClient.deleteById(documentId);
        solrClient.commit();
    }

    public void deleteSolrDocumentByQuery(String query) throws SolrServerException, IOException {

        solrClient.deleteByQuery(query);
        solrClient.commit();
    }
    public void searchQuery(String query1)  throws SolrServerException, IOException {
        SolrQuery query = new SolrQuery();
        query.setQuery(query1);
        //query.setFields("alan","alan","alan"); //isteğe göre
        query.setStart(0);

        QueryResponse response = solrClient.query(query);
        SolrDocumentList results = response.getResults();
        System.out.println(results);
        /*for (int i = 0; i < results.size(); ++i) {
            System.out.println(results.get(i));
        }*/
    
    }

    protected HttpSolrClient getSolrClient() {
        return solrClient;
    }

    protected void setSolrClient(HttpSolrClient solrClient) {
        this.solrClient = solrClient;
    }

}

