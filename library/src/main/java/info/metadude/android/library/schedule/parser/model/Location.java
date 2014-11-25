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
        "event",
        "floor",
        "id",
        "is_stage",
        "label_en",
        "order_index",
        "type"
})
public class Location {

    @JsonProperty("event")
    private String event;

    @JsonProperty("floor")
    private Integer floor;

    @JsonProperty("id")
    private String id;

    @JsonProperty("is_stage")
    private Boolean isStage;

    @JsonProperty("label_en")
    private String labelEn;

    @JsonProperty("order_index")
    private Integer orderIndex;

    @JsonProperty("type")
    private String type;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * @return The floor
     */
    @JsonProperty("floor")
    public Integer getFloor() {
        return floor;
    }

    /**
     * @param floor The floor
     */
    @JsonProperty("floor")
    public void setFloor(Integer floor) {
        this.floor = floor;
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
     * @return The isStage
     */
    @JsonProperty("is_stage")
    public Boolean getIsStage() {
        return isStage;
    }

    /**
     * @param isStage The is_stage
     */
    @JsonProperty("is_stage")
    public void setIsStage(Boolean isStage) {
        this.isStage = isStage;
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
     * @return The orderIndex
     */
    @JsonProperty("order_index")
    public Integer getOrderIndex() {
        return orderIndex;
    }

    /**
     * @param orderIndex The order_index
     */
    @JsonProperty("order_index")
    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
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
