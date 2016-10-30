/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Checks whether service is up or not! Can be heralded as Base Abstract class for Connection Check
 */
package org.crce.sw;

import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.sparql.engine.http.QueryExceptionHTTP;

/**
 *
 * @author Leon
 */
public class ThirdAttempt {
    public static void main(String [] args){
        String service = "http://dbpedia.org/sparql";
        String query = "ASK{ }";  //ask query
        
        QueryExecution qe = QueryExecutionFactory.sparqlService(service, query);
        qe.setTimeout(1000000000);  //increase timeout! Slow Internet Problems for me!
        try{
        if(qe.execAsk()){
            System.out.println(service+ " is  UP");  //check if service works
        }
        }catch(QueryExceptionHTTP e){
            System.out.println(service + " is down");
        }
        finally{
            qe.close();
        }
    }
}
