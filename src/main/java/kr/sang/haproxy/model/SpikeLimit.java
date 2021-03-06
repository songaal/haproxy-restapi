package kr.sang.haproxy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * SpikeLimit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-30T06:16:08.273Z")

public class SpikeLimit   {
  @JsonProperty("sampleTime")
  private String sampleTime = null;

  @JsonProperty("expiryTime")
  private String expiryTime = null;

  @JsonProperty("rate")
  private Long rate = null;

  public SpikeLimit sampleTime(String sampleTime) {
    this.sampleTime = sampleTime;
    return this;
  }

   /**
   * Get sampleTime
   * @return sampleTime
  **/
  @ApiModelProperty(value = "")


  public String getSampleTime() {
    return sampleTime;
  }

  public void setSampleTime(String sampleTime) {
    this.sampleTime = sampleTime;
  }

  public SpikeLimit expiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

   /**
   * Get expiryTime
   * @return expiryTime
  **/
  @ApiModelProperty(value = "")


  public String getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(String expiryTime) {
    this.expiryTime = expiryTime;
  }

  public SpikeLimit rate(Long rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(value = "")


  public Long getRate() {
    return rate;
  }

  public void setRate(Long rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpikeLimit spikeLimit = (SpikeLimit) o;
    return Objects.equals(this.sampleTime, spikeLimit.sampleTime) &&
        Objects.equals(this.expiryTime, spikeLimit.expiryTime) &&
        Objects.equals(this.rate, spikeLimit.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sampleTime, expiryTime, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpikeLimit {\n");
    
    sb.append("    sampleTime: ").append(toIndentedString(sampleTime)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

