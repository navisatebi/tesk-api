package uk.ac.ebi.tsc.tesk.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.Valid;
import javax.validation.constraints.*;

import static uk.ac.ebi.tsc.tesk.util.constant.Constants.ABSOLUTE_PATH_MESSAGE;
import static uk.ac.ebi.tsc.tesk.util.constant.Constants.ABSOLUTE_PATH_REGEXP;

/**
 * Input describes Task input.json files.
 */
@ApiModel(description = "Input describes Task input.json files.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-16T12:59:29.706Z")
@ScriptAssert(lang = "javascript", script = "(_this.url != null && (_this.url.trim().length) > 0) || (_this.content != null && _this.content.length > 0)", message = "URL or content required")
public class TesInput   {
  @ApiModelProperty(example = "File from HTTP")
  @JsonProperty("name")
  private String name = null;

  @ApiModelProperty(example = "Downloading a single file from HTTP")
  @JsonProperty("description")
  private String description = null;

  @ApiModelProperty(example = "https://raw.githubusercontent.com/EMBL-EBI-TSI/TESK/master/examples/success/hello.json")
  @JsonProperty("url")
  private String url = null;

  @ApiModelProperty(example = "/tes/input")
  @Pattern(regexp = ABSOLUTE_PATH_REGEXP, message = ABSOLUTE_PATH_MESSAGE)
  @NotBlank
  @JsonProperty("path")
  private String path = null;

  @ApiModelProperty(example = "FILE")
  @NotNull
  @JsonProperty("type")
  private TesFileType type = null;

  @ApiModelProperty(hidden = true)
  @JsonProperty("content")
  private String content = null;

  public TesInput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TesInput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TesInput url(String url) {
    this.url = url;
    return this;
  }

   /**
   * REQUIRED, unless \"content\" is set.  URL in long term storage, for example: s3://my-object-store/file1 gs://my-bucket/file2 file:///path/to/my/file /path/to/my/file etc...
   * @return url
  **/
  @ApiModelProperty(value = "REQUIRED, unless \"content\" is set.  URL in long term storage, for example: s3://my-object-store/file1 gs://my-bucket/file2 file:///path/to/my/file /path/to/my/file etc...")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public TesInput path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path of the file inside the container. Must be an absolute path.
   * @return path
  **/
  @ApiModelProperty(value = "Path of the file inside the container. Must be an absolute path.")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public TesInput type(TesFileType type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the file, FILE or DIRECTORY
   * @return type
  **/
  @ApiModelProperty(value = "Type of the file, FILE or DIRECTORY")

  @Valid

  public TesFileType getType() {
    return type;
  }

  public void setType(TesFileType type) {
    this.type = type;
  }

  public TesInput content(String content) {
    this.content = content;
    return this;
  }

   /**
   * File content literal.  Implementations should support a minimum of 128 KiB in this field and may define its own maximum. UTF-8 encoded  If content is not empty, \"url\" must be ignored.
   * @return content
  **/
  @ApiModelProperty(value = "File content literal.  Implementations should support a minimum of 128 KiB in this field and may define its own maximum. UTF-8 encoded  If content is not empty, \"url\" must be ignored.")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TesInput tesInput = (TesInput) o;
    return Objects.equals(this.name, tesInput.name) &&
        Objects.equals(this.description, tesInput.description) &&
        Objects.equals(this.url, tesInput.url) &&
        Objects.equals(this.path, tesInput.path) &&
        Objects.equals(this.type, tesInput.type) &&
        Objects.equals(this.content, tesInput.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, url, path, type, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TesInput {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

