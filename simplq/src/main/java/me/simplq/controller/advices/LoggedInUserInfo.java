package me.simplq.controller.advices;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
@Setter
public class LoggedInUserInfo {
  private static final String ANONYMOUS = "anonymous";
  private String userId;

  public boolean isAnonymous() {
    return ANONYMOUS.equals(userId);
  }
}
