package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.NotNull;

/**
 * Stake pool relay.
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Relay {

  /**
   * DNS name.
   */
  private String dns;

  /**
   * IPv4 address.
   */
  private String ipv4;

  /**
   * IPv6 address.
   */
  private String ipv6;

  /**
   * Port number.
   */
  private Integer port;

  /**
   * SRV record.
   */
  private String srv;

  /**
   * Default no-argument constructor.
   */
  public Relay() {
  }

  /**
   * Constructor with all fields.
   * 
   * @param dns the DNS name
   * @param ipv4 the IPv4 address
   * @param ipv6 the IPv6 address
   * @param port the port number
   * @param srv the SRV record
   */
  public Relay(String dns, String ipv4, String ipv6, Integer port, String srv) {
    this.dns = dns;
    this.ipv4 = ipv4;
    this.ipv6 = ipv6;
    this.port = port;
    this.srv = srv;
  }

  /**
   * Gets the DNS name.
   * 
   * @return the DNS name
   */
  public String getDns() {
    return dns;
  }

  /**
   * Sets the DNS name.
   * 
   * @param dns the DNS name to set
   */
  public void setDns(String dns) {
    this.dns = dns;
  }

  /**
   * Gets the IPv4 address.
   * 
   * @return the IPv4 address
   */
  public String getIpv4() {
    return ipv4;
  }

  /**
   * Sets the IPv4 address.
   * 
   * @param ipv4 the IPv4 address to set
   */
  public void setIpv4(String ipv4) {
    this.ipv4 = ipv4;
  }

  /**
   * Gets the IPv6 address.
   * 
   * @return the IPv6 address
   */
  public String getIpv6() {
    return ipv6;
  }

  /**
   * Sets the IPv6 address.
   * 
   * @param ipv6 the IPv6 address to set
   */
  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }

  /**
   * Gets the port number.
   * 
   * @return the port number
   */
  public Integer getPort() {
    return port;
  }

  /**
   * Sets the port number.
   * 
   * @param port the port number to set
   */
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   * Gets the SRV record.
   * 
   * @return the SRV record
   */
  public String getSrv() {
    return srv;
  }

  /**
   * Sets the SRV record.
   * 
   * @param srv the SRV record to set
   */
  public void setSrv(String srv) {
    this.srv = srv;
  }

  @Override
  public String toString() {
    return "Relay{" +
            "dns='" + dns + '\'' +
            ", ipv4='" + ipv4 + '\'' +
            ", ipv6='" + ipv6 + '\'' +
            ", port=" + port +
            ", srv='" + srv + '\'' +
            '}';
  }
}
