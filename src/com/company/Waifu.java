//-----------------------------------com.example.Image.java-----------------------------------
package com.company;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "file",
        "extension",
        "image_id",
        "favourites",
        "dominant_color",
        "source",
        "uploaded_at",
        "is_nsfw",
        "width",
        "height",
        "url",
        "preview_url",
        "tags"
})
@Generated("jsonschema2pojo")
 class Image {

    @JsonProperty("file")
    private String file;
    @JsonProperty("extension")
    private String extension;
    @JsonProperty("image_id")
    private int imageId;
    @JsonProperty("favourites")
    private int favourites;
    @JsonProperty("dominant_color")
    private String dominantColor;
    @JsonProperty("source")
    private String source;
    @JsonProperty("uploaded_at")
    private String uploadedAt;
    @JsonProperty("is_nsfw")
    private boolean isNsfw;
    @JsonProperty("width")
    private int width;
    @JsonProperty("height")
    private int height;
    @JsonProperty("url")
    private String url;
    @JsonProperty("preview_url")
    private String previewUrl;
    @JsonProperty("tags")
    private List<Tag> tags = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Image() {
    }

    /**
     *
     * @param extension
     * @param imageId
     * @param previewUrl
     * @param favourites
     * @param isNsfw
     * @param source
     * @param url
     * @param tags
     * @param dominantColor
     * @param file
     * @param width
     * @param uploadedAt
     * @param height
     */
    public Image(String file, String extension, int imageId, int favourites, String dominantColor, String source, String uploadedAt, boolean isNsfw, int width, int height, String url, String previewUrl, List<Tag> tags) {
        super();
        this.file = file;
        this.extension = extension;
        this.imageId = imageId;
        this.favourites = favourites;
        this.dominantColor = dominantColor;
        this.source = source;
        this.uploadedAt = uploadedAt;
        this.isNsfw = isNsfw;
        this.width = width;
        this.height = height;
        this.url = url;
        this.previewUrl = previewUrl;
        this.tags = tags;
    }

    @JsonProperty("file")
    public String getFile() {
        return file;
    }

    @JsonProperty("file")
    public void setFile(String file) {
        this.file = file;
    }

    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    @JsonProperty("image_id")
    public int getImageId() {
        return imageId;
    }

    @JsonProperty("image_id")
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @JsonProperty("favourites")
    public int getFavourites() {
        return favourites;
    }

    @JsonProperty("favourites")
    public void setFavourites(int favourites) {
        this.favourites = favourites;
    }

    @JsonProperty("dominant_color")
    public String getDominantColor() {
        return dominantColor;
    }

    @JsonProperty("dominant_color")
    public void setDominantColor(String dominantColor) {
        this.dominantColor = dominantColor;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("uploaded_at")
    public String getUploadedAt() {
        return uploadedAt;
    }

    @JsonProperty("uploaded_at")
    public void setUploadedAt(String uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    @JsonProperty("is_nsfw")
    public boolean isIsNsfw() {
        return isNsfw;
    }

    @JsonProperty("is_nsfw")
    public void setIsNsfw(boolean isNsfw) {
        this.isNsfw = isNsfw;
    }

    @JsonProperty("width")
    public int getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(int width) {
        this.width = width;
    }

    @JsonProperty("height")
    public int getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(int height) {
        this.height = height;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("preview_url")
    public String getPreviewUrl() {
        return previewUrl;
    }

    @JsonProperty("preview_url")
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("file");
        sb.append('=');
        sb.append(((this.file == null)?"<null>":this.file));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("imageId");
        sb.append('=');
        sb.append(this.imageId);
        sb.append(',');
        sb.append("favourites");
        sb.append('=');
        sb.append(this.favourites);
        sb.append(',');
        sb.append("dominantColor");
        sb.append('=');
        sb.append(((this.dominantColor == null)?"<null>":this.dominantColor));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("uploadedAt");
        sb.append('=');
        sb.append(((this.uploadedAt == null)?"<null>":this.uploadedAt));
        sb.append(',');
        sb.append("isNsfw");
        sb.append('=');
        sb.append(this.isNsfw);
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(this.width);
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(this.height);
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("previewUrl");
        sb.append('=');
        sb.append(((this.previewUrl == null)?"<null>":this.previewUrl));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
//-----------------------------------com.example.Tag.java-----------------------------------


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tag_id",
        "name",
        "description",
        "is_nsfw"
})
@Generated("jsonschema2pojo")
 class Tag {

    @JsonProperty("tag_id")
    private int tagId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("is_nsfw")
    private boolean isNsfw;

    /**
     * No args constructor for use in serialization
     *
     */
    public Tag() {
    }

    /**
     *
     * @param tagId
     * @param isNsfw
     * @param name
     * @param description
     */
    public Tag(int tagId, String name, String description, boolean isNsfw) {
        super();
        this.tagId = tagId;
        this.name = name;
        this.description = description;
        this.isNsfw = isNsfw;
    }

    @JsonProperty("tag_id")
    public int getTagId() {
        return tagId;
    }

    @JsonProperty("tag_id")
    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("is_nsfw")
    public boolean isIsNsfw() {
        return isNsfw;
    }

    @JsonProperty("is_nsfw")
    public void setIsNsfw(boolean isNsfw) {
        this.isNsfw = isNsfw;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tag.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tagId");
        sb.append('=');
        sb.append(this.tagId);
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("isNsfw");
        sb.append('=');
        sb.append(this.isNsfw);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
//-----------------------------------com.example.Waifu.java-----------------------------------
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "code",
        "images"
})
@Generated("jsonschema2pojo")
public class Waifu {

    @JsonProperty("code")
    private int code;
    @JsonProperty("images")
    private List<Image> images = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Waifu() {
    }

    /**
     *
     * @param images
     * @param code
     */
    public Waifu(int code, List<Image> images) {
        super();
        this.code = code;
        this.images = images;
    }

    @JsonProperty("code")
    public int getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(int code) {
        this.code = code;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Waifu.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(this.code);
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
