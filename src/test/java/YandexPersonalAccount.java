import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * @author agorelikova
 * @since 20/09/2018
 */
public class YandexPersonalAccount {
  @Test
  public void userCanEntertoAccountByEmail(){
    open("http://yandex.ru");
    Configuration.timeout=10000;
    $(".button desk-notif-card__login-enter-expanded button_theme_bordergray button_size_m i-bem button_js_inited").click();
  }
}
