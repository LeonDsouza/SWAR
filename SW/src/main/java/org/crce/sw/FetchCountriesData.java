/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crce.sw;

import org.apache.jena.query.ParameterizedSparqlString;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;

/**
 *
 * @author Leon
 */
public class FetchCountriesData {

    public void getCountriesInformation() {
        ParameterizedSparqlString qs = new ParameterizedSparqlString("PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \n "
                + "SELECT * {?Subject rdf:type <http://dbpedia.org/ontology/Country> . ?Subject ?Predicate ?Object } ORDER BY ?Subject ");

        QueryExecution exec = QueryExecutionFactory.sparqlService("https://dbpedia.org/sparql", qs.asQuery());
        //exec.setTimeout(10000000);
        exec.setTimeout(-123);
        ResultSet results = exec.execSelect();
        ResultSetFormatter.out(results);
    }
}
