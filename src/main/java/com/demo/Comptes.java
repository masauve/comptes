package com.demo;

public class Comptes {
    private String id;
    private String nom;
    private String courriel;
    private String equipe;
    
    public  Comptes (String id,  String nom, String courriel, String equipe)
    {
        this.id = id;
        this.nom = nom;
        this.courriel = courriel;
        this.equipe = equipe;
    }
    
    public String toJSON ()
    {
        return "{ \"data\": {\"id\": \""+this.id+"\",\"nom\": \""+this.nom+"\", \"courriel\": \""+this.courriel+"\", \"equipe\": \""+this.equipe+"\"}  }";
    }

}
