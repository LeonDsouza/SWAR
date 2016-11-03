/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crce.sw;

/**
 *
 * @author Leon
 */
public class Main {
    public static void main(String [] args){
        FetchCountryData fetchCountryData = new FetchCountryData();
        fetchCountryData.fetchData();
        FetchCountriesData fetchCountriesData = new FetchCountriesData();
        fetchCountriesData.getCountriesInformation();
    }
}
