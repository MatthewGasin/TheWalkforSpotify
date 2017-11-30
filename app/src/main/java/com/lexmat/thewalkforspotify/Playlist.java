package com.lexmat.thewalkforspotify;


public class Playlist {

    private String[] catagories;
    /*
    * represents what the playlist is categorised as
    * ex: ["Evening","Warm","Cheerful","Beach"]
     */
    private String URI;
    private String name;

    public Playlist(String[] catagories, String URI, String name) {
        this.catagories = catagories;
        this.URI = URI;
        this.name = name;
    }

    public String[] getCatagories() {
        return catagories;
    }

    public void setCatagories(String[] catagories) {
        this.catagories = catagories;
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Playlist other){
        return getURI().equals(other.URI);
    }


    public int compareTo(Playlist other){
        int len = getCatagories().length;
        if(len == other.getCatagories().length) {
            for (int i = 0; i < len; i++) {
                int cur = getCatagories()[i].compareTo(other.getCatagories()[i]);
                if(cur != 0){
                    return cur;
                }
            }
        }
        return 0;
    }
}
