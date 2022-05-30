package com.company;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "results"
})
@Generated("jsonschema2pojo")
public class Gif {

    @JsonProperty("results")
    private List<Result> results = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Gif() {
    }

    /**
     *
     * @param results
     */
    public Gif(List<Result> results) {
        super();
        this.results = results;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Gif.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "anime_name",
        "url"
})
@Generated("jsonschema2pojo")
class Result {

    @JsonProperty("anime_name")
    private String animeName;
    @JsonProperty("url")
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Result() {
    }

    /**
     *
     * @param animeName
     * @param url
     */
    public Result(String animeName, String url) {
        super();
        this.animeName = animeName;
        this.url = url;
    }

    @JsonProperty("anime_name")
    public String getAnimeName() {
        return animeName;
    }

    @JsonProperty("anime_name")
    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("animeName");
        sb.append('=');
        sb.append(((this.animeName == null)?"<null>":this.animeName));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
