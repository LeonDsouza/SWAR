/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Used for creating a Turtle file for own ontology if required!
 */
package org.crce.sw;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.rdf.model.Property;

/**
 *
 * @author Leon
 */
public class FirstAttempt {

    public static void main(String[] args) {

        Model m = ModelFactory.createDefaultModel();
        String NS = "http://example.com/test/";
        
        Resource r = m.createResource(NS + "r");
        Property p = m.createProperty(NS + "p");
        
        r.addProperty(p, "First Test", XSDDatatype.XSDstring);
        
        m.write(System.out, "Turtle");

    }
}
