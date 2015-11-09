/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.JsonEntities;

import com.br.lp3.entities.Historia;
import com.br.lp3.entities.Vestimenta;

/**
 *
 * @author willi
 */
public class HeroiJson {
    private int idHeroi;
    
    private String nomeHeroi;
    
    private String nomeCriador;
    
    private String capacete;
    
    private String corpo;
    
    private String introducaoHistoria;
    
    private String meioHistoria;
    
    private String finalHistoria;

    public HeroiJson() {
    }

    public HeroiJson(int idHeroi, String nomeHeroi, String nomeCriador, String capacete, String corpo, String introducaoHistoria, String meioHistoria, String finalHistoria) {
        this.idHeroi = idHeroi;
        this.nomeHeroi = nomeHeroi;
        this.nomeCriador = nomeCriador;
        this.capacete = capacete;
        this.corpo = corpo;
        this.introducaoHistoria = introducaoHistoria;
        this.meioHistoria = meioHistoria;
        this.finalHistoria = finalHistoria;
    }

    public int getIdHeroi() {
        return idHeroi;
    }

    public void setIdHeroi(int idHeroi) {
        this.idHeroi = idHeroi;
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public String getNomeCriador() {
        return nomeCriador;
    }

    public void setNomeCriador(String nomeCriador) {
        this.nomeCriador = nomeCriador;
    }

    public String getCapacete() {
        return capacete;
    }

    public void setCapacete(String capacete) {
        this.capacete = capacete;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getIntroducaoHistoria() {
        return introducaoHistoria;
    }

    public void setIntroducaoHistoria(String introducaoHistoria) {
        this.introducaoHistoria = introducaoHistoria;
    }

    public String getMeioHistoria() {
        return meioHistoria;
    }

    public void setMeioHistoria(String meioHistoria) {
        this.meioHistoria = meioHistoria;
    }

    public String getFinalHistoria() {
        return finalHistoria;
    }

    public void setFinalHistoria(String finalHistoria) {
        this.finalHistoria = finalHistoria;
    }

    
}
