package info.metadude.android.library.schedule.parser.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "date",
        "event",
        "id",
        "label_de",
        "label_en",
        "type"
})
public class Day {

    @JsonProperty("date")
    private String date;

    @JsonProperty("event")
    private String event;

    @JsonProperty("id")
    private String id;

    @JsonProperty("label_de")
    private String labelDe;

    @JsonProperty("label_en")
    private String labelEn;

    @JsonProperty("type")
    private String type;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * @param date The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
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
     * @return The labelDe
     */
    @JsonProperty("label_de")
    public String getLabelDe() {
        return labelDe;
    }

    /**
     * @param labelDe The label_de
     */
    @JsonProperty("label_de")
    public void setLabelDe(String labelDe) {
        this.labelDe = labelDe;
    }

    /**
     * @return The labelEn
     */
    @JsonProperty("label_en")
    public String getLabelEn() {
        return labelEn;
    }

    /**
     * @param labelEn The label_en
     */
    @JsonProperty("label_en")
    public void setLabelEn(String labelEn) {
        this.labelEn = labelEn;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
