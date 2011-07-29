package org.springframework.security.oauth2.common.exceptions;

/**
 * @author Ryan Heaton
 */
public class UserDeniedAuthorizationException extends OAuth2Exception {

  public UserDeniedAuthorizationException(String msg, Throwable t) {
    super(msg, t);
  }

  public UserDeniedAuthorizationException(String msg) {
    super(msg);
  }

  public UserDeniedAuthorizationException(String msg, Object extraInformation) {
    super(msg, extraInformation);
  }

  @Override
  public String getOAuth2ErrorCode() {
    return "access_denied";
  }

}
