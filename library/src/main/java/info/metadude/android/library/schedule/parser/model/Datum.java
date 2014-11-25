package info.metadude.android.library.schedule.parser.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "abstract",
        "begin",
        "day",
        "description",
        "enclosures",
        "end",
        "event",
        "format",
        "id",
        "lang",
        "last_modified",
        "level",
        "links",
        "location",
        "speakers",
        "title",
        "track",
        "type",
        "url"
})
public class Datum {

    @JsonProperty("abstract")
    private String _abstract;

    @JsonProperty("begin")
    private String begin;

    @JsonProperty("day")
    private Day day;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enclosures")
    private List<Enclosure> enclosures = new ArrayList<Enclosure>();

    @JsonProperty("end")
    private String end;

    @JsonProperty("event")
    private String event;

    @JsonProperty("format")
    private Format format;

    @JsonProperty("id")
    private String id;

    @JsonProperty("lang")
    private Lang lang;

    @JsonProperty("last_modified")
    private Double lastModified;

    @JsonProperty("level")
    private Level level;

    @JsonProperty("links")
    private List<Object> links = new ArrayList<Object>();

    @JsonProperty("location")
    private Location location;

    @JsonProperty("speakers")
    private List<Speaker> speakers = new ArrayList<Speaker>();

    @JsonProperty("title")
    private String title;

    @JsonProperty("track")
    private Track track;

    @JsonProperty("type")
    private String type;

    @JsonProperty("url")
    private String url;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The _abstract
     */
    @JsonProperty("abstract")
    public String getAbstract() {
        return _abstract;
    }

    /**
     * @param _abstract The abstract
     */
    @JsonProperty("abstract")
    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    /**
     * @return The begin
     */
    @JsonProperty("begin")
    public String getBegin() {
        return begin;
    }

    /**
     * @param begin The begin
     */
    @JsonProperty("begin")
    public void setBegin(String begin) {
        this.begin = begin;
    }

    /**
     * @return The day
     */
    @JsonProperty("day")
    public Day getDay() {
        return day;
    }

    /**
     * @param day The day
     */
    @JsonProperty("day")
    public void setDay(Day day) {
        this.day = day;
    }

    /**
     * @return The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The enclosures
     */
    @JsonProperty("enclosures")
    public List<Enclosure> getEnclosures() {
        return enclosures;
    }

    /**
     * @param enclosures The enclosures
     */
    @JsonProperty("enclosures")
    public void setEnclosures(List<Enclosure> enclosures) {
        this.enclosures = enclosures;
    }

    /**
     * @return The end
     */
    @JsonProperty("end")
    public String getEnd() {
        return end;
    }

    /**
     * @param end The end
     */
    @JsonProperty("end")
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * @return The event
     */
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    /**
     * @param event The event
     */
    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * @return The format
     */
    @JsonProperty("format")
    public Format getFormat() {
        return format;
    }

    /**
     * @param format The format
     */
    @JsonProperty("format")
    public void setFormat(Format format) {
        this.format = format;
    }

    /**
     * @return The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The lang
     */
    @JsonProperty("lang")
    public Lang getLang() {
        return lang;
    }

    /**
     * @param lang The lang
     */
    @JsonProperty("lang")
    public void setLang(Lang lang) {
        this.lang = lang;
    }

    /**
     * @return The lastModified
     */
    @JsonProperty("last_modified")
    public Double getLastModified() {
        return lastModified;
    }

    /**
     * @param lastModified The last_modified
     */
    @JsonProperty("last_modified")
    public void setLastModified(Double lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * @return The level
     */
    @JsonProperty("level")
    public Level getLevel() {
        return level;
    }

    /**
     * @param level The level
     */
    @JsonProperty("level")
    public void setLevel(Level level) {
        this.level = level;
    }

    /**
     * @return The links
     */
    @JsonProperty("links")
    public List<Object> getLinks() {
        return links;
    }

    /**
     * @param links The links
     */
    @JsonProperty("links")
    public void setLinks(List<Object> links) {
        this.links = links;
    }

    /**
     * @return The location
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * @param location The location
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @return The speakers
     */
    @JsonProperty("speakers")
    public List<Speaker> getSpeakers() {
        return speakers;
    }

    /**
     * @param speakers The speakers
     */
    @JsonProperty("speakers")
    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    /**
     * @return The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The track
     */
    @JsonProperty("track")
    public Track getTrack() {
        return track;
    }

    /**
     * @param track The track
     */
    @JsonProperty("track")
    public void setTrack(Track track) {
        this.track = track;
    }

    /**
     * @return The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
