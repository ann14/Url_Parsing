package com.company;

public class ParseUrl {
    private String protocol;
    private String host;
    private String path;
    private String filename;
    private String query;

    public void parse(String urlString){
        this.protocol=urlString.substring(urlString.indexOf('h'),urlString.indexOf(':'));
        String h=urlString.substring(urlString.indexOf('h')+8);
        this.host=h.substring(0,h.indexOf('/'));
        this.path=h.substring(h.indexOf('/'),h.lastIndexOf('/')+1);
        String p=h.substring(h.indexOf('/')+1);
        this.filename=p.substring(p.indexOf('/')+1,p.indexOf('?'));
        this.query=urlString.substring(urlString.indexOf('?')+1);




    }
    public String toString(){
        return "protocol: "+protocol+"\nhost: "+host+"\npath: "+path+"\nfilename: "+filename+"\nquery: "+query;


    }

}
